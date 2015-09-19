package cn.edu.bit.linc.zql;

import cn.edu.bit.linc.zql.connections.connector.ConnectionPools;
import cn.edu.bit.linc.zql.databases.InnerDatabases;
import cn.edu.bit.linc.zql.exceptions.MetaDatabaseOperationsException;
import cn.edu.bit.linc.zql.exceptions.ZQLServerError;
import cn.edu.bit.linc.zql.network.packets.*;
import cn.edu.bit.linc.zql.network.server.UniformSQLServer;
import cn.edu.bit.linc.zql.network.server.UniformSQLServerSocketHandlerFactory;
import cn.edu.bit.linc.zql.command.SQLCommandManager;
import cn.edu.bit.linc.zql.connections.*;
import cn.edu.bit.linc.zql.databases.MetaDatabase;
import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;
import cn.edu.bit.linc.zql.util.StringUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static cn.edu.bit.linc.zql.util.CHAP.calcToken;

/**
 * 统一 SQL 系统入口，用于初始化系统底层的所有模块
 *
 * @author ihainan
 */
public class ZQLContext {
    private static final Logger logger = LoggerFactory.getLogger(ZQLContext.class);
    private static boolean initializedSystem = false;   // 系统是否已经被初始化
    public static MetaDatabase metaDatabase = null;     // 元数据库对象
    public static InnerDatabases innerDatabases = null; // 底层库信息
    public static ConnectionPools connectionPools = null;   // 连接池
    public static UniformSQLServer server = null;           // 系统服务器，对外提供命令执行接口

    /**
     * 初始化系统
     */
    public static synchronized void initializeSystem() throws IOException {
        if (!initializedSystem) {
            initializedSystem = true;

            logger.i("正在初始化系统模块...");
            ZQLEnv.init();

            logger.i("正在读取元数据库信息...");
            metaDatabase = MetaDatabase.getInstance();

            logger.i("正在读取底层库信息...");
            innerDatabases = InnerDatabases.getInstance();

            logger.i("正在初始化到底层库的连接池...");
            connectionPools = ConnectionPools.getInstance();

            logger.i("正在创建元数据库...");
            metaDatabase.createMetaDatabase();

//            if (ZQLEnv.get("server.enable").equals("true")) {
//                logger.i("正在启动服务接口...");
//                UniformSQLServerSocketHandlerFactory uniformSQLSocketHandlerFactory = new UniformSQLServerSocketHandlerFactory();
//                server = new UniformSQLServer
//                        .Builder()
//                        .onPort(Integer.valueOf(ZQLEnv.get("server.port")))
//                        .withSocketHandlerFactory(uniformSQLSocketHandlerFactory)
//                        .build();
//                server.start();
//            }
//            logger.i("系统模块初始化完毕\n");
        }

    }

    /**
     * 执行一条 SQL 语句并输出结果，本方法仅用于测试用途！
     *
     * @param commandStr 需要执行的 SQL 语句
     * @param session    当前会话
     */
    public static void executeSQL(String commandStr, ZQLSession session) {
        SQLCommandManager sqlCommandManager = new SQLCommandManager(commandStr, session);
        if (sqlCommandManager.execute()) {
            try {
                System.out.println("执行 SQL 命令 `" + commandStr + "` 成功");
                System.out.println(sqlCommandManager.getOutput());
            } catch (SQLException e) {
                logger.e("打印执行结果失败", e);
            }
        } else {
            System.out.println("执行 SQL 命令 `" + commandStr + "` 失败");
        }

        System.out.println();
    }

    public static void mySQLTest() {
        /* 伪造会话用于测试，实际过程是每与客户端建立连接便创建一个会话 */
        ZQLSession session = new ZQLSession("root", null, "12345");

        /* 测试命令 */
        executeSQL("USE db_1", session);
        executeSQL("DROP TABLE tb_1", session);
        executeSQL("CREATE TABLE IF NOT EXISTS tb_2 (C1 TINYINT, C2 SMALLINT, C3 INT, C4 BigInt, C5 FLOAT, C7 DOUBLE, C8 DECIMAL, C10 TIMESTAMP, c11 date, C12 Boolean, C13 BINARY) COMMENT 'Table 2 Comment'", session);

        // 创建、删除用户
        String userOne = "User_" + StringUtil.RandomStringGenerator.generateRandomString
                (5, StringUtil.RandomStringGenerator.Mode.ALPHA);           // 用户一
        String userTwo = "User_" + StringUtil.RandomStringGenerator.generateRandomString
                (5, StringUtil.RandomStringGenerator.Mode.ALPHA);           // 用户二
        String userThree = "User_" + StringUtil.RandomStringGenerator.generateRandomString
                (5, StringUtil.RandomStringGenerator.Mode.ALPHA);           // 用户三
        executeSQL("CREATE USER " + userOne + " IDENTIFIED BY '123456'", session);   // 创建普通用户一
        executeSQL("DROP USER " + userOne, session);                       // 删除用户一
        executeSQL("CREATE USER " + userOne + " IDENTIFIED BY '123456'", session);   // 创建普通用户一
        executeSQL("CREATE USER " + userTwo + " IDENTIFIED BY '123456'", session);   // 创建普通用户二
        executeSQL("CREATE USER " + userThree + " IDENTIFIED BY '123456'", session);   // 创建普通用户二

        // 创建、使用数据库、数据表

        executeSQL("CREATE DATABASE IF NOT EXISTS db_1", session);  // 创建数据库
        executeSQL("CREATE DATABASE IF NOT EXISTS db_2", session);  // 创建数据库
        executeSQL("CREATE DATABASE IF NOT EXISTS db_3", session);  // 创建数据库
        executeSQL("CREATE TABLE IF NOT EXISTS db_1.tb_1 (C1 TINYINT, C2 SMALLINT, C3 INT, C4 BigInt," +
                " C5 FLOAT, C7 DOUBLE, C8 DECIMAL, C10 TIMESTAMP, c11 date, C12 Boolean, " +
                "C13 BINARY) COMMENT 'Table 1 Comment'", session);        // 创建数据表一
        executeSQL("USE db_1", session);        // 使用数据库一
        executeSQL("CREATE TABLE IF NOT EXISTS tb_2 (C1 TINYINT, C2 SMALLINT, C3 INT, C4 BigInt," +
                " C5 FLOAT, C7 DOUBLE, C8 DECIMAL, C10 TIMESTAMP, c11 date, C12 Boolean, " +
                "C13 BINARY) COMMENT 'Table 2 Comment'", session);        // 创建数据表二 / 不带数据库名
        executeSQL("CREATE TABLE IF NOT EXISTS tb_3 (C1 TINYINT, C2 SMALLINT, C3 INT, C4 BigInt," +
                " C5 FLOAT, C7 DOUBLE, C8 DECIMAL, C10 TIMESTAMP, c11 date, C12 Boolean, " +
                "C13 BINARY) COMMENT 'Table 3 Comment'", session);        // 创建数据表三 / 不带数据库名

        // 删除数据库、数据表
        executeSQL("DROP DATABASE IF EXISTS db_2", session);    // 删除数据库2
        executeSQL("DROP TABLE IF EXISTS tb_3", session);       // 删除数据表3

        // 修改数据表
        executeSQL("ALTER TABLE tb_2 RENAME TO tb_N", session); // 修改数据表名
        executeSQL("ALTER TABLE tb_N CHANGE COLUMN C2 C2_NEW", session);    // 修改列名
        executeSQL("ALTER TABLE tb_N CHANGE C3 C3_NEW", session);    // 修改列名


        // 查看数据库、数据表、数据列、创建表语句
        executeSQL("USE db_1", session);        // 使用数据库一
        executeSQL("SHOW DATABASES", session);  // 查看数据库
        executeSQL("SHOW SCHEMAS LIKE 'db\\_%'", session);     // 带条件查看数据库
        executeSQL("SHOW TABLES", session);     // 查看数据表
        executeSQL("SHOW TABLES in db_1 'tb%'", session);   // 查看特定数据库中符合指定条件的数据表
        executeSQL("SHOW COLUMNS FROM tb_1", session);
        executeSQL("SHOW COLUMNS FROM tb_1 FROM db_1", session);
        executeSQL("SHOW CREATE TABLE db1.tb_1", session);
        executeSQL("SHOW CREATE TABLE tb_n", session);

        // 授权、撤销、查看授权
        executeSQL("GRANT SELECT, UPDATE ON tb_1 TO " + userOne + " WITH GRANT OPTION", session);    // 授权
        executeSQL("GRANT INSERT, UPDATE ON tb_1 TO " + userOne, session);      // 授权累加
        executeSQL("GRANT ALL ON tb_N TO " + userTwo, session);                         // GRANT ALL
        executeSQL("GRANT ALL ON tb_N TO " + userThree + " WITH GRANT OPTION", session);       // GRANT ALL / WITH GRANT OPTION
        executeSQL("SHOW GRANT ON ALL", session);                                  // 查看所有人授权
        executeSQL("SHOW GRANT " + userOne + " ON ALL", session);                    // 查看单人授权 / ALL
        executeSQL("SHOW GRANT " + userTwo + " ON TABLE tb_1", session);             // 查看单人 / 单表
        executeSQL("REVOKE ALL ON tb_1 FROM " + userOne, session);                   // 取消授权 / ALL
        executeSQL("REVOKE SELECT ON tb_N FROM " + userTwo, session);                // 取消授权
        executeSQL("REVOKE GRANT OPTION FOR SELECT ON tb_N FROM " + userThree, session);    // 取消授权 / GRANT OPTION FOR

        // 其他
        executeSQL("SHOW SERVER ALIASES", session);     // 查询底层库别名
        executeSQL("SET TABLE tb_4 TO db_mysql.db_1", session);     // 将现有表位置设置到元数据库内
        executeSQL("SERVER ALIAS db_mysql CREATE DATABASE IF NOT EXISTS db_2", session);  // 指定底层库运行
        executeSQL("SHOW DATABASES", session);          // 显示数据库
        executeSQL("SHOW TABLES", session);             // 显示数据表

        // 关闭会话！！！！
        session.closeSession();
    }

    public static void hiveTest() {
        /* 伪造会话用于测试，实际过程是每与客户端建立连接便创建一个会话 */
        ZQLSession session = new ZQLSession("root", null, "12345");

        // 创建、使用数据库、数据表
        executeSQL("USE db_1", session);        // 使用数据库一

        executeSQL("CREATE DATABASE IF NOT EXISTS db_1", session);  // 创建数据库
        executeSQL("CREATE DATABASE IF NOT EXISTS db_2", session);  // 创建数据库
        executeSQL("CREATE DATABASE IF NOT EXISTS db_3", session);  // 创建数据库
        executeSQL("CREATE TABLE IF NOT EXISTS db_1.tb_1 (C1 TINYINT, C2 SMALLINT, C3 INT, C4 BigInt," +
                " C5 FLOAT, C7 DOUBLE, C8 DECIMAL, C10 TIMESTAMP, c11 date, C12 Boolean, " +
                "C13 BINARY) COMMENT 'Table 1 Comment'", session);        // 创建数据表一
        executeSQL("USE db_1", session);        // 使用数据库一
        executeSQL("CREATE TABLE IF NOT EXISTS tb_2 (C1 TINYINT, C2 SMALLINT, C3 INT, C4 BigInt," +
                " C5 FLOAT, C7 DOUBLE, C8 DECIMAL, C10 TIMESTAMP, c11 date, C12 Boolean, " +
                "C13 BINARY) COMMENT 'Table 2 Comment'", session);        // 创建数据表二 / 不带数据库名
        executeSQL("CREATE TABLE IF NOT EXISTS tb_3 (C1 TINYINT, C2 SMALLINT, C3 INT, C4 BigInt," +
                " C5 FLOAT, C7 DOUBLE, C8 DECIMAL, C10 TIMESTAMP, c11 date, C12 Boolean, " +
                "C13 BINARY) COMMENT 'Table 3 Comment'", session);        // 创建数据表三 / 不带数据库名

        // 删除数据库、数据表
        executeSQL("USE db_1", session);        // 使用数据库一
        executeSQL("DROP DATABASE IF EXISTS db_2", session);    // 删除数据库2
        executeSQL("DROP TABLE IF EXISTS tb_3", session);       // 删除数据表3


        // 修改数据表
        executeSQL("ALTER TABLE tb_2 RENAME TO tb_N", session); // 修改数据表名
        executeSQL("ALTER TABLE tb_N CHANGE C3 C3_NEW", session);    // 修改列名
        executeSQL("ALTER TABLE tb_N CHANGE COLUMN C2 C2_NEW", session);    // 修改列名

        // 查看数据库、数据表、数据列
        executeSQL("SHOW DATABASES", session);  // 查看数据库
        executeSQL("SHOW SCHEMAS LIKE 'db\\_%'", session);     // 带条件查看数据库
        executeSQL("SHOW TABLES", session);     // 查看数据表
        executeSQL("SHOW TABLES in db_1 'tb%'", session);   // 查看特定数据库中符合指定条件的数据表
        executeSQL("SHOW COLUMNS FROM tb_1", session);
        executeSQL("SHOW COLUMNS FROM tb_n FROM db_1", session);
        executeSQL("USE db_1", session);        // 使用数据库一
        executeSQL("SHOW CREATE TABLE db1.tb_1", session);
        executeSQL("SHOW CREATE TABLE tb_n", session);
        executeSQL("SERVER ALIAS db_hive CREATE DATABASE IF NOT EXISTS db_2", session);  // 指定底层库运行

        // 关闭会话！！！！
        session.closeSession();
    }

    /**
     * 系统入口，在此启动系统
     *
     * @param args 程序参数
     */
    public static void main(String[] args) throws IOException, MetaDatabaseOperationsException {
        initializeSystem();
        String password = "root";
        String scramble = "12345678901234567890";
        String token = calcToken(password, scramble);
        System.out.println(ZQLContext.metaDatabase.checkPassword("root", scramble, token));
    }
}
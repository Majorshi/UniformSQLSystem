package cn.edu.bit.linc.zql;

import cn.edu.bit.linc.uniformsql.network.packets.*;
import cn.edu.bit.linc.uniformsql.network.server.UniformSQLServer;
import cn.edu.bit.linc.uniformsql.network.server.UniformSQLServerSocketHandlerFactory;
import cn.edu.bit.linc.zql.command.SQLCommandManager;
import cn.edu.bit.linc.zql.connections.*;
import cn.edu.bit.linc.zql.databases.Database;
import cn.edu.bit.linc.zql.databases.MetaDatabase;
import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;
import cn.edu.bit.linc.zql.util.StringUtil;

import java.io.IOException;
import java.sql.SQLException;

/**
 * 统一 SQL 系统入口，用于初始化系统底层的所有模块
 *
 * @author ihainan
 */
public class ZQLContext {
    private static final Logger logger = LoggerFactory.getLogger(ZQLContext.class);

    /**
     * 初始化系统
     */
    public static void initializeSystem() throws IOException {
        logger.i("正在初始化系统模块");
        ZQLEnv.init();
        MetaDatabase.initConnection();

        int port = 9527;
        int timeout = 100000;
        UniformSQLServerSocketHandlerFactory uniformSQLSocketHandlerFactory = new UniformSQLServerSocketHandlerFactory();

        UniformSQLServer server = new UniformSQLServer
                .Builder()
                .onPort(port)
                .withTimeout(timeout)
                .withSocketHandlerFactory(uniformSQLSocketHandlerFactory)
                .build();

        //server.start();

    }

    public static Packet executeSQL(String commandStr, ZQLSession session) {
        BasePacket basePacket = null;
        SQLCommandManager sqlCommandManager = new SQLCommandManager(commandStr, session);
        //String ret = "";
        if (sqlCommandManager.execute()) {
            try {
                System.out.println("执行 SQL 命令 `" + commandStr + "` 成功");
                // sqlCommandManager.printResult();
                System.out.println(sqlCommandManager.getOutput());

                if(sqlCommandManager.getReturnType()) {
                    String ret = sqlCommandManager.getReturnString();
                    basePacket = SuccessPacket.getSuccessPacket(new byte[]{1, 2, 3, 4}, new byte[]{3, 2, 1}, 200, 0, ret);
                } else {
                    basePacket = sqlCommandManager.getReturnPacket();
                }

            } catch (SQLException e) {
                logger.e("打印执行结果失败", e);
            }
        } else {
            System.out.println("执行 SQL 命令 `" + commandStr + "` 失败");
            int errorCode = 0;
            int serverStatus = 500;
            String errorMessage = "执行 SQL 命令 `" + commandStr + "` 失败";
            basePacket = ErrorPacket.getErrorPacket(errorCode, serverStatus, errorMessage);
            System.out.println(basePacket);
            //ret = "error";
        }
        System.out.println();

        byte[] body = new byte[basePacket.getSize()];
        basePacket.getData(body);

        /* 构建包头 */
        PacketHeader packetHeader = new PacketHeader(4);
        packetHeader.setPacketLength(basePacket.getSize());
        packetHeader.setPacketID((byte) 0);     // TODO: 包序列号

        /* 构建数据包 */
        Packet packet = new Packet(packetHeader.getSize() + body.length);
        packet.setPacketHeader(packetHeader);
        packet.setPacketBody(body);

        return packet;

    }

    private static void mySQLTest() {
        /* 伪造会话用于测试，实际过程是每与客户端建立连接便创建一个会话 */
        ZQLSession session = new ZQLSession("root", null, "12345");

        /* 测试命令 */
        executeSQL("USE db_1", session);
        executeSQL("DROP TABLE tb_1", session);
        executeSQL("CREATE TABLE IF NOT EXISTS tb_2 (C1 TINYINT, C2 SMALLINT, C3 INT, C4 BigInt, C5 FLOAT, C7 DOUBLE, C8 DECIMAL, C10 TIMESTAMP, c11 date, C12 Boolean, C13 BINARY) COMMENT 'Table 2 Comment'", session);

        // 创建、删除用户
        /*
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
        */

        // 创建、使用数据库、数据表
        /*
        executeSQL("CREATE DATABASE IF NOT EXISTS db_1", session);  // 创建数据库
        executeSQL("CREATE DATABASE IF NOT EXISTS db_2", session);  // 创建数据库
        executeSQL("CREATE DATABASE IF NOT EXISTS db_3", session);  // 创建数据库
        // TODO: line 1:159 mismatched input '<EOF>' expecting COMMENT
        // TODO: 对 DataType(INT) 的支持
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
        */

        // 查看数据库、数据表、数据列、创建表语句
        /*
        executeSQL("USE db_1", session);        // 使用数据库一
        executeSQL("SHOW DATABASES", session);  // 查看数据库
        executeSQL("SHOW SCHEMAS LIKE 'db\\_%'", session);     // 带条件查看数据库
        executeSQL("SHOW TABLES", session);     // 查看数据表
        executeSQL("SHOW TABLES in db_1 'tb%'", session);   // 查看特定数据库中符合指定条件的数据表
        executeSQL("SHOW COLUMNS FROM tb_1", session);
        executeSQL("SHOW COLUMNS FROM tb_1 FROM db_1", session);
        executeSQL("SHOW CREATE TABLE db1.tb_1", session);
        executeSQL("SHOW CREATE TABLE tb_n", session);
        */

        // 授权、撤销、查看授权
        /*
        executeSQL("GRANT SELECT, UPDATE ON tb_1 TO " + userOne + " WITH GRANT OPTION", session);    // 授权
        executeSQL("GRANT INSERT, UPDATE ON tb_1 TO " + userOne, session);      // 授权累加
        executeSQL("GRANT ALL ON tb_N TO " + userTwo, session);                         // GRANT ALL
        executeSQL("GRANT ALL ON tb_N TO " + userThree + " WITH GRANT OPTION", session);       // GRANT ALL / WITH GRANT OPTION
        executeSQL("SHOW GRANT ON ALL", session);                                  // 查看所有人授权
        executeSQL("SHOW GRANT " + userOne + " ON ALL", session);                    // 查看单人授权 / ALL
        executeSQL("SHOW GRANT " + userTwo + " ON TABLE tb_1", session);             // 查看单人 / 单表
        executeSQL("REVOKE ALL ON tb_1 FROM " + userOne, session);                   // 取消授权 / ALL
        executeSQL("REVOKE SELECT ON tb_N FROM " + userTwo, session);                // 取消授权
        // TODO: 错误语句仍能正常执行
        // executeSQL("REVOKE GRANT OPTION FOR ON tb_1 FROM " + userThree, session);    // 取消授权 / GRANT OPTION FOR
        executeSQL("REVOKE GRANT OPTION FOR SELECT ON tb_N FROM " + userThree, session);    // 取消授权 / GRANT OPTION FOR

        // 其他
        executeSQL("SHOW SERVER ALIASES", session);     // 查询底层库别名
        executeSQL("SET TABLE tb_4 TO db_mysql.db_1", session);     // 将现有表位置设置到元数据库内
        executeSQL("SERVER ALIAS db_mysql CREATE DATABASE IF NOT EXISTS db_2", session);  // 指定底层库运行
        executeSQL("SHOW DATABASES", session);          // 显示数据库
        executeSQL("SHOW TABLES", session);             // 显示数据表
        */
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

        // executeSQL("SERVER ALIAS db_hive CREATE DATABASE IF NOT EXISTS db_2", session);  // 指定底层库运行
    }

    /**
     * 系统入口，在此启动系统
     *
     * @param args 程序参数
     */
    public static void main(String[] args) throws IOException {
        initializeSystem();
        //mySQLTest();
        // hiveTest();
    }
}

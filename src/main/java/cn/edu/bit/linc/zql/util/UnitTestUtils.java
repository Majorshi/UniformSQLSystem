package cn.edu.bit.linc.zql.util;

import cn.edu.bit.linc.zql.command.SQLCommandManager;
import cn.edu.bit.linc.zql.connections.ZQLSession;
import cn.edu.bit.linc.zql.exceptions.ZQLConnectionException;
import cn.edu.bit.linc.zql.exceptions.ZQLInnerDatabaseExecutionException;
import cn.edu.bit.linc.zql.exceptions.ZQLSyntaxErrorException;
import org.custommonkey.xmlunit.Diff;
import org.xml.sax.SAXException;

import java.io.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * 单元测试工具
 */
public class UnitTestUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(UnitTestUtils.class);

    public String ReadFile(String path) {
        File file = new File(path);
        BufferedReader reader = null;
        String lastStr = "";
        try {
            //System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            //一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                //显示行号
                System.out.println("line " + line + ": " + tempString);
                lastStr = lastStr + tempString;
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return lastStr;
    }

    // ResultSet 导出成 XML 文件
    public String generateXML(final ResultSet rs) throws SQLException {
        final StringBuffer buffer = new StringBuffer(1024 * 4);
        if (rs == null)
            return "";

        buffer.append("<?xml version=\"1.0\" encoding=\"GB2312\"?>\n"); // XML的头部信息
        buffer.append("<ResultSet>\n");

        ResultSetMetaData rsmd = rs.getMetaData(); // 得到结果集的定义结构
        int colCount = rsmd.getColumnCount(); // 得到列的总数
        // 对放回的全部数据逐一处理
        for (int id = 1; rs.next(); id++) {
            // 格式为row id , col name, col context
            buffer.append("\t<row id=\"").append(id).append("\">\n");
            for (int i = 1; i <= colCount; i++) {
                String type = rsmd.getColumnTypeName(i); // 获取字段类型
                buffer.append("\t\t<col name=\"" + rsmd.getColumnName(i)
                        + "\">");
                buffer.append(getValue(rs, i, type));
                buffer.append("</col>\n");
            }
            buffer.append("\t</row>\n");
        }
        buffer.append("</ResultSet>");
        //关闭
        rs.close();
        return buffer.toString();
    }

    /**
     * This method gets the value of the specified column
     * 通用的读取结果集某一列的值并转化为String表达
     *
     * @param rs     rs 输入的纪录集
     * @param colNum colNum 第几列
     * @param type   type 数据类型
     * @return
     * @throws SQLException
     */
    private String getValue(final ResultSet rs, int colNum, String type)
            throws SQLException {
        Object value = null;

        if (type.equals("nchar") || type.equals("nvarchar"))
            value = rs.getString(colNum);
        else
            value = rs.getObject(colNum);

        if (value != null)
            return value.toString().trim();
        return "null";
    }

    public boolean exportResultToXML(final ResultSet rs, String fileName) {
        try {
            UnitTestUtils obj = new UnitTestUtils();
            String res = obj.generateXML(rs);

            FileOutputStream fswriter = new FileOutputStream(fileName, false);
            fswriter.write(res.getBytes());

            fswriter.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
            return false;
        }
        return true;
    }


    /**
     * 比较两个路径下的 XML 文件是否一致
     *
     * @param path         需要比较的XML文件的路径
     * @param expectedPath 期待的结果路径
     * @return
     */
    public boolean compare(String path, String expectedPath) {
        Reader oldXML = null, newXML = null;
        try {
            oldXML = new FileReader(new File(path));
            newXML = new FileReader(new File(expectedPath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Diff diff = null;
        try {
            diff = new Diff(oldXML, newXML);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return diff.identical();
    }

    // 导入 SQL 脚本

    /**
     * 执行一条 SQL 语句并输出结果，本方法仅用于测试用途！
     *
     * @param commandStr 需要执行的 SQL 语句
     * @param session    当前会话
     */
    public static void executeSQL(String commandStr, ZQLSession session) {
        SQLCommandManager sqlCommandManager = new SQLCommandManager(commandStr, session);
        try {
            if (sqlCommandManager.execute()) {
                try {
                    System.out.println("执行 SQL 命令 `" + commandStr + "` 成功");
                    System.out.println(sqlCommandManager.getOutput());
                } catch (SQLException e) {
                    LOGGER.e("打印执行结果失败", e);
                }
            } else {
                System.out.println("执行 SQL 命令 `" + commandStr + "` 失败");
            }
        } catch (ZQLSyntaxErrorException e) {
            LOGGER.e("解析 ZQL 命令失败", e);
        } catch (ZQLInnerDatabaseExecutionException e) {
            LOGGER.e("执行反向生成的 SQL 命令失败", e);
        } catch (ZQLConnectionException e) {
            switch (e.getErrorCode()) {
                case 12001:
                    LOGGER.e("创建 Statement 失败", e);
                    break;
                case 12002:
                    LOGGER.e("从 Statement 中获取 ResultSet 失败", e);
                    break;
                case 12003:
                    LOGGER.e("从 Statement 中获取 Updated Rows 失败", e);
                    break;
                default:
                    LOGGER.e("未知错误");
            }
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
}
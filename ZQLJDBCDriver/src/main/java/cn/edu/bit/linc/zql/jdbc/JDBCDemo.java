package cn.edu.bit.linc.zql.jdbc;

import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * JDBC 驱动使用 Demo
 */
public class JDBCDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(JDBCDemo.class);

    public static void main(String[] args) {
        try {
            Class.forName("cn.edu.bit.linc.zql.jdbc.UniformSQLDriver");
        } catch (ClassNotFoundException e) {
            LOGGER.e("找不到驱动程序", e);
            System.exit(-1);
        }

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:zql://127.0.0.1:9527", "root", "root");
        } catch (SQLException e) {
            LOGGER.e("获取 JDBC 连接失败", e);
            System.exit(-1);
        }

        try {
            connection.createStatement().execute("SHOW DATABASES");
        } catch (SQLException e) {
            LOGGER.e("执行命令失败", e);
        } finally {
            if (connection != null) try {
                connection.close();
            } catch (SQLException e) {
                LOGGER.e("关闭连接失败", e);
            }
        }
    }
}

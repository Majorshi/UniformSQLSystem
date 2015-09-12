package cn.edu.bit.linc.zql.jdbc;

import java.sql.Connection;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * zql驱动类
 */
public class UniformSQLDriver implements java.sql.Driver {

    public static final int MAJOR_VERSION = 0;
    public static final int MINOR_VERSION = 1;

    /**
     * 注册驱动
     */
    static {
        try{
            java.sql.DriverManager.registerDriver(new UniformSQLDriver());
        } catch (SQLException e) {
            System.err.println("Can't registering the ZQL JDBC Driver!");
            e.printStackTrace();
        }

    }

    public Connection connect(String url, Properties info) throws SQLException {
        return new UniformSQLConnection(url, info);
    }

    /**
     * uniformsql 驱动 url 前缀必须为：jdbc:zql://
     * @param url
     * @return
     * @throws SQLException
     */
    public boolean acceptsURL(String url) throws SQLException {
        return url.startsWith("jdbc:zql://");
    }

    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        return new DriverPropertyInfo[0];
    }

    /**
     * 主要版本号 0
     * @return
     */
    public int getMajorVersion() {
        return MAJOR_VERSION;
    }

    /**
     * 次要版本号 1
     * @return
     */
    public int getMinorVersion() {
        return MINOR_VERSION;
    }

    public static String getVersion(){
        return "ZQL JDBC Driver " + MAJOR_VERSION + "." + MINOR_VERSION;
    }

    public boolean jdbcCompliant() {
        return false;
    }

    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}

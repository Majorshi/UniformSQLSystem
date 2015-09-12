package cn.edu.bit.linc.zql.jdbc;

import cn.edu.bit.linc.zql.network.client.UniformSQLClient;
import cn.edu.bit.linc.zql.network.client.UniformSQLClientSocketHandler;
import cn.edu.bit.linc.zql.network.client.UniformSQLClientSocketHandlerFactory;

import java.io.IOException;
import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * Created by wyq on 2015/8/7.
 */
public class UniformSQLConnection implements Connection {

    private static UniformSQLClient client;
    private boolean                 closed;
    private String                  username;

    /**
     * 构造函数，建立和数据库服务端的连接
     * @param url       连接数据库的完整地址
     * @param info      存放用户名密码等信息
     */
    public UniformSQLConnection(String url, Properties info) {

        //url 在DriverManager中已经判断是否为空了，这里不需要再验证一次
        System.out.println("url     : " +  url);

        String[] strs = url.replace("jdbc:zql://","").split(":");
        if(strs.length < 2) {
            System.out.println("url is error！");
            return;
        }
        final String host = strs[0]; // TODO 判断ip地址是否合法
        final int port;
        try{
            port = Integer.parseInt(strs[1]);
        }catch(Exception e){
            System.out.println("解析端口出错！");
            return;
        }
        System.out.println("hots    : " + host + "\nport    : " + port);

        username = info.getProperty("user", "admin");
        final String password = info.getProperty("password", "");
        System.out.println("username: " + username + "\n" + "password: " + password);

        UniformSQLClientSocketHandlerFactory uniformSQLClientSocketHandlerFactory = new UniformSQLClientSocketHandlerFactory();
        client = new UniformSQLClient.Builder()
                .onPort(port).toServer(host).setAccount(username, password)
                .withSocketHandlerFactory(uniformSQLClientSocketHandlerFactory)
                .build();

        try {
            client.connect();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public UniformSQLClient getClient() {
        return client;
    }

    public Statement createStatement() throws SQLException {
        return new UniformSQLStatement(this);
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException {
        return null;
    }

    public CallableStatement prepareCall(String sql) throws SQLException {
        return null;
    }

    public String nativeSQL(String sql) throws SQLException {
        return null;
    }

    public void setAutoCommit(boolean autoCommit) throws SQLException {

    }

    public boolean getAutoCommit() throws SQLException {
        return false;
    }

    public void commit() throws SQLException {

    }

    public void rollback() throws SQLException {

    }

    public void close() throws SQLException {
        UniformSQLClientSocketHandler handler = (UniformSQLClientSocketHandler) client.getHandler();
        handler.disconnect();
        closed = true;
    }

    public boolean isClosed() throws SQLException {
        return closed;
    }

    public DatabaseMetaData getMetaData() throws SQLException {
        return new UniformSQLDatabaseMetaData(this, username);
    }

    public void setReadOnly(boolean readOnly) throws SQLException {

    }

    public boolean isReadOnly() throws SQLException {
        return false;
    }

    public void setCatalog(String catalog) throws SQLException {

    }

    public String getCatalog() throws SQLException {
        return null;
    }

    public void setTransactionIsolation(int level) throws SQLException {

    }

    public int getTransactionIsolation() throws SQLException {
        return 0;
    }

    public SQLWarning getWarnings() throws SQLException {
        return null;
    }

    public void clearWarnings() throws SQLException {

    }

    public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
        return new UniformSQLStatement(this, resultSetType, resultSetConcurrency);
    }

    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return null;
    }

    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return null;
    }

    public Map<String, Class<?>> getTypeMap() throws SQLException {
        return null;
    }

    public void setTypeMap(Map<String, Class<?>> map) throws SQLException {

    }

    public void setHoldability(int holdability) throws SQLException {

    }

    public int getHoldability() throws SQLException {
        return 0;
    }

    public Savepoint setSavepoint() throws SQLException {
        return null;
    }

    public Savepoint setSavepoint(String name) throws SQLException {
        return null;
    }

    public void rollback(Savepoint savepoint) throws SQLException {

    }

    public void releaseSavepoint(Savepoint savepoint) throws SQLException {

    }

    public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return new UniformSQLStatement(this, resultSetType, resultSetConcurrency, resultSetHoldability);
    }

    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return null;
    }

    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return null;
    }

    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
        return null;
    }

    public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
        return null;
    }

    public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
        return null;
    }

    public Clob createClob() throws SQLException {
        return null;
    }

    public Blob createBlob() throws SQLException {
        return null;
    }

    public NClob createNClob() throws SQLException {
        return null;
    }

    public SQLXML createSQLXML() throws SQLException {
        return null;
    }

    public boolean isValid(int timeout) throws SQLException {
        return false;
    }

    public void setClientInfo(String name, String value) throws SQLClientInfoException {

    }

    public void setClientInfo(Properties properties) throws SQLClientInfoException {

    }

    public String getClientInfo(String name) throws SQLException {
        return null;
    }

    public Properties getClientInfo() throws SQLException {
        return null;
    }

    public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
        return null;
    }

    public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
        return null;
    }

    public void setSchema(String schema) throws SQLException {

    }

    public String getSchema() throws SQLException {
        return null;
    }

    public void abort(Executor executor) throws SQLException {

    }

    public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {

    }

    public int getNetworkTimeout() throws SQLException {
        return 0;
    }

    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}

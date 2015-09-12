package cn.edu.bit.linc.zql.jdbc;

import cn.edu.bit.linc.zql.network.client.RowData;
import cn.edu.bit.linc.zql.network.client.UniformSQLClient;
import cn.edu.bit.linc.zql.network.client.UniformSQLClientSocketHandler;

import java.sql.*;
import java.util.List;

/**
 * Created by wyq on 2015/8/10.
 */
public class UniformSQLStatement implements Statement {

    protected final UniformSQLConnection    connection;
    protected final UniformSQLClient        client;

    protected UniformSQLResultSet           resultSet;
    protected boolean                       closed;

    protected int                           resultSetType;
    protected int                           resultSetConcurrency;
    protected int                           resultSetHoldability;

    /**
     * 构造函数
     */
    public UniformSQLStatement(final UniformSQLConnection connection){
        this(connection, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY, ResultSet.HOLD_CURSORS_OVER_COMMIT);
    }

    public UniformSQLStatement(final UniformSQLConnection connection, int resultSetType, int resultSetConcurrency) {
        this(connection, resultSetType, resultSetConcurrency, ResultSet.HOLD_CURSORS_OVER_COMMIT);
    }

    /**
     * TODO 增加状态，把 ResultSet 改成可以设置状态的
     * @param connection
     * @param resultSetType
     * @param resultSetConcurrency
     * @param resultSetHoldability
     */
    public UniformSQLStatement(final UniformSQLConnection connection, int resultSetType, int resultSetConcurrency, int resultSetHoldability) {
        this.connection = connection;
        this.client = this.connection.getClient();

        // 目前 ResultSet 默认设置成以下状态
        this.resultSetType = ResultSet.TYPE_FORWARD_ONLY;
        this.resultSetConcurrency = ResultSet.CONCUR_READ_ONLY;
        this.resultSetHoldability = ResultSet.HOLD_CURSORS_OVER_COMMIT;
    }

    /**
     * TODO 执行一个sql语句，返回ResultSet结果集
     * @param sql
     * @return
     * @throws SQLException
     */
    public ResultSet executeQuery(String sql) throws SQLException {
        //UniformSQLClient client = this.connection.getClient();
        UniformSQLClientSocketHandler handler = (UniformSQLClientSocketHandler) client.getHandler();

//        handler.sendCommand(1, sql);
//        try {
//            handler.getResult();
//            //handler.disconnect();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        List<RowData> results = handler.execute(sql);
        resultSet = new UniformSQLResultSet(this, results, resultSetType, resultSetConcurrency, resultSetHoldability);
//        System.out.println("executeQuery end");
        return resultSet;
    }

    public boolean execute(final String sql) throws SQLException {
        if("".equals(sql))
            return false;

        UniformSQLClientSocketHandler handler = (UniformSQLClientSocketHandler) client.getHandler();
        List<RowData> results = handler.execute(sql);
        resultSet = new UniformSQLResultSet(this, results, resultSetType, resultSetConcurrency, resultSetHoldability);
        return true;
    }

    public int executeUpdate(String sql) throws SQLException {
        UniformSQLClientSocketHandler handler = (UniformSQLClientSocketHandler) client.getHandler();
        List<RowData> results = handler.execute(sql);
        resultSet = new UniformSQLResultSet(this, results, resultSetType, resultSetConcurrency, resultSetHoldability);
        return results.size();
    }

    public void close() throws SQLException {
        closed = true;
    }

    public int getMaxFieldSize() throws SQLException {
        return 0;
    }

    public void setMaxFieldSize(int max) throws SQLException {

    }

    public int getMaxRows() throws SQLException {
        return 0;
    }

    public void setMaxRows(int max) throws SQLException {

    }

    public void setEscapeProcessing(boolean enable) throws SQLException {

    }

    public int getQueryTimeout() throws SQLException {
        return 0;
    }

    public void setQueryTimeout(int seconds) throws SQLException {

    }

    public void cancel() throws SQLException {

    }

    public SQLWarning getWarnings() throws SQLException {
        return null;
    }

    public void clearWarnings() throws SQLException {

    }

    public void setCursorName(String name) throws SQLException {

    }

    public ResultSet getResultSet() throws SQLException {
        return resultSet;
    }

    public int getUpdateCount() throws SQLException {
        return 0;
    }

    public boolean getMoreResults() throws SQLException {
        return false;
    }

    public void setFetchDirection(int direction) throws SQLException {

    }

    public int getFetchDirection() throws SQLException {
        return 0;
    }

    public void setFetchSize(int rows) throws SQLException {

    }

    public int getFetchSize() throws SQLException {
        return 0;
    }

    public int getResultSetConcurrency() throws SQLException {
        return 0;
    }

    public int getResultSetType() throws SQLException {
        return 0;
    }

    public void addBatch(String sql) throws SQLException {

    }

    public void clearBatch() throws SQLException {

    }

    public int[] executeBatch() throws SQLException {
        return new int[0];
    }

    public Connection getConnection() throws SQLException {
        return connection;
    }

    public boolean getMoreResults(int current) throws SQLException {
        return false;
    }

    public ResultSet getGeneratedKeys() throws SQLException {
        return null;
    }

    public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
        return 0;
    }

    public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
        return 0;
    }

    public int executeUpdate(String sql, String[] columnNames) throws SQLException {
        return 0;
    }

    public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
        return false;
    }

    public boolean execute(String sql, int[] columnIndexes) throws SQLException {
        return false;
    }

    public boolean execute(String sql, String[] columnNames) throws SQLException {
        return false;
    }

    public int getResultSetHoldability() throws SQLException {
        return 0;
    }

    public boolean isClosed() throws SQLException {
        return false;
    }

    public void setPoolable(boolean poolable) throws SQLException {

    }

    public boolean isPoolable() throws SQLException {
        return false;
    }

    public void closeOnCompletion() throws SQLException {

    }

    public boolean isCloseOnCompletion() throws SQLException {
        return false;
    }

    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}

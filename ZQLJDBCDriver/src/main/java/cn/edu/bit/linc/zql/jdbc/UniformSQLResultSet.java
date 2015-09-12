package cn.edu.bit.linc.zql.jdbc;

import cn.edu.bit.linc.zql.network.client.RowData;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 * Created by wyq on 2015/8/10.
 */
public class UniformSQLResultSet implements ResultSet {

    private UniformSQLStatement statement;
    private List<RowData>       records             = null;
    private int                 cursor              = -1;
    private int                 rowCount            = 0;
    private RowData             rowData;
    private String[]            fieldNames;
    private int                 type;
    private int                 concurrency;
    private int                 holdability;


    public UniformSQLResultSet(final UniformSQLStatement statement, final List<RowData> records, final int type,
                               final int concurrency, final int holdability) throws SQLException {
        this.statement = statement;
        this.records = records;
        rowCount = records.size();

        if(rowCount > 0){
            rowData = this.records.get(0);
            fieldNames = rowData.fieldNames();
        }

//        System.out.println("UniformSQLResultSet Field Name:");
//        for(String name : fieldNames){
//            System.out.print(name + " ");
//        }
//        System.out.println();
//        System.out.println("UniformSQLResultSet Row Data:");
//        for(String name : fieldNames){
//            System.out.print(rowData.getValueByFieldName(name) + " ");
//        }
//        System.out.println();

        if(type == TYPE_FORWARD_ONLY || type == TYPE_SCROLL_INSENSITIVE || type == TYPE_SCROLL_SENSITIVE)
            this.type = type;
        else
            throw new SQLException("Bad ResultSet type: " + type + " instead of one of the following values: ResultSet.TYPE_FORWARD_ONLY ," +
                    " ResultSet.TYPE_SCROLL_INSENSITIVE  or ResultSet.TYPE_SCROLL_SENSITIVE");

        if (concurrency == CONCUR_READ_ONLY || concurrency == CONCUR_UPDATABLE)
            this.concurrency = concurrency;
        else
            throw new SQLException("Bad ResultSet Concurrency type: " + concurrency + " instead of one of the following values: "
                    + CONCUR_READ_ONLY + " or" + CONCUR_UPDATABLE);

        if (holdability == HOLD_CURSORS_OVER_COMMIT || holdability == CLOSE_CURSORS_AT_COMMIT)
            this.holdability = holdability;
        else
            throw new SQLException("Bad ResultSet Holdability type: " + holdability + " instead of one of the following values: "
                    + HOLD_CURSORS_OVER_COMMIT + " or" + CLOSE_CURSORS_AT_COMMIT);
    }

    private int getFieldIndex(final int columnIndex) throws SQLException {
        if(columnIndex < 1)
            throw new SQLException("The column index cannot be less than 1");
        else if(columnIndex > fieldNames.length)
            throw new SQLException("The column index cannot be more than " + fieldNames.length);
        return columnIndex - 1;
    }

    public boolean next() throws SQLException {
        return absolute(++cursor);
    }

    public void close() throws SQLException {
        cursor = -1;
        rowCount = 0;
        records = null;
    }

    public boolean wasNull() throws SQLException {
        return false;
    }

    public String getString(int columnIndex) throws SQLException {
        return null;
    }

    public boolean getBoolean(int columnIndex) throws SQLException {
        return false;
    }

    public byte getByte(int columnIndex) throws SQLException {
        return 0;
    }

    public short getShort(int columnIndex) throws SQLException {
        return 0;
    }

    public int getInt(int columnIndex) throws SQLException {
        return 0;
    }

    public long getLong(int columnIndex) throws SQLException {
        return 0;
    }

    public float getFloat(int columnIndex) throws SQLException {
        return 0;
    }

    public double getDouble(int columnIndex) throws SQLException {
        return 0;
    }

    public BigDecimal getBigDecimal(int columnIndex, int scale) throws SQLException {
        return null;
    }

    public byte[] getBytes(int columnIndex) throws SQLException {
        return new byte[0];
    }

    public Date getDate(int columnIndex) throws SQLException {
        return null;
    }

    public Time getTime(int columnIndex) throws SQLException {
        return null;
    }

    public Timestamp getTimestamp(int columnIndex) throws SQLException {
        return null;
    }

    public InputStream getAsciiStream(int columnIndex) throws SQLException {
        return null;
    }

    public InputStream getUnicodeStream(int columnIndex) throws SQLException {
        return null;
    }

    public InputStream getBinaryStream(int columnIndex) throws SQLException {
        return null;
    }

    public String getString(String columnLabel) throws SQLException {
        return null;
    }

    public boolean getBoolean(String columnLabel) throws SQLException {
        return false;
    }

    public byte getByte(String columnLabel) throws SQLException {
        return 0;
    }

    public short getShort(String columnLabel) throws SQLException {
        return 0;
    }

    public int getInt(String columnLabel) throws SQLException {
        return 0;
    }

    public long getLong(String columnLabel) throws SQLException {
        return 0;
    }

    public float getFloat(String columnLabel) throws SQLException {
        return 0;
    }

    public double getDouble(String columnLabel) throws SQLException {
        return 0;
    }

    public BigDecimal getBigDecimal(String columnLabel, int scale) throws SQLException {
        return null;
    }

    public byte[] getBytes(String columnLabel) throws SQLException {
        return new byte[0];
    }

    public Date getDate(String columnLabel) throws SQLException {
        return null;
    }

    public Time getTime(String columnLabel) throws SQLException {
        return null;
    }

    public Timestamp getTimestamp(String columnLabel) throws SQLException {
        return null;
    }

    public InputStream getAsciiStream(String columnLabel) throws SQLException {
        return null;
    }

    public InputStream getUnicodeStream(String columnLabel) throws SQLException {
        return null;
    }

    public InputStream getBinaryStream(String columnLabel) throws SQLException {
        return null;
    }

    public SQLWarning getWarnings() throws SQLException {
        return null;
    }

    public void clearWarnings() throws SQLException {

    }

    public String getCursorName() throws SQLException {
        return null;
    }

    /**
     * TODO 获取数据库表列名
     * @return
     * @throws SQLException
     */
    public ResultSetMetaData getMetaData() throws SQLException {
        return new UniformSQLResultSetMetaData(this);
    }

    public Object getObject(int columnIndex) throws SQLException {
        return getObject(fieldNames[getFieldIndex(columnIndex)]);
    }

    public Object getObject(String columnLabel) throws SQLException {
        absolute(cursor);
        Object value = rowData.getValueByFieldName(columnLabel);
        return value;
    }

    public int findColumn(String columnLabel) throws SQLException {
        return 0;
    }

    public Reader getCharacterStream(int columnIndex) throws SQLException {
        return null;
    }

    public Reader getCharacterStream(String columnLabel) throws SQLException {
        return null;
    }

    public BigDecimal getBigDecimal(int columnIndex) throws SQLException {
        return null;
    }

    public BigDecimal getBigDecimal(String columnLabel) throws SQLException {
        return null;
    }

    public boolean isBeforeFirst() throws SQLException {
        return false;
    }

    public boolean isAfterLast() throws SQLException {
        return cursor >= rowCount;
    }

    public boolean isFirst() throws SQLException {
        return cursor == 0;
    }

    public boolean isLast() throws SQLException {
        return cursor == rowCount -1;
    }

    public void beforeFirst() throws SQLException {
        cursor = -1;
    }

    public void afterLast() throws SQLException {
        // 到最后一行的下一行
        cursor = rowCount;
    }

    public boolean first() throws SQLException {
        return absolute(0);
    }

    public boolean last() throws SQLException {
        return absolute(rowCount - 1);
    }

    public int getRow() throws SQLException {
        return cursor;
    }

    /**
     * 移动指针到第 row 行
     * @param row
     * @return
     * @throws SQLException
     */
    public boolean absolute(int row) throws SQLException {
        if(row > rowCount - 1){
            cursor = rowCount;
            return false;
        } else if(row < 0){
            cursor = -1;
            return false;
        }

        cursor = row;
        rowData = records.get(cursor);
        return true;
    }

    public boolean relative(int rows) throws SQLException {
        return false;
    }

    public boolean previous() throws SQLException {
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

    public int getType() throws SQLException {
        return type;
    }

    public int getConcurrency() throws SQLException {
        return concurrency;
    }

    public boolean rowUpdated() throws SQLException {
        return false;
    }

    public boolean rowInserted() throws SQLException {
        return false;
    }

    public boolean rowDeleted() throws SQLException {
        return false;
    }

    public void updateNull(int columnIndex) throws SQLException {

    }

    public void updateBoolean(int columnIndex, boolean x) throws SQLException {

    }

    public void updateByte(int columnIndex, byte x) throws SQLException {

    }

    public void updateShort(int columnIndex, short x) throws SQLException {

    }

    public void updateInt(int columnIndex, int x) throws SQLException {

    }

    public void updateLong(int columnIndex, long x) throws SQLException {

    }

    public void updateFloat(int columnIndex, float x) throws SQLException {

    }

    public void updateDouble(int columnIndex, double x) throws SQLException {

    }

    public void updateBigDecimal(int columnIndex, BigDecimal x) throws SQLException {

    }

    public void updateString(int columnIndex, String x) throws SQLException {

    }

    public void updateBytes(int columnIndex, byte[] x) throws SQLException {

    }

    public void updateDate(int columnIndex, Date x) throws SQLException {

    }

    public void updateTime(int columnIndex, Time x) throws SQLException {

    }

    public void updateTimestamp(int columnIndex, Timestamp x) throws SQLException {

    }

    public void updateAsciiStream(int columnIndex, InputStream x, int length) throws SQLException {

    }

    public void updateBinaryStream(int columnIndex, InputStream x, int length) throws SQLException {

    }

    public void updateCharacterStream(int columnIndex, Reader x, int length) throws SQLException {

    }

    public void updateObject(int columnIndex, Object x, int scaleOrLength) throws SQLException {

    }

    public void updateObject(int columnIndex, Object x) throws SQLException {

    }

    public void updateNull(String columnLabel) throws SQLException {

    }

    public void updateBoolean(String columnLabel, boolean x) throws SQLException {

    }

    public void updateByte(String columnLabel, byte x) throws SQLException {

    }

    public void updateShort(String columnLabel, short x) throws SQLException {

    }

    public void updateInt(String columnLabel, int x) throws SQLException {

    }

    public void updateLong(String columnLabel, long x) throws SQLException {

    }

    public void updateFloat(String columnLabel, float x) throws SQLException {

    }

    public void updateDouble(String columnLabel, double x) throws SQLException {

    }

    public void updateBigDecimal(String columnLabel, BigDecimal x) throws SQLException {

    }

    public void updateString(String columnLabel, String x) throws SQLException {

    }

    public void updateBytes(String columnLabel, byte[] x) throws SQLException {

    }

    public void updateDate(String columnLabel, Date x) throws SQLException {

    }

    public void updateTime(String columnLabel, Time x) throws SQLException {

    }

    public void updateTimestamp(String columnLabel, Timestamp x) throws SQLException {

    }

    public void updateAsciiStream(String columnLabel, InputStream x, int length) throws SQLException {

    }

    public void updateBinaryStream(String columnLabel, InputStream x, int length) throws SQLException {

    }

    public void updateCharacterStream(String columnLabel, Reader reader, int length) throws SQLException {

    }

    public void updateObject(String columnLabel, Object x, int scaleOrLength) throws SQLException {

    }

    public void updateObject(String columnLabel, Object x) throws SQLException {

    }

    public void insertRow() throws SQLException {

    }

    public void updateRow() throws SQLException {

    }

    public void deleteRow() throws SQLException {

    }

    public void refreshRow() throws SQLException {

    }

    public void cancelRowUpdates() throws SQLException {

    }

    public void moveToInsertRow() throws SQLException {

    }

    public void moveToCurrentRow() throws SQLException {

    }

    public Statement getStatement() throws SQLException {
        return statement;
    }

    public Object getObject(int columnIndex, Map<String, Class<?>> map) throws SQLException {
        return null;
    }

    public Ref getRef(int columnIndex) throws SQLException {
        return null;
    }

    public Blob getBlob(int columnIndex) throws SQLException {
        return null;
    }

    public Clob getClob(int columnIndex) throws SQLException {
        return null;
    }

    public Array getArray(int columnIndex) throws SQLException {
        return null;
    }

    public Object getObject(String columnLabel, Map<String, Class<?>> map) throws SQLException {
        return null;
    }

    public Ref getRef(String columnLabel) throws SQLException {
        return null;
    }

    public Blob getBlob(String columnLabel) throws SQLException {
        return null;
    }

    public Clob getClob(String columnLabel) throws SQLException {
        return null;
    }

    public Array getArray(String columnLabel) throws SQLException {
        return null;
    }

    public Date getDate(int columnIndex, Calendar cal) throws SQLException {
        return null;
    }

    public Date getDate(String columnLabel, Calendar cal) throws SQLException {
        return null;
    }

    public Time getTime(int columnIndex, Calendar cal) throws SQLException {
        return null;
    }

    public Time getTime(String columnLabel, Calendar cal) throws SQLException {
        return null;
    }

    public Timestamp getTimestamp(int columnIndex, Calendar cal) throws SQLException {
        return null;
    }

    public Timestamp getTimestamp(String columnLabel, Calendar cal) throws SQLException {
        return null;
    }

    public URL getURL(int columnIndex) throws SQLException {
        return null;
    }

    public URL getURL(String columnLabel) throws SQLException {
        return null;
    }

    public void updateRef(int columnIndex, Ref x) throws SQLException {

    }

    public void updateRef(String columnLabel, Ref x) throws SQLException {

    }

    public void updateBlob(int columnIndex, Blob x) throws SQLException {

    }

    public void updateBlob(String columnLabel, Blob x) throws SQLException {

    }

    public void updateClob(int columnIndex, Clob x) throws SQLException {

    }

    public void updateClob(String columnLabel, Clob x) throws SQLException {

    }

    public void updateArray(int columnIndex, Array x) throws SQLException {

    }

    public void updateArray(String columnLabel, Array x) throws SQLException {

    }

    public RowId getRowId(int columnIndex) throws SQLException {
        return null;
    }

    public RowId getRowId(String columnLabel) throws SQLException {
        return null;
    }

    public void updateRowId(int columnIndex, RowId x) throws SQLException {

    }

    public void updateRowId(String columnLabel, RowId x) throws SQLException {

    }

    public int getHoldability() throws SQLException {
        return holdability;
    }

    public boolean isClosed() throws SQLException {
        return false;
    }

    public void updateNString(int columnIndex, String nString) throws SQLException {

    }

    public void updateNString(String columnLabel, String nString) throws SQLException {

    }

    public void updateNClob(int columnIndex, NClob nClob) throws SQLException {

    }

    public void updateNClob(String columnLabel, NClob nClob) throws SQLException {

    }

    public NClob getNClob(int columnIndex) throws SQLException {
        return null;
    }

    public NClob getNClob(String columnLabel) throws SQLException {
        return null;
    }

    public SQLXML getSQLXML(int columnIndex) throws SQLException {
        return null;
    }

    public SQLXML getSQLXML(String columnLabel) throws SQLException {
        return null;
    }

    public void updateSQLXML(int columnIndex, SQLXML xmlObject) throws SQLException {

    }

    public void updateSQLXML(String columnLabel, SQLXML xmlObject) throws SQLException {

    }

    public String getNString(int columnIndex) throws SQLException {
        return null;
    }

    public String getNString(String columnLabel) throws SQLException {
        return null;
    }

    public Reader getNCharacterStream(int columnIndex) throws SQLException {
        return null;
    }

    public Reader getNCharacterStream(String columnLabel) throws SQLException {
        return null;
    }

    public void updateNCharacterStream(int columnIndex, Reader x, long length) throws SQLException {

    }

    public void updateNCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {

    }

    public void updateAsciiStream(int columnIndex, InputStream x, long length) throws SQLException {

    }

    public void updateBinaryStream(int columnIndex, InputStream x, long length) throws SQLException {

    }

    public void updateCharacterStream(int columnIndex, Reader x, long length) throws SQLException {

    }

    public void updateAsciiStream(String columnLabel, InputStream x, long length) throws SQLException {

    }

    public void updateBinaryStream(String columnLabel, InputStream x, long length) throws SQLException {

    }

    public void updateCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {

    }

    public void updateBlob(int columnIndex, InputStream inputStream, long length) throws SQLException {

    }

    public void updateBlob(String columnLabel, InputStream inputStream, long length) throws SQLException {

    }

    public void updateClob(int columnIndex, Reader reader, long length) throws SQLException {

    }

    public void updateClob(String columnLabel, Reader reader, long length) throws SQLException {

    }

    public void updateNClob(int columnIndex, Reader reader, long length) throws SQLException {

    }

    public void updateNClob(String columnLabel, Reader reader, long length) throws SQLException {

    }

    public void updateNCharacterStream(int columnIndex, Reader x) throws SQLException {

    }

    public void updateNCharacterStream(String columnLabel, Reader reader) throws SQLException {

    }

    public void updateAsciiStream(int columnIndex, InputStream x) throws SQLException {

    }

    public void updateBinaryStream(int columnIndex, InputStream x) throws SQLException {

    }

    public void updateCharacterStream(int columnIndex, Reader x) throws SQLException {

    }

    public void updateAsciiStream(String columnLabel, InputStream x) throws SQLException {

    }

    public void updateBinaryStream(String columnLabel, InputStream x) throws SQLException {

    }

    public void updateCharacterStream(String columnLabel, Reader reader) throws SQLException {

    }

    public void updateBlob(int columnIndex, InputStream inputStream) throws SQLException {

    }

    public void updateBlob(String columnLabel, InputStream inputStream) throws SQLException {

    }

    public void updateClob(int columnIndex, Reader reader) throws SQLException {

    }

    public void updateClob(String columnLabel, Reader reader) throws SQLException {

    }

    public void updateNClob(int columnIndex, Reader reader) throws SQLException {

    }

    public void updateNClob(String columnLabel, Reader reader) throws SQLException {

    }

    public <T> T getObject(int columnIndex, Class<T> type) throws SQLException {
        return null;
    }

    public <T> T getObject(String columnLabel, Class<T> type) throws SQLException {
        return null;
    }

    /**
     * TODO 理解
     * @param iface
     * @param <T>
     * @return
     * @throws SQLException
     */
    public <T> T unwrap(Class<T> iface) throws SQLException {
        try {
            return iface.cast(rowData);
        } catch (ClassCastException e){
            throw new SQLException(e);
        }
    }

    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}

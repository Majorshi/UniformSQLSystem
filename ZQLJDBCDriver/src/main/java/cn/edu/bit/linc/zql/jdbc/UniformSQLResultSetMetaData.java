package cn.edu.bit.linc.zql.jdbc;

import cn.edu.bit.linc.zql.network.client.RowData;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * Created by wyq on 2015/8/10.
 */
public class UniformSQLResultSetMetaData implements ResultSetMetaData {

    private UniformSQLResultSet             resultSet;

    public UniformSQLResultSetMetaData(final UniformSQLResultSet resultSet){
        this.resultSet = resultSet;
    }

    public int getColumnCount() throws SQLException {
        RowData rowData = resultSet.unwrap(RowData.class);

        if(rowData == null)
            return 0;
        return rowData.size();
    }

    public boolean isAutoIncrement(int column) throws SQLException {
        return false;
    }

    public boolean isCaseSensitive(int column) throws SQLException {
        return false;
    }

    public boolean isSearchable(int column) throws SQLException {
        return false;
    }

    public boolean isCurrency(int column) throws SQLException {
        return false;
    }

    public int isNullable(int column) throws SQLException {
        return 0;
    }

    public boolean isSigned(int column) throws SQLException {
        return false;
    }

    public int getColumnDisplaySize(int column) throws SQLException {
        return 0;
    }

    public String getColumnLabel(int column) throws SQLException {
        RowData rowData = resultSet.unwrap(RowData.class);
        if(rowData == null)
            return null;
        if(column > rowData.size() || column < 1)
            return null;
        return rowData.fieldNames()[column-1];
    }

    public String getColumnName(int column) throws SQLException {
        return getColumnLabel(column);
    }

    public String getSchemaName(int column) throws SQLException {
        return null;
    }

    public int getPrecision(int column) throws SQLException {
        return 0;
    }

    public int getScale(int column) throws SQLException {
        return 0;
    }

    public String getTableName(int column) throws SQLException {
        return null;
    }

    public String getCatalogName(int column) throws SQLException {
        return null;
    }

    public int getColumnType(int column) throws SQLException {
        return 0;
    }

    public String getColumnTypeName(int column) throws SQLException {
        return null;
    }

    public boolean isReadOnly(int column) throws SQLException {
        return false;
    }

    public boolean isWritable(int column) throws SQLException {
        return false;
    }

    public boolean isDefinitelyWritable(int column) throws SQLException {
        return false;
    }

    public String getColumnClassName(int column) throws SQLException {
        return null;
    }

    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}

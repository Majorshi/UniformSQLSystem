package cn.edu.bit.linc.zql.util;

import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.database.QueryDataSet;
import org.dbunit.database.search.TablesDependencyHelper;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据导出工具类
 */
public class DataExporter {
    public static void databaseExport(String dbName, String outputPath) throws ClassNotFoundException, DatabaseUnitException, SQLException, IOException {
        // 连接数据库

        Class driverClass = Class.forName("cn.edu.bit.linc.zql.jdbc.UniformSQLDriver");
        Connection jdbcConnection = DriverManager.getConnection(
                "jdbc:zql://127.0.0.1:9527", "wyq", "123456");

//        Class.forName("com.mysql.jdbc.Driver");
//        Connection jdbcConnection = DriverManager.getConnection(
//                "jdbc:mysql://lab2.ihainan.me/" + dbName, "ihainan", "123456");
        IDatabaseConnection connection = new DatabaseConnection(jdbcConnection);

        // 导出完整的数据库
        IDataSet fullDataSet = connection.createDataSet();
        FlatXmlDataSet.write(fullDataSet, new FileOutputStream(outputPath));
    }

    public static void partialExport(String[] sqlCommand, String[] newTableName, String outputPath) throws SQLException, ClassNotFoundException, DatabaseUnitException, IOException {
        if (sqlCommand.length != newTableName.length) return;

        // 连接数据库
        /*
        Class.forName("cn.edu.bit.linc.zql.jdbc.UniformSQLDriver");
        Connection jdbcConnection = DriverManager.getConnection(
                "jdbc:uniformsql:127.0.0.1:9527", "wyq", "123456");
        */
        Class.forName("com.mysql.jdbc.Driver");
        Connection jdbcConnection = DriverManager.getConnection(
                "jdbc:mysql://lab2.ihainan.me/", "ihainan", "123456");
        IDatabaseConnection connection = new DatabaseConnection(jdbcConnection);

        // 导出数据表
        QueryDataSet partialDataSet = new QueryDataSet(connection);
        for (int i = 0; i < sqlCommand.length; ++i) partialDataSet.addTable(newTableName[i], sqlCommand[i]);
        FlatXmlDataSet.write(partialDataSet, new FileOutputStream(outputPath));
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException, DatabaseUnitException, IOException {
        DataExporter.databaseExport("db_1", "test_data/exceptedCreateTable_new.xml");
        // DataExporter.partialExport(new String[]{"SELECT * FROM db_1.tb_1", "SELECT * FROM db_1.tb_2"}, new String[]{"tb_1", "tb_2"}, "test_data/table.xml");
    }
}

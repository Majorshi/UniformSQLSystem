package cn.edu.bit.linc.zql.util;

import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.database.QueryDataSet;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ReplacementDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.ext.mysql.MySqlDataTypeFactory;
import org.dbunit.ext.mysql.MySqlMetadataHandler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据导出工具类
 */
public class DataExporter {
    /**
     * 导出特定数据库在执行特定 SQL 语句前后的数据到特定文件中
     *
     * @param dbName      数据库名
     * @param outputName  导出文件前缀名
     * @param sqlCommands 需要执行的 SQL 语句
     * @throws ClassNotFoundException 找不到相应的 JDBC 驱动
     * @throws SQLException           执行 SQL 语句失败
     * @throws DatabaseUnitException  数据写入到文件中失败
     * @throws IOException            创建 / 写入文件失败
     */
    public static void databaseExport(String dbName, String outputName, String[] sqlCommands) throws ClassNotFoundException, SQLException, DatabaseUnitException, IOException {
        // 连接数据库
        Class.forName("com.mysql.jdbc.Driver");
        Connection jdbcConnection = DriverManager.getConnection(
                "jdbc:mysql://lab2.ihainan.me/" + dbName, "ihainan", "123456");
        IDatabaseConnection connection = new DatabaseConnection(jdbcConnection);

        // 导出原始数据
        databaseExport(connection, "test_data/" + outputName + "_original.xml");

        // 执行 SQL 命令
        for (String sqlCommand : sqlCommands) {
            connection.getConnection().createStatement().execute(sqlCommand);
        }

        // 导出变化后数据
        connection = new DatabaseConnection(jdbcConnection);
        databaseExport(connection, "test_data/" + outputName + "_expected.xml");
    }

    /**
     * 导出特定数据库中的数据到特定文件中
     *
     * @param connection 到指定数据库的连接
     * @param outputPath 输出路径
     * @throws ClassNotFoundException 找不到相应的 JDBC 驱动
     * @throws SQLException           执行 SQL 语句失败
     * @throws DatabaseUnitException  数据写入到文件中失败
     * @throws IOException            创建 / 写入文件失败
     */
    public static void databaseExport(IDatabaseConnection connection, String outputPath) throws ClassNotFoundException, DatabaseUnitException, SQLException, IOException {
        // 导出完整的数据库
        if (CONFIG.IS_MYSQL) {
            connection.getConfig().setProperty(DatabaseConfig.PROPERTY_DATATYPE_FACTORY,
                    new MySqlDataTypeFactory());
            connection.getConfig().setProperty(DatabaseConfig.PROPERTY_METADATA_HANDLER,
                    new MySqlMetadataHandler());
        }
        IDataSet fullDataSet = connection.createDataSet();
        ReplacementDataSet replacementExpectedDataSet = new ReplacementDataSet(fullDataSet);
        replacementExpectedDataSet.addReplacementObject(null, "[NULL]");
        File file = new File(outputPath);
        if (!file.exists()) {
            file.createNewFile();
        }
        FlatXmlDataSet.write(replacementExpectedDataSet, new FileOutputStream(file, false));
    }

    public static void partialExport(String dbName, String[] sqlCommand, String[] newTableName, String outputName) throws SQLException, ClassNotFoundException, DatabaseUnitException, IOException {
        if (sqlCommand.length == 0 || newTableName.length == 0 || sqlCommand.length != newTableName.length) return;
        Class.forName("com.mysql.jdbc.Driver");
        Connection jdbcConnection = DriverManager.getConnection(
                "jdbc:mysql://lab2.ihainan.me/" + dbName, "ihainan", "123456");
        IDatabaseConnection connection = new DatabaseConnection(jdbcConnection);
        if (CONFIG.IS_MYSQL) {
            connection.getConfig().setProperty(DatabaseConfig.PROPERTY_DATATYPE_FACTORY,
                    new MySqlDataTypeFactory());
            connection.getConfig().setProperty(DatabaseConfig.PROPERTY_METADATA_HANDLER,
                    new MySqlMetadataHandler());
        }
        databaseExport(connection, "test_data/" + outputName + "_db.xml");

        // 导出数据表
        QueryDataSet partialDataSet = new QueryDataSet(connection);
        for (int i = 0; i < sqlCommand.length; ++i) partialDataSet.addTable(newTableName[i], sqlCommand[i]);
        FlatXmlDataSet.write(partialDataSet, new FileOutputStream("test_data/" + outputName + ".xml"));
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException, DatabaseUnitException, IOException {
    }
}

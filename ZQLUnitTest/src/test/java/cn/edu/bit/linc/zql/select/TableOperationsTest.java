package cn.edu.bit.linc.zql.select;

import cn.edu.bit.linc.zql.util.CONFIG;
import cn.edu.bit.linc.zql.util.GenerateXMLFile;
import org.dbunit.Assertion;
import org.dbunit.DBTestCase;
import org.dbunit.PropertiesBasedJdbcDatabaseTester;
import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ReplacementDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.ext.mysql.MySqlDataTypeFactory;
import org.dbunit.ext.mysql.MySqlMetadataHandler;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.util.Arrays;

/**
 * 表格相关操作单元测试.
 */
public class TableOperationsTest extends DBTestCase {
    public final static String DB_NAME = "db_table_test";   // 测试用的数据库
    public final static String ORIGINAL_DATA_FILE = "../test_data/createTable_1_original.xml";   // 原始数据

    /**
     * 构造函数，用于初始化数据库连接
     *
     * @param name 测试用例名
     * @throws Exception 创建到数据库的连接失败
     */
    public TableOperationsTest(String name) throws Exception {
        super(name);

        // 数据库连接信息
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_DRIVER_CLASS, CONFIG.DBUNIT_DRIVER_CLASS);
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_CONNECTION_URL, CONFIG.DBUNIT_CONNECTION_URL + DB_NAME);
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_USERNAME, CONFIG.DBUNIT_USERNAME);
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_PASSWORD, CONFIG.DBUNIT_PASSWORD);
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_SCHEMA, DB_NAME);

        // 由于 MySQL 自身的特殊性，需要指定 DATATYPE_FACTORY 和 METADATA_HEADLER，对于统一 SQL 系统的测试则无需指定
        if (CONFIG.IS_MYSQL) {
            IDatabaseConnection dbConn = getConnection();
            dbConn.getConfig().setProperty(DatabaseConfig.PROPERTY_DATATYPE_FACTORY,
                    new MySqlDataTypeFactory());
            dbConn.getConfig().setProperty(DatabaseConfig.PROPERTY_METADATA_HANDLER,
                    new MySqlMetadataHandler());
            dbConn.getConfig().setFeature(DatabaseConfig.FEATURE_CASE_SENSITIVE_TABLE_NAMES, Boolean.TRUE);
        }
    }

    /**
     * 从文件中读取需要测试用的原始数据
     *
     * @return 原始数据集
     * @throws Exception 读取文件失败
     */
    @Override
    protected IDataSet getDataSet() throws Exception {
        IDataSet dataSet = new FlatXmlDataSetBuilder().build(new FileInputStream(ORIGINAL_DATA_FILE));
        ReplacementDataSet replacementExpectedDataSet = new ReplacementDataSet(dataSet);
        replacementExpectedDataSet.addReplacementObject("[NULL]", null);
        return replacementExpectedDataSet;
    }

    /**
     * 获取每个单元测试前需要执行的操作，一般用于恢复数据库
     *
     * @return 需要采用的恢复操作
     * @throws Exception 获取恢复的操作失败
     */
    protected DatabaseOperation getSetUpOperation() throws Exception {
        // 删除掉原始数据中没有的数据表
        ResultSet resultSet = getConnection().getConnection().createStatement().executeQuery("SHOW TABLES");
        while (resultSet.next()) {
            String realTbName = resultSet.getString(1);
            if (!Arrays.asList(getDataSet().getTableNames()).contains(realTbName)) {
                getConnection().getConnection().createStatement().execute("DROP TABLE " + realTbName);
            }
        }
        return DatabaseOperation.CLEAN_INSERT;  // 清除数据文件中涉及到的数据表，重新插入数据
    }

    /**
     * 执行完每个单元测试后需要执行的操作，一般无操作
     *
     * @return 需要采用的操作
     * @throws Exception 获取操作失败
     */
    protected DatabaseOperation getTearDownOperation() throws Exception {
        return DatabaseOperation.NONE;
    }

    public final static String CREATE_TABLE_ONE_EXPECTED_DATA_FILE = "../test_data/createTable_1_expected.xml";   // 期待得到的结果数据

    @Test
    public void testCreateTable() throws Exception {
        getConnection().getConnection().createStatement().execute(GenerateXMLFile.CREATE_TABLE_COMMAND_ONE);

        // 从远程数据库中获取数据
        IDataSet databaseDataSet = getConnection().createDataSet();

        // 读取期望的 XML 数据
        IDataSet expectedDataSet = new FlatXmlDataSetBuilder().build(new File(CREATE_TABLE_ONE_EXPECTED_DATA_FILE));
        ReplacementDataSet replacementExpectedDataSet = new ReplacementDataSet(expectedDataSet);
        replacementExpectedDataSet.addReplacementObject("[NULL]", null);

        Assertion.assertEquals(databaseDataSet, replacementExpectedDataSet);
    }
}
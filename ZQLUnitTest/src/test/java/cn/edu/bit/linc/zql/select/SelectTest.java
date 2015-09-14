package cn.edu.bit.linc.zql.select;

import cn.edu.bit.linc.zql.util.CONFIG;
import cn.edu.bit.linc.zql.util.GenerateXMLFile;
import org.dbunit.Assertion;
import org.dbunit.DBTestCase;
import org.dbunit.PropertiesBasedJdbcDatabaseTester;
import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;
import org.dbunit.dataset.ReplacementDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.ext.mysql.MySqlDataTypeFactory;
import org.dbunit.ext.mysql.MySqlMetadataHandler;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

/**
 * SELECT 语句单元测试.
 */
public class SelectTest extends DBTestCase {
    public final static String DB_NAME = "db_test";   // 测试用的数据库
    public final static String ORIGINAL_DATA_FILE = "../test_data/subquery_1_db.xml";   // 原始数据

    /**
     * 构造函数，用于初始化数据库连接
     *
     * @param name 测试用例名
     * @throws Exception 创建到数据库的连接失败
     */
    public SelectTest(String name) throws Exception {
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

    public final static String SUBQUERY_ONE_EXPECTED_DATA_FILE = "../test_data/subquery_1.xml";   // 期待得到的结果数据
    public final static String SUBQUERY_TWO_EXPECTED_DATA_FILE = "../test_data/subquery_2.xml";   // 期待得到的结果数据


    /**
     * 测试子查询
     *
     * @throws Exception 测试子查询出现异常
     */
    @Test
    public void testSubquery() throws Exception {
        /* 测试子查询语句一 */
        ITable actualSelectTable = getConnection().createQueryTable("result",
                GenerateXMLFile.SUBQUERY_COMMAND_ONE);
        IDataSet expectedDataSet = new FlatXmlDataSetBuilder().build(new File(SUBQUERY_ONE_EXPECTED_DATA_FILE));
        ITable expectedTable = expectedDataSet.getTable("result");
        Assertion.assertEquals(expectedTable, actualSelectTable);

        /* 测试子查询语句二 */
        actualSelectTable = getConnection().createQueryTable("result",
                GenerateXMLFile.SUBQUERY_COMMAND_TWO);
        expectedDataSet = new FlatXmlDataSetBuilder().build(new File(SUBQUERY_TWO_EXPECTED_DATA_FILE));
        expectedTable = expectedDataSet.getTable("result");
        Assertion.assertEquals(expectedTable, actualSelectTable);
    }

    public final static String JOIN_ONE_EXPECTED_DATA_FILE = "../test_data/join_1.xml";   // 期待得到的结果数据

    /**
     * 测试 Join
     *
     * @throws Exception 测试 JOIN 出现异常
     */
    @Test
    public void testJoin() throws Exception {
        /* 测试 Join 语句一 */
        ITable actualSelectTable = getConnection().createQueryTable("result",
                GenerateXMLFile.JOIN_COMMAND_ONE);
        IDataSet expectedDataSet = new FlatXmlDataSetBuilder().build(new File(JOIN_ONE_EXPECTED_DATA_FILE));
        ITable expectedTable = expectedDataSet.getTable("result");
        Assertion.assertEquals(expectedTable, actualSelectTable);
    }
}

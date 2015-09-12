package cn.edu.bit.linc.zql;

import org.dbunit.Assertion;
import org.dbunit.DBTestCase;
import org.dbunit.PropertiesBasedJdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

/**
 * 数据表相关操作单元测试
 */
public class TableTest extends DBTestCase {
    public TableTest(String name) {
        super(name);
//        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_DRIVER_CLASS, "cn.edu.bit.linc.zql.jdbc.UniformSQLDriver");
//        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_CONNECTION_URL, "jdbc:zql://127.0.0.1:9527");
//        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_USERNAME, "wyq");
//        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_PASSWORD, "123456");
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_DRIVER_CLASS, "com.mysql.jdbc.Driver");
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_CONNECTION_URL, "jdbc:mysql://lab2.ihainan.me/db_1");
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_USERNAME, "ihainan");
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_PASSWORD, "123456");
    }

    protected IDataSet getDataSet() throws Exception {
        return new FlatXmlDataSetBuilder().build(new FileInputStream("test_data/originalTables.xml"));
    }

    protected DatabaseOperation getSetUpOperation() throws Exception {
        // TODO: 重构数据操作
        return DatabaseOperation.REFRESH;
    }

    protected DatabaseOperation getTearDownOperation() throws Exception {
        // TODO: 删除数据操作
        return DatabaseOperation.NONE;
    }

    @Test
    public void testCreateTable() throws Exception {
        // 执行 SQL 语句
        String sqlCommand = "CREATE TABLE IF NOT EXISTS tb_z (C1 INT)";
        getConnection().getConnection().prepareStatement(sqlCommand).executeQuery();

        // 从远程数据库中获取数据
        IDataSet databaseDataSet = getConnection().createDataSet();

        // 读取期望的 XML 数据
        IDataSet expectedDataSet = new FlatXmlDataSetBuilder().build(new File("exceptedCreateTable.xml"));

        // 对比数据
        Assertion.assertEquals(databaseDataSet, expectedDataSet);
    }
}

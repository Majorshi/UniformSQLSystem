import cn.edu.bit.linc.zql.jdbc.UniformSQLDriver;
import cn.edu.bit.linc.zql.util.StringUtil;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.sql.*;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by wyq on 2015/8/23.
 */
public class JDBCDriverTest {

    @Test
    public void driverTest() throws ClassNotFoundException, SQLException {

        System.out.println(UniformSQLDriver.getVersion());

        Driver drv = new UniformSQLDriver();

        Assert.assertTrue(drv.acceptsURL("jdbc:uniformsql:local:./working/db/test"));
        TestCase.assertFalse(drv.acceptsURL("local:./working/db/test"));

        Connection conn = DriverManager.getConnection("jdbc:uniformsql:127.0.0.1:9527", "wyq", "123456");
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("SHOW TABLES");
        Assert.assertNotNull(rs);

        ResultSetMetaData rsmd = rs.getMetaData();
        Assert.assertNotNull(rsmd);

        int columnCount = rsmd.getColumnCount();
        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.println(rsmd.getColumnLabel(i) + "   :   " + rs.getObject(i));
            }
        }
        // boolean b = rsmd.isSearchable(1);
        rs.close();
        stat.close();
        conn.close();

    }

    @Test
    public void statementTest() throws SQLException, ClassNotFoundException {
        Class.forName("cn.edu.bit.linc.zql.jdbc.UniformSQLDriver");
        Connection conn = DriverManager.getConnection("jdbc:uniformsql:127.0.0.1:9527", "ihainan", "12345");
        Statement stat = conn.createStatement();
        Assert.assertNotNull(stat);

        boolean b = stat.execute("ALTER TABLE tb_2 RENAME TO tb_N");
        Assert.assertEquals(true, b);


        String userOne = "User_" + StringUtil.RandomStringGenerator.generateRandomString
                (5, StringUtil.RandomStringGenerator.Mode.ALPHA);
        b = stat.execute("CREATE USER " + userOne + " IDENTIFIED BY '123456'");
        Assert.assertEquals(true, b);

        stat.close();
        conn.close();
    }

}

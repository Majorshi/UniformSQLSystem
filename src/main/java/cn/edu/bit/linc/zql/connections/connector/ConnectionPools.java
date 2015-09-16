package cn.edu.bit.linc.zql.connections.connector;

import cn.edu.bit.linc.zql.ZQLContext;
import cn.edu.bit.linc.zql.databases.Database;
import cn.edu.bit.linc.zql.databases.InnerDatabase;
import cn.edu.bit.linc.zql.databases.InnerDatabases;
import cn.edu.bit.linc.zql.databases.MetaDatabase;
import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * 连接池，用于获取到某指定底层库的连接
 */
public class ConnectionPools {
    private static ConnectionPools connectionPools;
    private ComboPooledDataSource[] cpdsArray;
    private final Logger logger = LoggerFactory.getLogger(ConnectionPools.class);

    /**
     * 构造函数，初始化连接池
     */
    private ConnectionPools() {
        // 获取底层库和元数据库
        if (ZQLContext.innerDatabases == null) {
            logger.e("尚未初始化底层库");
            System.exit(0);
        }
        InnerDatabases innerDatabases = ZQLContext.innerDatabases;
        ArrayList<InnerDatabase> innerDatabaseArray = innerDatabases.getInnerDatabaseArray();
        if (ZQLContext.metaDatabase == null) {
            logger.e("尚未初始化元数据库");
            System.exit(0);
        }
        MetaDatabase metaDatabase = ZQLContext.metaDatabase;

        // 初始化连接池
        int size = innerDatabaseArray.size() + 1;
        cpdsArray = new ComboPooledDataSource[size];   // 第一个连接池连接到元数据库

        // 设置元数据库连接池
        cpdsArray[0] = getCPDS(metaDatabase);

        // 设置底层库连接池
        for (int i = 0; i < innerDatabaseArray.size(); ++i) {
            cpdsArray[i + 1] = getCPDS(innerDatabaseArray.get(i));
        }
    }


    /**
     * 根据 Database 对象获取 ComboPooledDataSource 实例
     *
     * @param db Database 对象
     * @return ComboPooledDataSource 实例
     */
    private ComboPooledDataSource getCPDS(Database db) {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        String driverStr = Database.getDriver(db.getDbType());
        try {
            cpds.setDriverClass(driverStr);
        } catch (PropertyVetoException e) {
            logger.f("找不到 JDBC 驱动" + driverStr, e);
            System.exit(0);
        }
        String url = Database.getURL(db.getDbType(), db.getDbHost(), null);
        cpds.setJdbcUrl(url);
        cpds.setUser(db.getDbUser());
        cpds.setPassword(db.getDbPassword());

        // TODO: 从配置文件中读取
        cpds.setMinPoolSize(5);
        cpds.setAcquireIncrement(5);
        cpds.setMaxPoolSize(20);
        cpds.setMaxStatements(180);

        return cpds;
    }

    /**
     * 实例化单例
     */
    private static synchronized void initSync() {
        connectionPools = new ConnectionPools();
    }

    /**
     * 获取 ConnectionPools 实例
     *
     * @return ConnectionPools 实例
     */
    public static ConnectionPools getInstance() {
        if (connectionPools == null) {
            initSync();
        }
        return connectionPools;
    }


    /**
     * 获取指定 ID 数据库的连接
     *
     * @param dbId 数据库 ID
     * @return 数据库连接
     * @throws SQLException 获取到数据库的连接失败
     */
    public Connection getConnection(int dbId) throws SQLException {
        return cpdsArray[dbId].getConnection();
    }
}

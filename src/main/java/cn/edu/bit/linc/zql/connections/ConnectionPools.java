package cn.edu.bit.linc.zql.connections;

import cn.edu.bit.linc.zql.ZQLContext;
import cn.edu.bit.linc.zql.databases.Database;
import cn.edu.bit.linc.zql.databases.InnerDatabase;
import cn.edu.bit.linc.zql.databases.InnerDatabases;
import cn.edu.bit.linc.zql.databases.MetaDatabase;
import cn.edu.bit.linc.zql.exceptions.ZQLConnectionException;
import cn.edu.bit.linc.zql.exceptions.ZQLErrorNumbers;
import cn.edu.bit.linc.zql.exceptions.ZQLExceptionUtils;
import cn.edu.bit.linc.zql.exceptions.ZQLSystemException;
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
    private final static Logger LOGGER = LoggerFactory.getLogger(ConnectionPools.class);

    /**
     * 构造函数，初始化连接池
     */
    private ConnectionPools() {
        // 检查系统是否已经初始化
        if (ZQLContext.innerDatabases == null) {
            int vendorCode = ZQLErrorNumbers.ERR_SYSTEM_INIT;
            String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{});
            ZQLSystemException zqlSystemException = new ZQLSystemException(reason, "HY000", vendorCode);
            LOGGER.f(reason, zqlSystemException);
            System.exit(0);
        }

        // 检查并获取底层库和元数据库
        MetaDatabase metaDatabase = ZQLContext.metaDatabase;
        if (metaDatabase == null) {
            int vendorCode = ZQLErrorNumbers.ERR_SYSTEM_META_INIT;
            String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{});
            ZQLSystemException zqlSystemException = new ZQLSystemException(reason, "HY000", vendorCode);
            LOGGER.f(reason, zqlSystemException);
            System.exit(0);
        }

        InnerDatabases innerDatabases = ZQLContext.innerDatabases;
        if (innerDatabases == null) {
            int vendorCode = ZQLErrorNumbers.ERR_SYSTEM_INNER_INIT;
            String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{});
            ZQLSystemException zqlSystemException = new ZQLSystemException(reason, "HY000", vendorCode);
            LOGGER.f(reason, zqlSystemException);
            System.exit(0);
        }
        ArrayList<InnerDatabase> innerDatabaseArray = innerDatabases.getInnerDatabaseArray();

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
            int vendorCode = 12000;
            String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{driverStr});
            ZQLConnectionException zqlConnectionException = new ZQLConnectionException(reason, "HY000", vendorCode);
            LOGGER.f(reason, zqlConnectionException);
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

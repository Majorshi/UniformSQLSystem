package cn.edu.bit.linc.zql.databases;

import cn.edu.bit.linc.zql.ZQLEnv;
import cn.edu.bit.linc.zql.connections.connector.ConnectionPools;
import cn.edu.bit.linc.zql.exceptions.MetaDatabaseOperationsException;
import cn.edu.bit.linc.zql.exceptions.ZQLConnectionException;
import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

/**
 * 元数据库类，存储元数据相关的信息与操作
 */
public class MetaDatabase extends Database {
    private String metaDbName;                  // 元数据库中，存储元数据的数据库的名字

    private final static Logger logger = LoggerFactory.getLogger(MetaDatabase.class);
    public final static int META_DB_ID = 0;     // 元数据库的编号固定为 0
    public final static String META_DB_ALIAS = "db_meta";       // 元数据库的别名固定为 db_meta
    public final static DBType META_DB_TYPE = DBType.MySQL;     // 元数据的数据库类型固定为 MySQL
    private static MetaDatabase metaDatabase = null;            // 元数据库实例
    private static Connection connection = null;

    /**
     * 初始化 connection 对象
     */
    public static void initConnection() {
        if (connection == null) {
            ConnectionPools connectionPools = ConnectionPools.getInstance();
            try {
                logger.i("正在建立到元数据库 " + metaDatabase + " 的连接");
                connection = connectionPools.getConnection(0);
                logger.i("成功连接到元数据库 " + metaDatabase);
            } catch (SQLException e) {
                ZQLConnectionException connectionException = new ZQLConnectionException("到元数据库 " + metaDatabase + " 的连接失败");
                connectionException.initCause(e);
                logger.f("到元数据库 " + metaDatabase.toString() + " 的连接失败", connectionException);
                System.exit(0);
            }
            createMetaDatabase();
        }
    }

    /**
     * 获取元数据库中，存储元数据的数据库的名字
     *
     * @return 存储元数据的数据库的名字
     */
    public String getMetaDbName() {
        return metaDbName;
    }

    /**
     * 构造函数
     *
     * @param dbHost     数据库地址
     * @param dbUser     数据库连接用户
     * @param dbPassword 数据库用户密码
     * @param metaDbName 元数据库中，存储元数据的数据库的名字
     */
    private MetaDatabase(String dbHost, String dbUser, String dbPassword, String metaDbName) {
        super(META_DB_ID, META_DB_TYPE, META_DB_ALIAS, dbHost, dbUser, dbPassword);
        this.metaDbName = metaDbName;
    }


    /**
     * 获取 MetaDatabase 实例
     *
     * @return MetaDatabase 实例
     */
    public static MetaDatabase getInstance() {
        if (metaDatabase == null) {
            readMetaDatabaseFromConfigurationFile();
        }
        return metaDatabase;
    }

    /**
     * 从系统配置中读取元数据库信息
     */
    private static void readMetaDatabaseFromConfigurationFile() {
        logger.i("正在从配置文件中读取元数据库信息");
        String host = ZQLEnv.get("metadb.host");
        String user = ZQLEnv.get("metadb.username");
        String password = ZQLEnv.get("metadb.password");
        String dbName = ZQLEnv.get("metadb.dbname");
        if (host == null || user == null || password == null || dbName == null) {
            logger.f("元数据库配置项不完整");
            System.exit(0);
        }
        metaDatabase = new MetaDatabase(host, user, password, dbName);
        logger.i("从配置文件中读取得到元数据库 " + metaDatabase + " 的信息");
    }

    private final static String CREATE_META_DB_SQL = "CREATE DATABASE IF NOT EXISTS %s";
    private final static String CREATE_ZQL_USERS_TB_SQL = "CREATE TABLE IF NOT EXISTS %s.zql_users (User char(64) PRIMARY KEY, Password char(41)) ENGINE=InnoDB";
    private final static String CREATE_ZQL_INNER_DBS_TB_SQL = "CREATE TABLE IF NOT EXISTS %s.zql_inner_dbs " +
            "(Inner_db_id INT(10), Db_alias CHAR(64), PRIMARY KEY(Inner_db_id, Db_alias)) ENGINE=InnoDB";
    private final static String INSERT_INTO_INNER_DBS_TB_SQL = "INSERT IGNORE INTO %s.zql_inner_dbs VALUES(%s, '%s')";
    private final static String CREATE_ZQL_DBS_TB_SQL = "CREATE TABLE IF NOT EXISTS %s.zql_dbs " +
            "(Db char(64) PRIMARY KEY, Inner_db_id int(10), Db_alias char(64), User char(64), " +
            "Timestamp timestamp, FOREIGN KEY(User) REFERENCES %s.zql_users(User), " +
            "FOREIGN KEY(Inner_db_id, Db_alias) REFERENCES %s.zql_inner_dbs(Inner_db_id, Db_alias) ON UPDATE CASCADE ON DELETE CASCADE" +
            ") ENGINE=InnoDB";
    private final static String CREATE_ZQL_TABLES_TB_SQL = "CREATE TABLE IF NOT EXISTS %s.zql_tables " +
            "(Db char(64), Tb char(16), User char(64), Timestamp timestamp, PRIMARY KEY(Db, Tb), " +
            "FOREIGN KEY(User) REFERENCES %s.zql_users(User) ON UPDATE CASCADE ON DELETE SET NULL, " +
            "FOREIGN KEY(Db) REFERENCES %s.zql_dbs(Db) ON UPDATE CASCADE ON DELETE CASCADE) ENGINE=InnoDB";
    private final static String CREATE_ZQL_TABLES_PRIV = "CREATE TABLE IF NOT EXISTS %s.zql_tables_priv (User char(64), Db char(64), Tb char(16), Select_priv enum('Y', 'N') DEFAULT 'N', Insert_priv enum('Y', 'N') DEFAULT 'N', Update_priv enum('Y', 'N') DEFAULT 'N', Delete_priv enum('Y', 'N') DEFAULT 'N'," +
            " All_priv enum('Y', 'N') DEFAULT 'N',  Grant_option enum('Y', 'N') DEFAULT 'N', " +
            "PRIMARY KEY(User, Db, Tb), FOREIGN KEY(User) " +
            "REFERENCES %s.zql_users(User) ON UPDATE CASCADE ON DELETE CASCADE, FOREIGN KEY(Db, Tb) " +
            "REFERENCES %s.zql_tables(Db, Tb) ON UPDATE CASCADE ON DELETE CASCADE) ENGINE=InnoDB";
    private final static String CREATE_ROOT_USER = "INSERT IGNORE INTO %s.zql_users VALUES('root', 'root')";

    /**
     * 创建元数据库
     */
    private static void createMetaDatabase() {
        logger.i("正在创建和初始化元数据库");

        /* 连接元数据库 */
        try {
            initConnection();
            Statement statement = connection.createStatement();
            statement.execute(String.format(CREATE_META_DB_SQL, metaDatabase.getMetaDbName()));
            statement.execute(String.format(CREATE_ZQL_INNER_DBS_TB_SQL, metaDatabase.getMetaDbName()));
            for (InnerDatabase innerDatabase : InnerDatabases.getInstance().getInnerDatabaseArray()) {
                statement.execute(String.format(INSERT_INTO_INNER_DBS_TB_SQL, metaDatabase.getMetaDbName(),
                        innerDatabase.getDbId(), innerDatabase.getDbAlias()));
            }
            statement.execute(String.format(CREATE_ZQL_USERS_TB_SQL, metaDatabase.getMetaDbName()));
            statement.execute(String.format(CREATE_ZQL_DBS_TB_SQL, metaDatabase.getMetaDbName(), metaDatabase.getMetaDbName(),
                    metaDatabase.getMetaDbName(), metaDatabase.getMetaDbName(), metaDatabase.getMetaDbName()));
            statement.execute(String.format(CREATE_ZQL_TABLES_TB_SQL, metaDatabase.getMetaDbName(), metaDatabase.getMetaDbName(), metaDatabase.getMetaDbName()));
            statement.execute(String.format(CREATE_ZQL_TABLES_PRIV, metaDatabase.getMetaDbName(), metaDatabase.getMetaDbName(), metaDatabase.getMetaDbName()));
            statement.execute(String.format(CREATE_ROOT_USER, metaDatabase.getMetaDbName()));
            logger.i("创建和初始化元数据库成功");
        } catch (SQLException e) {
            logger.f("创建元数据库失败，错误原因：", e);
            System.exit(0);
        }
    }

    private final static String SELECT_DB_FORM_ZQL_DBS_SQL = "SELECT * FROM %s.zql_dbs WHERE Db = '%s'";

    /**
     * 获取指定名字数据库所在的底层库
     *
     * @param dbName 数据库名
     * @return 底层库 ID，如果元数据库中没有记录，则返回 -1
     * @throws cn.edu.bit.linc.zql.exceptions.MetaDatabaseOperationsException 从元数据库中查询某数据库所述的底层库失败
     */
    public int getInnerDatabaseId(String dbName) throws MetaDatabaseOperationsException {
        /* 连接元数据库并执行命令 */
        try {
            initConnection();
            Statement statement = connection.createStatement();
            String sqlCommand = String.format(SELECT_DB_FORM_ZQL_DBS_SQL, metaDatabase.getMetaDbName(), dbName);
            logger.d("从元数据库中查询某数据库所在的底层库：" + sqlCommand);
            ResultSet resultSet = statement.executeQuery(sqlCommand);
            if (resultSet.next()) {
                return Integer.valueOf(resultSet.getString("Inner_db_id"));
            }
        } catch (SQLException e) {
            MetaDatabaseOperationsException metaDatabaseOperationsException = new MetaDatabaseOperationsException("从元数据库中查询数据库" + dbName + " 所在的底层库失败");
            metaDatabaseOperationsException.initCause(e);
            throw metaDatabaseOperationsException;
        }
        return -1;   // 默认使用第 1 个底层库
    }

    private final static String SELECT_PRIVILEGES_SQL = "SELECT * FROM %s.zql_tables_priv WHERE Db = '%s' " +
            "and Tb = '%s' and User = '%s'";

    /**
     * 获取指定用户对于某数据表的权限
     *
     * @param databaseName 数据库名
     * @param tableName    数据表名
     * @param user         用户
     * @return 权限列表
     * @throws MetaDatabaseOperationsException 从元数据库中获取用户 user 对于数据表 databaseName.tableName 的权限失败
     */
    public Map<String, String> getPrivilegesOfASpecifiedUserAndTable(String databaseName, String tableName, String user) throws MetaDatabaseOperationsException {
        /* 连接元数据库并执行命令 */
        try {
            initConnection();
            Statement statement = connection.createStatement();
            String sqlCommand = String.format(SELECT_PRIVILEGES_SQL, metaDatabase.getMetaDbName(), databaseName,
                    tableName, user);
            ResultSet resultSet = statement.executeQuery(sqlCommand);
            if (resultSet.next()) {
                Map<String, String> privileges = new HashMap<String, String>();
                privileges.put("SELECT", resultSet.getString("Select_priv"));
                privileges.put("INSERT", resultSet.getString("Insert_priv"));
                privileges.put("UPDATE", resultSet.getString("Update_priv"));
                privileges.put("DELETE", resultSet.getString("Delete_priv"));
                privileges.put("ALL", resultSet.getString("All_priv"));
                privileges.put("GRANT_OPTION", resultSet.getString("Grant_option"));
                return privileges;
            }
        } catch (SQLException e) {
            MetaDatabaseOperationsException metaDatabaseOperationsException = new MetaDatabaseOperationsException("从元数据库中获取用户 " + user + " 对于数据表" + databaseName + "." + tableName + " 的权限失败");
            metaDatabaseOperationsException.initCause(e);
            throw metaDatabaseOperationsException;
        }

        return null;
    }
}

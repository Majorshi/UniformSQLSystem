package cn.edu.bit.linc.zql.databases;

import cn.edu.bit.linc.zql.ZQLContext;
import cn.edu.bit.linc.zql.ZQLEnv;
import cn.edu.bit.linc.zql.connections.ConnectionPools;
import cn.edu.bit.linc.zql.exceptions.ZQLErrorNumbers;
import cn.edu.bit.linc.zql.exceptions.ZQLExceptionUtils;
import cn.edu.bit.linc.zql.exceptions.ZQLMetaDatabaseConnectionException;
import cn.edu.bit.linc.zql.exceptions.ZQLMetaDatabaseExecutionException;
import cn.edu.bit.linc.zql.util.CHAP;
import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import static cn.edu.bit.linc.zql.util.CHAP.checkToken;

/**
 * 元数据库类，存储元数据相关的信息与操作
 */
public class MetaDatabase extends Database {
    private String metaDbName;                  // 元数据库中，存储元数据的数据库的名字

    private final static Logger LOGGER = LoggerFactory.getLogger(MetaDatabase.class);
    public final static int META_DB_ID = 0;     // 元数据库的编号固定为 0
    public final static String META_DB_ALIAS = "db_meta";       // 元数据库的别名固定为 db_meta
    public final static DBType META_DB_TYPE = DBType.MySQL;     // 元数据的数据库类型固定为 MySQL
    private static MetaDatabase metaDatabase = null;            // 元数据库实例
    private static String temp_db_name = "";
    public final static String TEMP_DB_DEFAULT_NAME = "temp_db";

    /**
     * 获取元数据库中，存储元数据的数据库的名字
     *
     * @return 存储元数据的数据库的名字
     */
    public String getMetaDbName() {
        return metaDbName;
    }

    /**
     * 获取元数据库中临时数据库的名字
     *
     * @return 存储元数据的数据库的名字
     */
    public String getTempDbName() {
        return temp_db_name;
    }


    /**
     * 构造函数
     *
     * @param dbHost     数据库地址
     * @param dbUser     数据库连接用户
     * @param dbPassword 数据库用户密码
     * @param metaDbName 元数据库中，存储元数据的数据库的名字
     */
    private MetaDatabase(String dbHost, String dbUser, String dbPassword, String metaDbName, String tempdbName) {
        super(META_DB_ID, META_DB_TYPE, META_DB_ALIAS, dbHost, dbUser, dbPassword);
        this.metaDbName = metaDbName;
        this.temp_db_name = tempdbName == null ? TEMP_DB_DEFAULT_NAME : tempdbName;
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
     * 从系统配置中读取元数据库信息，仅允许在 ZQLContext.initializeSystem 方法中调用
     */
    private static synchronized void readMetaDatabaseFromConfigurationFile() {
        LOGGER.i("正在从配置文件中读取元数据库信息");
        ZQLEnv.checkConfigurationItems(ZQLEnv.META_DB_HOST, ZQLEnv.META_DB_USERNAME,
                ZQLEnv.META_DB_PASSWORD, ZQLEnv.META_DB_DBNAME);

        String host = ZQLEnv.get(ZQLEnv.META_DB_HOST);
        String user = ZQLEnv.get(ZQLEnv.META_DB_USERNAME);
        String password = ZQLEnv.get(ZQLEnv.META_DB_PASSWORD);
        String dbName = ZQLEnv.get(ZQLEnv.META_DB_DBNAME);
        String tempdbName = ZQLEnv.get(ZQLEnv.META_DB_TEMPDBNAME);
        metaDatabase = new MetaDatabase(host, user, password, dbName, tempdbName);
        LOGGER.i("从配置文件中读取得到元数据库 " + metaDatabase + " 的信息");
    }


    private final static String CREATE_META_DB_SQL = "CREATE DATABASE IF NOT EXISTS %s";
    //临时数据库
    private final static String CREATE_TEMP_DB_SQL = "CREATE DATABASE IF NOT EXISTS %s";

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
    private final static String CREATE_ROOT_USER = "INSERT IGNORE INTO %s.zql_users VALUES('root', '" + CHAP.SHA1(CHAP.SHA1("root")) + "')";

    /**
     * 创建元数据库，<b>只能在 ZQLContext.initializeSystem 方法中被调用</b>
     */
    public static void createMetaDatabase() {
        LOGGER.i("正在创建和初始化元数据库");
        /* 连接元数据库 */
        Connection connection = null;
        try {
            connection = ConnectionPools.getInstance().getConnection(0);
            Statement statement = connection.createStatement();
            statement.execute(String.format(CREATE_META_DB_SQL, metaDatabase.getMetaDbName()));
            //临时数据库创建
            statement.execute(String.format(CREATE_TEMP_DB_SQL, metaDatabase.getTempDbName()));

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
            LOGGER.i("创建和初始化元数据库成功");
        } catch (SQLException e) {
            int vendorCode = ZQLErrorNumbers.ERR_META_EXEC;
            String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{ZQLContext.metaDatabase.toString(), "[数据库创建语句]"});
            ZQLMetaDatabaseExecutionException zqlMetaDatabaseExecutionException = new ZQLMetaDatabaseExecutionException(reason, e.getSQLState(), vendorCode);
            zqlMetaDatabaseExecutionException.initCause(e);
            LOGGER.f(reason, zqlMetaDatabaseExecutionException);
            System.exit(0);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    int vendorCode = ZQLErrorNumbers.ERR_META_CON_CLOSE;
                    String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{ZQLContext.metaDatabase.toString()});
                    ZQLMetaDatabaseConnectionException zqlMetaDatabaseConnectionException = new ZQLMetaDatabaseConnectionException(reason, e.getSQLState(), vendorCode);
                    zqlMetaDatabaseConnectionException.initCause(e);
                    LOGGER.e(reason, zqlMetaDatabaseConnectionException);
                }
            }
        }
    }

    private final static String SELECT_DB_FORM_ZQL_DBS_SQL = "SELECT * FROM %s.zql_dbs WHERE Db = '%s'";

    /**
     * 获取指定名字数据库所在的底层库
     *
     * @param dbName 数据库名
     * @return 底层库 DbAlias，如果元数据库中没有记录，则返回""
     */
    public String getInnerDatabaseDbAlias(String dbName) throws ZQLMetaDatabaseConnectionException, ZQLMetaDatabaseExecutionException {
        /* 连接元数据库并执行命令 */
        Connection connection = null;
        String sqlCommand = "";
        try {
            connection = ConnectionPools.getInstance().getConnection(0);
            Statement statement = connection.createStatement();
            sqlCommand = String.format(SELECT_DB_FORM_ZQL_DBS_SQL, metaDatabase.getMetaDbName(), dbName);
            LOGGER.d("从元数据库中查询某数据库所在的底层库：" + sqlCommand);
            ResultSet resultSet = statement.executeQuery(sqlCommand);
            if (resultSet.next()) {
                return resultSet.getString("Db_alias");
            }
        } catch (SQLException e) {
            int vendorCode = ZQLErrorNumbers.ERR_META_EXEC;
            String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{ZQLContext.metaDatabase.toString(), sqlCommand});
            ZQLMetaDatabaseExecutionException zqlMetaDatabaseExecutionException = new ZQLMetaDatabaseExecutionException(reason, e.getSQLState(), vendorCode);
            zqlMetaDatabaseExecutionException.initCause(e);
            throw zqlMetaDatabaseExecutionException;
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    int vendorCode = ZQLErrorNumbers.ERR_META_CON_CLOSE;
                    String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{ZQLContext.metaDatabase.toString()});
                    ZQLMetaDatabaseConnectionException zqlMetaDatabaseConnectionException = new ZQLMetaDatabaseConnectionException(reason, e.getSQLState(), vendorCode);
                    zqlMetaDatabaseConnectionException.initCause(e);
                    LOGGER.e(reason, zqlMetaDatabaseConnectionException);
                }
            }
        }
        return "";
    }


    /**
     * 获取指定名字数据库所在的底层库
     *
     * @param dbName 数据库名
     * @return 底层库 ID，如果元数据库中没有记录，则返回 -1
     */
    public int getInnerDatabaseId(String dbName) throws ZQLMetaDatabaseConnectionException, ZQLMetaDatabaseExecutionException {
        /* 连接元数据库并执行命令 */
        Connection connection = null;
        String sqlCommand = "";
        try {
            connection = ConnectionPools.getInstance().getConnection(0);
            Statement statement = connection.createStatement();
            sqlCommand = String.format(SELECT_DB_FORM_ZQL_DBS_SQL, metaDatabase.getMetaDbName(), dbName);
            LOGGER.d("从元数据库中查询某数据库所在的底层库：" + sqlCommand);
            ResultSet resultSet = statement.executeQuery(sqlCommand);
            if (resultSet.next()) {
                return Integer.valueOf(resultSet.getString("Inner_db_id"));
            }
        } catch (SQLException e) {
            int vendorCode = ZQLErrorNumbers.ERR_META_EXEC;
            String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{ZQLContext.metaDatabase.toString(), sqlCommand});
            ZQLMetaDatabaseExecutionException zqlMetaDatabaseExecutionException = new ZQLMetaDatabaseExecutionException(reason, e.getSQLState(), vendorCode);
            zqlMetaDatabaseExecutionException.initCause(e);
            throw zqlMetaDatabaseExecutionException;
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    int vendorCode = ZQLErrorNumbers.ERR_META_CON_CLOSE;
                    String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{ZQLContext.metaDatabase.toString()});
                    ZQLMetaDatabaseConnectionException zqlMetaDatabaseConnectionException = new ZQLMetaDatabaseConnectionException(reason, e.getSQLState(), vendorCode);
                    zqlMetaDatabaseConnectionException.initCause(e);
                    LOGGER.e(reason, zqlMetaDatabaseConnectionException);
                }
            }
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
     */
    public Map<String, String> getPrivilegesOfASpecifiedUserAndTable(String databaseName, String tableName, String user) throws ZQLMetaDatabaseConnectionException, ZQLMetaDatabaseExecutionException {
        /* 连接元数据库并执行命令 */
        Connection connection = null;
        String sqlCommand = "";
        try {
            connection = ConnectionPools.getInstance().getConnection(0);
            Statement statement = connection.createStatement();
            sqlCommand = String.format(SELECT_PRIVILEGES_SQL, metaDatabase.getMetaDbName(), databaseName,
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
            int vendorCode = ZQLErrorNumbers.ERR_META_EXEC;
            String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{ZQLContext.metaDatabase.toString(), sqlCommand});
            ZQLMetaDatabaseExecutionException zqlMetaDatabaseExecutionException = new ZQLMetaDatabaseExecutionException(reason, e.getSQLState(), vendorCode);
            zqlMetaDatabaseExecutionException.initCause(e);
            throw zqlMetaDatabaseExecutionException;
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    int vendorCode = ZQLErrorNumbers.ERR_META_CON_CLOSE;
                    String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{ZQLContext.metaDatabase.toString()});
                    ZQLMetaDatabaseConnectionException zqlMetaDatabaseConnectionException = new ZQLMetaDatabaseConnectionException(reason, e.getSQLState(), vendorCode);
                    zqlMetaDatabaseConnectionException.initCause(e);
                    throw zqlMetaDatabaseConnectionException;
                }
            }
        }

        return null;
    }


    private final static String SELECT_USER_PASSWORD_SQL = "SELECT * FROM %s.zql_users WHERE User = '%s' ";

    /**
     * 验证用户密码是否正确
     *
     * @param userName 需要检测的用户名
     * @param scramble 由服务器端生成的 20 位随机数
     * @param token    客户端返回的认证信息
     * @return 如果密码正确，返回 true，否则返回 false
     */
    public boolean checkPassword(String userName, String scramble, String token) throws ZQLMetaDatabaseConnectionException, ZQLMetaDatabaseExecutionException {
        /* 连接元数据库并执行命令 */
        Connection connection = null;
        String sqlCommand = "";
        try {
            connection = ConnectionPools.getInstance().getConnection(0);
            Statement statement = connection.createStatement();
            sqlCommand = String.format(SELECT_USER_PASSWORD_SQL, metaDatabase.getMetaDbName(), userName);
            ResultSet resultSet = statement.executeQuery(sqlCommand);

            if (resultSet.next()) {
                String realPassword = resultSet.getString("Password");
                return checkToken(realPassword, scramble, token);
            } else throw new SQLException("用户 " + userName + " 不存在");
        } catch (SQLException e) {
            int vendorCode = ZQLErrorNumbers.ERR_META_EXEC;
            String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{ZQLContext.metaDatabase.toString(), sqlCommand});
            ZQLMetaDatabaseExecutionException zqlMetaDatabaseExecutionException = new ZQLMetaDatabaseExecutionException(reason, e.getSQLState(), vendorCode);
            zqlMetaDatabaseExecutionException.initCause(e);
            throw zqlMetaDatabaseExecutionException;
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    int vendorCode = ZQLErrorNumbers.ERR_META_CON_CLOSE;
                    String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{ZQLContext.metaDatabase.toString()});
                    ZQLMetaDatabaseConnectionException zqlMetaDatabaseConnectionException = new ZQLMetaDatabaseConnectionException(reason, e.getSQLState(), vendorCode);
                    zqlMetaDatabaseConnectionException.initCause(e);
                    throw zqlMetaDatabaseConnectionException;
                }
            }
        }
    }
}

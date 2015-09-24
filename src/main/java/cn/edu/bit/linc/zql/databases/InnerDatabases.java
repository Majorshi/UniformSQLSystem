package cn.edu.bit.linc.zql.databases;

import cn.edu.bit.linc.zql.ZQLEnv;
import cn.edu.bit.linc.zql.command.*;
import cn.edu.bit.linc.zql.connections.ConnectionPools;
import cn.edu.bit.linc.zql.exceptions.*;
import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 数据库底层库管理类
 */
public class InnerDatabases {
    private final static Logger LOGGER = LoggerFactory.getLogger(InnerDatabases.class);

    private ArrayList<InnerDatabase> innerDatabaseArray = new ArrayList<InnerDatabase>();  // 底层库数组，用于存储底层库的信息
    public final static SQLCommandBuilder sqlCommandBuilder;                   // SQL 命令构造器，用于构造到底层库的命令

    static {
        sqlCommandBuilder = new SQLCommandBuilder();
        sqlCommandBuilder.addAdapter(new MySQLCommandAdapter());
        sqlCommandBuilder.addAdapter(new HiveCommandAdapter());
    }

    /**
     * 获取底层库连接信息
     *
     * @return 底层库连接信息
     */
    public ArrayList<InnerDatabase> getInnerDatabaseArray() {
        return new ArrayList<InnerDatabase>(innerDatabaseArray);
    }

    /**
     * 构造函数
     */
    private InnerDatabases() {
        // 读取配置文件，获取底层库信息
        getInnerDatabasesFromConfigurationFile();
    }

    private static InnerDatabases innerDatabases;

    /**
     * 获取 InnerDatabases 实例
     *
     * @return InnerDatabases 实例
     */
    public static InnerDatabases getInstance() {
        if (innerDatabases == null) {
            innerDatabases = new InnerDatabases();
        }
        return innerDatabases;
    }

    /**
     * 从系统配置中读取底层库信息
     */
    private synchronized void getInnerDatabasesFromConfigurationFile() {
        LOGGER.i("正在从配置文件中读取底层库信息");
        int dbNo = 1;
        Map<String, Integer> aliasHashMap = new HashMap<String, Integer>();
        while (true) {
            String prefix = "innerdb.db" + dbNo;
            if (ZQLEnv.get(prefix) != null
                    && ZQLEnv.get(prefix) != null
                    && ZQLEnv.get(prefix).equals("enable")) {
                // 检查配置项是否完整，获取配置内容
                String itemDbAlias = prefix + ".alias";
                String itemDbHost = prefix + ".host";
                String itemDbUser = prefix + ".username";
                String itemDbPassword = prefix + ".password";
                String itemDbType = prefix + ".type";

                ZQLEnv.checkConfigurationItems(itemDbAlias, itemDbHost, itemDbUser, itemDbPassword, itemDbType);

                String dbAlias = ZQLEnv.get(itemDbAlias);
                String dbHost = ZQLEnv.get(itemDbHost);
                String dbUser = ZQLEnv.get(itemDbUser);
                String dbPassword = ZQLEnv.get(itemDbPassword);

                // 检测别名是否冲突
                Integer preId = aliasHashMap.put(dbAlias, dbNo);
                if (preId != null) {
                    String reason = ZQLExceptionUtils.getMessage(11501, new String[]{itemDbAlias});
                    ZQLConfigurationException zqlConfigurationException = new ZQLConfigurationException(reason, "HY000", 11501);
                    LOGGER.f(reason, zqlConfigurationException);
                    System.exit(0);
                }

                // 检查底层库类型是否被支持
                Database.DBType dbType = null;
                try {
                    dbType = Database.DBType.valueOf(ZQLEnv.get(itemDbType));
                } catch (Exception e) {
                    int vendorCode = ZQLErrorNumbers.ERR_NOT_SUPPORTED_DB;
                    String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{ZQLEnv.get(itemDbType)});
                    ZQLNotSupportedDatabaseException zqlNotSupportedDatabaseException = new ZQLNotSupportedDatabaseException(reason, "HY000", vendorCode);
                    zqlNotSupportedDatabaseException.initCause(e);
                    LOGGER.f(reason, zqlNotSupportedDatabaseException);
                    System.exit(0);
                }
                InnerDatabase innerDatabase = new InnerDatabase(dbNo, dbType, dbAlias, dbHost, dbUser, dbPassword);
                innerDatabaseArray.add(innerDatabase);
                dbNo++;
            } else {
                break;
            }
        }
        LOGGER.i("从配置文件中读取底层库信息成功，共有 " + innerDatabaseArray.size() + " 个底层库：" + innerDatabaseArray);
    }

    /**
     * 获取特定数据列的类型
     *
     * @param dbNo         底层库编号
     * @param databaseName 数据库名
     * @param tableName    数据表名
     * @param columnName   数据列名
     * @return 数据列的类型
     */
    public String getColumnType(int dbNo, String databaseName, String tableName, String columnName) throws ZQLInnerDatabaseExecutionException {
        /* 连接底层库并执行命令 */
        ConnectionPools connectionPools = ConnectionPools.getInstance();
        Connection connection = null;
        Statement statement = null;
        InnerSQLCommand command = null;
        try {
            CommandAdapter adapterAdapter = CommandAdapter.getAdapterInstance(innerDatabaseArray.get(dbNo - 1).getDbType());
            connection = connectionPools.getConnection(dbNo);
            statement = connection.createStatement();
            // USE db_name
            command = sqlCommandBuilder.useDatabase(adapterAdapter.dbType, databaseName);
            statement.execute(command.getCommandStr());
            // GET COLUMN_TYPE
            command = sqlCommandBuilder.getColumnType(adapterAdapter.dbType, tableName, columnName);
            ResultSet resultSet = statement.executeQuery(command.getCommandStr());
            if (resultSet.next()) {
                return resultSet.getString(adapterAdapter.TYPE_FILED_NAME);
            }
        } catch (SQLException e) {
            int vendorCode = ZQLErrorNumbers.ERR_INNER_EXEC;
            String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{innerDatabaseArray.get(dbNo - 1).toString(), command.getCommandStr()});
            ZQLInnerDatabaseExecutionException zqlInnerDatabaseExecutionException = new ZQLInnerDatabaseExecutionException(reason, e.getSQLState(), vendorCode);
            zqlInnerDatabaseExecutionException.initCause(e);
            throw zqlInnerDatabaseExecutionException;
        } finally {
            if (connection != null) try {
                connection.close();
            } catch (SQLException e) {
                int vendorCode = ZQLErrorNumbers.ERR_INNER_CON_CLOSE;
                String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{innerDatabaseArray.get(dbNo - 1).toString()});
                ZQLMetaDatabaseConnectionException zqlMetaDatabaseConnectionException = new ZQLMetaDatabaseConnectionException(reason, e.getSQLState(), vendorCode);
                zqlMetaDatabaseConnectionException.initCause(e);
                LOGGER.e(reason, zqlMetaDatabaseConnectionException);
            }
        }
        return "INT";
    }

    public HashMap<String, String> getColumnTypeInTable(int dbNo, String databaseName, String tableName) throws ZQLInnerDatabaseExecutionException {
        /* 连接底层库并执行命令 */
        ConnectionPools connectionPools = ConnectionPools.getInstance();
        Connection connection = null;
        Statement statement = null;
        InnerSQLCommand command = null;
        try {
            CommandAdapter adapterAdapter = CommandAdapter.getAdapterInstance(innerDatabaseArray.get(dbNo - 1).getDbType());
            connection = connectionPools.getConnection(dbNo);
            statement = connection.createStatement();
            // USE db_name
            command = sqlCommandBuilder.useDatabase(adapterAdapter.dbType, databaseName);
            statement.execute(command.getCommandStr());
            // GET COLUMN_TYPE
            command = sqlCommandBuilder.getColumnInfo(adapterAdapter.dbType, tableName);
            ResultSet resultSet = statement.executeQuery(command.getCommandStr());
            HashMap<String, String> types = new HashMap<String, String>();
            if (resultSet.next()) {
                types.put(resultSet.getString("field"), resultSet.getString(adapterAdapter.TYPE_FILED_NAME));
            }
            return types;
        } catch (SQLException e) {
            int vendorCode = ZQLErrorNumbers.ERR_INNER_EXEC;
            String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{innerDatabaseArray.get(dbNo - 1).toString(), command.getCommandStr()});
            ZQLInnerDatabaseExecutionException zqlInnerDatabaseExecutionException = new ZQLInnerDatabaseExecutionException(reason, e.getSQLState(), vendorCode);
            zqlInnerDatabaseExecutionException.initCause(e);
            throw zqlInnerDatabaseExecutionException;
        } finally {
            if (statement != null) try {
                statement.close();
            } catch (SQLException e) {
                int vendorCode = ZQLErrorNumbers.ERR_INNER_EXEC;
                String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{innerDatabaseArray.get(dbNo - 1).toString(), command.getCommandStr()});
                ZQLInnerDatabaseExecutionException zqlInnerDatabaseExecutionException = new ZQLInnerDatabaseExecutionException(reason, e.getSQLState(), vendorCode);
                zqlInnerDatabaseExecutionException.initCause(e);
                throw zqlInnerDatabaseExecutionException;
            }

            if (connection != null) try {
                connection.close();
            } catch (SQLException e) {
                int vendorCode = ZQLErrorNumbers.ERR_INNER_CON_CLOSE;
                String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{innerDatabaseArray.get(dbNo - 1).toString()});
                ZQLMetaDatabaseConnectionException zqlMetaDatabaseConnectionException = new ZQLMetaDatabaseConnectionException(reason, e.getSQLState(), vendorCode);
                zqlMetaDatabaseConnectionException.initCause(e);
                LOGGER.e(reason, zqlMetaDatabaseConnectionException);
            }
        }
    }
}

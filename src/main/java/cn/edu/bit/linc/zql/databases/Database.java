package cn.edu.bit.linc.zql.databases;

import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;

/**
 * 数据库类，用于存储一个数据库的信息
 */
public class Database {
    private final static Logger LOGGER = LoggerFactory.getLogger(Database.class);
    public static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";  // MYSQL JDBC 驱动
    public static final String HIVE_DRIVER = "org.apache.hive.jdbc.HiveDriver";   // HIVE JDBC 驱动

    /**
     * 获取数据库别名
     *
     * @return 数据库别名
     */
    public String getDbAlias() {
        return dbAlias;
    }

    /**
     * 获取数据库连接用户名
     *
     * @return 数据库连接用户名
     */
    public String getDbUser() {
        return dbUser;
    }

    /**
     * 获取数据库连接地址
     *
     * @return 数据库连接地址
     */
    public String getDbHost() {
        return dbHost;
    }

    /**
     * 获取数据库连接密码
     *
     * @return 数据库连接密码
     */
    public String getDbPassword() {
        return dbPassword;
    }

    /**
     * 获取数据库编号
     *
     * @return 数据库编号
     */
    public int getDbId() {
        return dbId;
    }

    /**
     * 获取数据库类型
     *
     * @return 数据库类型
     */
    public DBType getDbType() {
        return dbType;
    }

    private String dbAlias;
    private String dbUser;
    private String dbHost;
    private String dbPassword;
    private int dbId;
    private DBType dbType;

    @Override
    public String toString() {
        return dbAlias + "(" + dbHost + ", " + dbType + ")";
    }

    /**
     * 构造函数
     *
     * @param dbAlias    数据库别名
     * @param dbUser     数据库连接用户
     * @param dbHost     数据库地址
     * @param dbPassword 数据库用户密码
     * @param dbId       数据库编号（从 1 开始，其中 0 表示元数据库）
     * @param dbType     数据库类型
     */
    public Database(int dbId, DBType dbType, String dbAlias, String dbHost, String dbUser, String dbPassword) {
        this.dbAlias = dbAlias;
        this.dbUser = dbUser;
        this.dbHost = dbHost;
        this.dbPassword = dbPassword;
        this.dbId = dbId;
        this.dbType = dbType;
    }

    /**
     * 根据数据库类型返回相应 JDBC 驱动名
     *
     * @param dbType 数据库类型
     * @return JDBC 驱动名
     */
    public static String getDriver(DBType dbType) {
        if (dbType == DBType.MySQL) {
            return MYSQL_DRIVER;
        } else if (dbType == DBType.Hive) {
            return HIVE_DRIVER;
        } else {
            return null;
        }
    }

    /**
     * 获取数据库连接 URL
     *
     * @param dbType        数据库类型
     * @param host          数据库地址
     * @param connectDBName 连接的数据库，可以为 null 或者空串
     * @return 数据库连接 URL
     */
    public static String getURL(DBType dbType, String host, String connectDBName) {
        if (connectDBName == null)
            connectDBName = "";
        if (dbType == DBType.MySQL) {
            return "jdbc:mysql://" + host + "/" + connectDBName;
        } else if (dbType == DBType.Hive) {
            return "jdbc:hive2://" + host + "/" + connectDBName;
        }
        return null;
    }

    /**
     * 目前支持的数据库类型
     */
    public static enum DBType {
        MySQL, Hive
    }
}

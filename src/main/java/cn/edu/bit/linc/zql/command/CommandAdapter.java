package cn.edu.bit.linc.zql.command;

import cn.edu.bit.linc.zql.databases.Database;

import java.util.HashMap;
import java.util.Map;

/**
 * SQL 命令生成适配器
 */
public abstract class CommandAdapter {
    public Database.DBType dbType;

    /* 数据类型映射 - 当前以 MySQL 为准 */
    public Map<String, String> TYPE_MAP = new HashMap<String, String>();

    /**
     * 根据数据库类型获取对应的适配器实例
     *
     * @param type 数据库类型
     * @return 数据库实例
     */
    public static CommandAdapter getAdapterInstance(Database.DBType type) {
        if (type == Database.DBType.MySQL) {
            return new MySQLCommandAdapter();
        } else if (type == Database.DBType.Hive) {
            return new HiveCommandAdapter();
        }
        return null;
    }

    {
        TYPE_MAP.put("TINYINT", "TINYINT");
        TYPE_MAP.put("SMALLINT", "SMALLINT");
        TYPE_MAP.put("INT", "INT");
        TYPE_MAP.put("BIGINT", "BIGINT");
        TYPE_MAP.put("FLOAT", "FLOAT");
        TYPE_MAP.put("DOUBLE", "DOUBLE");
        TYPE_MAP.put("DECIMAL", "DECIMAL");
        TYPE_MAP.put("TIMESTAMP", "TIMESTAMP");
        TYPE_MAP.put("DATE", "DATE");
        TYPE_MAP.put("VARCHAR", "VARCHAR");  // TODO: 长度限制
        TYPE_MAP.put("BOOLEAN", "ENUM('true', 'false')");
        TYPE_MAP.put("BINARY", "BLOB");
    }

    /* 当前以 MySQL 语法为准 */
    public String CREATE_USER = "INSERT INTO %s.`zql_users` VALUES('%s', '%s')";   // CREATE USER ihainan IDENTIFIED BY 123456，只考虑 MySQL
    public String DROP_USER = "DELETE FROM %s.zql_users WHERE User = '%s'";  // DROP user ihainan，只考虑 MySQL

    public String GRANT = "INSERT IGNORE INTO %s.zql_tables_priv VALUES('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')";  // GRANT SELECT, DELETE ON table_test TO ihainan, snow [WITH GRANT OPTION]，只考虑 MySQL
    public static String UPDATE_GRANT = "UPDATE %s.zql_tables_priv SET %s WHERE User = '%s' and Db = '%s' and Tb = '%s'";

    public String REVOKE_GRANT = "REVOKE %s %s ON %s TO %s %s"; // REVOKE SELECT, DELETE ON table_test [GRANT OPTION] FROM ihainan, snow

    public String SHOW_GRANT = "SELECT * FROM %s.zql_tables_priv WHERE %s and %s";   // SHOW GRANT FOR ihainan

    public String DROP_TABLE = "DROP TABLE %s %s"; // DROP TABLE [IF EXISTS] tb_name
    public String DROP_TABLE_META_DB = "DELETE FROM %s.zql_tables WHERE Tb = '%s' and Db = '%s'";

    public String CREATE_TABLE = "CREATE %s %s TABLE %s %s.%s (%s) %s %s";
    public String CREATE_TABLE_META = "INSERT IGNORE INTO %s.zql_tables VALUES('%s', '%s', '%s', '%s')";


    public String ALTER_TABLE_NAME = "RENAME TABLE %s TO %s"; // RENAME TABLE old_table TO backup_table
    public String ALTER_TABLE_NAME_META_DB = "UPDATE %s.zql_tables SET Tb = '%s' WHERE Tb = '%s' and Db = '%s'";

    public String ALTER_COLUMN_NAME = "ALTER TABLE %s CHANGE COLUMN %s %s %s"; // ALTER TABLE table_name CHANGE COLUMN old_name new_name type
    public String SELECT_FIELD_TYPE = "SHOW FIELDS FROM %s where Field ='%s'";
    public String TYPE_FILED_NAME = "type";

    public String SHOW_TABLES = "SELECT * FROM %s.zql_tables WHERE %s and %s";    // SHOW TABLES [IN db_test] [LIKE "db_*"]
    public String SHOW_COLUMNS = "SHOW COLUMNS FROM %s FROM %s"; // SHOW COLUMNS FROM tb_name [FROM db_name]

    public String SHOW_CREATE_TABLE = "SHOW CREATE TABLE %s";

    public String CREATE_DATABASE = "CREATE DATABASE %s %s";   // CREATE DATABASE [IF NOT EXISTS] db_name
    public String CREATE_DATABASE_META_DB = "INSERT IGNORE INTO %s.zql_dbs VALUES('%s', '%s', '%s', '%s', '%s')";

    public String SHOW_DATABASES = "SELECT * FROM %s.zql_dbs %s";        // SHOW DATABASES [LIKE "fuck you"];

    public String DROP_DATABASE = "DROP DATABASE %s %s";       // DROP DATABASE [IF EXISTS] db_name
    public String DROP_DATABASE_META_DB = "DELETE FROM %s.zql_dbs WHERE Db = '%s'";

    public String USE_DATABASE = "USE %s"; // USE db_name

    public String SHOW_SERVER_ALIASES = "SELECT Inner_db_id, Db_alias FROM %s.zql_inner_dbs";

    public String SET_TABLE_NAME_TO_SERVER_ALIAS = "INSERT IGNORE INTO %s.zql_tables VALUES('%s', '%s', '%s', '%s')";

    public String SELECT = "SELECT %s %s FROM %s %s %s %s %s";

    public String DEFAULT = "%s";

    public String DELETE = "DELETE FROM %s %s";

    public String UPDATE = "UPDATE %s %s %s";

    public String INSERT = "INSERT %s %s %s";

    /**
     * 删除用户
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String dropUser(Object... args) {
        return String.format(DROP_USER, args);
    }

    /**
     * 授权
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String grant(Object... args) {
        return String.format(GRANT, args);
    }

    /**
     * 更新
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String updateGrant(Object... args) {
        return String.format(UPDATE_GRANT, args);
    }

    /**
     * 回收授权
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String revokeGrant(Object... args) {
        return String.format(REVOKE_GRANT, args);
    }

    /**
     * 显示授权
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String showGrant(Object... args) {
        return String.format(SHOW_GRANT, args);
    }

    /**
     * 创建数据表
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String createTable(Object... args) {
        return String.format(CREATE_TABLE, args);
    }

    /**
     * 创建数据表 - 元数据库
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String createTableMateDb(Object... args) {
        return String.format(CREATE_TABLE_META, args);
    }

    /**
     * 删除数据表
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String dropTable(Object... args) {
        return String.format(DROP_TABLE, args);
    }

    /**
     * 删除数据表 - 元数据库
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String dropTableMetaDb(Object... args) {
        return String.format(DROP_TABLE_META_DB, args);
    }

    /**
     * 修改数据表名
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String alterTableName(Object... args) {
        return String.format(ALTER_TABLE_NAME, args);
    }

    /**
     * 修改数据表名 - 元数据库
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String alterTableNameMetaDb(Object... args) {
        return String.format(ALTER_TABLE_NAME_META_DB, args);
    }

    /**
     * 修改数据列
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String alterColumnName(Object... args) {
        return String.format(ALTER_COLUMN_NAME, args);
    }


    /**
     * 修改数据列 - 获取数据类型
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String getColumnType(Object... args) {
        return String.format(SELECT_FIELD_TYPE, args);
    }

    /**
     * 显示数据表
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String showTables(Object... args) {
        return String.format(SHOW_TABLES, args);
    }

    /**
     * 显示数据列
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String showColumns(Object... args) {
        return String.format(SHOW_COLUMNS, args);
    }

    /**
     * 查看创建表语句
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String showCreateTable(Object... args) {
        return String.format(SHOW_CREATE_TABLE, args);
    }

    /**
     * 创建数据库
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String createDatabase(Object... args) {
        return String.format(CREATE_DATABASE, args);
    }

    /**
     * 创建数据库 - 更新元数据库
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String createDatabaseMetaDb(Object... args) {
        return String.format(CREATE_DATABASE_META_DB, args);
    }

    /**
     * 查看数据库
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String showDatabases(Object... args) {
        return String.format(SHOW_DATABASES, args);
    }

    /**
     * 删除数据库
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String dropDatabase(Object... args) {
        return String.format(DROP_DATABASE, args);
    }

    /**
     * 删除数据库 - 更新元数据库
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String dropDatabaseMetaDb(Object... args) {
        return String.format(DROP_DATABASE_META_DB, args);
    }

    /**
     * 使用指定数据库
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String useDatabase(Object... args) {
        return String.format(USE_DATABASE, args);
    }

    /**
     * 创建用户
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String createUser(Object... args) {
        return String.format(CREATE_USER, args);
    }

    /**
     * 显示 DB 别名
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String showServerAliases(Object... args) {
        return String.format(SHOW_SERVER_ALIASES, args);
    }

    /**
     * 设置元数据
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String setTableNameToServerAlias(Object... args) {
        return String.format(SET_TABLE_NAME_TO_SERVER_ALIAS, args);
    }

    /**
     * SELECT
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String select(Object... args) {
        return String.format(SELECT, args);
    }

    /**
     * DELETE
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String delete(Object... args) {
        return String.format(DELETE, args);
    }

    /**
     * UPDATE
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String update(Object... args) {
        return String.format(UPDATE, args);
    }

    /**
     * INSERT
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String insert(Object... args) { return String.format(INSERT, args); }

    /**
     * defaultSQL
     *
     * @param args 参数列表
     * @return SQL 命令
     */
    public String defaultSQL(Object... args) { return String.format(DEFAULT, args); }

}
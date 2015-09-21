package cn.edu.bit.linc.zql.command;

import cn.edu.bit.linc.zql.databases.Database;

import java.util.HashMap;

/**
 * MySQL 命令生成适配器
 */
public class MySQLCommandAdapter extends CommandAdapter {
    {
        /* MySQL 模板在此定义*/
        dbType = Database.DBType.MySQL;

        /* 数据类型 */
        TYPE_MAP = new HashMap<String, String>();
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

        /* 命令模板 */
        CREATE_USER = "INSERT INTO %s.`zql_users` VALUES('%s', '%s')";   // CREATE USER ihainan IDENTIFIED BY 123456，只考虑 MySQL
        DROP_USER = "DELETE FROM %s.zql_users WHERE User = '%s'";  // DROP user ihainan，只考虑 MySQL

        GRANT = "INSERT IGNORE INTO %s.zql_tables_priv VALUES('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')";  // GRANT SELECT, DELETE ON table_test TO ihainan, snow [WITH GRANT OPTION]，只考虑 MySQL
        UPDATE_GRANT = "UPDATE %s.zql_tables_priv SET %s WHERE User = '%s' and Db = '%s' and Tb = '%s'";

        REVOKE_GRANT = "REVOKE %s %s ON %s TO %s %s"; // REVOKE SELECT, DELETE ON table_test [GRANT OPTION] FROM ihainan, snow

        SHOW_GRANT = "SELECT * FROM %s.zql_tables_priv WHERE %s and %s";   // SHOW GRANT FOR ihainan

        DROP_TABLE = "DROP TABLE %s %s"; // DROP TABLE [IF EXISTS] tb_name
        DROP_TABLE_META_DB = "DELETE FROM %s.zql_tables WHERE Tb = '%s' and Db = '%s'";

        CREATE_TABLE = "CREATE %s %s TABLE %s %s.%s (%s) %s %s";
        CREATE_TABLE_META = "INSERT IGNORE INTO %s.zql_tables VALUES('%s', '%s', '%s', '%s')";


        ALTER_TABLE_NAME = "RENAME TABLE %s TO %s"; // RENAME TABLE old_table TO backup_table
        ALTER_TABLE_NAME_META_DB = "UPDATE %s.zql_tables SET Tb = '%s' WHERE Tb = '%s' and Db = '%s'";

        ALTER_COLUMN_NAME = "ALTER TABLE %s CHANGE COLUMN %s %s %s"; // ALTER TABLE table_name CHANGE COLUMN old_name new_name type
        SELECT_FIELD_TYPE = "SHOW FIELDS FROM %s where Field ='%s'";
        SELECT_FIELD_INFO = "SHOW FIELDS FROM %s";
        TYPE_FILED_NAME = "type";

        SHOW_TABLES = "SELECT * FROM %s.zql_tables WHERE %s and %s";    // SHOW TABLES [IN db_test] [LIKE "db_*"]
        SHOW_COLUMNS = "SHOW COLUMNS FROM %s FROM %s"; // SHOW COLUMNS FROM tb_name [FROM db_name]

        SHOW_CREATE_TABLE = "SHOW CREATE TABLE %s";

        CREATE_DATABASE = "CREATE DATABASE %s %s";   // CREATE DATABASE [IF NOT EXISTS] db_name
        CREATE_DATABASE_META_DB = "INSERT IGNORE INTO %s.zql_dbs VALUES('%s', '%s', '%s', '%s', '%s')";

        SHOW_DATABASES = "SELECT * FROM %s.zql_dbs %s";        // SHOW DATABASES [LIKE "fuck you"];

        DROP_DATABASE = "DROP DATABASE %s %s";       // DROP DATABASE [IF EXISTS] db_name
        DROP_DATABASE_META_DB = "DELETE FROM %s.zql_dbs WHERE Db = '%s'";

        USE_DATABASE = "USE %s"; // USE db_name

        SHOW_SERVER_ALIASES = "SELECT Inner_db_id, Db_alias FROM %s.zql_inner_dbs";

        SET_TABLE_NAME_TO_SERVER_ALIAS = "INSERT IGNORE INTO %s.zql_tables VALUES('%s', '%s', '%s', '%s')";

        SELECT = "SELECT %s %s %s %s %s %s %s";

        DEFAULT = "%s";

        DELETE = "DELETE FROM %s %s";

        UPDATE = "UPDATE %s %s %s";

        INSERT = "INSERT %s %s %s";
    }
}

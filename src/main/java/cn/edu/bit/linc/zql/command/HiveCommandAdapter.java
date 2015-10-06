package cn.edu.bit.linc.zql.command;

import cn.edu.bit.linc.zql.databases.Database;

import java.util.HashMap;

/**
 * Hive SQL 命令生成适配器
 */
public class HiveCommandAdapter extends CommandAdapter {
    {
        /* Hive 模板在此定义*/
        dbType = Database.DBType.Hive;

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
        TYPE_MAP.put("BOOLEAN", "BOOLEAN");
        TYPE_MAP.put("BINARY", "BINARY");


        RE_TYPE_MAP.put("TINYINT", "TINYINT");
        RE_TYPE_MAP.put("SMALLINT", "SMALLINT");
        RE_TYPE_MAP.put("INT", "INT");
        RE_TYPE_MAP.put("BIGINT", "BIGINT");
        RE_TYPE_MAP.put("FLOAT", "FLOAT");
        RE_TYPE_MAP.put("DOUBLE", "DOUBLE");
        RE_TYPE_MAP.put("DECIMAL", "DECIMAL");
        RE_TYPE_MAP.put("TIMESTAMP", "TIMESTAMP");
        RE_TYPE_MAP.put("DATE", "DATE");
        RE_TYPE_MAP.put("VARCHAR", "VARCHAR");  // TODO: 长度限制
        RE_TYPE_MAP.put("BOOLEAN", "BOOLEAN");
        RE_TYPE_MAP.put("BINARY", "BINARY");

        /* 命令模板 */
        CREATE_USER = "INSERT INTO %s.`zql_users` VALUES('%s', '%s')";   // CREATE USER ihainan IDENTIFIED BY 123456，只考虑 MySQL
        DROP_DATABASE = "DROP DATABASE %s %s CASCADE";       // DROP DATABASE [IF EXISTS] db_name
        ALTER_TABLE_NAME = "ALTER TABLE %s RENAME TO %s"; // RENAME TABLE old_table TO backup_table
        SELECT_FIELD_TYPE = "DESCRIBE %s.%s";
        TYPE_FILED_NAME = "data_type";
        SHOW_COLUMNS = "DESCRIBE %s.%s";
    }
}

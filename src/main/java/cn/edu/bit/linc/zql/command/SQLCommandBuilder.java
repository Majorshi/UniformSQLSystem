package cn.edu.bit.linc.zql.command;

import cn.edu.bit.linc.zql.databases.Database;

/**
 * SQL 命令生成器
 */
public class SQLCommandBuilder {
    private CommandAdapter[] commandAdapters;
    public SQLCommandBuilder() {
        commandAdapters = new CommandAdapter[Database.DBType.values().length];
    }

    public SQLCommandBuilder(CommandAdapter[] commandAdapters) {
        this.commandAdapters = commandAdapters;
    }

    /**
     * 添加适配器
     *
     * @param commandAdapter 适配器
     */
    public SQLCommandBuilder addAdapter(CommandAdapter commandAdapter) {
        Database.DBType dbType = commandAdapter.dbType;
        commandAdapters[dbType.ordinal()] = commandAdapter;
        return new SQLCommandBuilder(commandAdapters);
    }

    /**
     * 创建用户
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand createUser(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].createUser(args), args);
    }

    /**
     * 删除用户
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand dropUser(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].dropUser(args), args);
    }

    /**
     * 授权
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand grant(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].grant(args), args);
    }

    /**
     * 更新授权
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand updateGrant(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].updateGrant(args), args);
    }

    /**
     * 收回权限
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand revokeGrant(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].revokeGrant(args), args);
    }

    /**
     * 显示权限
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand showGrant(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].showGrant(args), args);
    }

    /**
     * 创建数据表
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand createTable(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].createTable(args), args);
    }

    /**
     * 创建数据表 - 元数据库
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand createTableMateDb(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].createTableMateDb(args), args);
    }

    /**
     * 删除数据表
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand dropTable(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].dropTable(args), args);
    }

    /**
     * 删除数据表 - 元数据库
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand dropTableMetaDb(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].dropTableMetaDb(args), args);
    }

    /**
     * 修改表名
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand alterTableName(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].alterTableName(args), args);
    }

    /**
     * 修改表名 - 元数据库
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand alterTableNameMetaDb(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].alterTableNameMetaDb(args), args);
    }

    /**
     * 修改列名
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand alterColumnName(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].alterColumnName(args), args);
    }

    /**
     * 修改数据列 - 获取数据类型
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand getColumnType(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].getColumnType(args), args);
    }

    /**
     * 跨库 - 获取某一张表内所有列的数据类型
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand getColumnInfo(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].getColumnInfo(args), args);
    }

    /**
     * 显示数据表
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand showTables(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].showTables(args), args);
    }

    /**
     * 显示数据列
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand showColumns(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].showColumns(args), args);
    }

    /**
     * 查看创建表语句
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand showCreateTable(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].showCreateTable(args), args);
    }

    /**
     * 创建数据库
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL 命令
     */
    public InnerSQLCommand createDatabase(Database.DBType dbType, String... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].createDatabase(args), args);
    }

    /**
     * 创建数据库 - 更新元数据库
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL 命令
     */
    public InnerSQLCommand createDatabaseMetaDb(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].createDatabaseMetaDb(args), args);

    }

    /**
     * 删除数据库
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand dropDatabase(Database.DBType dbType, String... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].dropDatabase(args), args);
    }

    /**
     * 删除数据库 - 更新元数据库
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand dropDatabaseMetaDb(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].dropDatabaseMetaDb(args), args);
    }

    /**
     * 显示数据库
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand showDatabases(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].showDatabases(args), args);
    }

    /**
     * 使用数据库
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand useDatabase(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].useDatabase(args), args);
    }


    /**
     * 显示数据库别名
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand showServerAliases(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].showServerAliases(args), args);
    }

    /**
     * 设置元数据
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand setTableNameToServerAlias(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].setTableNameToServerAlias(args), args);
    }

    /**
     * SELECT Statement
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand select(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].select(args), args);
    }

    /**
     * DEFAULT(不作任何改动)
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand defaultSQL(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].defaultSQL(args), args);
    }

    /**
     * DELETE Statement
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand delete(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].delete(args), args);
    }

    /**
     * UPDATE Statement
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand update(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].update(args), args);
    }

    /**
     * INSERT Statement
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public InnerSQLCommand insert(Database.DBType dbType, Object... args) {
        return new InnerSQLCommand(dbType, commandAdapters[dbType.ordinal()].insert(args), args);
    }
    /**
     * 测试函数
     *
     * @param args 程序参数
     */
    public static void main(String[] args) {
        SQLCommandBuilder builder = new SQLCommandBuilder().addAdapter(new MySQLCommandAdapter());
        String[] sqlArgs = new String[]{"db_test", "IF NOT EXISTS"};
        System.out.println(builder.createDatabase(Database.DBType.MySQL, sqlArgs));
    }


}

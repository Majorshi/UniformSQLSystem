package cn.edu.bit.linc.zql.parser.visitor;

import antlr.collections.AST;
import cn.edu.bit.linc.zql.ZQLEnv;
import cn.edu.bit.linc.zql.command.*;
import cn.edu.bit.linc.zql.connections.ZQLSession;
import cn.edu.bit.linc.zql.databases.Database;
import cn.edu.bit.linc.zql.databases.InnerDatabase;
import cn.edu.bit.linc.zql.databases.InnerDatabases;
import cn.edu.bit.linc.zql.databases.MetaDatabase;
import cn.edu.bit.linc.zql.exceptions.MetaDatabaseOperationsException;
import cn.edu.bit.linc.zql.exceptions.ZQLCommandExecutionError;
import cn.edu.bit.linc.zql.parser.uniformSQLBaseVisitor;
import cn.edu.bit.linc.zql.parser.uniformSQLParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.mortbay.log.Log;

import java.util.*;

/**
 * 抽象语法树访问器
 */
public class ZQLVisitor extends uniformSQLBaseVisitor<ASTNodeVisitResult> {
    /**
     * 命令生成器
     */
    public final static SQLCommandBuilder sqlCommandBuilder;

    static {
        sqlCommandBuilder = new SQLCommandBuilder();
        sqlCommandBuilder.addAdapter(new MySQLCommandAdapter());
        sqlCommandBuilder.addAdapter(new HiveCommandAdapter());
    }

    private final static InnerDatabases innerDatabase = InnerDatabases.getInstance();
    private final static ArrayList<InnerDatabase> innerDatabasesArrayList = innerDatabase.getInnerDatabaseArray();
    private final static MetaDatabase metaDatabase = MetaDatabase.getInstance();
    private final ZQLSession session;
    public ArrayList<uniformSQLParser.Table_specContext> tableSpecNodes = new ArrayList<uniformSQLParser.Table_specContext>();
    public HashMap<uniformSQLParser.Table_specContext, String> commandType = new HashMap<uniformSQLParser.Table_specContext, String>();
    public ArrayList<String> commandStack = new ArrayList<String>();

    public ZQLVisitor(ZQLSession session) {
        this.session = session;
    }

    /**
     * 根据DBID获取Database对象
     *
     * @param dbid 数据库id
     * @return InnerDatabases对象
     */
    public InnerDatabase getInnerDatabaseByDBID(int dbid) {
        for (int i = 0; i < innerDatabasesArrayList.size(); i++) {
            if (innerDatabasesArrayList.get(i).getDbId() == dbid) {
                return innerDatabasesArrayList.get(i);
            }
        }
        return null;
    }

    /**
     * 获取用户名
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitUser_name(uniformSQLParser.User_nameContext ctx) {
        String value = ctx.any_name().getText();
        return new ASTNodeVisitResult(value, null, null);
    }

    /**
     * 获取密码字段
     *
     * @param ctx 节点上下文
     * @return 访问结果
     */
    @Override
    public ASTNodeVisitResult visitPassword(uniformSQLParser.PasswordContext ctx) {
        String value = ctx.any_name().getText();
        return new ASTNodeVisitResult(value, null, null);
    }

    /**
     * Root_statement一切的起点，这里将会对是否存在跨库的判断以及涉及到的数据表权限的判断
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitRoot_statement(uniformSQLParser.Root_statementContext ctx) {
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();
        ASTNodeVisitResult result = visitChildrenNodes(ctx.children);
        if (result.getCommands() != null) {
            commands = result.getCommands();
        }
        if (result.getDbIds() != null) {
            dbIds = result.getDbIds();
        }
//        boolean isSrideDB = false;
//        ArrayList<String> databaseNames = new ArrayList<String>();
//        ArrayList<Integer> nodedbIds = new ArrayList<Integer>();
//        if (tableSpecNodes.size() > 0) {
//            for (int i = 0; i < tableSpecNodes.size(); i++) {
//                uniformSQLParser.Table_specContext node = tableSpecNodes.get(i);
//                if (node.schema_name() != null) {
//                    String databaseName = visit(node.schema_name()).getValue();
//                    if (!databaseNames.contains(databaseName)) {
//                        databaseNames.add(databaseName);
//                    }
//                }
//            }
//            if (databaseNames.size() > 1) {
//                涉及到多个数据库，判断是否存在多个底层库
//                for (int i = 0; i < databaseNames.size(); i++) {
//                    String databaseName = databaseNames.get(i);
//                    int dbId;
//                    try {
//                        dbId = metaDatabase.getInnerDatabaseId(databaseName);
//                    } catch (MetaDatabaseOperationsException e) {
//                        session.setErrorMessage(e.getMessage());
//                        return null;
//                    }
//                    if (!nodedbIds.contains(dbId)) {
//                        nodedbIds.add(dbId);
//                    }
//                }
//                if (nodedbIds.size() > 1) {
//                    isSrideDB = true;
//                }
//            }
//            //TODO: 判断权限
//            for (int i = 0; i < databaseNames.size(); i++) {
//
//            }
//        }
//        if (isSrideDB) {
//            //跨库
//            if (commandStack.size() > 0) {
//                String rootCommand = commandStack.get(0);
//                if (rootCommand.equals("SELECT")) {
//                    for (int i = 0; i < tableSpecNodes.size(); i++) {
//                        uniformSQLParser.Table_specContext node = tableSpecNodes.get(i);
//                        String databaseName = session.getDatabase();
//                        if (node.schema_name() != null) {
//                            databaseName = visit(node.schema_name()).getValue();
//                        }
//                        String tableName = visit(node.table_name()).getValue();
//                        int dbId;
//                        try {
//                            dbId = metaDatabase.getInnerDatabaseId(databaseName);
//                        } catch (MetaDatabaseOperationsException e) {
//                            session.setErrorMessage(e.getMessage());
//                            return null;
//                        }
//                        try {
//                            HashMap<String, String> columnTypes = innerDatabase.getColumnTypeInTable(dbId, databaseName, tableName);
//                            String columnString = "";
//                            String tempTableName = tableName + System.currentTimeMillis();
//                            for (String columnName : columnTypes.keySet()) {
//                                String columnType = columnTypes.get(columnName);
//                                if (columnString.length() != 0) columnString += ",";
//                                columnString += columnName + " " + columnType;
//                            }
//                            InnerSQLCommand innerDbCommand = sqlCommandBuilder.createTable(Database.DBType.MySQL, "", "", "", "tempDB", tempTableName,
//                                    columnString, "", "");
////                            commands.add(innerDbCommand);
//                        } catch (ZQLCommandExecutionError e) {
//                            session.setErrorMessage(e.getMessage());
//                            return null;
//                        }
//
//                    }
//                } else {
//
//                }
//            }
//        }
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    @Override
    public ASTNodeVisitResult visitData_definition_statements(uniformSQLParser.Data_definition_statementsContext ctx) {
        return visitChildrenNodes(ctx.children);
    }

    /**
     * 遍历某个节点的子节点，获取ASTNodeVisitResult
     *
     * @param childrenNodes 要遍历的节点的子节点数组
     * @return 访问结果
     */
    public ASTNodeVisitResult visitChildrenNodes(List<ParseTree> childrenNodes) {
        String valueStr = "";
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();
        boolean keywordsFlag = false;
        for (int i = 0; i < childrenNodes.size(); i++) {
            if (childrenNodes.get(i).getClass() == TerminalNodeImpl.class) {
                if (childrenNodes.size() == 1) {
                    //只有一个子节点，可以认为是非关键字节点，无需添加空格
                    valueStr += childrenNodes.get(i).getText();
                } else {
                    if (!keywordsFlag && !childrenNodes.get(i).getText().equals(".")) {
                        valueStr += " ";
                    }
                    valueStr += childrenNodes.get(i).getText();
                    if (!(childrenNodes.get(i).getText().equals("'") || childrenNodes.get(i).getText().equals(".")
                            || childrenNodes.get(i).getText().equals("\""))) {
                        valueStr += " ";
                    }
                    keywordsFlag = true;
                }
            } else {
                ASTNodeVisitResult whateverResult = visit(childrenNodes.get(i));
                if (whateverResult == null) {
                    System.out.println(childrenNodes.get(i).getClass() + " return NULL.");
                }
                if (whateverResult.getValue() != null) {
                    valueStr += whateverResult.getValue();
                }
                if (whateverResult.getCommands() != null) {
                    commands.addAll(whateverResult.getCommands());
                }
                if (whateverResult.getDbIds() != null) {
                    dbIds.addAll(whateverResult.getDbIds());
                }
                keywordsFlag = false;
            }
        }
        if (commands.size() == 0) commands = null;
        if (dbIds.size() == 0) dbIds = null;
        return new ASTNodeVisitResult(valueStr, commands, dbIds);
    }

    /**
     * 创建用户 STATEMENT
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitCreate_user_statement(uniformSQLParser.Create_user_statementContext ctx) {
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 获取子节点数据 */
        String userName = visit(ctx.user_name()).getValue();
        String passWord = ctx.children.get(5).getText();
        passWord = passWord.substring(1, passWord.length() - 1);

         /* 元数据库命令 */
        InnerSQLCommand metaDbCommand = sqlCommandBuilder.createUser(Database.DBType.MySQL, metaDatabase.getMetaDbName(), userName, passWord);
        commands.add(metaDbCommand);
        dbIds.add(0);

        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * 授权 STATEMENT
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitGrant_privilege_statement(uniformSQLParser.Grant_privilege_statementContext ctx) {
        // TODO: databaseName.tableName 的情况
        // TODO: *.* 的情况
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();
        if (session.getDatabase() == null) {
            session.setErrorMessage("未指定数据库，使用命令 `use db_name` 指定数据库");
            return null;
        }

        /* 获取子节点数据 */
        String tbName = visit(ctx.table_spec().table_name()).getValue();

        // 权限表
        ArrayList<String> privilegesArray = new ArrayList<String>();
        for (int i = 0; i < ctx.priv_type().size(); i++) {
            uniformSQLParser.Priv_typeContext context = ctx.priv_type().get(i);
            ASTNodeVisitResult visitPrivTypeNodeResult = visit(context);
            if (context.ALL() != null) {
                privilegesArray.add("ALL");
            }
            if (context.INSERT() != null) {
                privilegesArray.add("INSERT");
            }
            if (context.SELECT() != null) {
                privilegesArray.add("SELECT");
            }
            if (context.DELETE() != null) {
                privilegesArray.add("DELETE");
            }
            if (context.UPDATE() != null) {
                privilegesArray.add("UPDATE");
            }
        }

        if (privilegesArray.contains("ALL")) {
            privilegesArray.add("SELECT");
            privilegesArray.add("INSERT");
            privilegesArray.add("DELETE");
            privilegesArray.add("UPDATE");
            privilegesArray.add("ALL");
        }

        // 用户表
        ArrayList<String> specs = new ArrayList<String>();
        for (int i = 0; i < ctx.principal_specification().size(); ++i) {
            uniformSQLParser.Principal_specificationContext context = ctx.principal_specification().get(i);
            ASTNodeVisitResult visitPrincipalSpeNodeResult = visit(context);
            specs.add(visitPrincipalSpeNodeResult.getValue());
        }

        boolean withGrantOption = (ctx.WITH() != null);

        /* 检查是否拥有权限 */
        Map<String, String> privilegesMap;
        try {
            privilegesMap = metaDatabase.getPrivilegesOfASpecifiedUserAndTable(session.getDatabase(),
                    tbName, session.getUserName());
        } catch (MetaDatabaseOperationsException e) {
            session.setErrorMessage("从元数据库获取用户 " + session.getUserName() + " 失败，失败原因 " + e.getMessage());
            return null;
        }

        if (!session.getUserName().equals("root") && privilegesMap == null) {
            session.setErrorMessage("元数据库中找不到用户 " + session.getUserName() + " 对于数据库表 " + session.getDatabase()
                    + "." + tbName + " 的权限");
            return null;
        }

        // 检查用户是否有足够权限
        if (!session.getUserName().equals("root") && privilegesMap.get("GRANT_OPTION").equals("N")) {
            session.setErrorMessage("用户 " + session.getUserName() + " 在数据表 " + session.getDatabase()
                    + "." + tbName + " 中没有 GRANT 权限");
            return null;
        }

        if (!(session.getUserName().equals("root") || privilegesMap.get("ALL").equals("Y") ||
                (!(privilegesArray.contains("SELECT") && !privilegesMap.get("SELECT").equals("Y")) &&
                        !(privilegesArray.contains("INSERT") && !privilegesMap.get("INSERT").equals("Y")) &&
                        !(privilegesArray.contains("UPDATE") && !privilegesMap.get("UPDATE").equals("Y")) &&
                        !(privilegesArray.contains("DELETE") && !privilegesMap.get("DELETE").equals("Y"))))) {
            session.setErrorMessage("用户 " + session.getUserName() + " 在数据表 " + session.getDatabase() + "." +
                    tbName + " 中没有足够的权限");
            return null;
        }

        /* 元数据库命令 */
        for (String spec : specs) {
            InnerSQLCommand metaDbCommand = sqlCommandBuilder.grant(Database.DBType.MySQL, metaDatabase.getMetaDbName(),
                    spec, session.getDatabase(), tbName
                    , privilegesArray.contains("SELECT") ? "Y" : "N"  // SELECT Privilege
                    , privilegesArray.contains("INSERT") ? "Y" : "N"  // INSERT Privilege
                    , privilegesArray.contains("UPDATE") ? "Y" : "N"  // UPDATE Privilege
                    , privilegesArray.contains("DELETE") ? "Y" : "N"  // DELETE Privilege
                    , privilegesArray.contains("ALL") ? "Y" : "N"     // All Privilege
                    , withGrantOption ? "Y" : "N"           // WITH GRANT OPTION
            );
            commands.add(metaDbCommand);
            dbIds.add(0);

            String updateFields = makePrivilegeFieldsSetStr(privilegesArray, withGrantOption, true);
            InnerSQLCommand metaDbCommandUpdate = sqlCommandBuilder.updateGrant(Database.DBType.MySQL, metaDatabase.getMetaDbName(),
                    updateFields, spec, session.getDatabase(), tbName
            );
            commands.add(metaDbCommandUpdate);
            dbIds.add(0);
        }

        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * 根据用户命令构建 zql_tables_priv 表 Update 操作 Set 部分字符串
     *
     * @param privs       用户命令中的权限设置
     * @param grantOption WITH GRANT OPTION / GRANT OPTION FOR
     * @param isGrant     GRANT 还是 REVOKE 语句，<code>true</code> 为 GRANT，<code>false</code> 为 REVOKE
     * @return zql_tables_p iv 表 Update 操作 Set 部分
     */
    private static String makePrivilegeFieldsSetStr(ArrayList<String> privs, boolean grantOption, boolean isGrant) {
        String yesOrNo = "Y";
        if (!isGrant) yesOrNo = "N";
        String updateFieldsStr = "";
        boolean hasPre = false;
        if (privs.contains("SELECT")) {
            updateFieldsStr += "SELECT_PRIV = '" + yesOrNo + "'";
            hasPre = true;
        }
        if (privs.contains("INSERT")) {
            if (hasPre) updateFieldsStr += ", ";
            updateFieldsStr += "INSERT_PRIV = '" + yesOrNo + "'";
            hasPre = true;
        }
        if (privs.contains("UPDATE")) {
            if (hasPre) updateFieldsStr += ", ";
            updateFieldsStr += "UPDATE_PRIV = '" + yesOrNo + "'";
            hasPre = true;
        }
        if (privs.contains("DELETE")) {
            if (hasPre) updateFieldsStr += ", ";
            updateFieldsStr += "DELETE_PRIV = '" + yesOrNo + "'";
            hasPre = true;
        }
        if (privs.contains("ALL")) {
            if (hasPre) updateFieldsStr += ", ";
            updateFieldsStr += "ALL_PRIV = '" + yesOrNo + "'";
            hasPre = true;
        }
        if (grantOption) {
            if (hasPre) updateFieldsStr += ", ";
            updateFieldsStr += "GRANT_OPTION = '" + yesOrNo + "'";
        }
        return updateFieldsStr;
    }

    /**
     * 撤销授权 STATEMENT
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitRevoke_privilege_statement(uniformSQLParser.Revoke_privilege_statementContext ctx) {
        // TODO: databaseName.tableName 的情况
        // TODO: *.* 的情况
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 获取子节点数据 */
        String tbName = visit(ctx.table_spec()).getValue();

        // 权限表
        ArrayList<String> privilegesArray = new ArrayList<String>();
        for (int i = 0; i < ctx.priv_type().size(); i++) {
            uniformSQLParser.Priv_typeContext context = ctx.priv_type().get(i);
            ASTNodeVisitResult visitPrivTypeNodeResult = visit(context);
            privilegesArray.add(visitPrivTypeNodeResult.getValue());
        }

        if (privilegesArray.contains("ALL")) {
            privilegesArray.add("SELECT");
            privilegesArray.add("INSERT");
            privilegesArray.add("DELETE");
            privilegesArray.add("UPDATE");
            privilegesArray.add("ALL");
        }

        // 用户表
        ArrayList<String> specs = new ArrayList<String>();
        for (int i = 0; i < ctx.principal_specification().size(); ++i) {
            uniformSQLParser.Principal_specificationContext context = ctx.principal_specification().get(i);
            ASTNodeVisitResult visitPrincipalSpeNodeResult = visit(context);
            specs.add(visitPrincipalSpeNodeResult.getValue());
        }

        boolean withGrantOption = (ctx.OPTION() != null);   // GRANT OPTION FOR

        /* 检查是否拥有权限 */
        Map<String, String> privilegesMap;
        try {
            privilegesMap = metaDatabase.getPrivilegesOfASpecifiedUserAndTable(session.getDatabase(),
                    tbName, session.getUserName());
        } catch (MetaDatabaseOperationsException e) {
            session.setErrorMessage("从元数据库获取用户 " + session.getUserName() + " 失败，失败原因 " + e.getMessage());
            return null;
        }

        if (!session.getUserName().equals("root") && privilegesMap == null) {
            session.setErrorMessage("元数据库中找不到用户 " + session.getUserName() + " 对于数据库表 " + session.getDatabase()
                    + "." + tbName + " 的权限");
            return null;
        }

        // 检查用户是否有足够权限
        if (!session.getUserName().equals("root") && privilegesMap.get("GRANT_OPTION").equals("N")) {
            session.setErrorMessage("用户 " + session.getUserName() + " 在数据表 " + session.getDatabase()
                    + "." + tbName + " 中没有 GRANT 权限");
            return null;
        }

        if (!(session.getUserName().equals("root") || privilegesMap.get("ALL").equals("Y") ||
                (!(privilegesArray.contains("SELECT") && !privilegesMap.get("SELECT").equals("Y")) &&
                        !(privilegesArray.contains("INSERT") && !privilegesMap.get("INSERT").equals("Y")) &&
                        !(privilegesArray.contains("UPDATE") && !privilegesMap.get("UPDATE").equals("Y")) &&
                        !(privilegesArray.contains("DELETE") && !privilegesMap.get("DELETE").equals("Y"))))) {
            session.setErrorMessage("用户 " + session.getUserName() + " 在数据表 " + session.getDatabase() + "." +
                    tbName + " 中没有足够的权限");
            return null;
        }

        /* 元数据库命令 */
        for (String spec : specs) {
            String updateFields = makePrivilegeFieldsSetStr(privilegesArray, withGrantOption, false);
            InnerSQLCommand metaDbCommandUpdate = sqlCommandBuilder.updateGrant(Database.DBType.MySQL, metaDatabase.getMetaDbName()
                    , updateFields, spec, session.getDatabase(), tbName
            );
            commands.add(metaDbCommandUpdate);
            dbIds.add(0);
        }

        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * SHOW STATEMENT
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitShow_event_statement(uniformSQLParser.Show_event_statementContext ctx) {
        uniformSQLParser.Show_specificationContext specificationContext = ctx.show_specification();
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();
        commandStack.add("SHOW");
        if (specificationContext.GRANT() != null) {
            /* 查看授权 */
            String userName = specificationContext.principal_name() == null ? "true "
                    : "User = '" + visit(specificationContext.principal_name()).getValue() + "'";    // 用户名
            String tableName = specificationContext.table_spec() == null ? "true"
                    : "Tb = '" + visit(specificationContext.table_spec()).getValue() + "'";

            /* 元数据库命令 */
            InnerSQLCommand metaDbCommand = sqlCommandBuilder.showGrant(Database.DBType.MySQL, metaDatabase.getMetaDbName()
                    , userName, tableName);
            commands.add(metaDbCommand);
            dbIds.add(0);
        } else if (specificationContext.DATABASES() != null || specificationContext.SCHEMAS() != null) {
            // TODO: Like 为可选项
            /* 查看数据库 */
            /* 元数据库命令 */
            String likeStr = specificationContext.LIKE() == null ? ""
                    : "WHERE Db LIKE '" + specificationContext.getChild(2).getText().substring(1, specificationContext.getChild(2).getText().length() - 1) + "'";
            InnerSQLCommand metaDbCommand = sqlCommandBuilder.showDatabases(Database.DBType.MySQL, metaDatabase.getMetaDbName(), likeStr);
            commands.add(metaDbCommand);
            dbIds.add(0);
        } else if (specificationContext.TABLES() != null) {
            /* 查看数据表 */
            /* 获取子节点数据 */
            String inDatabase = (specificationContext.IN() != null) ? "Db = '" + (visit(specificationContext.database_name()).getValue()) + "'" : "true";
            String like = (specificationContext.children.size() >= 4) ?
                    "tb LIKE " + specificationContext.children.get(3).getText() : "true";

            /* 元数据库命令 */
            InnerSQLCommand metaDbCommand = sqlCommandBuilder.showTables(Database.DBType.MySQL, metaDatabase.getMetaDbName(), inDatabase, like);
            commands.add(metaDbCommand);
            dbIds.add(0);
        } else if (specificationContext.SERVER() != null) {
            /* 查看数据库别名 */
            InnerSQLCommand metaDbCommand = sqlCommandBuilder.showServerAliases(Database.DBType.MySQL, metaDatabase.getMetaDbName());
            commands.add(metaDbCommand);
            dbIds.add(0);
        } else if (specificationContext.CREATE() != null && specificationContext.TABLE() != null) {
            /* 查看创建表语句 */
            /* 获取子节点数据 */
            String tableName = visit(specificationContext.table_spec()).getValue();

            // 获取数据库所在底层库编号
            int dbId;
            try {
                dbId = metaDatabase.getInnerDatabaseId(session.getDatabase());
            } catch (MetaDatabaseOperationsException e) {
                session.setErrorMessage(e.getMessage());
                return null;
            }

            /* 底层库命令 */
            Database.DBType dbType = innerDatabasesArrayList.get(dbId - 1).getDbType();
            InnerSQLCommand innerDbCommand = sqlCommandBuilder.showCreateTable(dbType, session.getDatabase() + "." + tableName);
            commands.add(innerDbCommand);
            dbIds.add(dbId);
        } else if (specificationContext.COLUMNS() != null) {
            /* 查看列 */
            /* 获取子节点数据 */
            String tableName = visit(specificationContext.table_spec()).getValue();
            String databaseName = specificationContext.table_spec().schema_name() != null
                    ? visit(specificationContext.table_spec().schema_name()).getValue() : session.getDatabase();
            if (databaseName == null) {
                session.setErrorMessage("未指定数据库");
                return null;
            }

            /* 底层库命令 */
            // 获取数据库所在底层库编号
            int dbId;
            try {
                dbId = metaDatabase.getInnerDatabaseId(databaseName);
            } catch (MetaDatabaseOperationsException e) {
                session.setErrorMessage(e.getMessage());
                return null;
            }

            Database.DBType dbType = innerDatabasesArrayList.get(dbId - 1).getDbType();
            String[] args = new String[2];
            if (dbType == Database.DBType.MySQL) {
                args[0] = tableName;
                args[1] = databaseName;
            } else if (dbType == Database.DBType.Hive) {
                args[0] = databaseName;
                args[1] = tableName;
            } else {
                session.setErrorMessage("不支持的数据库类型 " + dbType);
                return null;
            }
            InnerSQLCommand innerDbCommand = sqlCommandBuilder.showColumns(dbType, args);
            commands.add(innerDbCommand);
            dbIds.add(dbId);
        }
        if (commandStack.size() > 1) commandStack.remove(commandStack.size() - 1);
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * 删除用户 STATEMENT
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitDrop_user_statement(uniformSQLParser.Drop_user_statementContext ctx) {
        /* 获取子节点数据 */
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();
        String userName = visit(ctx.user_name()).getValue();

        // TODO: 检测用户是否存在

        /* 元数据库命令 */
        InnerSQLCommand metaDbCommand = sqlCommandBuilder.dropUser(Database.DBType.MySQL, metaDatabase.getMetaDbName(), userName);
        commands.add(metaDbCommand);
        dbIds.add(0);

        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * 创建数据库 STATEMENT
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitCreate_database_statement(uniformSQLParser.Create_database_statementContext ctx) {
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 底层库 */
        if (ZQLEnv.get("innerdb.dafault.innerdb") == null) {
            session.setErrorMessage("没有指定底层库");
            return null;
        }
        int dbId = Integer.valueOf(ZQLEnv.get("innerdb.dafault.innerdb"));    // 默认底层库

        /* 获取子节点数据 */
        ASTNodeVisitResult visitSchemaNameNodeResult = visit(ctx.database_name());
        String createDbName = visitSchemaNameNodeResult.getValue();     // 数据库名
        String checkExists = ctx.IF() != null ? "IF NOT EXISTS" : "";   // IF NOT EXISTS

        /* 底层库命令 */
        Database.DBType dbType = innerDatabasesArrayList.get(dbId - 1).getDbType();
        InnerSQLCommand innerDbCommand = sqlCommandBuilder.createDatabase(dbType, checkExists, createDbName);
        commands.add(innerDbCommand);
        dbIds.add(dbId);

        /* 元数据库命令 */
        String dbAlias = innerDatabasesArrayList.get(dbId - 1).getDbAlias();
        String user = session.getUserName();
        InnerSQLCommand metaDbCommand = sqlCommandBuilder.createDatabaseMetaDb(Database.DBType.MySQL, metaDatabase.getMetaDbName(),
                createDbName, String.valueOf(dbId), dbAlias, user, new java.sql.Timestamp(Calendar.getInstance().getTime().getTime()));
        commands.add(metaDbCommand);
        dbIds.add(0);

        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * 删除指定数据库 STATEMENT
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitDrop_database_statement(uniformSQLParser.Drop_database_statementContext ctx) {
        /* 获取子节点数据 */
        ASTNodeVisitResult visitSchemaNameNodeResult;
        visitSchemaNameNodeResult = visit(ctx.database_name());
        String dropDbName = visitSchemaNameNodeResult.getValue(); // 数据库名
        String checkExists = ctx.IF() != null ? "IF EXISTS" : "";   // IF NOT EXISTS

        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 元数据库命令 - 直接执行 */
        // TODO: 如何让底层库间接使用元数据库命令执行的结果？
        // 获取数据库所在底层库编号
        int dbId;
        try {
            dbId = metaDatabase.getInnerDatabaseId(dropDbName);
        } catch (MetaDatabaseOperationsException e) {
            session.setErrorMessage(e.getMessage());
            return null;
        }

        // TODO: 数据库已经被删除
        if (dbId == -1) {
            return new ASTNodeVisitResult(null, commands, dbIds);
        }

        /* 底层库命令 */
        Database.DBType dbType = innerDatabasesArrayList.get(dbId - 1).getDbType();
        InnerSQLCommand innerDbCommand = sqlCommandBuilder.dropDatabase(dbType, checkExists, dropDbName);
        commands.add(innerDbCommand);
        dbIds.add(dbId);

        /* 元数据库命令 */
        InnerSQLCommand metaDbCommand = sqlCommandBuilder.dropDatabaseMetaDb(Database.DBType.MySQL, metaDatabase.getMetaDbName(), dropDbName);
        commands.add(metaDbCommand);
        dbIds.add(0);

        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * USE DATABASE
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitUse_event_statement(uniformSQLParser.Use_event_statementContext ctx) {
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 获取子节点数据 */
        ASTNodeVisitResult visitDatabaseNameNodeResult = visit(ctx.database_name());
        String dbName = visitDatabaseNameNodeResult.getValue();

        /* 检查数据库是否存在 */
        int dbId;
        try {
            dbId = metaDatabase.getInnerDatabaseId(dbName);
        } catch (MetaDatabaseOperationsException e) {
            session.setErrorMessage("连接元数据库获取数据库信息失败，失败原因：" + e.getMessage());
            return null;
        }
        if (dbId == -1) {
            session.setErrorMessage("不存在数据库 " + dbName);
            return null;
        }

        /* 更新 Session */
        session.setDatabase(dbName);

        return new ASTNodeVisitResult(null, commands, dbIds);
    }


    /**
     * Create_table_statement
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitCreate_table_statement(uniformSQLParser.Create_table_statementContext ctx) {
        return visitChildrenNodes(ctx.children);
    }

    /**
     * 创建表格 STATEMENT
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitCreate_table_statement1(uniformSQLParser.Create_table_statement1Context ctx) {
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 获取子节点数据 */
        String temporary = ctx.TEMPORARY() == null ? "" : "TEMPORARY";
        String external = ctx.EXTERNAL() == null ? "" : "EXTERNAL";
        String checkExists = ctx.IF() == null ? "" : "IF NOT EXISTS";
        String tableName = visit(ctx.table_spec().table_name()).getValue();
        String databaseName = (ctx.table_spec().schema_name() != null ? visit(ctx.table_spec().schema_name()).getValue() :
                (session.getDatabase() != null ? session.getDatabase() : null));
        if (databaseName == null) {
            session.setErrorMessage("未指定数据库");
            return null;
        }

        // 获取数据库所在的底层库
        int dbId;
        try {
            dbId = metaDatabase.getInnerDatabaseId(databaseName);
        } catch (MetaDatabaseOperationsException e) {
            session.setDatabase("获取数据库所在底层库失败，错误原因：" + e.getMessage());
            return null;
        }
        Database.DBType dbType = innerDatabasesArrayList.get(dbId - 1).getDbType();

        String columns = "";
        for (ParseTree tree : ctx.create_definition()) {
            String columnName = visit(tree.getChild(0)).getValue();
            ASTNodeVisitResult visitColumnDefinitionNodeResult = visit(tree.getChild(1));
//            int index = visitColumnDefinitionNodeResult.getValue().indexOf(" ");
//            String columnCommend = (index != -1 ? "COMMENT "
//                    + visitColumnDefinitionNodeResult.getValue().substring(index + 1, visitColumnDefinitionNodeResult.getValue().length())
//                    : "");
            String columnCommend = "";
            String allColumn = visitColumnDefinitionNodeResult.getValue();
            while (allColumn.indexOf(" ") == 0) allColumn = allColumn.substring(1);   //去掉开头的空格
            String columnType = visitColumnDefinitionNodeResult.getValue();
            while (columnType.indexOf(" ") == 0) columnType = columnType.substring(1);   //去掉开头的空格
//            columnType = columnType.split(" ")[0];
            int leftBracketsIndex = allColumn.indexOf('(');
            int rightBracketsIndex = allColumn.indexOf(')');
            // 括号内容
            String bracketContent = "";
            if (leftBracketsIndex != -1) {
                bracketContent = allColumn.substring(leftBracketsIndex, rightBracketsIndex + 1);
                columnType = allColumn.substring(0, leftBracketsIndex);
            }
            while (columnType.lastIndexOf(" ") == columnType.length() - 1)
                columnType = columnType.substring(0, columnType.length() - 1);   //去掉开头的空格
            CommandAdapter commandAdapter = CommandAdapter.getAdapterInstance(dbType);
            if (!commandAdapter.TYPE_MAP.containsKey(columnType.toUpperCase())) {
                session.setErrorMessage("找不到类型 " + columnType);
                return null;
            }
            columns += columnName + " " + commandAdapter.TYPE_MAP.get(columnType.toUpperCase()) + bracketContent + " " + columnCommend + ", ";
        }
        columns = columns.substring(0, columns.length() - 2);

        /* 底层库命令 */
        InnerSQLCommand innerDbCommand = sqlCommandBuilder.createTable(dbType, temporary, external, checkExists, databaseName, tableName,
                columns, "", "");
        commands.add(innerDbCommand);
        dbIds.add(dbId);

        /* 元数据库命令 */
        InnerSQLCommand metaDbCommand = sqlCommandBuilder.createTableMateDb(Database.DBType.MySQL, metaDatabase.getMetaDbName(),
                databaseName, tableName, session.getUserName(),
                new java.sql.Timestamp(Calendar.getInstance().getTime().getTime()));
        commands.add(metaDbCommand);
        dbIds.add(0);

        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * 获取字段定义
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitColumn_definition(uniformSQLParser.Column_definitionContext ctx) {
        String columnType = visit(ctx.column_data_type_header()).getValue();
        String comment = "";
        if (ctx.COMMENT() != null) {
            comment = ctx.getChild(2).getText();
        }
        String value = columnType + (comment.equals("") ? "" : (" " + comment));
        return new ASTNodeVisitResult(value, null, null);
    }

    /**
     * 获取 DECIMAL 的 NUMBER LITERAL
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitNumber_literal(uniformSQLParser.Number_literalContext ctx) {
        return new ASTNodeVisitResult(ctx.getText(), null, null);
    }

    /**
     * 获取 VARCHAR 的长度字段
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitVarchar_length(uniformSQLParser.Varchar_lengthContext ctx) {
        return new ASTNodeVisitResult(ctx.getText(), null, null);
    }

    /**
     * 获取 DECIMAL 的 LENGTH
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitLength(uniformSQLParser.LengthContext ctx) {
        return new ASTNodeVisitResult(ctx.getText(), null, null);
    }

    /**
     * 获取字段类型
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitColumn_data_type_header(uniformSQLParser.Column_data_type_headerContext ctx) {
//        String value = ctx.getChild(0).getText();
//        if (value.equals("VARCHAR")) {
//            value += "(" + visit(ctx.getChild(2)).getValue() + ")";
//        } else if (value.equals("DECIMAL")) {
//            value += "(" + visit(ctx.getChild(2)).getValue() + "," + visit(ctx.getChild(4)).getValue() + ")";
//        }
//        return new ASTNodeVisitResult(value, null, null);
        return visitChildrenNodes(ctx.children);
    }

    /**
     * 获取列名
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitColumn_name(uniformSQLParser.Column_nameContext ctx) {
        String value = ctx.any_name().getText();
        return new ASTNodeVisitResult(value, null, null);
    }

    /**
     * 删除数据表
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitDrop_table_statement(uniformSQLParser.Drop_table_statementContext ctx) {
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();
        if (session.getDatabase() == null) {
            session.setErrorMessage("未指定数据库，使用命令 `use db_name` 指定数据库");
            return null;
        }

        /* 获取子节点数据 */
        //TODO: 9月9日g4改动后可能会有点问题，待修正
        ASTNodeVisitResult visitTableNameNodeResult = visit(ctx.table_spec().table_name());
        String dropTableName = visitTableNameNodeResult.getValue();
        String checkExists = ctx.IF() == null ? "" : "IF EXISTS";
        String databaseName = session.getDatabase();
        if (ctx.table_spec().schema_name() != null) {
            databaseName = visit(ctx.table_spec().schema_name()).getValue();
        }
        /* 获取数据库所在底层库 */
        int dbId;
        try {
            dbId = metaDatabase.getInnerDatabaseId(databaseName);
        } catch (MetaDatabaseOperationsException e) {
            session.setDatabase("获取数据库所在底层库失败，错误原因：" + e.getMessage());
            return null;
        }

        /* 底层库命令 */
        Database.DBType dbType = innerDatabasesArrayList.get(dbId - 1).getDbType();
        InnerSQLCommand innerDbCommand = sqlCommandBuilder.dropTable(dbType, checkExists, databaseName + "." + dropTableName);
        commands.add(innerDbCommand);
        dbIds.add(dbId);

        /* 元数据库命令 */
        InnerSQLCommand metaDbCommand = sqlCommandBuilder.dropTableMetaDb(dbType, metaDatabase.getMetaDbName(), dropTableName, databaseName);
        commands.add(metaDbCommand);
        dbIds.add(0);

        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * 修改数据表 STATEMENT
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitAlter_table_statement(uniformSQLParser.Alter_table_statementContext ctx) {
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 获取子节点数据 */
        ASTNodeVisitResult visitTableSepcNodeResult = visit(ctx.table_spec().table_name());
        String tableName = visitTableSepcNodeResult.getValue();
        List<uniformSQLParser.Alter_table_specificationContext> alter_table_specificationContext = ctx.alter_table_specification();
        String databaseName = session.getDatabase();
        if (ctx.table_spec().schema_name() != null) {
            databaseName = visit(ctx.table_spec().schema_name()).getValue();
        }
        if (databaseName == null) {
            session.setErrorMessage("未指定数据库");
            return null;
        }
        /* 确定数据库所在底层库以及底层库类型 */
        int dbId;
        try {
            dbId = metaDatabase.getInnerDatabaseId(databaseName);
        } catch (MetaDatabaseOperationsException e) {
            session.setDatabase("获取数据库所在底层库失败，错误原因：" + e.getMessage());
            return null;
        }
        Database.DBType dbType = innerDatabasesArrayList.get(dbId - 1).getDbType();
        if (alter_table_specificationContext.size() != 0) {
            if (alter_table_specificationContext.get(0).RENAME() != null) {
            /* 修改表名 */
                String newTableName = ctx.alter_table_specification(0).table_spec().table_name().getText();
                Log.debug("修改数据表 " + tableName + " 为 " + newTableName);

            /* 底层库命令 */
                InnerSQLCommand innerDbCommand = sqlCommandBuilder.alterTableName(dbType, databaseName + "." + tableName, databaseName + "." + newTableName);
                commands.add(innerDbCommand);
                dbIds.add(dbId);

            /* 元数据库命令 */
                InnerSQLCommand metaDbSQLCommand = sqlCommandBuilder.alterTableNameMetaDb(Database.DBType.MySQL, metaDatabase.getMetaDbName(),
                        newTableName, tableName, databaseName);
                commands.add(metaDbSQLCommand);
                dbIds.add(0);
            } else if (alter_table_specificationContext.get(0).CHANGE() != null) {
            /* 修改列名 */
                String oldColumnName, newColumnName;
//                if (alter_table_specificationContext.get(0).COLUMN() != null) {
                oldColumnName = ctx.alter_table_specification(0).column_name(0).getText();
                newColumnName = ctx.alter_table_specification(0).column_name(1).getText();
//                } else {
//                    oldColumnName = alter_table_specificationContext.get(0).children.get(1).getText();
//                    newColumnName = alter_table_specificationContext.get(0).children.get(2).getText();
//                }

            /* 获取列类型 */
                String columnType;
                try {
                    columnType = innerDatabase.getColumnType(dbId, databaseName, tableName, oldColumnName);
                } catch (ZQLCommandExecutionError e) {
                    session.setErrorMessage(e.getMessage());
                    return null;
                }
            /* 底层库命令 */
                InnerSQLCommand innerDbCommand = sqlCommandBuilder.alterColumnName(dbType, databaseName + "." + tableName, oldColumnName, newColumnName, columnType);
                commands.add(innerDbCommand);
                dbIds.add(dbId);
            }
        }

        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
    }


    /**
     * specification 你个头！！！！
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitShow_specification(uniformSQLParser.Show_specificationContext ctx) {
        String value = ctx.getText();
        return new ASTNodeVisitResult(value, null, null);
    }

    /**
     * 获取表名
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitTable_name(uniformSQLParser.Table_nameContext ctx) {
        String value = ctx.any_name().getText();
        return new ASTNodeVisitResult(value, null, null);
    }

    /**
     * 获取用户字段
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitPrincipal_name(uniformSQLParser.Principal_nameContext ctx) {
        String value = ctx.getText();
        return new ASTNodeVisitResult(value, null, null);
    }

    /**
     * 获取权限字段
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitPriv_type(uniformSQLParser.Priv_typeContext ctx) {
        String value = ctx.getText();
        return new ASTNodeVisitResult(value, null, null);
    }

    /**
     * 返回模式名
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitSchema_name(uniformSQLParser.Schema_nameContext ctx) {
        String value = ctx.any_name().getText();
        return new ASTNodeVisitResult(value, null, null);
    }

    /**
     * 数据库名
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitDatabase_name(uniformSQLParser.Database_nameContext ctx) {
        String value = ctx.any_name().getText();
        return new ASTNodeVisitResult(value, null, null);
    }

    /**
     * SELECT Statement
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitSelect_statement(uniformSQLParser.Select_statementContext ctx) {
        commandStack.add("SELECT");
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();
        boolean keywordFlag = false;
        String valueStr = "";
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getClass() == TerminalNodeImpl.class) {
                if (!keywordFlag) {
                    valueStr += " ";
                }
                valueStr += ctx.children.get(i).getText() + " ";
                keywordFlag = true;
            } else {
                ASTNodeVisitResult whateverResult = visit(ctx.children.get(i));
                if (whateverResult.getCommands().size() != 0) {
                    valueStr += whateverResult.getCommands().get(0).getCommandStr();
                    if (whateverResult.getDbIds().size() != 0) {
                        dbIds.addAll(whateverResult.getDbIds());
                    }
                }
                keywordFlag = false;
            }
        }
        Database.DBType dbType = null;
        if (dbIds.size() != 0) {
            dbType = innerDatabasesArrayList.get(dbIds.get(0) - 1).getDbType();
        }
        InnerSQLCommand innerDBcommands = sqlCommandBuilder.defaultSQL(dbType, valueStr);
        commands.add(innerDBcommands);
        if (commandStack.size() > 1) commandStack.remove(commandStack.size() - 1);
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * SELECT Expression
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitSelect_expression(uniformSQLParser.Select_expressionContext ctx) {
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 获取子节点数据 */
        String allOrDistinct = (ctx.ALL() != null ? "ALL" : (ctx.DISTINCT() != null ? "DISTINCT" : ""));

        /* 确定数据库所在底层库以及底层库类型 */
        int dbId;
        try {
            dbId = metaDatabase.getInnerDatabaseId(session.getDatabase());
        } catch (MetaDatabaseOperationsException e) {
            session.setDatabase("获取数据库所在底层库失败，错误原因：" + e.getMessage());
            return null;
        }
        if (dbId == -1) dbId = 1;
        Database.DBType dbType = innerDatabasesArrayList.get(dbId - 1).getDbType();

        // SELECT ITEMS
        // TODO: 应该进一步分析
        String selectList = "";
        if (ctx.select_list() != null) {
            ASTNodeVisitResult visitResult = visit(ctx.select_list());
            String selectListeStr = visitResult.getValue();
            selectList += selectListeStr;
        }

        if (ctx.FROM() != null) {
            selectList += " " + ctx.FROM().getText() + " ";
        }

        // FROM TABLES
        String fromTables = "";
        if (ctx.table_references() != null) {
            ASTNodeVisitResult visitResult = visit(ctx.table_references());
            String fromTablesStr = visitResult.getValue();
            fromTables += fromTablesStr;
        }

        // WHERE CONDITIONS
        String whereConditions = "";
        if (ctx.where_clause() != null) {
            ASTNodeVisitResult visitResult = visit(ctx.where_clause());
            String whereStr = visitResult.getValue();
            whereConditions += whereStr;
        }

        // GROUP BY
        String groupBy = "";
        if (ctx.groupby_clause() != null) {
            ASTNodeVisitResult visitResult = visit(ctx.groupby_clause());
            String groupStr = visitResult.getValue();
            groupBy += groupStr;
        }

        // ORDER BY
        String orderBy = "";
        if (ctx.orderby_clause() != null) {
            ASTNodeVisitResult visitResult = visit(ctx.orderby_clause());
            String orderStr = visitResult.getValue();
            orderBy += orderStr;
        }

        // LIMIT
        String limit = "";
        if (ctx.limit_clause() != null) {
            ASTNodeVisitResult visitResult = visit(ctx.limit_clause());
            String limitStr = visitResult.getValue();
            limit += limitStr;
        }

        /* 底层库命令 */
        InnerSQLCommand innerDBcommands = sqlCommandBuilder.select(dbType, allOrDistinct, selectList,
                fromTables, whereConditions, groupBy, orderBy, limit);
        commands.add(innerDBcommands);
        dbIds.add(dbId);

        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * Select_list
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitSelect_list(uniformSQLParser.Select_listContext ctx) {
        return visitChildrenNodes(ctx.children);
    }

    /**
     * Table_references
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitTable_references(uniformSQLParser.Table_referencesContext ctx) {
        String valueStr = "";
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getText().equals(",")) {
                valueStr += " " + ctx.children.get(i).getText() + " ";
            } else {
                ASTNodeVisitResult whateverResult = visit(ctx.children.get(i));
                if (whateverResult.getValue() != null) {
                    valueStr += whateverResult.getValue();
                }
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Groupby_clause
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitGroupby_clause(uniformSQLParser.Groupby_clauseContext ctx) {
        return visitChildrenNodes(ctx.children);
    }

    /**
     * Groupby_item
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitGroupby_item(uniformSQLParser.Groupby_itemContext ctx) {
        String valueStr = "";
        if (ctx.column_spec() != null) {
            ASTNodeVisitResult whateverResult = visit(ctx.column_spec());
            if (whateverResult.getValue() != null) {
                valueStr += whateverResult.getValue();
            }
        }
        if (ctx.INTEGER_NUM() != null) {
            valueStr += ctx.INTEGER_NUM();
        }
        if (ctx.bit_expr() != null) {
            ASTNodeVisitResult whateverResult = visit(ctx.bit_expr());
            if (whateverResult.getValue() != null) {
                valueStr += whateverResult.getValue();
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Having_clause
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitHaving_clause(uniformSQLParser.Having_clauseContext ctx) {
        return visitChildrenNodes(ctx.children);
    }

    /**
     * Orderby_clause
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitOrderby_clause(uniformSQLParser.Orderby_clauseContext ctx) {
        return visitChildrenNodes(ctx.children);
    }

    /**
     * Orderby_item
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitOrderby_item(uniformSQLParser.Orderby_itemContext ctx) {
        return visitChildrenNodes(ctx.children);
    }

    /**
     * Limit_clause
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitLimit_clause(uniformSQLParser.Limit_clauseContext ctx) {
        return visitChildrenNodes(ctx.children);
    }

    /**
     * Offset
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitOffset(uniformSQLParser.OffsetContext ctx) {
        String valueStr = "";
        for (int i = 0; i < ctx.children.size(); i++) {
            ASTNodeVisitResult whateverResult = visit(ctx.children.get(i));
            if (whateverResult.getValue() != null) {
                valueStr += whateverResult.getValue();
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Row_count
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitRow_count(uniformSQLParser.Row_countContext ctx) {
        return new ASTNodeVisitResult(ctx.INTEGER_NUM().getText(), null, null);
    }

    /**
     * 获取 Displayed Column 数据
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitDisplayed_column(uniformSQLParser.Displayed_columnContext ctx) {
        String valueStr = "";
        TerminalNode dot = ctx.DOT();
        TerminalNode AK = ctx.ASTERISK();
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getText().equals(".") || ctx.children.get(i).getText().equals("*")) {
                if (ctx.children.get(i).getText().equals(".")) {
                    valueStr += ctx.children.get(i).getText();
                } else {
                    valueStr += ctx.children.get(i).getText() + " ";
                }
            } else {
                ASTNodeVisitResult whateverResult = visit(ctx.children.get(i));
                if (whateverResult.getValue() != null) {
                    valueStr += whateverResult.getValue();
                }
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * 设置元数据 STATEMENT
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitSet_event_statement(uniformSQLParser.Set_event_statementContext ctx) {
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 获取子节点数据 */
        String tableName = visit(ctx.table_spec().table_name()).getValue();
        String serverAlias = visit(ctx.server_alias_name()).getValue();
        String databaseName = visit(ctx.database_name()).getValue();

        /* 检查底层库是否存在 */
        int dbId;
        for (dbId = 0; dbId < innerDatabasesArrayList.size(); ++dbId) {
            if (innerDatabasesArrayList.get(dbId).getDbAlias().equals(serverAlias)) {
                break;
            }
        }

        if (dbId == innerDatabasesArrayList.size()) {
            session.setErrorMessage("底层库不存在");
            return null;
        }

        /* 检查数据库是否存在并且数据库是否在底层库中 */
        try {
            if (metaDatabase.getInnerDatabaseId(databaseName) != dbId + 1) {
                session.setErrorMessage("数据库 " + databaseName + " 不存在或不在底层库当中");
                return null;
            }
        } catch (MetaDatabaseOperationsException e) {
            session.setErrorMessage("连接元数据库获取数据库 " + databaseName + " 所在底层库失败，失败原因：");
            return null;
        }

        /* 元数据库命令 */

        InnerSQLCommand metaDbSQLCommand = sqlCommandBuilder.setTableNameToServerAlias(Database.DBType.MySQL, metaDatabase.getMetaDbName(),
                databaseName, tableName, session.getUserName(), new java.sql.Timestamp(Calendar.getInstance().getTime().getTime()));
        commands.add(metaDbSQLCommand);
        dbIds.add(0);

        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * 获取底层库别名
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitServer_alias_name(uniformSQLParser.Server_alias_nameContext ctx) {
        return new ASTNodeVisitResult(ctx.any_name().getText(), null, null);
    }

    /**
     * 指定底层库运行 STATEMENT
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitServer_event_statement(uniformSQLParser.Server_event_statementContext ctx) {
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 获取子节点数据 */
        String serverAlias = visit(ctx.server_alias_name()).getValue();

        /* 检查底层库是否存在 */
        int dbId;
        for (dbId = 0; dbId < innerDatabasesArrayList.size(); ++dbId) {
            if (innerDatabasesArrayList.get(dbId).getDbAlias().equals(serverAlias)) {
                break;
            }
        }

        if (dbId == innerDatabasesArrayList.size()) {
            session.setErrorMessage("底层库不存在");
            return null;
        }

        /* 访问语句，提取执行结果 */
        ASTNodeVisitResult visitResult = visit(ctx.root_statement());
        if (visitResult == null) {
            return null;
        } else {
            commands.addAll(visitResult.getCommands());
            for (int id : visitResult.getDbIds()) {
                dbIds.add(id == 0 ? 0 : dbId + 1);  // 保留元数据库相关操作
            }
        }

        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * 获取 Table Reference 数据
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitTable_reference(uniformSQLParser.Table_referenceContext ctx) {
//        String value = ctx.table_factor1().table_factor2().table_factor3().get(0).table_atom().get(0).table_spec().table_name().any_name().keyword().getText();
        String valueStr = "";
        if (ctx.table_atom() != null) {
            ASTNodeVisitResult whateverResult = visit(ctx.table_atom());
            if (whateverResult.getValue() != null) {
                valueStr += whateverResult.getValue();
            }
        }
        if (ctx.table_factor1() != null) {
            ASTNodeVisitResult whateverResult = visit(ctx.table_factor1());
            if (whateverResult.getValue() != null) {
                valueStr += whateverResult.getValue();
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Table_factor1
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitTable_factor1(uniformSQLParser.Table_factor1Context ctx) {
        return visitChildrenNodes(ctx.children);
    }

    /**
     * Table_factor2
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitTable_factor2(uniformSQLParser.Table_factor2Context ctx) {
        return visitChildrenNodes(ctx.children);
    }

    /**
     * Table_factor3
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitTable_factor3(uniformSQLParser.Table_factor3Context ctx) {
        return visitChildrenNodes(ctx.children);
    }

    /**
     * Table_atom
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitTable_atom(uniformSQLParser.Table_atomContext ctx) {
//        if (ctx.table_spec() == null) {
        return visitChildrenNodes(ctx.children);
//        }
//        String valueStr = "";
//        ASTNodeVisitResult whateverResult = visit(ctx.table_spec());
//        if (whateverResult.getValue() != null) {
//            valueStr += whateverResult.getValue();
//        }
//        if (ctx.alias() != null) {
//            ASTNodeVisitResult aliasResult = visit(ctx.alias());
//            if (aliasResult.getValue() != null) {
//                valueStr += " " + aliasResult.getValue();
//            }
//        }
//        return new ASTNodeVisitResult(valueStr, null, null);
    }

    @Override
    public ASTNodeVisitResult visitAlias(uniformSQLParser.AliasContext ctx) {
        ASTNodeVisitResult whateverResult = visitChildrenNodes(ctx.children);
        return new ASTNodeVisitResult(" " + whateverResult.getValue(), whateverResult.getCommands(), whateverResult.getDbIds());
    }

    /**
     * DELETE STATEMENT
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitDelete_statements(uniformSQLParser.Delete_statementsContext ctx) {
        commandStack.add("DELETE");
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 底层库 */
        if (ZQLEnv.get("innerdb.dafault.innerdb") == null) {
            session.setErrorMessage("没有指定底层库");
            return null;
        }
        String databaseName = session.getDatabase();
        if (ctx.table_spec().schema_name() != null) {
            databaseName = visit(ctx.table_spec().schema_name()).getValue();
        }
        /* 获取子节点数据 */
        ASTNodeVisitResult visitSchemaNameNodeResult = visit(ctx.table_spec().table_name());
        String tableName = visitSchemaNameNodeResult.getValue();
        // 数据库名
        /* 确定数据库所在底层库以及底层库类型 */
        int dbId;
        try {
            dbId = metaDatabase.getInnerDatabaseId(databaseName);
        } catch (MetaDatabaseOperationsException e) {
            session.setDatabase("获取数据库所在底层库失败，错误原因：" + e.getMessage());
            return null;
        }
        Database.DBType dbType = getInnerDatabaseByDBID(dbId).getDbType();

        ASTNodeVisitResult visitWhereClauseResult = visit(ctx.where_clause());
        String whereString = visitWhereClauseResult.getValue();
        if (whereString == null) {
            whereString = "";
        }
        /* 底层库命令 */
        InnerSQLCommand innerDbCommand = sqlCommandBuilder.delete(dbType, databaseName + "." + tableName, whereString);
        commands.add(innerDbCommand);
        dbIds.add(dbId);
        if (commandStack.size() > 1) commandStack.remove(commandStack.size() - 1);
        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * WHERE CLAUSE
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitWhere_clause(uniformSQLParser.Where_clauseContext ctx) {
        commandStack.add("WHERE");
        String whereString = "";
        if (ctx.WHERE() != null) {
            whereString += " " + ctx.WHERE() + " ";
            ASTNodeVisitResult childrenResult = visit(ctx.expression());
            whereString = whereString + " " + childrenResult.getValue();
        }
        if (commandStack.size() > 1) commandStack.remove(commandStack.size() - 1);
        return new ASTNodeVisitResult(whereString, null, null);
    }

    /**
     * EXPRESSION
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitExpression(uniformSQLParser.ExpressionContext ctx) {
        String valueStr = "";
        for (int i = 0; i < ctx.exp_factor1().size(); i++) {
            ASTNodeVisitResult expressionResult = visit(ctx.exp_factor1().get(i));
            if (expressionResult.getValue() != null) {
                valueStr += expressionResult.getValue();
            }
            if (ctx.OR(i) != null) {
                valueStr += " " + ctx.OR(i) + " ";
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Exp_factor1
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitExp_factor1(uniformSQLParser.Exp_factor1Context ctx) {
        String valueStr = "";
        for (int i = 0; i < ctx.exp_factor2().size(); i++) {
            ASTNodeVisitResult childrenResult = visit(ctx.exp_factor2().get(i));
            if (childrenResult.getValue() != null) {
                valueStr += childrenResult.getValue();
            }
            if (ctx.XOR(i) != null) {
                valueStr += " " + ctx.XOR(i) + " ";
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Exp_factor2
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitExp_factor2(uniformSQLParser.Exp_factor2Context ctx) {
        String valueStr = "";
        for (int i = 0; i < ctx.exp_factor3().size(); i++) {
            ASTNodeVisitResult childrenResult = visit(ctx.exp_factor3().get(i));
            if (childrenResult.getValue() != null) {
                valueStr += childrenResult.getValue();
            }
            if (ctx.AND(i) != null) {
                valueStr += " " + ctx.AND(i) + " ";
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Exp_factor3
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitExp_factor3(uniformSQLParser.Exp_factor3Context ctx) {
        String valueStr = "";
        if (ctx.NOT() != null) {
            valueStr += " " + ctx.NOT() + " ";
        }
        ASTNodeVisitResult childrenResult = visit(ctx.exp_factor4());
        if (childrenResult.getValue() != null) {
            valueStr += childrenResult.getValue();
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Exp_factor4
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitExp_factor4(uniformSQLParser.Exp_factor4Context ctx) {
        String valueStr = "";
        ASTNodeVisitResult childrenResult = visit(ctx.bool_primary());
        if (childrenResult.getValue() != null) {
            valueStr += childrenResult.getValue();
        }
        if (ctx.IS() != null) {
            valueStr += " " + ctx.IS() + " ";
            if (ctx.NOT() != null) {
                valueStr += " " + ctx.NOT() + " ";
            }
            if (ctx.NULL() != null) {
                valueStr += " " + ctx.NULL() + " ";
            } else {
                ASTNodeVisitResult booleanLiteralResult = visit(ctx.boolean_literal());
                if (booleanLiteralResult.getValue() != null) {
                    valueStr += booleanLiteralResult.getValue();
                }
            }
        }

        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Boolean_literal
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitBoolean_literal(uniformSQLParser.Boolean_literalContext ctx) {
        String valueStr = "";
        if (ctx.TRUE() != null) {
            valueStr += " " + ctx.TRUE() + " ";
        }
        if (ctx.FALSE() != null) {
            valueStr += " " + ctx.FALSE() + " ";
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Bool_primary
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitBool_primary(uniformSQLParser.Bool_primaryContext ctx) {
        String valueStr = "";
        if (ctx.predicate().size() != 0) {
            ASTNodeVisitResult predicateResult = visit(ctx.predicate(0));
            if (predicateResult.getValue() != null) {
                valueStr += predicateResult.getValue();
            }
            if (ctx.relational_op() != null) {
                ASTNodeVisitResult opResult = visit(ctx.relational_op());
                if (opResult.getValue() != null) {
                    valueStr += opResult.getValue();
                }
                if (ctx.predicate().size() != 1) {
                    //( predicate relational_op predicate )
                    ASTNodeVisitResult predicateResult2 = visit(ctx.predicate(1));
                    if (predicateResult2.getValue() != null) {
                        valueStr += predicateResult2.getValue();
                    }
                } else {
                    if (ctx.subquery() != null) {
                        //( predicate relational_op ( ALL  )? subquery )
                        if (ctx.ALL() != null) {
                            valueStr += " " + ctx.ALL() + " ";
                        }
                        ASTNodeVisitResult subQueryResult = visit(ctx.subquery());
                        if (subQueryResult.getValue() != null) {
                            valueStr += subQueryResult.getValue();
                        }
                    } else {
                        //(predicate)
                    }
                }
            }
        } else {
            //( NOT? EXISTS subquery )
            if (ctx.NOT() != null) {
                valueStr += " " + ctx.NOT() + " ";
            }
            if (ctx.EXISTS() != null) {
                valueStr += " " + ctx.EXISTS() + " ";
            }
            ASTNodeVisitResult subQueryResult = visit(ctx.subquery());
            if (subQueryResult.getValue() != null) {
                valueStr += subQueryResult.getValue();
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * predicate
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitPredicate(uniformSQLParser.PredicateContext ctx) {
        String valueStr = "";
        ASTNodeVisitResult bit_exprResult1 = visit(ctx.bit_expr(0));
        if (bit_exprResult1.getValue() != null) {
            valueStr += bit_exprResult1.getValue();
        }
        if (ctx.NOT() != null) {
            valueStr += " " + ctx.NOT() + " ";
        }
        if (ctx.IN() != null) {
            //( bit_expr (NOT)? IN (subquery | expression_list) )
            valueStr += " " + ctx.IN() + " ";
            if (ctx.subquery() != null) {
                ASTNodeVisitResult subQueryResult = visit(ctx.subquery());
                if (subQueryResult.getValue() != null) {
                    valueStr += subQueryResult.getValue();
                }
            } else {
                ASTNodeVisitResult expressionListResult = visit(ctx.expression_list());
                if (expressionListResult.getValue() != null) {
                    valueStr += expressionListResult.getValue();
                }
            }
        }
        if (ctx.BETWEEN() != null) {
            //( bit_expr (NOT)? BETWEEN bit_expr AND predicate )
            valueStr += " " + ctx.BETWEEN() + " ";

            ASTNodeVisitResult bit_exprResult2 = visit(ctx.bit_expr(1));
            if (bit_exprResult2.getValue() != null) {
                valueStr += bit_exprResult2.getValue();
            } else {
                //TODO:error
            }

            if (ctx.AND() != null) {
                valueStr += " " + ctx.AND() + " ";
            } else {
                //TODO:error
            }

            if (ctx.predicate() != null) {
                ASTNodeVisitResult predicateResult = visit(ctx.predicate());
                if (predicateResult.getValue() != null) {
                    valueStr += predicateResult.getValue();
                }
            } else {
                //TODO:error
            }
        }
        if (ctx.LIKE() != null) {
            //( bit_expr (NOT)? LIKE simple_expr  )
            valueStr += " " + ctx.LIKE() + " ";
            if (ctx.simple_expr() != null) {
                ASTNodeVisitResult simple_exprResult = visit(ctx.simple_expr());
                if (simple_exprResult.getValue() != null) {
                    valueStr += simple_exprResult.getValue();
                }
            } else {
                //TODO:error
            }
        }
        if (ctx.REGEXP() != null) {
            //( bit_expr (NOT)? REGEXP bit_expr )
            valueStr += " " + ctx.REGEXP() + " ";
            if (ctx.bit_expr(1) != null) {
                ASTNodeVisitResult bit_exprResult2 = visit(ctx.bit_expr(1));
                if (bit_exprResult2.getValue() != null) {
                    valueStr += bit_exprResult2.getValue();
                }
            } else {
                //TODO:error
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Bit_expr
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitBit_expr(uniformSQLParser.Bit_exprContext ctx) {
        String valueStr = "";
        ASTNodeVisitResult factor1Result1 = visit(ctx.factor1(0));
        if (factor1Result1.getValue() != null) {
            valueStr += factor1Result1.getValue();
        }
        if (ctx.VERTBAR() != null) {
            valueStr += " " + ctx.VERTBAR() + " ";
            if (ctx.factor1(1) != null) {
                ASTNodeVisitResult factor1Result2 = visit(ctx.factor1(1));
                if (factor1Result2.getValue() != null) {
                    valueStr += factor1Result2.getValue();
                }
            } else {
                //TODO:error
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * factor1
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitFactor1(uniformSQLParser.Factor1Context ctx) {
        String valueStr = "";
        ASTNodeVisitResult factor2Result1 = visit(ctx.factor2(0));
        if (factor2Result1.getValue() != null) {
            valueStr += factor2Result1.getValue();
        }
        if (ctx.BITAND() != null) {
            valueStr += " " + ctx.BITAND() + " ";
            if (ctx.factor2(1) != null) {
                ASTNodeVisitResult factor1Result2 = visit(ctx.factor2(1));
                if (factor1Result2.getValue() != null) {
                    valueStr += factor1Result2.getValue();
                }
            } else {
                //TODO:error
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * factor2
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitFactor2(uniformSQLParser.Factor2Context ctx) {
        String valueStr = "";
        ASTNodeVisitResult factor2Result1 = visit(ctx.factor3(0));
        if (factor2Result1.getValue() != null) {
            valueStr += factor2Result1.getValue();
        }
        if (ctx.SHIFT_LEFT() != null) {
            valueStr += " " + ctx.SHIFT_LEFT() + " ";
            if (ctx.factor3(1) != null) {
                ASTNodeVisitResult factor1Result2 = visit(ctx.factor3(1));
                if (factor1Result2.getValue() != null) {
                    valueStr += factor1Result2.getValue();
                }
            } else {
                //TODO:error
            }
        } else {
            if (ctx.SHIFT_RIGHT() != null) {
                valueStr += " " + ctx.SHIFT_RIGHT() + " ";
                if (ctx.factor3(1) != null) {
                    ASTNodeVisitResult factor1Result2 = visit(ctx.factor3(1));
                    if (factor1Result2.getValue() != null) {
                        valueStr += factor1Result2.getValue();
                    }
                } else {
                    //TODO:error
                }
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * factor3
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitFactor3(uniformSQLParser.Factor3Context ctx) {
        String valueStr = "";
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getText().equals("+") || ctx.children.get(i).getText().equals("-")) {
                //op
                valueStr += " " + ctx.children.get(i).getText() + " ";
            } else {
                ASTNodeVisitResult factor4Result1 = visit(ctx.children.get(i));
                if (factor4Result1.getValue() != null) {
                    valueStr += factor4Result1.getValue();
                }
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * factor4
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitFactor4(uniformSQLParser.Factor4Context ctx) {
        String valueStr = "";
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getText().equals("*") || ctx.children.get(i).getText().equals("/") || ctx.children.get(i).getText().equals("%") || ctx.children.get(i).getText().equals("^")) {
                //op
                valueStr += " " + ctx.children.get(i).getText() + " ";
            } else {
                ASTNodeVisitResult factor5Result1 = visit(ctx.children.get(i));
                if (factor5Result1.getValue() != null) {
                    valueStr += factor5Result1.getValue();
                }
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * factor5
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitFactor5(uniformSQLParser.Factor5Context ctx) {
        String valueStr = "";
        ASTNodeVisitResult factor6Result = visit(ctx.factor6());
        if (factor6Result.getValue() != null) {
            valueStr += factor6Result.getValue();
        }
        boolean flag = false;
        if (ctx.PLUS() != null) {
            valueStr += " " + ctx.PLUS() + " ";
            flag = true;
        }
        if (ctx.MINUS() != null) {
            valueStr += " " + ctx.MINUS() + " ";
            flag = true;
        }
        if (flag) {
            ASTNodeVisitResult interval_exprResult = visit(ctx.interval_expr());
            if (interval_exprResult.getValue() != null) {
                valueStr += interval_exprResult.getValue();
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * factor6
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitFactor6(uniformSQLParser.Factor6Context ctx) {
        String valueStr = "";
        if (ctx.PLUS() != null) valueStr += " " + ctx.PLUS() + " ";
        if (ctx.MINUS() != null) valueStr += " " + ctx.MINUS() + " ";
        if (ctx.NEGATION() != null) valueStr += " " + ctx.NEGATION() + " ";
        if (ctx.BINARY() != null) valueStr += " " + ctx.BINARY() + " ";
        ASTNodeVisitResult simple_exprResult = visit(ctx.simple_expr());
        if (simple_exprResult.getValue() != null) {
            valueStr += simple_exprResult.getValue();
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Simple_expr
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitSimple_expr(uniformSQLParser.Simple_exprContext ctx) {
        String valueStr = "";
        if (ctx.EXISTS() != null) {
            //EXISTS subquery
            valueStr += " " + ctx.EXISTS() + " ";
        }
        if (ctx.subquery() != null) {
            ASTNodeVisitResult whateverResult = visit(ctx.subquery());
            if (whateverResult.getValue() != null) {
                valueStr += whateverResult.getValue();
            }
        }
        if (ctx.literal_value() != null) {
            ASTNodeVisitResult whateverResult = visit(ctx.literal_value());
            if (whateverResult.getValue() != null) {
                valueStr += whateverResult.getValue();
            }
        }
        if (ctx.column_spec() != null) {
            ASTNodeVisitResult whateverResult = visit(ctx.column_spec());
            if (whateverResult.getValue() != null) {
                valueStr += whateverResult.getValue();
            }
        }
        if (ctx.function_call() != null) {
            //TODO:visitFuncation_call
            ASTNodeVisitResult whateverResult = visit(ctx.function_call());
            if (whateverResult.getValue() != null) {
                valueStr += whateverResult.getValue();
            }
        }
        if (ctx.expression_list() != null) {
            ASTNodeVisitResult whateverResult = visit(ctx.expression_list());
            if (whateverResult.getValue() != null) {
                valueStr += whateverResult.getValue();
            }
        }
        if (ctx.raw_expression_list() != null) {
            ASTNodeVisitResult whateverResult = visit(ctx.raw_expression_list());
            if (whateverResult.getValue() != null) {
                valueStr += whateverResult.getValue();
            }
        }
        if (ctx.case_when_statement() != null) {
            ASTNodeVisitResult whateverResult = visit(ctx.case_when_statement());
            if (whateverResult.getValue() != null) {
                valueStr += whateverResult.getValue();
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Literal_value
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitLiteral_value(uniformSQLParser.Literal_valueContext ctx) {
        String valueStr = "";
        if (ctx.NULL() != null) valueStr += " " + ctx.NULL() + " ";
        else if (ctx.string_literal() != null) {
            ASTNodeVisitResult whateverResult = visit(ctx.string_literal());
            if (whateverResult.getValue() != null) {
                valueStr += whateverResult.getValue();
            }
        } else if (ctx.number_literal() != null) {
            ASTNodeVisitResult whateverResult = visit(ctx.number_literal());
            if (whateverResult.getValue() != null) {
                valueStr += whateverResult.getValue();
            }
        } else if (ctx.hex_literal() != null) {
            ASTNodeVisitResult whateverResult = visit(ctx.hex_literal());
            if (whateverResult.getValue() != null) {
                valueStr += whateverResult.getValue();
            }
        } else if (ctx.boolean_literal() != null) {
            ASTNodeVisitResult whateverResult = visit(ctx.boolean_literal());
            if (whateverResult.getValue() != null) {
                valueStr += whateverResult.getValue();
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * String_literal
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitString_literal(uniformSQLParser.String_literalContext ctx) {
        return new ASTNodeVisitResult(ctx.getText(), null, null);
    }

    /**
     * Hex_literal
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitHex_literal(uniformSQLParser.Hex_literalContext ctx) {
        return new ASTNodeVisitResult(ctx.getText(), null, null);
    }

//    /**
//     * Bit_literal
//     *
//     * @param ctx 节点上下文
//     * @return 节点访问结果
//     */
//    @Override
//    public ASTNodeVisitResult visitBit_literal(uniformSQLParser.Bit_literalContext ctx) {
//        return new ASTNodeVisitResult(ctx.getText(), null, null);
//    }

    /**
     * Any_name
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitAny_name(uniformSQLParser.Any_nameContext ctx) {
        return new ASTNodeVisitResult(ctx.getText(), null, null);
    }

    /**
     * Column_spec
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitColumn_spec(uniformSQLParser.Column_specContext ctx) {
        String valueStr = "";
        if (ctx.table_spec() != null) {
            ASTNodeVisitResult whateverResult = visit(ctx.table_spec());
            if (whateverResult.getValue() != null) {
                valueStr += whateverResult.getValue();
                valueStr += ".";
            }
        }
        ASTNodeVisitResult whateverResult = visit(ctx.column_name());
        if (whateverResult.getValue() != null) {
            valueStr += whateverResult.getValue();
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Expression_list
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitExpression_list(uniformSQLParser.Expression_listContext ctx) {
        //LPAREN expression ( COMMA expression )* RPAREN ;
        String valueStr = "";
        if (ctx.LPAREN() != null) {
            valueStr += " " + ctx.LPAREN();
        }
        for (int i = 0; i < ctx.expression().size(); i++) {
            ASTNodeVisitResult expressionResult = visit(ctx.expression(i));
            if (expressionResult.getValue() != null) {
                valueStr += expressionResult.getValue();
            }
            if (ctx.COMMA(i) != null) {
                valueStr += ctx.COMMA(i) + " ";
            }
        }
        if (ctx.RPAREN() != null) {
            valueStr += ctx.RPAREN() + " ";
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Raw_expression_list
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitRaw_expression_list(uniformSQLParser.Raw_expression_listContext ctx) {
        return visitChildrenNodes(ctx.children);
    }

    /**
     * Interval_expr
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitInterval_expr(uniformSQLParser.Interval_exprContext ctx) {
        String valueStr = "";
        if (ctx.INTERVAL() != null) {
            valueStr += " " + ctx.INTERVAL() + " ";
        }
        if (ctx.expression() != null) {
            ASTNodeVisitResult expressionResult = visit(ctx.expression());
            if (expressionResult.getValue() != null) {
                valueStr += expressionResult.getValue() + " ";
            }
        }
        if (ctx.interval_unit() != null) {
            ASTNodeVisitResult interval_unitResult = visit(ctx.interval_unit());
            if (interval_unitResult.getValue() != null) {
                valueStr += interval_unitResult.getValue() + " ";
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Case_when_statement
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitCase_when_statement(uniformSQLParser.Case_when_statementContext ctx) {
        String valueStr = "";
        if (ctx.case_when_statement1() != null) {
            ASTNodeVisitResult caseResult = visit(ctx.case_when_statement1());
            if (caseResult.getValue() != null) {
                valueStr += caseResult.getValue();
            }
        } else if (ctx.case_when_statement2() != null) {
            ASTNodeVisitResult caseResult = visit(ctx.case_when_statement2());
            if (caseResult.getValue() != null) {
                valueStr += caseResult.getValue();
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Case_when_statement1
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitCase_when_statement1(uniformSQLParser.Case_when_statement1Context ctx) {
        return visitChildrenNodes(ctx.children);
    }

    /**
     * Case_when_statement2
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitCase_when_statement2(uniformSQLParser.Case_when_statement2Context ctx) {
        return visitChildrenNodes(ctx.children);
    }

    /**
     * Function_call
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitFunction_call(uniformSQLParser.Function_callContext ctx) {
        String valueStr = "";
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getText().equals("(") || ctx.children.get(i).getText().equals(")") || ctx.children.get(i).getText().equals(",") || ctx.children.get(i).getText().equals("CAST") || ctx.children.get(i).getText().equals("*") || ctx.children.get(i).getText().equals("ALL") || ctx.children.get(i).getText().equals("DISTINCT")) {
                valueStr += " " + ctx.children.get(i).getText() + " ";
            } else {
                ASTNodeVisitResult whateverResult = visit(ctx.children.get(i));
                if (whateverResult.getValue() != null) {
                    valueStr += whateverResult.getValue();
                }
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * FunctionList
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitFunctionList(uniformSQLParser.FunctionListContext ctx) {
        String valueStr = "";
        ASTNodeVisitResult whateverResult = visit(ctx.children.get(0));
        if (whateverResult.getValue() != null) {
            valueStr += whateverResult.getValue();
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Cast_data_type
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitCast_data_type(uniformSQLParser.Cast_data_typeContext ctx) {
//        BINARY (INTEGER_NUM)?
//        | CHAR (INTEGER_NUM)?
//        | DATE
//        | DATETIME
//        | DECIMAL (LPAREN INTEGER_NUM (COMMA INTEGER_NUM)? RPAREN )?
//        | SIGNED (INTEGER)?
//        //| TIME
//        | UNSIGNED (INTEGER)?
        return visitChildrenNodes(ctx.children);
    }

    /**
     * Group_functions
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitGroup_functions(uniformSQLParser.Group_functionsContext ctx) {
        String valueStr = "";
        valueStr += " " + ctx.children.get(0).getText() + " ";
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Relational_op
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitRelational_op(uniformSQLParser.Relational_opContext ctx) {
        String valueStr = "";
        if (ctx.EQ() != null) valueStr += " " + ctx.EQ() + " ";
        if (ctx.LTH() != null) valueStr += " " + ctx.LTH() + " ";
        if (ctx.GTH() != null) valueStr += " " + ctx.GTH() + " ";
        if (ctx.NOT_EQ() != null) valueStr += " " + ctx.NOT_EQ() + " ";
        if (ctx.LET() != null) valueStr += " " + ctx.LET() + " ";
        if (ctx.GET() != null) valueStr += " " + ctx.GET() + " ";
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Update_statements
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitUpdate_statements(uniformSQLParser.Update_statementsContext ctx) {
        commandStack.add("UPDATE");
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();
                /* 底层库 */
        if (ZQLEnv.get("innerdb.dafault.innerdb") == null) {
            session.setErrorMessage("没有指定底层库");
            return null;
        }
        String database = session.getDatabase();
        if (ctx.table_spec().schema_name() != null) {
            ASTNodeVisitResult database_nameResult = visit(ctx.table_spec().schema_name());
            if (database_nameResult.getValue() != null) {
                database = database_nameResult.getValue();
            }
        }


        /* 确定数据库所在底层库以及底层库类型 */
        int dbId;
        try {
            dbId = metaDatabase.getInnerDatabaseId(database);
        } catch (MetaDatabaseOperationsException e) {
            session.setDatabase("获取数据库所在底层库失败，错误原因：" + e.getMessage());
            return null;
        }
        Database.DBType dbType = getInnerDatabaseByDBID(dbId).getDbType();

        String tableName = "";
        if (ctx.table_spec().table_name() != null) {
            ASTNodeVisitResult user_nameResult = visit(ctx.table_spec().table_name());
            if (user_nameResult.getValue() != null) {
                tableName = user_nameResult.getValue();
            }
        }

        String setString = "";
        if (ctx.set_columns_cluase() != null) {
            ASTNodeVisitResult setResult = visit(ctx.set_columns_cluase());
            if (setResult.getValue() != null) {
                setString = setResult.getValue();
            }
        }

        String whereString = "";
        if (ctx.where_clause() != null) {
            ASTNodeVisitResult visitWhereClauseResult = visit(ctx.where_clause());
            if (visitWhereClauseResult.getValue() != null) {
                whereString = visitWhereClauseResult.getValue();
            }
        }

        /* 底层库命令 */
        InnerSQLCommand innerDbCommand = sqlCommandBuilder.update(dbType, database + "." + tableName, setString, whereString);
        commands.add(innerDbCommand);
        dbIds.add(dbId);
        if (commandStack.size() > 1) commandStack.remove(commandStack.size() - 1);
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * Set_columns_cluase
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitSet_columns_cluase(uniformSQLParser.Set_columns_cluaseContext ctx) {
        return visitChildrenNodes(ctx.children);
    }

    /**
     * Set_column_cluase
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitSet_column_cluase(uniformSQLParser.Set_column_cluaseContext ctx) {
        return visitChildrenNodes(ctx.children);
    }

//    /**
//     * Insert_statements
//     *
//     * @param ctx 节点上下文
//     * @return 节点访问结果
//     */
//    @Override
//    public ASTNodeVisitResult visitInsert_statements(uniformSQLParser.Insert_statementsContext ctx) {
//        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
//        ArrayList<Integer> dbIds = new ArrayList<Integer>();
//        if (ctx.insert_statement() != null) {
//            ASTNodeVisitResult insertResult = visit(ctx.insert_statement());
//            commands = insertResult.getCommands();
//            dbIds = insertResult.getDbIds();
//        }
//        return new ASTNodeVisitResult(null, commands, dbIds);
//    }

    /**
     * Insert_statement
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitInsert_statement(uniformSQLParser.Insert_statementContext ctx) {
        commandStack.add("INSERT");
        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();
        /* 底层库 */
        if (ZQLEnv.get("innerdb.dafault.innerdb") == null) {
            session.setErrorMessage("没有指定底层库");
            return null;
        }
        String database = session.getDatabase();
        /* 确定数据库所在底层库以及底层库类型 */
        int dbId = -1;
        try {
            dbId = metaDatabase.getInnerDatabaseId(database);
        } catch (MetaDatabaseOperationsException e) {
            session.setDatabase("获取数据库所在底层库失败，错误原因：" + e.getMessage());
            return null;
        }
        if (dbId == -1) dbId = 1;
        Database.DBType dbType = getInnerDatabaseByDBID(dbId).getDbType();

        String insert_headerStr = "";
        if (ctx.insert_header() != null) {
            ASTNodeVisitResult whateverResult = visit(ctx.insert_header());
            if (whateverResult.getValue() != null) {
                insert_headerStr += whateverResult.getValue();
            }
            if (whateverResult.getDbIds() != null) {
                dbIds = whateverResult.getDbIds();
            }
        }

        String column_listStr = "";
        if (ctx.column_list() != null) {
            ASTNodeVisitResult whateverResult = visit(ctx.column_list());
            if (whateverResult.getValue() != null) {
                column_listStr += whateverResult.getValue();
            }
        }

        String select_expressionStr = "";
        if (ctx.select_expression() != null) {
            ASTNodeVisitResult whateverResult = visit(ctx.select_expression());
            if (whateverResult.getCommands() != null) {
                if (whateverResult.getCommands().size() > 0) {
                    select_expressionStr += whateverResult.getCommands().get(0).getCommandStr();
                }
            }
        }

        String value_list_clauseStr = "";
        if (ctx.value_list_clause() != null) {
            ASTNodeVisitResult whateverResult = visit(ctx.value_list_clause());
            if (whateverResult.getValue() != null) {
                value_list_clauseStr += whateverResult.getValue();
            }
        }

        String insert_subfixStr = "";
        if (ctx.insert_subfix() != null) {
            ASTNodeVisitResult whateverResult = visit(ctx.insert_subfix());
            if (whateverResult.getValue() != null) {
                insert_subfixStr += whateverResult.getValue();
            }
        }

        /* 底层库命令 */
        InnerSQLCommand innerDbCommand = sqlCommandBuilder.insert(dbType, insert_headerStr, column_listStr, select_expressionStr + value_list_clauseStr, insert_subfixStr);
        commands.add(innerDbCommand);
        dbIds.add(dbId);
        if (commandStack.size() > 1) commandStack.remove(commandStack.size() - 1);
        return new ASTNodeVisitResult(null, commands, dbIds);
    }

    /**
     * Insert_header
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitInsert_header(uniformSQLParser.Insert_headerContext ctx) {
        ArrayList<Integer> dbIds = new ArrayList<Integer>();
        String valueStr = "";
        if (ctx.LOW_PRIORITY() != null) {
            valueStr += " " + ctx.LOW_PRIORITY() + " ";
        }
        if (ctx.HIGH_PRIORITY() != null) {
            valueStr += " " + ctx.HIGH_PRIORITY() + " ";
        }
        if (ctx.IGNORE() != null) {
            valueStr += " " + ctx.IGNORE() + " ";
        }
        if (ctx.INTO() != null) {
            valueStr += " " + ctx.INTO() + " ";
        }
        if (ctx.table_spec() != null) {
            ASTNodeVisitResult tableResult = visit(ctx.table_spec());
            if (tableResult.getValue() != null) {
                valueStr += tableResult.getValue();
            }
        }
        if (ctx.partition_clause() != null) {
            ASTNodeVisitResult partition_clauseResult = visit(ctx.partition_clause());
            if (partition_clauseResult.getValue() != null) {
                valueStr += partition_clauseResult.getValue();
            }
        }
        return new ASTNodeVisitResult(valueStr, null, dbIds);
    }

    /**
     * Table_spec
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitTable_spec(uniformSQLParser.Table_specContext ctx) {
        ArrayList<Integer> dbIds = new ArrayList<Integer>();
        String valueStr = "";
//        tableSpecNodes.add(ctx);
//        commandType.put(ctx,commandStack.get(commandStack.size() - 1));
        if (ctx.schema_name() != null) {
            //databasename
            ASTNodeVisitResult schema_nameResult = visit(ctx.schema_name());
            String database = session.getDatabase();
            if (schema_nameResult.getValue() != null) {
                valueStr += schema_nameResult.getValue();
                database = schema_nameResult.getValue();
            }
            int dbId;
            try {
                dbId = metaDatabase.getInnerDatabaseId(database);
            } catch (MetaDatabaseOperationsException e) {
                session.setDatabase("获取数据库所在底层库失败，错误原因：" + e.getMessage());
                return null;
            }
            dbIds.add(dbId);
            if (ctx.DOT() != null) {
                valueStr += ctx.DOT();
            }
        } else {
            dbIds = null;
            valueStr += session.getDatabase() + ".";
        }
        if (ctx.table_name() != null) {
            ASTNodeVisitResult table_nameResult = visit(ctx.table_name());
            if (table_nameResult.getValue() != null) {
                valueStr += table_nameResult.getValue();
            }
        }

        return new ASTNodeVisitResult(valueStr, null, dbIds);
    }

    /**
     * Partition_clause
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitPartition_clause(uniformSQLParser.Partition_clauseContext ctx) {
        String valueStr = "";
        if (ctx.PARTITION() != null) {
            valueStr += " " + ctx.PARTITION() + " ";
        }
        if (ctx.LPAREN() != null) {
            valueStr += ctx.LPAREN();
        }

        if (ctx.partition_names() != null) {
            ASTNodeVisitResult partition_namesResult = visit(ctx.partition_names());
            if (partition_namesResult.getValue() != null) {
                valueStr += partition_namesResult.getValue();
            }
        }
        if (ctx.RPAREN() != null) {
            valueStr += ctx.RPAREN();
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Partition_names
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitPartition_names(uniformSQLParser.Partition_namesContext ctx) {
        String valueStr = "";
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).getText().equals(",")) {
                valueStr += ctx.children.get(i).getText() + " ";
            } else {
                ASTNodeVisitResult whateverResult = visit(ctx.children.get(i));
                if (whateverResult.getValue() != null) {
                    valueStr += whateverResult.getValue();
                }
            }
        }
        return new ASTNodeVisitResult(valueStr, null, null);
    }

    /**
     * Partition_name
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitPartition_name(uniformSQLParser.Partition_nameContext ctx) {
        return new ASTNodeVisitResult(ctx.any_name().getText(), null, null);
    }

    /**
     * Column_list
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitColumn_list(uniformSQLParser.Column_listContext ctx) {
        return visitChildrenNodes(ctx.children);
    }

    /**
     * Value_list_clause
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitValue_list_clause(uniformSQLParser.Value_list_clauseContext ctx) {
        return visitChildrenNodes(ctx.children);
    }

    /**
     * Value_list_clause
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitColumn_value_list(uniformSQLParser.Column_value_listContext ctx) {
        return visitChildrenNodes(ctx.children);
    }

    /**
     * Insert_subfix
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitInsert_subfix(uniformSQLParser.Insert_subfixContext ctx) {
        return visitChildrenNodes(ctx.children);
    }

    /**
     * Subquery
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitSubquery(uniformSQLParser.SubqueryContext ctx) {
        ASTNodeVisitResult whateverResult = visitChildrenNodes(ctx.children);
        String valueStr = "(" + whateverResult.getCommands().get(0).getCommandStr() + ")";
        return new ASTNodeVisitResult(valueStr, null, whateverResult.getDbIds());
    }

    /**
     * Join_condition
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitJoin_condition(uniformSQLParser.Join_conditionContext ctx) {
        return visitChildrenNodes(ctx.children);
    }
}
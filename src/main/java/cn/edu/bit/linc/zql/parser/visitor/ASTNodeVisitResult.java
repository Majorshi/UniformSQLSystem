package cn.edu.bit.linc.zql.parser.visitor;

import cn.edu.bit.linc.zql.command.*;

import java.util.ArrayList;

/**
 * 访问结果类
 */
public class ASTNodeVisitResult {
    private String value;
    private ArrayList<InnerSQLCommand> commands;
    private ArrayList<String> dbAliases;

    /**
     * 构造函数
     *
     * @param value    节点返回值，可为 null
     * @param commands 节点对应的 SQL 命令集合
     * @param dbAliases    命令对应的底层库的dbAlias
     */
    public ASTNodeVisitResult(String value, ArrayList<InnerSQLCommand> commands, ArrayList<String> dbAliases) {
        this.value = value;
        this.commands = commands;
        this.dbAliases = dbAliases;
    }

    /**
     * 获取命令对应的底层库 ID 列表
     *
     * @return 命令对应的底层库 ID 列表
     */
    public ArrayList<String> getDbAliases() {
        return dbAliases;
    }

    /**
     * 获取节点访问结果
     *
     * @return 访问节点值
     */
    public String getValue() {
        return value;
    }

    /**
     * 获取节点对应的 SQL 命令列表
     *
     * @return SQL 命令列表
     */
    public ArrayList<InnerSQLCommand> getCommands() {
        return commands;
    }
}

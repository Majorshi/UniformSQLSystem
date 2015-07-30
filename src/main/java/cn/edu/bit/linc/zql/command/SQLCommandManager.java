package cn.edu.bit.linc.zql.command;

import cn.edu.bit.linc.zql.connections.ZQLSession;
import cn.edu.bit.linc.zql.connections.connector.ConnectionPools;
import cn.edu.bit.linc.zql.exceptions.ZQLCommandExecutionError;
import cn.edu.bit.linc.zql.exceptions.ZQLConnectionException;
import cn.edu.bit.linc.zql.exceptions.ZQLSyntaxErrorException;
import cn.edu.bit.linc.zql.parser.uniformSQLLexer;
import cn.edu.bit.linc.zql.parser.uniformSQLParser;
import cn.edu.bit.linc.zql.parser.visitor.ASTNodeVisitResult;
import cn.edu.bit.linc.zql.parser.visitor.ZQLVisitor;
import cn.edu.bit.linc.zql.util.AsciiArtTable;
import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.ArrayList;

/**
 * SQL 命令类，用于执行 SQL 命令并保存执行结果
 */
public class SQLCommandManager {
    /**
     * 构造器
     *
     * @param sqlCommand 希望执行的 SQL 命令
     * @param session    用户会话
     */
    public SQLCommandManager(String sqlCommand, ZQLSession session) {
        this.sqlCommand = sqlCommand;
        this.session = session;
    }

    /**
     * 执行 SQL 命令
     */
    public boolean execute() {
        // TODO: 抛出异常给外部处理
        /* 记录时间 */
        java.util.Date startTime = new java.util.Date();

        /* 检测语法错误 */
        InputStream is = new ByteArrayInputStream(sqlCommand.getBytes(StandardCharsets.UTF_8));
        ANTLRInputStream ais;
        uniformSQLLexer lexer;
        CommonTokenStream tokens;
        uniformSQLParser parser;
        ParseTree tree;
        ASTNodeVisitResult visitResult;
        try {
            /* 词法解析器与语法解析器 */
            ais = new ANTLRInputStream(is);
            lexer = new uniformSQLLexer(ais);
            tokens = new CommonTokenStream(lexer);
            parser = new uniformSQLParser(tokens);

            /* 遍历语法树 */
            tree = parser.root_statement();
            ZQLVisitor visitor = new ZQLVisitor(session);
            visitResult = visitor.visit(tree);
        } catch (Exception e) {
            ZQLSyntaxErrorException zqlSyntaxErrorException = new ZQLSyntaxErrorException();
            zqlSyntaxErrorException.initCause(e);
            logger.e("发生语法错误：" + sqlCommand, zqlSyntaxErrorException);
            return false;
        }

        if (visitResult == null) {
            ZQLCommandExecutionError zqlCommandExecutionError = new ZQLCommandExecutionError();
            logger.e("反向生成 SQL 命令失败，错误原因：" + session.getErrorMessage(), zqlCommandExecutionError);
            return false;
        }

        ArrayList<InnerSQLCommand> commands = visitResult.getCommands();
        ArrayList<Integer> dbIds = visitResult.getDbIds();

        /* 通过连接池连接底层库 */
        // TODO: 事务处理
        for (int i = 0; i < commands.size(); ++i) {
            int dbId = dbIds.get(i);
            InnerSQLCommand innerSQLCommand = commands.get(i);
            ConnectionPools connectionPools = ConnectionPools.getInstance();
            Connection connection;
            Statement statement;
            try {
                connection = connectionPools.getConnection(dbId);
                statement = connection.createStatement();
            } catch (SQLException e) {
                ZQLConnectionException zqlConnectionException = new ZQLConnectionException();
                zqlConnectionException.initCause(e);
                logger.e("连接到底层库 " + dbId + " 失败", zqlConnectionException);
                return false;
            }

            /* 交付数据库（底层库 / 元数据库）执行 SQL 命令 */
            boolean isQuery;
            try {
                logger.d("在底层库 " + dbId + " 中执行指令 " + innerSQLCommand.getCommandStr());
                isQuery = statement.execute(innerSQLCommand.getCommandStr());
            } catch (SQLException e) {
                ZQLCommandExecutionError zqlCommandExecutionError = new ZQLCommandExecutionError(e.getMessage());
                logger.e("在底层库 " + dbId + " 执行 SQL 命令失败：" + innerSQLCommand.getCommandStr() + "，错误原因：", zqlCommandExecutionError);
                return false;
            }

            /* 获取结果 */
            if (isQuery) {
                try {
                    this.resultSet = statement.getResultSet();
                } catch (SQLException e) {
                    ZQLCommandExecutionError zqlCommandExecutionError = new ZQLCommandExecutionError();
                    zqlCommandExecutionError.initCause(e);
                    logger.e("从底层库 " + dbId + " 中获取 Result Set 失败：" + sqlCommand, zqlCommandExecutionError);
                    return false;
                }
            } else {
                try {
                    if (updateCount == -1) updateCount = 0;
                    this.updateCount += statement.getUpdateCount();
                } catch (SQLException e) {
                    ZQLCommandExecutionError zqlCommandExecutionError = new ZQLCommandExecutionError();
                    zqlCommandExecutionError.initCause(e);
                    logger.e("从底层库 " + dbId + " 中获取 Update Row 失败：" + sqlCommand, zqlCommandExecutionError);
                    return false;
                }
            }
        }

        /* 记录时间 */
        java.util.Date endTime = new java.util.Date();
        this.runningTime = endTime.getTime() - startTime.getTime();
        return true;
    }

    /**
     * 打印 SQL 命令输出结果
     */
    public String getOutput() throws SQLException {
        StringBuilder stringBuilder = new StringBuilder();
        if (resultSet != null) {
            AsciiArtTable asciiArtTable = new AsciiArtTable();
            stringBuilder.append("QUERY OK!\n");

            /* 获取表头 */
            ResultSetMetaData rsmd;
            rsmd = resultSet.getMetaData();
            ArrayList<String> headerList = new ArrayList<String>();
            if (rsmd != null) {
                for (int i = 1; i <= rsmd.getColumnCount(); ++i) {
                    headerList.add(rsmd.getColumnName(i));
                }
            }
            String[] header = new String[headerList.size()];
            header = headerList.toArray(header);
            asciiArtTable.addHeaderCols(header);

            /* 获取表中数据并存放在二维数据中 */
            int i = 0;
            int numberOfRows = 0;
            String[][] data;
            if (resultSet != null) {
                resultSet.last();
                numberOfRows = resultSet.getRow();
                data = new String[numberOfRows][headerList.size()];
                resultSet.beforeFirst();

                while (resultSet.next()) {
                    assert rsmd != null;
                    for (int j = 1; j <= rsmd.getColumnCount(); ++j) {
                        String result = resultSet.getString(j);
                        data[i][j - 1] = result;
                    }
                    asciiArtTable.add(data[i]);
                    i++;
                }
            }
            stringBuilder.append(asciiArtTable.getOutput());
            stringBuilder.append("" + numberOfRows + " rows in set (" + runningTime + " ms)\n");
        } else {
            stringBuilder.append("Updated ").append(updateCount).append(" rows (").append(runningTime).append(" ms)\n");
        }
        return stringBuilder.toString();
    }

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final String sqlCommand;    // SQL 指令
    private final ZQLSession session;   // 用户会话
    private ResultSet resultSet = null; // 执行结果，仅在执行结果返回 ResultSet 时候该值不为 null
    private int updateCount = -1;       // 更新行数，仅在执行结果返回数值时候该值不为 - 1
    private long runningTime;
}

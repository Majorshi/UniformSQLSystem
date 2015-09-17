package cn.edu.bit.linc.zql.command;

import cn.edu.bit.linc.zql.connections.ZQLSession;
import cn.edu.bit.linc.zql.connections.connector.ConnectionPools;
import cn.edu.bit.linc.zql.exceptions.ZQLCommandExecutionError;
import cn.edu.bit.linc.zql.exceptions.ZQLConnectionException;
import cn.edu.bit.linc.zql.exceptions.ZQLSyntaxErrorException;
import cn.edu.bit.linc.zql.network.packets.*;
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
import java.util.List;
import cn.edu.bit.linc.zql.network.packets.*;
import javax.xml.transform.Result;

/**
 * SQL 命令类，用于执行 SQL 命令并保存执行结果
 */
public class SQLCommandManager {
    private static final Logger logger = LoggerFactory.getLogger(SQLCommandManager.class);
    private final String sqlCommand;    // SQL 指令
    private final ZQLSession session;   // 用户会话
    private ResultSet resultSet = null; // 执行结果，仅在执行结果返回 ResultSet 时候该值不为 null
    private int updateCount = 0;        // 更新行数，仅在执行结果返回数值时候该值不为 - 1
    private long runningTime;           // SQL 命令运行时间
    private ResultSetPacket resultSetPacket; //结果集报文
    private ResultSetMetaData rsmd;     // ResultSetMetaData
    private ArrayList<Connection> connections = null;      // 到数据库的连接

    /**
     * 构造器
     *
     * @param sqlCommand 希望执行的 SQL 命令
     * @param session    用户会话
     */
    public SQLCommandManager(String sqlCommand, ZQLSession session) {
        this.sqlCommand = sqlCommand;
        this.session = session;
        connections = session.getConnections();
    }

    public ResultSet getResultSet () {
        return this.resultSet;
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
        for (int i = 0; i < commands.size(); ++i) {
            int dbId = dbIds.get(i);
            InnerSQLCommand innerSQLCommand = commands.get(i);
            Connection connection = connections.get(dbId);
            Statement statement;
            try {
                statement = connection.createStatement();
            } catch (SQLException e) {
                ZQLConnectionException zqlConnectionException = new ZQLConnectionException("创建数据库 " + dbId + " 的 Statement 对象失败，失败原因：");
                zqlConnectionException.initCause(e);
                logger.e("创建数据库 " + dbId + " 的 Statement 对象失败，失败原因：", zqlConnectionException);
                return false;
            }

            /* 交付数据库（底层库 / 元数据库）执行 SQL 命令 */
            boolean isQuery;
            try {
                logger.d("在数据库 " + dbId + " 中执行指令 " + innerSQLCommand.getCommandStr());
                String a = innerSQLCommand.getCommandStr();
                isQuery = statement.execute(innerSQLCommand.getCommandStr());
            } catch (SQLException e) {
                ZQLCommandExecutionError zqlCommandExecutionError = new ZQLCommandExecutionError(e.getMessage());
                logger.e("在数据库 " + dbId + " 执行 SQL 命令失败：" + innerSQLCommand.getCommandStr() + "，错误原因：", zqlCommandExecutionError);
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
     * 获取SQL命令返回结果的类型
     *
     * @return true为字符串结果 false为结果集
     */
    public boolean getReturnType() {
        return resultSet == null;
    }

    public String getReturnString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Updated ").append(updateCount).append(" rows (").append(runningTime).append(" ms)\n");
        return stringBuilder.toString();
    }

    public ResultSetPacket getReturnPacket() throws SQLException {

        return resultSetPacket;
    }

    /**
     * 打印 SQL 命令输出结果
     */
    public String getOutput() throws SQLException {
        StringBuilder stringBuilder = new StringBuilder();
        if (resultSet != null) {

            /* 结果集包 */
            ResultHeadPacket resultHeadPacket = ResultHeadPacket.getResultHeadPacket(new byte[]{1, 3, 4}, new byte[]{3, 2, 1});

            AsciiArtTable asciiArtTable = new AsciiArtTable();
            stringBuilder.append("QUERY OK!\n");

            /* 获取表头 */
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

            /* 域报文 */
            FieldPacket[] fieldPacketArray = new FieldPacket[header.length];
            for (int i = 0; i < header.length; ++i)
                fieldPacketArray[i] = FieldPacket.getFieldPacket("def", "DATABASE", "TABLE ALIAS NAME", "TABLE NAME", "FIELD ALIAS NAME", header[i], 0xC0, 0, 10000, 3, 0x0002, 1, 0, "DEFAULT");
            EOFPacket eofPacket1 = EOFPacket.getEOFPacket(2, 0xFFFF);

            /* 获取表中数据并存放在二维数据中 */
            int i = 0;
            int numberOfRows = 0;
            List<String[]> rowDataList = new ArrayList<String[]>();
            while (resultSet.next()) {
                assert rsmd != null;
                String[] rowData = new String[rsmd.getColumnCount()];
                for (int j = 1; j <= rsmd.getColumnCount(); ++j) {
                    String result = resultSet.getString(j);
                    if (result == null) result = "";
                    rowData[j - 1] = result;
                }
                rowDataList.add(rowData);
                asciiArtTable.add(rowData);
                i++;
            }

            RowDataPacket[] rowDataPacketArray = new RowDataPacket[rowDataList.size()];
            for (int j = 0; j < rowDataList.size(); ++j) {
                rowDataPacketArray[j] = RowDataPacket.getRowDataPacket(rowDataList.get(j));
            }
            EOFPacket eofPacket2 = EOFPacket.getEOFPacket(1, 0xFFFF);

            resultSetPacket = ResultSetPacket.getResultSetPacket(resultHeadPacket, fieldPacketArray, eofPacket1, rowDataPacketArray, eofPacket2);
            stringBuilder.append(asciiArtTable.getOutput());
            stringBuilder.append("").append(numberOfRows).append(" rows in set (").append(runningTime).append(" ms)\n");
        } else {
            stringBuilder.append("Updated ").append(updateCount).append(" rows (").append(runningTime).append(" ms)\n");
        }
        return stringBuilder.toString();
    }
}

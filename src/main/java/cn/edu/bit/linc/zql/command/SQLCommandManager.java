package cn.edu.bit.linc.zql.command;

import cn.edu.bit.linc.zql.connections.ZQLSession;
import cn.edu.bit.linc.zql.databases.MetaDatabase;
import cn.edu.bit.linc.zql.exceptions.*;
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
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * SQL 命令类，用于执行 SQL 命令并保存执行结果
 */
public class SQLCommandManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(SQLCommandManager.class);
    private final String sqlCommand;    // SQL 指令
    private final ZQLSession session;   // 用户会话
    private ResultSet resultSet = null; // 执行结果，仅在执行结果返回 ResultSet 时候该值不为 null
    private int updateCount = 0;        // 更新行数，仅在执行结果返回数值时候该值不为 - 1
    private long runningTime;           // SQL 命令运行时间
    private ResultSetPacket resultSetPacket; //结果集报文
    private ResultSetMetaData rsmd;     // ResultSetMetaData
    private ArrayList<Connection> connections = null;      // 到数据库的连接
    private HashMap<String, Connection> connectionsMap = null;      // 到数据库的连接
    private final static MetaDatabase metaDatabase = MetaDatabase.getInstance();
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
        connectionsMap = session.getconnectionsMap();
    }

    public ResultSet getResultSet() {
        return this.resultSet;
    }

    public boolean excuteSQLWithoutParser(ArrayList<InnerSQLCommand> commands, ArrayList<Integer> dbIds) {
        /* 记录时间 */
        java.util.Date startTime = new java.util.Date();

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
                LOGGER.e("创建数据库 " + dbId + " 的 Statement 对象失败，失败原因：", zqlConnectionException);
                return false;
            }

            /* 交付数据库（底层库 / 元数据库）执行 SQL 命令 */
            boolean isQuery;
            try {
                LOGGER.d("在数据库 " + dbId + " 中执行指令 " + innerSQLCommand.getCommandStr());
                isQuery = statement.execute(innerSQLCommand.getCommandStr());
            } catch (SQLException e) {
                ZQLInnerDatabaseExecutionException zqlInnerDatabaseExecutionException = new ZQLInnerDatabaseExecutionException(e.getMessage());
                LOGGER.e("在数据库 " + dbId + " 执行 SQL 命令失败：" + innerSQLCommand.getCommandStr() + "，错误原因：", zqlInnerDatabaseExecutionException);
                return false;
            }

            /* 获取结果 */
            if (isQuery) {
                try {
                    this.resultSet = statement.getResultSet();
                } catch (SQLException e) {
                    ZQLInnerDatabaseExecutionException zqlInnerDatabaseExecutionException = new ZQLInnerDatabaseExecutionException();
                    zqlInnerDatabaseExecutionException.initCause(e);
                    LOGGER.e("从底层库 " + dbId + " 中获取 Result Set 失败：" + sqlCommand, zqlInnerDatabaseExecutionException);
                    return false;
                }
            } else {
                try {
                    this.updateCount += statement.getUpdateCount();
                } catch (SQLException e) {
                    ZQLInnerDatabaseExecutionException zqlInnerDatabaseExecutionException = new ZQLInnerDatabaseExecutionException();
                    zqlInnerDatabaseExecutionException.initCause(e);
                    LOGGER.e("从底层库 " + dbId + " 中获取 Update Row 失败：" + sqlCommand, zqlInnerDatabaseExecutionException);
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
     * 执行 ZQL 命令
     *
     * @return 执行成功返回 <code>true</code>，否则抛出异常
     * @throws ZQLSyntaxErrorException            解析 ZQL 命令 / 反向生成 SQL 命令失败，具体由 Exception 中的 ErrorCode 决定
     * @throws ZQLInnerDatabaseExecutionException 底层库执行反向生成的 SQL 命令失败
     * @throws ZQLConnectionException             创建 Connection / Statement 或者从 Statement 中获取结果失败，具体由 Exception 中的 ErrorCode 决定
     */
    public boolean execute() throws ZQLSyntaxErrorException, ZQLInnerDatabaseExecutionException, ZQLConnectionException {
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

        /* 词法解析与语法解析 */
        try {
            ais = new ANTLRInputStream(is);
        } catch (IOException e) {
            int vendorCode = ZQLErrorNumbers.ERR_SYNTAX_READ;
            String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{});
            ZQLSyntaxErrorException zqlSyntaxErrorException = new ZQLSyntaxErrorException(reason, "42000", vendorCode);
            throw zqlSyntaxErrorException;
        }

        lexer = new uniformSQLLexer(ais);
        tokens = new CommonTokenStream(lexer);
        parser = new uniformSQLParser(tokens);
        parser.setErrorHandler(new ExceptionErrorStrategy());
        try {
            tree = parser.root_statement();
        } catch (Exception e) {
            int vendorCode = ZQLErrorNumbers.ERR_SYNTAX_PARSE;
            String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{sqlCommand});
            ZQLSyntaxErrorException zqlSyntaxErrorException = new ZQLSyntaxErrorException(reason, "42000", vendorCode);
            zqlSyntaxErrorException.initCause(e);
            throw zqlSyntaxErrorException;
        }

        /* 遍历语法树 */
        ZQLVisitor visitor = new ZQLVisitor(session);
        visitor.visit(tree);
        visitResult = visitor.checkIfStrideDb();
        session.setException(null);

        if (visitResult == null) {
            if (session.getException() != null) {
                int vendorCode = ZQLErrorNumbers.ERR_SYNTAX_GENE;
                String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{});
                ZQLSyntaxErrorException zqlSyntaxErrorException = new ZQLSyntaxErrorException(reason, "HY000", vendorCode);
                zqlSyntaxErrorException.initCause(session.getException());
                throw zqlSyntaxErrorException;
            }
        }

        ArrayList<InnerSQLCommand> commands = visitResult.getCommands();
        ArrayList<String> dbAliases = visitResult.getDbAliases();

        /* 通过连接池连接底层库 */
        for (int i = 0; i < commands.size(); ++i) {
            String dbAlias = dbAliases.get(i);
            InnerSQLCommand innerSQLCommand = commands.get(i);
            if (dbAlias.equals(metaDatabase.getMetaDbName())) {
                dbAlias = MetaDatabase.META_DB_ALIAS;
            }
            Connection connection = connectionsMap.get(dbAlias);
            Statement statement;
            try {
                statement = connection.createStatement();
            } catch (SQLException e) {
                int vendorCode = ZQLErrorNumbers.ERR_CP_CREATE_STATEMENT;
                String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{});
                ZQLConnectionException zqlConnectionException = new ZQLConnectionException(reason, e.getSQLState(), vendorCode);
                zqlConnectionException.initCause(e);
                throw zqlConnectionException;
            }

            /* 交付数据库（底层库 / 元数据库）执行 SQL 命令 */
            boolean isQuery;
            try {
                LOGGER.d("在数据库 " + dbAlias + " 中执行指令 " + innerSQLCommand.getCommandStr());
                isQuery = statement.execute(innerSQLCommand.getCommandStr());
            } catch (SQLException e) {
                int vendorCode = ZQLErrorNumbers.ERR_INNER_EXEC;
                String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{dbAlias, innerSQLCommand.getCommandStr()});
                ZQLInnerDatabaseExecutionException zqlInnerDatabaseExecutionException = new ZQLInnerDatabaseExecutionException(reason, e.getSQLState(), vendorCode);
                zqlInnerDatabaseExecutionException.initCause(e);
                throw zqlInnerDatabaseExecutionException;
            }

            /* 获取结果 */
            if (isQuery) {
                try {
                    this.resultSet = statement.getResultSet();
                } catch (SQLException e) {
                    int vendorCode = ZQLErrorNumbers.ERR_CP_GET_RS;
                    String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{});
                    ZQLConnectionException zqlConnectionException = new ZQLConnectionException(reason, e.getSQLState(), vendorCode);
                    zqlConnectionException.initCause(e);
                    throw zqlConnectionException;
                }
            } else {
                try {
                    this.updateCount += statement.getUpdateCount();
                } catch (SQLException e) {
                    int vendorCode = ZQLErrorNumbers.ERR_CP_GET_UR;
                    String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{});
                    ZQLConnectionException zqlConnectionException = new ZQLConnectionException(reason, e.getSQLState(), vendorCode);
                    zqlConnectionException.initCause(e);
                    throw zqlConnectionException;
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
        getOutput();
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
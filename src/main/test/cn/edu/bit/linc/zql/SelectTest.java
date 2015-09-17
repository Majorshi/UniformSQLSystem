package cn.edu.bit.linc.zql;

import cn.edu.bit.linc.zql.command.SQLCommandManager;
import cn.edu.bit.linc.zql.connections.ZQLSession;
import cn.edu.bit.linc.zql.util.StringUtil;
import cn.edu.bit.linc.zql.util.UnitTestUtils;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import junit.framework.TestCase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.sql.ResultSet;

/**
 * SELECT 单元测试
 */
public class SelectTest {

    private String user, password, inputQuery, fileName, database;

    private final static String testFileUrl = "test.json";
    private final static String dataDirectory = "./UnitTestData/";
    private final static String testDBName = "SQLTest";
    private final String commandTerminator = ";";
    private void parseArgs(String[] args) {
        /* 构建解析器 */
        OptionParser parser = new OptionParser();
        parser.posixlyCorrect(false);

        parser.accepts("u").withRequiredArg().ofType(String.class);
        parser.accepts("p").withRequiredArg().ofType(String.class);
        parser.accepts("f").withRequiredArg().ofType(String.class);
        parser.accepts("q").withRequiredArg().ofType(String.class);
        parser.accepts("d").withRequiredArg().ofType(String.class);
        parser.accepts("help");

        /* 解析与提取参数 */
        OptionSet options = parser.parse(args);
        if (options.has("help")) {
            printUsage();
            System.exit(0);
        }

        if (options.has("u")) {
            user = (String) options.valueOf("u");
        }
        else{
            user = "root";
        }

        if (options.has("p")) {
            password = (String) options.valueOf("p");
        }

        if (options.has("f")) {
            fileName = (String) options.valueOf("f");
            fileName = (String) options.valueOf("f");
        }

        if (options.has("q")) {
            inputQuery = (String) options.valueOf("q");
            fileName = null;
        }

        if (options.has("d")) {
            database = (String) options.valueOf("d");
        }

        System.out.println("User = " + user);
        System.out.println("Password = " + password);
        System.out.println("DatabaseName = " + database);
        System.out.println("File Name = " + fileName);
        System.out.println("Query = " + inputQuery);

    }

    public void doInputSQLCommand(String fileUrl) {
        ZQLSession session = new ZQLSession(user, database, password);

        /* 确定输入源 */
        BufferedReader reader = null;
        StringBuffer query;
        if (fileUrl != null) {
            try {
                reader = new BufferedReader(new FileReader(fileUrl));
            } catch (FileNotFoundException e) {
//                logger.f("找不到指定 SQL 文件 " + fileName, e);
                System.exit(-1);
            }
        } else {
            reader = new BufferedReader(new InputStreamReader(System.in));
        }

        try {
            while (true) {
                int lineCount = 1;
                // 从 System.in 输入
                if (fileUrl == null && inputQuery == null) {
                    System.out.print("\nEnter a query:\n");
                }

                query = new StringBuffer();
                while (true) {
                    // 从 System.in 输入
                    if (fileUrl == null && inputQuery == null) {
                        System.out.print(lineCount++ + " > ");
                        System.out.flush();
                    }

                    String line;
                    if (inputQuery == null) {
                        line = reader.readLine();
                    } else {
                        line = inputQuery.toString();
                        if (!line.trim().endsWith(commandTerminator)) {
                            line = line.trim().concat(commandTerminator);
                        }
                    }

                    // 退出系统
                    if (line == null || line.equalsIgnoreCase("quit") || line.equalsIgnoreCase("exit"))
                        return;

                    // 重置
                    if (line.equals("reset")) {
                        query = new StringBuffer();
                        break;
                    }

                    // 结束
                    if (line.trim().equalsIgnoreCase(commandTerminator) || line.trim().endsWith(commandTerminator)) {
                        if (line.trim().endsWith(commandTerminator)) {
                            line = line.substring(0, line.length() - commandTerminator.length());
                            line = StringUtil.RegexStringTool.removeNumberSignAndDoubleDashComment(line);
                            query.append("\n");
                            query.append(line);
                        }
                        break;
                    }
                    line = StringUtil.RegexStringTool.removeNumberSignAndDoubleDashComment(line);
                    query.append("\n");
                    query.append(line);
                }

                // 删除注释
                String queryStr = StringUtil.RegexStringTool.removeComments(query.toString().replaceAll("\n", " ")).trim();
                if (queryStr.length() == 0) continue;
                System.out.println("Query Command: " + queryStr);

                /* 执行 SQL 语句 */
                SQLCommandManager sqlCommandManager = new SQLCommandManager(queryStr, session);
                sqlCommandManager.execute();
                System.out.println(sqlCommandManager.getOutput());

                if (inputQuery != null)
                    return;
            }
        } catch (Exception e) {
//            logger.f("读取 SQL 命令失败", e);
            System.exit(0);
        }
    }

    /**
     * 输出程序用法
     */
    private static void printUsage() {
        System.err.println();
        System.err.println("Usage: java " + SelectTest.class.getName() + " -u username -p password  [-d database_name] [-f file_name] " +
                " [-q query_command]");
        System.err.println("Where:");
        System.err.println("\t-u Specifies a user name to log into a database server with.");
        System.err.println("\t-p Password specifies the user name to log into a database server with.");
        System.err.println("\t-f Specifies a file name to read commands from.");
        System.err.println("\t-q specifies an optional signal query to run instead of interacting with the command line or a file.");
    }

    // 读入测试流程JSON
    public void startTest () throws JSONException {
        ZQLSession session = new ZQLSession(user, database, password);
        UnitTestUtils test = new UnitTestUtils();
        String json = test.ReadFile(testFileUrl);
        org.json.JSONArray arr = new JSONArray(json);
        for (int i = 0; i < arr.length(); i++) {
            JSONObject obj = arr.getJSONObject(i);
            //测试用例标题
            String title = obj.getString("title") != null ? obj.getString("title"):"";
            //初始化用sql文件名称
            String initFile = obj.getString("initFile") != null ? obj.getString("initFile"):"";
            //测试用SQL语句所指定的数据库
            String useDatabase = obj.getString("useDatabase") != null ? obj.getString("useDatabase"):"";
            //测试用SQL语句（非文件）
            String executeSQL = obj.getString("executeSQL") != null ? obj.getString("executeSQL"):"";
            //需要使用showSQL来得到对比用的结果集（针对insert、delete等没有结果集的语句使用）
            int useShowSQL = obj.getInt("useShowSQL");
            //showSQL
            String showSQL = obj.getString("showSQL") != null ? obj.getString("showSQL"):"";
            //结果集输出的文件名
            String exportFile = obj.getString("exportFile") != null ? obj.getString("exportFile"):"";
            //期望结果集文件名
            String expectFile = obj.getString("expectFile") != null ? obj.getString("expectFile"):"";
            //根据initFile初始化数据库
            doInputSQLCommand(dataDirectory + initFile);
            //执行excuteSQL
            ResultSet rs;

            SQLCommandManager sqlCommandManager = new SQLCommandManager("USE " + useDatabase, session);
            sqlCommandManager.execute();
            sqlCommandManager = new SQLCommandManager(executeSQL, session);
            if (!sqlCommandManager.execute()) {
                rs = null;
            } else {
                rs = sqlCommandManager.getResultSet();
            }
            if (useShowSQL != 0) {
                //执行showSQL
                sqlCommandManager = new SQLCommandManager(showSQL, session);
                if (!sqlCommandManager.execute()) {
                    rs = null;
                } else {
                    rs = sqlCommandManager.getResultSet();
                }
            }
            test.exportResultToXML(rs, dataDirectory + exportFile);
            //对比expectFile和exportFile
//            test.compare(dataDirectory + expectFile, dataDirectory + expectFile);
        }
    }

    public boolean initDatabase (ZQLSession session, String initFile) {

        String dropSQL = "DROP DATABASE " + testDBName;
        SQLCommandManager sqlCommandManager = new SQLCommandManager(dropSQL, session);
        if (!sqlCommandManager.execute()) return false;

        String createSQL = "CREATE DATABASE " + testDBName;
        sqlCommandManager = new SQLCommandManager(createSQL, session);
        if (!sqlCommandManager.execute()) return false;

        String useSQL = "USE " + testDBName;
        sqlCommandManager = new SQLCommandManager(useSQL, session);
        if (!sqlCommandManager.execute()) return false;

        UnitTestUtils unit = new UnitTestUtils();
        String initSQL = unit.ReadFile(dataDirectory + initFile);
        sqlCommandManager = new SQLCommandManager(initSQL, session);
        if (!sqlCommandManager.execute()) return false;
        return true;
    }

    public static void main (String[] args) throws IOException, JSONException {
        ZQLContext zqlContext = new ZQLContext();
        zqlContext.initializeSystem();
        SelectTest test = new SelectTest();
        test.parseArgs(args);
        test.startTest();
    }
}

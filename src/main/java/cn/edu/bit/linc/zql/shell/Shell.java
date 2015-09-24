package cn.edu.bit.linc.zql.shell;

import cn.edu.bit.linc.zql.ZQLContext;
import cn.edu.bit.linc.zql.command.SQLCommandManager;
import cn.edu.bit.linc.zql.connections.ZQLSession;
import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;
import cn.edu.bit.linc.zql.util.StringUtil;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.io.*;

/**
 * 用户与系统连接和交互用的 Shell，可以读取外部文件，或者直接用户直接输入命令 <br>
 * Reference: https://github.com/stdunbar/jisql
 */
public class Shell {
    public String user, password, inputQuery, fileName, database;
    private final String commandTerminator = ";";
    private final static Logger LOGGER = LoggerFactory.getLogger(Shell.class);

    public void doInputSQLCommand() {
        ZQLSession session = new ZQLSession(user, database, password);

        /* 确定输入源 */
        BufferedReader reader = null;
        StringBuffer query;
        if (fileName != null) {
            try {
                reader = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                LOGGER.f("找不到指定 SQL 文件 " + fileName, e);
                System.exit(-1);
            }
        } else {
            reader = new BufferedReader(new InputStreamReader(System.in));
        }

        try {
            while (true) {
                int lineCount = 1;
                // 从 System.in 输入
                if (fileName == null && inputQuery == null) {
                    System.out.print("\nEnter a query:\n");
                }

                query = new StringBuffer();
                while (true) {
                    // 从 System.in 输入
                    if (fileName == null && inputQuery == null) {
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
            LOGGER.f("读取 SQL 命令失败", e);
            System.exit(0);
        }
    }

    /**
     * 解析程序参数
     *
     * @param args 程序参数
     */
    public void parseArgs(String[] args) {
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

    /**
     * 输出程序用法
     */
    private static void printUsage() {
        System.err.println();
        System.err.println("Usage: java " + Shell.class.getName() + " -u username -p password  [-d database_name] [-f file_name] " +
                " [-q query_command]");
        System.err.println("Where:");
        System.err.println("\t-u Specifies a user name to log into a database server with.");
        System.err.println("\t-p Password specifies the user name to log into a database server with.");
        System.err.println("\t-f Specifies a file name to read commands from.");
        System.err.println("\t-q specifies an optional signal query to run instead of interacting with the command line or a file.");
    }

    public static void main(String[] args) throws IOException {
        ZQLContext zqlContext = new ZQLContext();
        zqlContext.initializeSystem();
        Shell shell = new Shell();
        shell.parseArgs(args);
        shell.doInputSQLCommand();
    }
}

package cn.edu.bit.linc.zql.util;

/**
 * 自动生成 XML 文件
 */
public class GenerateXMLFile {
    private static Logger logger = LoggerFactory.getLogger(GenerateXMLFile.class);

    public final static String SUBQUERY_COMMAND_ONE = "SELECT b.id, b.age, b.num FROM (select * FROM student) b";
    public final static String SUBQUERY_COMMAND_TWO = "SELECT d.id,max(score),sex FROM (SELECT * FROM (SELECT id,score FROM stu_course) m WHERE m.score > 80) c INNER JOIN student d on c.id=d.id  GROUP BY sex";

    /**
     * 创建子查询测试 XML 数据文件
     */
    public static void generateSubqueryXMLFile() {
        /* 测试一 */
        String dbName = "db_test";  // 设置测试用途数据库名
        String fileName = "subquery_1"; // 需要保存原始数据（subquery_1_db.xml） / 结果数据的文件名 (subquery_1.xml)
        try {
            DataExporter.partialExport(dbName, new String[]{SUBQUERY_COMMAND_ONE}, new String[]{"result"}, fileName);
        } catch (Exception e) {
            logger.e("创建 XML 文件失败", e);
        }

        /* 测试二 */
        dbName = "db_test";  // 设置测试用途数据库名
        fileName = "subquery_2"; // 需要保存原始数据（subquery_1_db.xml） / 结果数据的文件名 (subquery_1.xml)
        try {
            DataExporter.partialExport(dbName, new String[]{SUBQUERY_COMMAND_TWO}, new String[]{"result"}, fileName);
        } catch (Exception e) {
            logger.e("创建 XML 文件失败", e);
        }
    }

    public final static String JOIN_COMMAND_ONE = "SELECT id, age FROM IF EXISTS student INNER JOIN stu_course on (student.id = stu_course.id)";

    /**
     * 创建子查询测试 XML 数据文件
     */
    public static void generateJoinXMLFile() {
        String dbName = "db_test";  // 设置测试用途数据库名
        String fileName = "join_1"; // 需要保存原始数据 / 结果数据的文件名
        try {
            DataExporter.partialExport(dbName, new String[]{JOIN_COMMAND_ONE}, new String[]{"result"}, fileName);
        } catch (Exception e) {
            logger.e("创建 XML 文件失败", e);
        }
    }

    public final static String IN_COMMAND_ONE = "SELECT id,age,num FROM student WHERE age in (20,21);";

    /**
     * 创建子查询测试 XML 数据文件
     */
    public static void generateINXMLFile() {
        String dbName = "db_test";  // 设置测试用途数据库名
        String fileName = "in_1"; // 需要保存原始数据 / 结果数据的文件名
        try {
            DataExporter.partialExport(dbName, new String[]{IN_COMMAND_ONE}, new String[]{"result"}, fileName);
        } catch (Exception e) {
            logger.e("创建 XML 文件失败", e);
        }
    }

    public final static String CREATE_TABLE_COMMAND_ONE = "CREATE TABLE student(id int primary key not NULL, name varchar(30), age int, sex boolean, num varchar(15))";

    /**
     * 生成创建数据表测试 XML 数据文件
     */
    public static void generateCreateTableXMLFile() {
        String dbName = "db_table_test";  // 设置测试用途数据库名
        String fileName = "createTable_1"; // 需要保存原始数据 / 结果数据的文件名
        try {
            DataExporter.databaseExport(dbName, fileName, new String[]{CREATE_TABLE_COMMAND_ONE});
        } catch (Exception e) {
            logger.e("创建 XML 文件失败", e);
        }
    }

    public static void main(String[] args) {
        /* 数据表操作相关 */
        // generateCreateTableXMLFile();

        /* 查询相关 */
        generateSubqueryXMLFile();
//        generateJoinXMLFile();
//        generateINXMLFile();
    }
}

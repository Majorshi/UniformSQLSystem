package cn.edu.bit.linc.zql.util;
//import org.codehaus.jettison.json.JSONArray;
import org.json.*;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 单元测试工具
 */
public class UnitTestUtils {

    private final static String testFileUrl = "test.json";
    private final static String dataDirectory = "./UnitTestData/";

    public static void main (String[] argv) throws JSONException {
        UnitTestUtils test = new UnitTestUtils();
        test.startTest();
    }

    // 读入测试流程JSON
    public void startTest () throws JSONException {
        String json = ReadFile(testFileUrl);
        org.json.JSONArray arr = new JSONArray(json);
        for (int i = 0; i < arr.length(); i++) {
            JSONObject obj = arr.getJSONObject(i);
            //测试用例标题
            String title = obj.getString("title") != null ? obj.getString("title"):"";
            //初始化用sql文件名称
            String initFile = obj.getString("initFile") != null ? obj.getString("initFile"):"";
            //测试用SQL语句（非文件）
            String excuteSQL = obj.getString("excuteSQL") != null ? obj.getString("excuteSQL"):"";
            //需要使用showSQL来得到对比用的结果集（针对insert、delete等没有结果集的语句使用）
            int useShowSQL = obj.getInt("useShowSQL");
            //showSQL
            String showSQL = obj.getString("showSQL") != null ? obj.getString("showSQL"):"";
            //结果集输出的文件名
            String exportFile = obj.getString("exportFile") != null ? obj.getString("exportFile"):"";
            //期望结果集文件名
            String expectFile = obj.getString("expectFile") != null ? obj.getString("expectFile"):"";

            //TODO: 根据initFile初始化数据库

            //TODO: 执行excuteSQL
            ResultSet rs = null;
            if (useShowSQL != 0) {
                //TODO: 执行showSQL
//                rs = ...;
            }
//            exportResultToXML(rs,expectFile);

            //TODO: 对比expectFile和exportFile
        }
    }
    public String ReadFile(String path){
        File file = new File(path);
        BufferedReader reader = null;
        String laststr = "";
        try {
            //System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            //一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                //显示行号
                System.out.println("line " + line + ": " + tempString);
                laststr = laststr + tempString;
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return laststr;
    }

    // ResultSet 导出成 XML 文件
    public String generateXML(final ResultSet rs) throws SQLException {
        final StringBuffer buffer = new StringBuffer(1024 * 4);
        if (rs == null)
            return "";

        buffer.append("<?xml version=\"1.0\" encoding=\"GB2312\"?>\n"); // XML的头部信息
        buffer.append("<ResultSet>\n");

        ResultSetMetaData rsmd = rs.getMetaData(); // 得到结果集的定义结构
        int colCount = rsmd.getColumnCount(); // 得到列的总数
        // 对放回的全部数据逐一处理
        for (int id = 1; rs.next(); id++) {
            // 格式为row id , col name, col context
            buffer.append("\t<row id=\"").append(id).append("\">\n");
            for (int i = 1; i <= colCount; i++) {
                String type = rsmd.getColumnTypeName(i); // 获取字段类型
                buffer.append("\t\t<col name=\"" + rsmd.getColumnName(i)
                        + "\">");
                buffer.append(getValue(rs, i, type));
                buffer.append("</col>\n");
            }
            buffer.append("\t</row>\n");
        }
        buffer.append("</ResultSet>");
        //关闭
        rs.close();
        return buffer.toString();
    }

    /**
     * This method gets the value of the specified column
     * 通用的读取结果集某一列的值并转化为String表达
     *
     * @param ResultSet
     *            rs 输入的纪录集
     * @param int
     *            colNum 第几列
     * @param int
     *            type 数据类型
     */
    private String getValue(final ResultSet rs, int colNum, String type)
            throws SQLException {
        Object value = null;

        if (type.equals("nchar") || type.equals("nvarchar"))
            value = rs.getString(colNum);
        else
            value = rs.getObject(colNum);

        if (value != null)
            return value.toString().trim();
        return "null";
    }

    public boolean exportResultToXML(final ResultSet rs, String fileName) {
        try {
            UnitTestUtils obj = new UnitTestUtils();
            String res = obj.generateXML(rs);

            FileOutputStream fswriter = new FileOutputStream(dataDirectory + fileName, true);
            fswriter.write(res.getBytes());

            fswriter.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
            return false;
        }
        return true;
    }

    // 比较两个 XML 文件是否一致

    // 导入 SQL 脚本

}
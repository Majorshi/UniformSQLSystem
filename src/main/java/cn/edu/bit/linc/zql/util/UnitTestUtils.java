package cn.edu.bit.linc.zql.util;
//import org.codehaus.jettison.json.JSONArray;
import org.custommonkey.xmlunit.Diff;
import org.json.*;
import org.xml.sax.SAXException;

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

//
//    public static void main (String[] argv) throws JSONException {
//        UnitTestUtils test = new UnitTestUtils();
//        test.startTest();
//    }

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
     * @param rs rs 输入的纪录集
     * @param colNum colNum 第几列
     * @param type type 数据类型
     * @return
     * @throws SQLException
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

            FileOutputStream fswriter = new FileOutputStream(fileName, true);
            fswriter.write(res.getBytes());

            fswriter.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
            return false;
        }
        return true;
    }


    /**
     * 比较两个路径下的 XML 文件是否一致
     * @param path 需要比较的XML文件的路径
     * @param expectedPath 期待的结果路径
     * @return
     */
    public boolean compare(String path,String expectedPath){
        Reader oldXML=null,newXML=null;
        try {
            oldXML = new FileReader(new File(path));
            newXML = new FileReader(new File(expectedPath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Diff diff = null;
        try {
            diff = new Diff(oldXML, newXML);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return diff.identical();
    }

    // 导入 SQL 脚本

}
package cn.edu.bit.linc.zql.exceptions;

import java.util.Map;
import java.util.HashMap;

/**
 * 统一 SQL 系统相关工具
 */
public class ZQLExceptionUtils {
    private final static Map<Integer, String> MESSAGES_TEMPLATE = new HashMap<Integer, String>();

    static {
        /* 底层库相关 */
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_NOT_SUPPORTED_DB, "系统暂未支持相应的底层库类型 %s");
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_INNER_CON_OPEN, "连接到底层库 %s 失败");
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_INNER_EXEC, "底层库 %s 执行命令 %s 失败");
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_INNER_CON_CLOSE, "关闭到底层库 %s 的连接失败");
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_INNER_NO_USE, "未指定数据库，请使用 `USE db_name` 指定数据库");
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_INNER_USE_DB, "USE 命令指定的数据库不存在");
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_INNER_INNER_DB_NOT_FOUND, "底层库 %s 不存在");
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_INNER_COLUMN_TYPE_NOT_FOUND, "列类型 %s 不存在");
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_INNER_DB_NOT_FOUND, "数据库 %s 未被登记在元数据库中");


        /* 元数据库相关 */
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_META_CON_OPEN, "连接到元数据库 %s 失败");
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_META_EXEC, "元数据库 %s 执行命令 %s 失败");
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_META_CON_CLOSE, "关闭到元数据库 %s 的连接失败");

        /* SQL 语句解析相关 */
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_SYNTAX_PARSE, "ZQL 语句 %s 解析失败");
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_SYNTAX_READ, "读取 ZQL 语句失败");
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_SYNTAX_GENE, "反向生成 SQL 命令失败");

        /* 配置文件相关 */
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_CONF_MISS, "配置项 %s 缺失");
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_CONF_CONFLICT, "配置项 %s 发生不符合预期或者冲突");
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_CONF_FILE_NOT_FOUND, "找不到配置文件 %s");

        /* 连接 / 连接池相关 */
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_CP_JDBC_NOT_FOUND, "找不到 JDBC 驱动 %s");
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_CP_CREATE_STATEMENT, "创建 Statement 失败");
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_CP_GET_RS, "从 Statement 中获取 ResultSet 失败");
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_CP_GET_UR, "从 Statement 中获取 Updated Rows 失败");

        /* 系统相关 */
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_SYSTEM_INIT, "尚未初始化系统");
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_SYSTEM_META_INIT, "尚未初始化元数据库");
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_SYSTEM_INNER_INIT, "尚未初始化底层库");

        /* 权限相关 */
        MESSAGES_TEMPLATE.put(ZQLErrorNumbers.ERR_PRIV_NOT_FOUND, "元数据库中找不到用户 %s 对于数据表 %s 的权限 %s");

    }

    /**
     * 根据错误编号获取相应的错误信息模板
     *
     * @param vendorCode 错误编号
     * @return 错误编号对应的错误信息模板，如果编号不存在返回 null
     */
    public static String getMessageTemplate(int vendorCode) {
        return MESSAGES_TEMPLATE.get(vendorCode);
    }

    /**
     * 根据错误编号和错误信息模板参数获取相应的错误信息
     *
     * @param vendorCode 错误编号
     * @param args       错误信息模板参数
     * @return 相应的错误信息，如果编号不存在，返回 null
     */
    public static String getMessage(int vendorCode, String[] args) {
        if (getMessageTemplate(vendorCode) == null) {
            return null;
        }
        return String.format(getMessageTemplate(vendorCode), args);
    }
}

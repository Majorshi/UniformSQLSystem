package cn.edu.bit.linc.zql.exceptions;

/**
 * ZQL 错误编号
 */
public class ZQLErrorNumbers {
    /* 底层库相关 */
    public final static int ERR_NOT_SUPPORTED_DB = 10000;
    public final static int ERR_INNER_CON_OPEN = 10001;
    public final static int ERR_INNER_EXEC = 10002;
    public final static int ERR_INNER_CON_CLOSE = 10003;
    public final static int ERR_INNER_NO_USE = 10004;
    public final static int ERR_INNER_USE_DB = 10005;
    public final static int ERR_INNER_INNER_DB_NOT_FOUND = 10006;
    public final static int ERR_INNER_COLUMN_TYPE_NOT_FOUND = 10007;
    public final static int ERR_INNER_DB_NOT_FOUND = 10008;

    /* 元数据库相关 */
    public final static int ERR_META_CON_OPEN = 10500;
    public final static int ERR_META_EXEC = 10501;
    public final static int ERR_META_CON_CLOSE = 10502;

    /* SQL 语句解析相关 */
    public final static int ERR_SYNTAX_PARSE = 11000;
    public final static int ERR_SYNTAX_READ = 11001;
    public final static int ERR_SYNTAX_GENE = 11002;

    /* 配置文件相关 */
    public final static int ERR_CONF_MISS = 11500;
    public final static int ERR_CONF_CONFLICT = 11501;
    public final static int ERR_CONF_FILE_NOT_FOUND = 11502;

    /* 连接 / 连接池相关 */
    public final static int ERR_CP_JDBC_NOT_FOUND = 12000;
    public final static int ERR_CP_CREATE_STATEMENT = 12001;
    public final static int ERR_CP_GET_RS = 12002;
    public final static int ERR_CP_GET_UR = 12003;

    /* 系统相关 */
    public final static int ERR_SYSTEM_INIT = 12500;
    public final static int ERR_SYSTEM_META_INIT = 12501;
    public final static int ERR_SYSTEM_INNER_INIT = 12502;

    /* 权限相关 */
    public final static int ERR_PRIV_NOT_FOUND = 13000;

}

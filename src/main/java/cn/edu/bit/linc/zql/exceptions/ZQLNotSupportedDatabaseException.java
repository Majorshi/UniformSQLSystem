package cn.edu.bit.linc.zql.exceptions;

import java.sql.SQLException;

/**
 * 不支持的底层库类型
 */
public class ZQLNotSupportedDatabaseException extends SQLException {
    /**
     * 构造函数
     *
     * @param reason     异常描述
     * @param SQLState   一个 XOPEN 或者 SQL:2003 代码用于标示异常
     * @param vendorCode 数据库提供商指定代码用于标示异常
     */
    public ZQLNotSupportedDatabaseException(String reason, String SQLState, int vendorCode) {
        super(reason, SQLState, vendorCode);
    }

    /**
     * 构造函数
     *
     * @param reason   异常描述
     * @param SQLState 一个 XOPEN 或者 SQL:2003 代码用于标示异常
     */
    public ZQLNotSupportedDatabaseException(String reason, String SQLState) {
        super(reason, SQLState);
    }

    /**
     * 构造函数
     *
     * @param reason 异常描述
     */
    public ZQLNotSupportedDatabaseException(String reason) {
        super(reason);
    }

    /**
     * 构造函数
     */
    public ZQLNotSupportedDatabaseException() {
    }
}

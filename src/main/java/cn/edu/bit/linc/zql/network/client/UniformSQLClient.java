package cn.edu.bit.linc.zql.network.client;

import java.io.IOException;
import java.net.Socket;
import cn.edu.bit.linc.zql.util.StringUtil;

/**
 * 客户端
 */

public class UniformSQLClient {
    private final int port;             // 服务器端口
    private final String serverHost;    // 服务器地址
    private final String username;
    private final String password;
    private final ClientSocketHandlerFactory socketHandlerFactory;
    private static ClientSocketHandler handler = null;

    /**
     * 构造函数
     *
     * @param serverHost           远程服务器地址
     * @param port                 远程服务器端口
     * @param socketHandlerFactory Socket Handler 工厂
     */
    private UniformSQLClient(String serverHost, int port, ClientSocketHandlerFactory socketHandlerFactory, String username, String password) {
        this.port = port;
        this.serverHost = serverHost;
        this.socketHandlerFactory = socketHandlerFactory;
        this.username = username;
        this.password = password;
    }

    public ClientSocketHandler getHandler() {
        return handler;
    }

    /**
     * 连接远程服务器
     *
     * @throws IOException
     */
    public void connect() throws IOException {
        Socket clientSocket = new Socket(serverHost, port);
        handler = socketHandlerFactory.newSocketHandler(clientSocket, username, password);
        handler.handleSocket();
    }

    /**
     * Uniform SQL Server 构建器
     */
    public static class Builder {
        private Integer port;         // 服务器端口
        private String serverHost;    // 服务器地址
        private String username;
        private String password;
        private ClientSocketHandlerFactory socketHandlerFactory;

        /**
         * 配置服务器开放端口
         *
         * @param port 服务器开放端口
         * @return Builder
         */
        public Builder onPort(int port) {
            this.port = port;
            return this;
        }

        /**
         * 配置 Socket Handler 工厂
         *
         * @param socketHandlerFactory Socket Handler 工厂
         * @return Builder
         */
        public Builder withSocketHandlerFactory(ClientSocketHandlerFactory socketHandlerFactory) {
            this.socketHandlerFactory = socketHandlerFactory;
            return this;
        }

        /**
         * 配置远程服务器地址
         *
         * @param serverHost 远程服务器地址
         * @return Builder
         */
        public Builder toServer(String serverHost) {
            this.serverHost = serverHost;
            return this;
        }

        /**
         * 设置账户信息
         * @param username 数据库用户名
         * @param password 数据库密码
         * @return
         */
        public Builder setAccount(String username, String password){
            this.username = username;
            this.password = password;
            return this;
        }

        /**
         * 构建 UniformSQLClient 对象
         *
         * @return UniformSQLClient 对象
         */
        public UniformSQLClient build() {
            if (port == null || serverHost == null) {
                throw new IllegalStateException("port and server host do not have defaults");
            }
            if (username == null || password == null){
                throw new IllegalStateException("account do not have defaults");
            }
            return new UniformSQLClient(serverHost, port, socketHandlerFactory, username, password);
        }
    }

    /**
     * 测试函数
     *
     * @param args 程序参数
     */
    public static void main(String[] args) throws IOException {
        int port = 9527;
        String host = "127.0.0.1";
        UniformSQLClientSocketHandlerFactory uniformSQLClientSocketHandlerFactory = new UniformSQLClientSocketHandlerFactory();
        UniformSQLClient client = new UniformSQLClient.Builder()
                .onPort(port).toServer(host).setAccount("ihainan", "12345")
                .withSocketHandlerFactory(uniformSQLClientSocketHandlerFactory)
                .build();

        client.connect();
        UniformSQLClientSocketHandler handler = (UniformSQLClientSocketHandler) client.getHandler();

//        String userOne = "User_" + StringUtil.RandomStringGenerator.generateRandomString
//                (5, StringUtil.RandomStringGenerator.Mode.ALPHA);           // 用户一
//        String userTwo = "User_" + StringUtil.RandomStringGenerator.generateRandomString
//                (5, StringUtil.RandomStringGenerator.Mode.ALPHA);           // 用户二
//        String userThree = "User_" + StringUtil.RandomStringGenerator.generateRandomString
//                (5, StringUtil.RandomStringGenerator.Mode.ALPHA);           // 用户三
//        handler.sendCommand(1, "CREATE USER " + userOne + " IDENTIFIED BY '123456'");
//        handler.getResult();
//        // TODO: 检测用户是否存在
//        handler.sendCommand(1, "DROP USER " + userOne);                       // 删除用户一
//        handler.getResult();
//
//        handler.sendCommand(1, "CREATE USER " + userOne + " IDENTIFIED BY '123456'");   // 创建普通用户一
//        handler.getResult();
//        handler.sendCommand(1, "CREATE USER " + userTwo + " IDENTIFIED BY '123456'");   // 创建普通用户二
//        handler.getResult();
//        handler.sendCommand(1, "CREATE USER " + userThree + " IDENTIFIED BY '123456'");   // 创建普通用户二
//        handler.getResult();
//
//        // 创建、使用数据库、数据表
//        handler.sendCommand(1, "CREATE DATABASE IF NOT EXISTS db_1");  // 创建数据库
//        handler.getResult();
//        handler.sendCommand(1, "CREATE DATABASE IF NOT EXISTS db_2");  // 创建数据库
//        handler.getResult();
//        handler.sendCommand(1, "CREATE DATABASE IF NOT EXISTS db_3");  // 创建数据库
//        handler.getResult();
//        // TODO: line 1:159 mismatched input '<EOF>' expecting COMMENT
//        // TODO: 对 DataType(INT) 的支持
//        handler.sendCommand(1, "CREATE TABLE IF NOT EXISTS db_1.tb_1 (C1 TINYINT, C2 SMALLINT, C3 INT, C4 BigInt," +
//                " C5 FLOAT, C7 DOUBLE, C8 DECIMAL, C10 TIMESTAMP, c11 date, C12 Boolean, " +
//                "C13 BINARY) COMMENT 'Table 1 Comment'");        // 创建数据表一
//        handler.getResult();
//        handler.sendCommand(1, "USE db_1");        // 使用数据库一
//        handler.getResult();
//        handler.sendCommand(1, "CREATE TABLE IF NOT EXISTS tb_2 (C1 TINYINT, C2 SMALLINT, C3 INT, C4 BigInt," +
//                " C5 FLOAT, C7 DOUBLE, C8 DECIMAL, C10 TIMESTAMP, c11 date, C12 Boolean, " +
//                "C13 BINARY) COMMENT 'Table 2 Comment'");        // 创建数据表二 / 不带数据库名
//        handler.getResult();
//        handler.sendCommand(1, "CREATE TABLE IF NOT EXISTS tb_3 (C1 TINYINT, C2 SMALLINT, C3 INT, C4 BigInt," +
//                " C5 FLOAT, C7 DOUBLE, C8 DECIMAL, C10 TIMESTAMP, c11 date, C12 Boolean, " +
//                "C13 BINARY) COMMENT 'Table 3 Comment'");        // 创建数据表三 / 不带数据库名
//        handler.getResult();
//
//        // 删除数据库、数据表
//        handler.sendCommand(1, "DROP DATABASE IF EXISTS db_2");    // 删除数据库2
//        handler.getResult();
//        handler.sendCommand(1, "DROP TABLE IF EXISTS tb_3");       // 删除数据表3
//        handler.getResult();
//
//        // 修改数据表
//        handler.sendCommand(1, "ALTER TABLE tb_2 RENAME TO tb_N"); // 修改数据表名
//        handler.getResult();
//        handler.sendCommand(1, "ALTER TABLE tb_N CHANGE COLUMN C2 C2_NEW");    // 修改列名
//        handler.getResult();
//        handler.sendCommand(1, "ALTER TABLE tb_N CHANGE C3 C3_NEW");    // 修改列名
//        handler.getResult();
//
//
//        // 查看数据库、数据表、数据列
//        // TODO: line 1:14 mismatched input '<EOF>' expecting LIKE
//        handler.sendCommand(1, "SHOW DATABASES");  // 查看数据库
//        handler.getResult();
//        handler.sendCommand(1, "SHOW SCHEMAS LIKE 'db\\_%'");     // 带条件查看数据库
//        handler.getResult();
//        handler.sendCommand(1, "SHOW TABLES");     // 查看数据表
//        handler.getResult();
//        handler.sendCommand(1, "SHOW TABLES in db_1 'tb%'");   // 查看特定数据库中符合指定条件的数据表
//        handler.getResult();
//        handler.sendCommand(1, "SHOW COLUMNS FROM tb_1");
//        handler.getResult();
//        handler.sendCommand(1, "SHOW COLUMNS FROM tb_1 FROM db_1");
//        handler.getResult();
//
//        // 授权、撤销、查看授权
//        handler.sendCommand(1, "GRANT SELECT, UPDATE ON tb_1 TO " + userOne + " WITH GRANT OPTION");    // 授权
//        handler.getResult();
//        handler.sendCommand(1, "GRANT INSERT, UPDATE ON tb_1 TO " + userOne);      // 授权累加
//        handler.getResult();
//        handler.sendCommand(1, "GRANT ALL ON tb_N TO " + userTwo);                         // GRANT ALL
//        handler.getResult();
//        handler.sendCommand(1, "GRANT ALL ON tb_N TO " + userThree + " WITH GRANT OPTION");       // GRANT ALL / WITH GRANT OPTION
//        handler.getResult();
//        handler.sendCommand(1, "SHOW GRANT ON ALL");                                  // 查看所有人授权
//        handler.getResult();
//        handler.sendCommand(1, "SHOW GRANT " + userOne + " ON ALL");                    // 查看单人授权 / ALL
//        handler.getResult();
//        handler.sendCommand(1, "SHOW GRANT " + userTwo + " ON TABLE tb_1");             // 查看单人 / 单表
//        handler.getResult();
//        handler.sendCommand(1, "REVOKE ALL ON tb_1 FROM " + userOne);                   // 取消授权 / ALL
//        handler.getResult();
//        handler.sendCommand(1, "REVOKE SELECT ON tb_N FROM " + userTwo);                // 取消授权
//        handler.getResult();
//        // TODO: 错误语句仍能正常执行
//        // sendCommand("REVOKE GRANT OPTION FOR ON tb_1 FROM " + userThree);    // 取消授权 / GRANT OPTION FOR
//        handler.sendCommand(1, "REVOKE GRANT OPTION FOR SELECT ON tb_N FROM " + userThree);    // 取消授权 / GRANT OPTION FOR
//        handler.getResult();

        // 其他
//        handler.sendCommand(1, "SHOW SERVER ALIASES");     // 查询底层库别名
//        handler.getResult();
//        handler.sendCommand(1, "SET TABLE tb_4 TO db_mysql.db_1");     // 将现有表位置设置到元数据库内
//        handler.getResult();
//        handler.sendCommand(1, "SERVER ALIAS db_mysql CREATE DATABASE IF NOT EXISTS db_2");  // 指定底层库运行
//        handler.getResult();
//        handler.sendCommand(1, "SHOW DATABASES");          // 显示数据库
//        handler.getResult();
        handler.sendCommand(1, "SHOW TABLES");             // 显示数据表
        handler.getResult();

        handler.disconnect();
    }
}
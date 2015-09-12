package cn.edu.bit.linc.zql.network.client;

import java.net.Socket;

/**
 * 统一 SQL 系统 Server Socket Handler 工厂
 */
public class UniformSQLClientSocketHandlerFactory implements ClientSocketHandlerFactory {

    public ClientSocketHandler newSocketHandler(Socket socket) {
        return new UniformSQLClientSocketHandler(socket);
    }

    public ClientSocketHandler newSocketHandler(Socket socket, String username, String password) {
        return new UniformSQLClientSocketHandler(socket,username, password);
    }
}

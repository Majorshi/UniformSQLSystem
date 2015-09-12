package cn.edu.bit.linc.zql.network.client;

import java.net.Socket;

/**
 * Server Socket Handler 工厂
 */
public interface ClientSocketHandlerFactory {
    public ClientSocketHandler newSocketHandler(Socket socket);

    public ClientSocketHandler newSocketHandler(Socket socket, String username, String password);
}

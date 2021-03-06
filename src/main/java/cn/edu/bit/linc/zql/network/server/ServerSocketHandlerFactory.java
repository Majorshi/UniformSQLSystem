package cn.edu.bit.linc.zql.network.server;

import java.net.Socket;

/**
 * Server Socket Handler 工厂
 */
public interface ServerSocketHandlerFactory {
    public ServerSocketHandler newSocketHandler(Socket socket);
}

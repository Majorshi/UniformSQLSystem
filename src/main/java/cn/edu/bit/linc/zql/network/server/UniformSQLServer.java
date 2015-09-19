package cn.edu.bit.linc.zql.network.server;

import cn.edu.bit.linc.zql.exceptions.ZQLServerError;
import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 服务器端
 */
public class UniformSQLServer {
    private final int port;
    private final ServerSocketHandlerFactory socketHandlerFactory;
    private final ExecutorService handlerService = Executors.newCachedThreadPool();
    private static final Logger logger = LoggerFactory.getLogger(UniformSQLServer.class);

    /**
     * 构造函数
     *
     * @param port                 服务器端口
     * @param socketHandlerFactory Socket Handler 工厂
     */
    private UniformSQLServer(int port, ServerSocketHandlerFactory socketHandlerFactory) {
        this.port = port;
        this.socketHandlerFactory = socketHandlerFactory;
    }

    /**
     * 启动服务端
     *
     * @throws IOException 创建 Server Socket 失败
     */
    public void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        logger.i("系统正在监听 " + port + " 端口...");

        while (true) {
            final Socket clientSocket = serverSocket.accept();
            final ServerSocketHandler handler = socketHandlerFactory.newSocketHandler(clientSocket);

            handlerService.submit(new Runnable() {
                public void run() {
                    try {
                        logger.i("(TID " + Thread.currentThread().getId() + ") 客户端 " + clientSocket.getInetAddress() + " 已经连接到服务器");
                        handler.handleSocket();
                    } catch (Exception ex) {
                        ZQLServerError zqlServerError = new ZQLServerError();
                        zqlServerError.initCause(ex);
                        logger.e("(TID " + Thread.currentThread().getId() + ") " + "连接发生异常", zqlServerError);
                    }
                }
            });
        }
    }

    /**
     * Uniform SQL Server 构建器
     */
    public static class Builder {
        private Integer port;
        private ServerSocketHandlerFactory socketHandlerFactory;

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
        public Builder withSocketHandlerFactory(ServerSocketHandlerFactory socketHandlerFactory) {
            this.socketHandlerFactory = socketHandlerFactory;
            return this;
        }

        /**
         * 获取 Uniform SQL Server 对象
         *
         * @return Uniform SQL Server 对象
         */
        public UniformSQLServer build() {
            if (port == null) {
                throw new IllegalStateException("port and timeout do not have defaults");
            }
            return new UniformSQLServer(port, socketHandlerFactory);
        }
    }

    /**
     * 测试函数
     *
     * @param args 程序参数
     * @throws java.io.IOException 创建 Server Socket 失败
     */
    public static void main(String[] args) throws IOException {
        int port = 9527;
        UniformSQLServerSocketHandlerFactory uniformSQLSocketHandlerFactory = new UniformSQLServerSocketHandlerFactory();

        UniformSQLServer server = new UniformSQLServer
                .Builder()
                .onPort(port)
                .withSocketHandlerFactory(uniformSQLSocketHandlerFactory)
                .build();

        server.start();
    }
}

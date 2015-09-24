package cn.edu.bit.linc.zql;

import cn.edu.bit.linc.zql.connections.ConnectionPools;
import cn.edu.bit.linc.zql.databases.InnerDatabases;
import cn.edu.bit.linc.zql.databases.MetaDatabase;
import cn.edu.bit.linc.zql.network.server.UniformSQLServer;
import cn.edu.bit.linc.zql.network.server.UniformSQLServerSocketHandlerFactory;
import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;

import java.io.IOException;

/**
 * 统一 SQL 系统入口，用于初始化系统底层的所有模块
 *
 * @author ihainan
 */
public class ZQLContext {
    private static final Logger LOGGER = LoggerFactory.getLogger(ZQLContext.class);
    private static boolean initializedSystem = false;   // 系统是否已经被初始化
    public static MetaDatabase metaDatabase = null;     // 元数据库对象
    public static InnerDatabases innerDatabases = null; // 底层库信息
    public static ConnectionPools connectionPools = null;   // 连接池
    public static UniformSQLServer server = null;           // 系统服务器，对外提供命令执行接口

    /**
     * 初始化系统
     */
    public static synchronized void initializeSystem() throws IOException {
        if (!initializedSystem) {
            initializedSystem = true;

            LOGGER.i("正在初始化系统模块...");
            ZQLEnv.init();

            LOGGER.i("正在读取元数据库信息...");
            metaDatabase = MetaDatabase.getInstance();

            LOGGER.i("正在读取底层库信息...");
            innerDatabases = InnerDatabases.getInstance();

            LOGGER.i("正在初始化到底层库的连接池...");
            connectionPools = ConnectionPools.getInstance();

            LOGGER.i("正在创建元数据库...");
            metaDatabase.createMetaDatabase();

            if (ZQLEnv.get(ZQLEnv.SERVER_ENABLE).equals("true")) {
                LOGGER.i("正在启动服务接口...");
                UniformSQLServerSocketHandlerFactory uniformSQLSocketHandlerFactory = new UniformSQLServerSocketHandlerFactory();
                server = new UniformSQLServer
                        .Builder()
                        .onPort(Integer.valueOf(ZQLEnv.get(ZQLEnv.SERVER_PORT)))
                        .withSocketHandlerFactory(uniformSQLSocketHandlerFactory)
                        .build();
                server.start();
            }
            LOGGER.i("系统模块初始化完毕\n");
        }
    }

    /**
     * 系统入口，在此启动系统
     *
     * @param args 程序参数
     */
    public static void main(String[] args) throws IOException {
        initializeSystem();
        // UnitTestUtils.mySQLTest();
        // ZQLSession session = new ZQLSession("root", "", "root");
        // UnitTestUtils.executeSQL("SELECT * FROMX user", session);
    }
}
package cn.edu.bit.linc.zql;

import cn.edu.bit.linc.zql.exceptions.ZQLConfigurationException;
import cn.edu.bit.linc.zql.exceptions.ZQLErrorNumbers;
import cn.edu.bit.linc.zql.exceptions.ZQLExceptionUtils;
import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;
import java.util.HashMap;

/**
 * 全局系统变量
 */
public class ZQLEnv {
    private static final HashMap<String, String> CONF_MAP = new HashMap<String, String>();  // HashMap 用于存储全局性质的配置项
    private static final String CONFIG_FILE_PATH = "conf.xml";  // 配置文件路径
    private static final Logger LOGGER = LoggerFactory.getLogger(ZQLEnv.class);

    /* 配置项 */
    /* 元数据库相关 */
    public final static String META_DB_HOST = "metadb.host";
    public final static String META_DB_USERNAME = "metadb.username";
    public final static String META_DB_PASSWORD = "metadb.password";
    public final static String META_DB_DBNAME = "metadb.dbname";

    /* 底层库相关 */
    public final static String INNER_DB_DEFAULT = "innerdb.dafault.innerdb";

    /* 服务器相关 */
    public final static String SERVER_ENABLE = "server.enable";
    public final static String SERVER_PORT = "server.port";
    public final static String SERVER_VERSION = "server.version";
    public final static String SERVER_PROTOCOL_VERSION = "server.protocol.version";


    /** 从配置文件中读取系统配置项，存储在 CONF_MAP 对象中 */
    static {
        /* 读取配置文件 */
        try {
            LOGGER.i("正在读取配置文件 " + new File(CONFIG_FILE_PATH).getAbsolutePath() + " ...");
            readConFile(CONFIG_FILE_PATH);
        } catch (ConfigurationException e) {
            LOGGER.f(ZQLExceptionUtils.getMessage(11502, new String[]{new File(CONFIG_FILE_PATH).getAbsolutePath()}), e);
            System.exit(0);
        }

        /* 默认系统配置项 */
        if (CONF_MAP.get(INNER_DB_DEFAULT) == null) {
            LOGGER.w("默认底层库 " + INNER_DB_DEFAULT + " 未设置，使用默认值 1");
            CONF_MAP.put(INNER_DB_DEFAULT, "1");   // 默认底层库编号
        }

        CONF_MAP.put(SERVER_VERSION, "version 0.1");  // 服务器版本
        CONF_MAP.put(SERVER_PROTOCOL_VERSION, "1");          // 协议版本

        // TODO: 设置默认配置项
        // TODO: 检查必要配置项是否缺失

        LOGGER.i("读取配置文件成功");
    }

    /**
     * 空函数，用于初始化本类的静态成员
     */
    public static void init() {
    }

    /**
     * 获取系统配置项
     *
     * @param key 配置项
     * @return 若配置项存在，则返回配置项对应的值，否则返回 null
     */
    public static String get(String key) {
        return CONF_MAP.get(key);
    }

    /**
     * 读取配置文件
     *
     * @param filePath 配置文件路径
     * @throws ConfigurationException 读取 XML 配置文件失败
     */
    private static void readConFile(String filePath) throws ConfigurationException {
        XMLConfiguration config = new XMLConfiguration(filePath);
        NodeList list = config.getDocument().getElementsByTagName("entry");
        for (int i = 0; i < list.getLength(); i++) {
            Node node = list.item(i);
            String key = node.getAttributes().getNamedItem("key").getTextContent();
            String val = node.getTextContent();
            CONF_MAP.put(key, val);
        }
    }

    /**
     * 检查多个配置项是否完整，若不完整报错并退出程序
     *
     * @param itemNames 需要检查的配置项数组
     */
    public static void checkConfigurationItems(String... itemNames) {
        for (String itemName : itemNames) {
            int vendorCode = ZQLErrorNumbers.ERR_CONF_MISS;
            if (ZQLEnv.get(itemName) == null || ZQLEnv.get(itemName) == "") {
                String reason = ZQLExceptionUtils.getMessage(vendorCode, new String[]{itemName});
                ZQLConfigurationException zqlConfigurationException = new ZQLConfigurationException(reason, "HY000", vendorCode);
                LOGGER.f(reason, zqlConfigurationException);
                System.exit(0);
            }
        }
    }

    /**
     * 输出配置项
     */
    public static void printConf() {
        for (String key : CONF_MAP.keySet()) {
            LOGGER.d(key + ": " + CONF_MAP.get(key));
        }
    }
}

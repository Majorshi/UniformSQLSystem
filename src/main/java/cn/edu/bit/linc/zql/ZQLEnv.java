package cn.edu.bit.linc.zql;

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
    private static final Logger logger = LoggerFactory.getLogger(ZQLEnv.class);

    /** 从配置文件中读取系统配置项，存储在 CONF_MAP 对象中 */
    static {
        /* 读取配置文件 */
        try {
            logger.i("正在读取配置文件 " + new File(CONFIG_FILE_PATH).getAbsolutePath() + " ...");
            readConFile(CONFIG_FILE_PATH);
        } catch (ConfigurationException e) {
            logger.f("找不到配置文件 " + new File(CONFIG_FILE_PATH).getAbsolutePath(), e);
            System.exit(-1);
        }

        /* 默认系统配置项 */
        if (CONF_MAP.get("innerdb.dafault.innerdb") == null) {
            logger.w("默认底层库 innerdb.dafault.innerdb 未设置，使用默认值 1");
            CONF_MAP.put("innerdb.dafault.innerdb", "1");   // 默认底层库编号
        }

        CONF_MAP.put("server.version", "version 0.1");  // 服务器版本
        CONF_MAP.put("protocol.version", "1");          // 协议版本

        logger.i("读取配置文件成功");
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
     * 输出配置项
     */
    public static void printConf() {
        for (String key : CONF_MAP.keySet()) {
            System.out.println(key + ": " + CONF_MAP.get(key));
        }
    }
}

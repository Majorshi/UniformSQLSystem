package cn.edu.bit.linc.zql.network.server;

import cn.edu.bit.linc.zql.ZQLContext;
import cn.edu.bit.linc.zql.ZQLEnv;
import cn.edu.bit.linc.zql.connections.ZQLSession;
import cn.edu.bit.linc.zql.network.packets.*;
import cn.edu.bit.linc.zql.network.packets.type.IntegerType;
import cn.edu.bit.linc.zql.network.packets.type.LengthCodeBinaryType;
import cn.edu.bit.linc.zql.network.packets.type.LengthCodeStringType;
import cn.edu.bit.linc.zql.network.packets.type.StringType;
import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;
import org.apache.commons.lang.RandomStringUtils;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 统一 SQL 系统 Server Socket Handler，用于接收和发送请求
 */
public class UniformSQLServerSocketHandler implements ServerSocketHandler {
    private static final Logger logger = LoggerFactory.getLogger(UniformSQLServerSocketHandler.class);

    private final int id;
    private final Socket clientSocket;
    int packetNumber = 0;

    /**
     * 构造函数，初始化 Socket Handler
     *
     * @param id           Socket 连接编号
     * @param clientSocket 客户端 Socket
     */
    public UniformSQLServerSocketHandler(int id, Socket clientSocket) {
        this.id = id;
        this.clientSocket = clientSocket;
    }

    /**
     * handle Socket 连接
     *
     * @throws IOException                                    获取 InputStream 或者 OutputStream 失败
     * @throws PacketExceptions.NecessaryFieldNotSetException 必要字段没有正确设置
     */
    public void handleSocket() throws IOException, PacketExceptions.NecessaryFieldNotSetException {
        logger.i(clientSocket.getInetAddress() + " has been connected to server with ID " + id);

        InputStream in = clientSocket.getInputStream();
        OutputStream out = clientSocket.getOutputStream();

        // 发送握手数据包
        Packet handShakePacket;
        handShakePacket = buildHandShakePacket();
        byte[] data = new byte[handShakePacket.getSize()];
        handShakePacket.getData(data);
        out.write(data);
        logger.d("(TID " + Thread.currentThread().getId() + ") 正在握手数据包给客户端 " + clientSocket.getInetAddress());
        logger.d("(TID " + Thread.currentThread().getId() + ") 握手数据包内容 : " + handShakePacket);

        // 客户端验证包
        Packet packer = readPacket(in);
        byte[] credentialsPacketBytes = packer.getPacketBody();
        CredentialsPacket credentialsPacket = new CredentialsPacket(credentialsPacketBytes.length);
        credentialsPacket.setData(credentialsPacketBytes);
        logger.i("(TID " + Thread.currentThread().getId() + ") 接收来自客户端的验证报文");
        logger.d("(TID " + Thread.currentThread().getId() + ") 报文内容 : " + credentialsPacket);
        logger.d("Character Set       : " + IntegerType.getIntegerValue(credentialsPacket.getCharacterSet()));
        logger.d("Max Packet Length   : " + IntegerType.getIntegerValue(credentialsPacket.getMaxPacketLength()));
        logger.d("Server Capabilities : " + IntegerType.getIntegerValue(credentialsPacket.getClientCapabilities()));
        CredentialsPacket.CredentialInformation credentialInformation = credentialsPacket.getCredentialInformation();
        logger.d("User Name           : " + StringType.getString(credentialInformation.userName));
        logger.d("Token               : " + LengthCodeStringType.getString(credentialInformation.token));
        logger.d("Database Name       : " + StringType.getString(credentialInformation.dbName));

        // TODO: 用户信息认证
        Packet successPacket;
        successPacket = buildSuccessPacket("OK");
        data = new byte[successPacket.getSize()];
        successPacket.getData(data);
        out.write(data);
        logger.i("(TID " + Thread.currentThread().getId() + ") 发送验证成功报文给客户端 " + clientSocket.getInetAddress());
        logger.d("(TID " + Thread.currentThread().getId() + ") 成功报文内容: " + successPacket);

        /* 生成会话 */
        ZQLSession session = new ZQLSession("root", null, "12345");

        /* 接收命令包和返回结果包 */
        while (true) {
            packer = readPacket(in);
            byte[] commandBytes = packer.getPacketBody();
            CommandPacket commandPacket = new CommandPacket(commandBytes.length);
            commandPacket.setData(commandBytes);
            logger.i("(TID " + Thread.currentThread().getId() + ") 接收来自客户端的命令报文");
            logger.i("(TID " + Thread.currentThread().getId() + ") 命令报文内容 : " + commandPacket);

            // 接收到断开连接请求
            if (IntegerType.getIntegerValue(commandPacket.getCommandCode()) == CommandPacket.COM_QUIT) {
                logger.i("(TID " + Thread.currentThread().getId() + ") 接收到退出命令，准备断开连接");
                break;
            }

            logger.d("(TID " + Thread.currentThread().getId() + ") 命令编号: " + IntegerType.getIntegerValue(commandPacket.getCommandCode()));
            logger.d("(TID " + Thread.currentThread().getId() + ") 命令内容: " + LengthCodeStringType.getString(commandPacket.getCommand()));

            // TODO: 执行命令，若失败则封装错误报文
            Packet packet = ZQLContext.executeSQL(LengthCodeStringType.getString(commandPacket.getCommand()), session);

            // 返回结果包
            data = new byte[packet.getSize()];
            packet.getData(data);
            out.write(data);
        }

        // 关闭连接
        closeQuietly(in);
        closeQuietly(out);
    }

    /**
     * 从流中读取一个数据报文
     *
     * @param in 输入流
     * @return 读取得到的数据报文
     */
    public static Packet readPacket(InputStream in) throws IOException {
        /* 读取消息头 */
        byte[] packetHeaderBytes = new byte[4];
        in.read(packetHeaderBytes);
        PacketHeader packetHeader = new PacketHeader(4);
        packetHeader.setData(packetHeaderBytes);

        /* 读取消息体 */
        byte[] packetBodyBytes = new byte[packetHeader.getPacketLength()];
        in.read(packetBodyBytes);
        Packet packet = new Packet(4 + packetBodyBytes.length);
        packet.setPacketHeader(packetHeader);
        packet.setPacketBody(packetBodyBytes);

        return packet;
    }

    /**
     * 关闭流
     *
     * @param closeable 需要关闭的流
     */
    private void closeQuietly(Closeable closeable) throws IOException {
        closeable.close();
    }

    /**
     * 构建握手数据包
     *
     * @return 构建得到的握手数据包
     * @throws cn.edu.bit.linc.zql.network.packets.PacketExceptions.NecessaryFieldNotSetException 必要字段没有设置
     */
    private Packet buildHandShakePacket() throws PacketExceptions.NecessaryFieldNotSetException {
        /* 构建握手包 */
        IntegerType protocolVersion = IntegerType.getIntegerType(Integer.valueOf(ZQLEnv.get("protocol.version")), HandShakePacket.LENGTH_PROTOCOL_VERSION);
        StringType serverVersion = StringType.getStringType(ZQLEnv.get("server.version"));
        IntegerType threadID = IntegerType.getIntegerType((int) Thread.currentThread().getId(), HandShakePacket.LENGTH_THREAD_ID);
        IntegerType serverCapabilities = IntegerType.getIntegerType(0, HandShakePacket.LENGTH_SERVER_CAPABILITIES);
        IntegerType characterSet = IntegerType.getIntegerType(0, HandShakePacket.LENGTH_CHARACTER_SET);
        IntegerType serverStatus = IntegerType.getIntegerType(0, HandShakePacket.LENGTH_SERVER_STATUS);

        String randomStr = RandomStringUtils.randomAlphanumeric(HandShakePacket.LENGTH_SCRAMBLE_ONE + HandShakePacket.LENGTH_SCRAMBLE_TWO - 2);    // 随机字符串
        StringType randomStrPartOneST = StringType.getStringType(randomStr.substring(0, 8));
        byte[] scramblePartOne = new byte[HandShakePacket.LENGTH_SCRAMBLE_ONE];
        randomStrPartOneST.getData(scramblePartOne);
        StringType randomStrPartTwoST = StringType.getStringType(randomStr.substring(8, 20));
        byte[] scramblePartTwo = new byte[HandShakePacket.LENGTH_SCRAMBLE_TWO];
        randomStrPartTwoST.getData(scramblePartTwo);

        HandShakePacket handShakePacket = new HandShakePacket(serverVersion.getSize() + 45);
        handShakePacket.setProtocolVersion(protocolVersion);
        handShakePacket.setServerVersion(serverVersion);
        handShakePacket.setThreadID(threadID);
        handShakePacket.setScramblePartOne(scramblePartOne);
        handShakePacket.setServerCapabilities(serverCapabilities);
        handShakePacket.setCharacterSet(characterSet);
        handShakePacket.setServerStatus(serverStatus);
        handShakePacket.setScramblePartTwo(scramblePartTwo);
        byte[] body = new byte[handShakePacket.getSize()];
        handShakePacket.getData(body);

        /* 构建包头 */
        PacketHeader packetHeader = new PacketHeader(4);
        packetHeader.setPacketLength(handShakePacket.getSize());
        packetHeader.setPacketID((byte) packetNumber++);

        /* 构建数据包 */
        Packet packet = new Packet(packetHeader.getSize() + body.length);
        packet.setPacketHeader(packetHeader);
        packet.setPacketBody(body);

        return packet;
    }

    /**
     * 构建响应成功数据包
     *
     * @return 构建得到的响应成功数据包
     */
    private Packet buildSuccessPacket(String ret) {
        IntegerType packetIdentifier = IntegerType.getIntegerType(0x00, SuccessPacket.LENGTH_PACKET_IDENTIFIER);
        LengthCodeBinaryType changedRows = LengthCodeBinaryType.getLengthCodeBinaryType(new byte[]{1, 2, 3, 4, 5, 6, 7, 8});
        LengthCodeBinaryType indexID = LengthCodeBinaryType.getLengthCodeBinaryType(new byte[]{4, 3, 2, 1});
        IntegerType serverStatus = IntegerType.getIntegerType(200, SuccessPacket.LENGTH_SERVER_STATUS);
        IntegerType warningNumber = IntegerType.getIntegerType(2, SuccessPacket.LENGTH_WARNING_NUMBER);
        LengthCodeStringType serverMessage = LengthCodeStringType.getLengthCodeString(ret);

        SuccessPacket successPacket = new SuccessPacket(packetIdentifier.getSize() + changedRows.getSize() + indexID.getSize() + serverStatus.getSize() + warningNumber.getSize() + serverMessage.getSize());
        successPacket.setPacketIdentifier(packetIdentifier);
        successPacket.setChangedRows(changedRows);
        successPacket.setIndexID(indexID);
        successPacket.setServerStatus(serverStatus);
        successPacket.setWarningNumber(warningNumber);
        successPacket.setServerMessage(serverMessage);
        byte[] body = new byte[successPacket.getSize()];
        successPacket.getData(body);

        /* 构建包头 */
        PacketHeader packetHeader = new PacketHeader(4);
        packetHeader.setPacketLength(successPacket.getSize());
        packetHeader.setPacketID((byte) packetNumber++);

        /* 构建数据包 */
        Packet packet = new Packet(packetHeader.getSize() + body.length);
        packet.setPacketHeader(packetHeader);
        packet.setPacketBody(body);

        return packet;
    }

}

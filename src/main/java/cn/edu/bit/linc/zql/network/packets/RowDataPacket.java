package cn.edu.bit.linc.zql.network.packets;

import cn.edu.bit.linc.zql.network.packets.type.LengthCodeBinaryType;
import cn.edu.bit.linc.zql.network.packets.type.LengthCodeStringType;

import java.util.ArrayList;

/**
 * 行数据报文
 */
public class RowDataPacket extends BasePacket {

    /**
     * 偏移量数组
     */
    private int[] rowOffsets;

    /**
     * 创建指定大小的行数据报文
     *
     * @param size 指定大小（字节为单位）
     */
    public RowDataPacket(int size) {
        super(size);
    }

    /**
     * 设置 _data_ 数组
     *
     * @param data 指定 byte 数组
     */
    @Override
    public void setData(byte[] data) {
        super.setData(data);
    }

    /**
     * 设置行数据字段
     *
     * @param rowDataArray 行数据数组
     */
    public void setRowData(LengthCodeStringType[] rowDataArray) {
        rowOffsets = new int[rowDataArray.length+1];
        rowOffsets[0] = 0;
        for(int index = 0; index < rowDataArray.length; ++index) {
            byte[] bytes = new byte[rowDataArray[index].getSize()];
            rowDataArray[index].getData(bytes);
            System.arraycopy(bytes, 0, _data_, rowOffsets[index], bytes.length);
            rowOffsets[index+1] = rowOffsets[index] + bytes.length;
        }
    }

    /**
     * 获取行数据字段
     *
     * @return 行数据数组
     */
    public LengthCodeStringType[] getRowData(int len) {

        ArrayList <Integer> tmpRowOffsets = new ArrayList<Integer>();
        int index = 0, offset = 0;
        tmpRowOffsets.add(0, 0);
        while(index < len) {
            byte[] tmp = new byte[_data_.length - tmpRowOffsets.get(index)];
            System.arraycopy(_data_, tmpRowOffsets.get(index), tmp, 0, tmp.length);
            tmpRowOffsets.add(index+1, tmpRowOffsets.get(index) + LengthCodeBinaryType.getLength(tmp));
            offset = tmpRowOffsets.get(index+1);
            index++;
        }
        rowOffsets = new int[tmpRowOffsets.size()];
        for(int i = 0; i < tmpRowOffsets.size(); ++i)
            rowOffsets[i] = tmpRowOffsets.get(i);

        LengthCodeStringType[] rowDataArray = new LengthCodeStringType[rowOffsets.length-1];
        ArrayList tmpOffset = new ArrayList();
        tmpOffset.add(0);
        for(int i = 0; i < rowDataArray.length; ++i) {
            rowDataArray[i] = getRowDataByIndex(i);
        }
        return rowDataArray;
    }

    /**
     * 获取行数据字段
     *
     * @param index 下标
     * @return 行数据
     */
    public LengthCodeStringType getRowDataByIndex(int index) {
        byte[] data = new byte[rowOffsets[index+1] - rowOffsets[index]];
        System.arraycopy(_data_, rowOffsets[index], data, 0, data.length);
        return LengthCodeStringType.getLengthCodeBinaryTypeUsingData(data);
    }

    /**
     * 获取在完整data数组头部的行数据包
     *
     * @param __data 完整数组
     * @return 行数据包的长度
     */
    public int getRowDataPacketFromByte(byte[] __data, int offset, int len) {
        byte[] _data = new byte[__data.length - offset];
        System.arraycopy(__data, offset, _data, 0, __data.length - offset);
        setData(_data);
        getRowData(len);

        int newLen = rowOffsets[rowOffsets.length-1];
        byte[] newData = new byte[newLen];
        System.arraycopy(_data_, 0, newData, 0, newLen);
        setData(newData);

        return rowOffsets[rowOffsets.length-1];
    }

    /**
     * 根据参数构建行数据报文
     *
     * @param _rowData
     * @return 行数据报文
     */
    public static RowDataPacket getRowDataPacket(String[] _rowData) {
        //LengthCodeStringType[] rowDataArray = new LengthCodeStringType[] {LengthCodeStringType.getLengthCodeString("111"), LengthCodeStringType.getLengthCodeString("222"), LengthCodeStringType.getLengthCodeString("333")};

        LengthCodeStringType[] rowDataArray = new LengthCodeStringType[_rowData.length];
        int size = 0;
        for(int i = 0; i < _rowData.length; ++i) {
            rowDataArray[i] = LengthCodeStringType.getLengthCodeString(_rowData[i]);
            size += rowDataArray[i].getSize();
        }
        RowDataPacket rowDataPacket = new RowDataPacket(size);
        rowDataPacket.setRowData(rowDataArray);

        return rowDataPacket;
    }

    /**
     * 测试函数
     *
     * @param args 程序参数
     */
    public static void main(String[] args) {

        LengthCodeStringType[] rowDataArray = new LengthCodeStringType[] {LengthCodeStringType.getLengthCodeString("111"), LengthCodeStringType.getLengthCodeString("222"), LengthCodeStringType.getLengthCodeString("333")};

        RowDataPacket rowDataPacket = new RowDataPacket(12);
        rowDataPacket.setRowData(rowDataArray);

        //RowDataPacket rowDataPacket = RowDataPacket.getRowDataPacket(new String [] {"111", "222", "33"});

        System.out.println(rowDataPacket);

        LengthCodeStringType[] rowDataArrayRes = rowDataPacket.getRowData(3);
        for(LengthCodeStringType rowData : rowDataArrayRes) {
            System.out.print(LengthCodeStringType.getString(rowData) + " ");
        }
        System.out.println();

        /* 通过byte[]构建 */
        RowDataPacket rowDataPacketCopy = new RowDataPacket(rowDataPacket.getSize());
        byte[] data = new byte[rowDataPacket.getSize()];
        rowDataPacket.getData(data);

        byte[] newdata = new byte[data.length+2];
        for(int i = 0; i < data.length; ++i)
            newdata[i] = data[i];
        newdata[newdata.length-1] = 1;
        newdata[newdata.length-2] = 2;
        rowDataPacketCopy.getRowDataPacketFromByte(newdata, 0, 3);

        System.out.println();
        System.out.println(rowDataPacketCopy);

        rowDataArrayRes = rowDataPacketCopy.getRowData(3);
        for(LengthCodeStringType rowData : rowDataArrayRes) {
            System.out.print(LengthCodeStringType.getString(rowData) + " ");
        }
        System.out.println();


    }
    /* Output:
    [3, 49, 49, 49, 3, 50, 50, 50, 3, 51, 51, 51]
    111 222 333
    111
    222
    333
     */

}

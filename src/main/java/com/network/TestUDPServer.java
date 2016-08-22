package com.network;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by liujw on 2016/8/19.
 */
public class TestUDPServer {
    public static void main(String[] args) throws Exception {
        byte buf[] = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);
        DatagramSocket ds = new DatagramSocket(5678);
        while(true) {
            ds.receive(dp);
            ByteArrayInputStream bais = new ByteArrayInputStream(buf);
            DataInputStream dis = new DataInputStream(bais);
            System.out.println(dis.readLong());//通过字节数组的一部分构建出一个字符串打印出来
        }
    }
}

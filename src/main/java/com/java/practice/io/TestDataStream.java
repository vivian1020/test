package com.java.practice.io;

import java.io.*;

/**
 * Created by liujw on 2016/8/19.
 */
public class TestDataStream {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();//建立一个字节数组
        DataOutputStream dos = new DataOutputStream(baos);//套接一个DataOutputStream
        try{
            dos.writeDouble(Math.random());
            dos.writeBoolean(true);
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            System.out.println(bais.available());//有多少字节可以读取
            DataInputStream dis = new DataInputStream(bais);
            System.out.println(dis.readDouble());//先写的先读
            System.out.println(dis.readBoolean());
            dos.close();
            dis.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by liujw on 2016/8/19.
 * 客户端和服务端同时传输数据
 */
public class TestSockServer {
    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;
        try {
            ServerSocket ss = new ServerSocket(5888);
            Socket socket = ss.accept();
            in = socket.getInputStream();
            out = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(out);
            DataInputStream dis = new DataInputStream(in);
            String s = null;
            if((s=dis.readUTF()) != null) {
                System.out.println(s);
                System.out.println("from:" + socket.getInetAddress());
                System.out.println("Port:" +socket.getPort());
            }
            dos.writeUTF("hi, hello");
            dis.close();
            dos.close();
            socket.close();
        }catch(IOException e) {e.printStackTrace();}
    }
}

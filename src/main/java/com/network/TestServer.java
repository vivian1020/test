package com.network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by liujw on 2016/8/19.
 * 通过Socket对象获取通信双方Socket的信息
 */
public class TestServer {
    public static void main(String[] args) {
        try {
            ServerSocket s = new ServerSocket(8888);
            while (true) {
                Socket s1 = s.accept();
                OutputStream os = s1.getOutputStream();
                DataOutputStream dos = new DataOutputStream(os);
                dos.writeUTF("Hello, "+s1.getInetAddress()+"port# "+s1.getPort()+" bye-bye!");
                dos.close();
                s1.close();
            }
        }catch (IOException e) {
            e.printStackTrace();
            System.out.println("程序运行出错：" + e);
        }
    }
}

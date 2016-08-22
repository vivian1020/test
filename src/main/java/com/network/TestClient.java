package com.network;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

/**
 * Created by liujw on 2016/8/19.
 */
public class TestClient {
    public static void main(String[] args) {
        try {
            Socket s1 = new Socket("127.0.0.1", 8888);
            InputStream is = s1.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            System.out.println(dis.readUTF());
            dis.close();
            s1.close();
        } catch (ConnectException connExc) {
            connExc.printStackTrace();
            System.out.println("服务器连接失败！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.java.practice.network;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by liujw on 2016/8/19.
 */
public class TestSockClient {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
            Socket socket = new Socket("localhost", 5888);
            is = socket.getInputStream();
            os = socket.getOutputStream();
            DataInputStream dis = new DataInputStream(is);
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF("hey");
            String s = null;
            if((s=dis.readUTF()) != null) {
                System.out.println(s);
            }
            dis.close();
            dos.close();
            socket.close();
        }catch(UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

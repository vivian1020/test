package com.java.practice.network;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by liujw on 2016/8/19.
 */
public class TCPClient {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("127.0.0.1", 6666);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("hello server!");
        dos.flush();
        dos.close();
    }
}

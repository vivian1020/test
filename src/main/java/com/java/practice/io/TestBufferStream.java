package com.java.practice.io;

import java.io.*;

/**
 * Created by liujw on 2016/8/18.
 * 缓冲流的使用
 */
public class TestBufferStream {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\share\\java\\data2.txt"));
            BufferedReader br = new BufferedReader(new FileReader("d:\\share\\java\\data2.txt"));
            String s = null;
            for(int i=1; i<100; i++){
                s = String.valueOf(Math.random());
                bw.write(s);
                bw.newLine();
            }
            bw.flush();
            while((s=br.readLine()) != null){
                System.out.println(s);
            }
            bw.close();
            br.close();

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}

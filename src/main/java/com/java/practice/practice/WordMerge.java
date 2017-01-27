package com.java.practice.practice;

import java.io.*;

/**
 * Created by liujw on 2016/8/30.
 * 编写一个程序，将 a.txt 文件中的单词与 b.txt 文件中的单词交替合并到 c.txt
 文件中， a.txt 文件中的单词用回车符分隔， b.txt 文件中用回车或空格进行分隔。
 */
public class WordMerge {
    public static void main(String[] args) {
        BufferedReader bra = null;//读取a.txt
        BufferedReader brb = null;//读取b.txt
        BufferedWriter bw = null;
        try {
            bra = new BufferedReader(new FileReader("D:\\a.txt"));
            brb = new BufferedReader(new FileReader("D:\\b.txt"));
            bw = new BufferedWriter(new FileWriter("D:\\c.txt"));

            String lineA = "";
            String lineB = "";
            while((lineA = bra.readLine()) != null && (lineB = brb.readLine()) != null) {
                bw.write(lineA);
                bw.newLine();
                bw.write(lineB);
                bw.newLine();
            }
            while((lineA = bra.readLine()) != null) {
                bw.write(lineA);
                bw.newLine();
            }
            while((lineB = brb.readLine()) != null) {
                bw.write(lineB);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bra != null) {
                try {
                    bra.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(brb != null) {
                try {
                    brb.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bw != null) {
                try {
                    bw.flush();
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

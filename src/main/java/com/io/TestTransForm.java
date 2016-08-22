package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by liujw on 2016/8/19.
 * 接受系统输入，将一行数据转化为大写，输入exit时退出
 */
public class TestTransForm {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = null;
        try {
            s = br.readLine();
            while(s != null) {
                if(s.equalsIgnoreCase("exit")) break;
                System.out.println(s.toUpperCase());
                s = br.readLine();
            }
            br.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.java.practice.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by liujw on 2016/8/15.
 */
public class TestEx {
    public static void main(String[] args) {
       /* int[] arr = {1, 2, 3};
        try {
            System.out.println(2/0);
        } catch (ArithmeticException ae) {
            System.out.println("系统正在维护");
            ae.printStackTrace();
        }
        */
        FileInputStream in = null;

        try {
            in = new FileInputStream("myfile.txt");
            int b;
            b = in.read();
            while(b != -1) {
                System.out.println((char) b);
                b = in.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                in.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

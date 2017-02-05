package com.cnc.thread.test1;

/**
 * Created by liujinwen on 2017/2/5.
 */
public class Test1 {
    public static void main(String[] args) {
        String newString = new String("");
        try {
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

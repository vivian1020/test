package com.cnc.thread.joinException;

/**
 * Created by liujinwen on 2017/2/7.
 */
public class Run {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadC c = new ThreadC(b);
        c.start();
    }
}

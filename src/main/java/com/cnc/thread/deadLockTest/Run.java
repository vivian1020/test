package com.cnc.thread.deadLockTest;

/**
 * Created by liujw on 2017/1/28.
 */
public class Run {
    public static void main(String[] args) {
        DealThread t1 = new DealThread();
        t1.setFlag("a");
        Thread thread1 = new Thread(t1);
        thread1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.setFlag("b");
        Thread thread2 = new Thread(t1);
        thread2.start();
    }
}

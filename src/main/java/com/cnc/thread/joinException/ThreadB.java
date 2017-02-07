package com.cnc.thread.joinException;

/**
 * Created by liujinwen on 2017/2/7.
 */
public class ThreadB extends Thread {
    public void run(){
        ThreadA a = new ThreadA();
        a.start();
        try {
            a.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("B在run end处打印了");
    }
}


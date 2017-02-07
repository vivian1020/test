package com.cnc.thread.joinMoreTest;

/**
 * Created by liujinwen on 2017/2/7.
 */
public class ThreadB extends Thread {
    synchronized public void run() {
        System.out.println("begin B" + Thread.currentThread().getName()
                + " " + System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" end B ThreadName=" + Thread.currentThread()
                .getName() + " " + System.currentTimeMillis());
    }
}


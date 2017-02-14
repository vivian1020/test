package com.cnc.thread.stateTest4;

/**
 * Created by liujinwen on 2017/2/12.
 */
public class MyThread extends Thread {
    public void run() {
        try {
            synchronized (Lock.lock) {
                Lock.lock.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

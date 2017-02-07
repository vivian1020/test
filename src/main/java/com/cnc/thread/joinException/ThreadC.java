package com.cnc.thread.joinException;

/**
 * Created by liujinwen on 2017/2/7.
 */
public class ThreadC extends Thread {
    private ThreadB threadB;
    public ThreadC(ThreadB threadB) {
        super();
        this.threadB = threadB;
    }
    public void run() {
        threadB.interrupt();
    }
}

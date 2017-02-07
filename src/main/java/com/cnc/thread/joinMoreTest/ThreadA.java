package com.cnc.thread.joinMoreTest;

/**
 * Created by liujinwen on 2017/2/7.
 */
public class ThreadA extends Thread {
    private ThreadB b;
    public ThreadA(ThreadB b) {
        super();
        this.b = b;
    }
    public void run() {
        synchronized (b) {
            System.out.println("begin A" + Thread.currentThread().getName()
            + " " + System.currentTimeMillis());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" end A ThreadName=" + Thread.currentThread()
            .getName() + " " + System.currentTimeMillis());
        }
    }

}

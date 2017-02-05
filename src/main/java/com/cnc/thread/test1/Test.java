package com.cnc.thread.test1;

import com.cnc.thread.atomicIntegerNoSafe.MyThread;

/**
 * Created by liujinwen on 2017/2/5.
 */
public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        MyThread1 t1 = new MyThread1(lock);
        t1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyThread2 t2 = new MyThread2(lock);
        t2.start();
    }
}

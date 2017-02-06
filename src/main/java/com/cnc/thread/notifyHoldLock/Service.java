package com.cnc.thread.notifyHoldLock;

import com.java.practice.guava.ObjectTest;

/**
 * Created by liujinwen on 2017/2/5.
 */
public class Service {
    public void testMethod(Object lock){
        try {
            synchronized (lock) {
                System.out.println("begin wait() ThreadName="
                + Thread.currentThread().getName());
                lock.wait();
                System.out.println("end wait() ThreadName="
                + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void synNotifyMethod(Object lock) {
        synchronized (lock) {
            System.out.println("begin notify() ThreadName="
            + Thread.currentThread().getName() + " time="
            + System.currentTimeMillis());
            lock.notify();
            System.out.println("end notify() ThreadName="
            + Thread.currentThread().getName() + " time="
            + System.currentTimeMillis());
        }
    }
}

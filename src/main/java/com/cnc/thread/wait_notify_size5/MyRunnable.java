package com.cnc.thread.wait_notify_size5;

/**
 * Created by liujw on 2017/2/6.
 */
public class MyRunnable {
    static private Object lock = new Object();
    static private Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin timer="
                    + System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait end timer="
                            + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    static private Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                    System.out.println("wait begin timer="
                            + System.currentTimeMillis());
                    lock.notify();
                    System.out.println("wait end timer="
                            + System.currentTimeMillis());
            }
        }
    };

    public static void main(String[] args) {
        Thread t1 = new Thread(runnable1);
        t1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t2 = new Thread(runnable2);
        t2.start();
    }
}

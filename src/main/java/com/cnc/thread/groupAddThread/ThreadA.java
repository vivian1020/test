package com.cnc.thread.groupAddThread;

/**
 * Created by liujw on 2017/2/13.
 */
public class ThreadA extends Thread {
    public void run(){
        try {
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("ThreadName:" + Thread.currentThread().getName());
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

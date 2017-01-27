package com.cnc.thread.t8;

/**
 * Created by liujw on 2017/1/27.
 */
public class MyThread1 extends Thread{
    @Override
    public void run(){
        System.out.println("run threadName="
        +this.currentThread().getName() + " begin");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run threadName="
        +this.currentThread().getName() + " end");
    }

}

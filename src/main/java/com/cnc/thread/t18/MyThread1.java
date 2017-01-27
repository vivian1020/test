package com.cnc.thread.t18;

/**
 * Created by liujw on 2017/1/27.
 */
public class MyThread1 extends Thread {
    @Override
    public void run(){
        System.out.println("MyThread1 run priority=" + this.getPriority());
        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }
}

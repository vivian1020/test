package com.cnc.thread.t18;

/**
 * Created by liujw on 2017/1/27.
 */
public class MyThread2 extends Thread{
    @Override
    public void run(){
        System.out.println("MyThread2 run priority=" + this.getPriority());
    }
}

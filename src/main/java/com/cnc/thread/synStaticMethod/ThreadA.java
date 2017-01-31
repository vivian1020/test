package com.cnc.thread.synStaticMethod;

/**
 * Created by liujw on 2017/1/28.
 */
public class ThreadA extends Thread{
    @Override
    public void run(){
        Service.printA();
    }
}

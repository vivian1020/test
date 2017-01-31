package com.cnc.thread.synStaticMethod;

/**
 * Created by liujw on 2017/1/28.
 */
public class ThreadB extends Thread{
    @Override
    public void run(){
        Service.printB();
    }

}

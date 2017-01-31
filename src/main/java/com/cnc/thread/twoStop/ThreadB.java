package com.cnc.thread.twoStop;

/**
 * Created by liujw on 2017/1/28.
 */
public class ThreadB extends Thread{
    private Service service;
    public ThreadB(Service service){
        super();
        this.service = service;
    }
    @Override
    public void run(){
        service.methodB();
    }
}

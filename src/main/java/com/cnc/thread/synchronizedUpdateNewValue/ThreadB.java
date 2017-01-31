package com.cnc.thread.synchronizedUpdateNewValue;

/**
 * Created by liujw on 2017/1/28.
 */
public class ThreadB extends Thread{
    private Service1 service;
    public ThreadB(Service1 service){
        super();
        this.service = service;
    }
    @Override
    public void run(){
        service.stopMethod();
    }
}

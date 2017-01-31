package com.cnc.thread.synchronizedUpdateNewValue;

/**
 * Created by liujw on 2017/1/28.
 */
public class ThreadA extends Thread{
    private Service1 service;
    public ThreadA(Service1 service){
        super();
        this.service = service;
    }
    @Override
    public void run(){
        service.runMethod();
    }
}

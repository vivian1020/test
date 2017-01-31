package com.cnc.thread.throwExceptionNoLock;

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
        service.testMethod();
    }
}

package com.cnc.thread.UseConditionWaitNotifyError;

/**
 * Created by liujinwen on 2017/2/8.
 */
public class ThreadA extends Thread{
    private MyService service;
    public ThreadA(MyService myService) {
        super();
        this.service = service;
    }
    public void run(){
        service.waitMethod();
    }
}

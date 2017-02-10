package com.cnc.thread.awaitUntilTest;

/**
 * Created by liujinwen on 2017/2/9.
 */
public class MyThreadA extends Thread {
    private Service service;

    public MyThreadA(Service service) {
        super();
        this.service = service;
    }
    public void run(){
        service.waitMethod();
    }
}

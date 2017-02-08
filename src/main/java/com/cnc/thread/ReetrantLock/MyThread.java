package com.cnc.thread.ReetrantLock;

/**
 * Created by liujinwen on 2017/2/8.
 */
public class MyThread extends Thread {
    private MyService service;
    public MyThread(MyService service) {
        super();
        this.service = service;
    }
    public void run() {
        service.testMethod();
    }
}

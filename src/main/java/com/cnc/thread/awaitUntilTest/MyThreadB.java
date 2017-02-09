package com.cnc.thread.awaitUntilTest;

/**
 * Created by liujinwen on 2017/2/9.
 */
public class MyThreadB extends Thread {
    private Service service;

    public MyThreadB(Service service) {
        super();
        this.service = service;
    }

    public void run() {
        service.notifyMethod();
    }


}


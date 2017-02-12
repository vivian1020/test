package com.cnc.thread.ReadWriteLockBegin1;

/**
 * Created by liujw on 2017/2/10.
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }
    public void run() {
        service.read();
    }
}

package com.cnc.thread.ReadWriteLockBegin1;

/**
 * Created by liujw on 2017/2/10.
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }
    public void run() {
        service.read();
    }
}

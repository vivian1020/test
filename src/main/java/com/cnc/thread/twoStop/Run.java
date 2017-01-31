package com.cnc.thread.twoStop;

/**
 * Created by liujw on 2017/1/28.
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA athread = new ThreadA(service);
        athread.start();
        ThreadB bthread = new ThreadB(service);
        bthread.start();
    }
}

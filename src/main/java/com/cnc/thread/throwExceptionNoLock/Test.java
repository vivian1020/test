package com.cnc.thread.throwExceptionNoLock;

/**
 * Created by liujw on 2017/1/28.
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
    }
}

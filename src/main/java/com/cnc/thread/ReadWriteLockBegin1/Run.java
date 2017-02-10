package com.cnc.thread.ReadWriteLockBegin1;

/**
 * Created by liujw on 2017/2/10.
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }

}

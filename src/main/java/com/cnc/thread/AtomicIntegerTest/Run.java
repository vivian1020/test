package com.cnc.thread.AtomicIntegerTest;

/**
 * Created by liujw on 2017/1/28.
 * AtomicInteger原子类实现同步，原子操作是一个不可分割的整体，没有其他线程能够中断或检查原子操作的
 * 变量。一个原子类型就是一个原子操作可用的类型，它可以在没有锁的情况下做到线程安全。
 *
 */
public class Run {
    public static void main(String[] args) {
        AddCountThread countService = new AddCountThread();
        Thread t1 = new Thread(countService);
        t1.start();
        Thread t2 = new Thread(countService);
        t2.start();
        Thread t3 = new Thread(countService);
        t3.start();
        Thread t4 = new Thread(countService);
        t4.start();
        Thread t5 = new Thread(countService);
        t5.start();
    }
}

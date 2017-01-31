package com.cnc.thread.innerTest1;

/**
 * Created by liujw on 2017/1/28.
 */
public class Run {
    public static void main(String[] args) {
        OutClass.Inner inner = new OutClass.Inner();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method1();
            }
        },"A");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        },"B");
        t1.start();
        t2.start();
    }
}

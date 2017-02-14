package com.cnc.thread.stateTest3;

/**
 * Created by liujinwen on 2017/2/12.
 */
public class Run {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.setName("a");
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.setName("b");
        t2.start();
        System.out.println("main方法中的t2的状态："+t2.getState());
    }
}

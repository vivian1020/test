package com.cnc.thread.t8;

/**
 * Created by liujw on 2017/1/27.
 */
public class Run1 {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        System.out.println("begin= "+ System.currentTimeMillis());
        thread1.start();
        //thread1.run();
        System.out.println("end= " +System.currentTimeMillis());
    }
}

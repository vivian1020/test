package com.cnc.thread.t15;

/**
 * Created by liujw on 2017/1/27.
 */
public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        thread.interrupt();
        System.out.println("end!");
    }
}

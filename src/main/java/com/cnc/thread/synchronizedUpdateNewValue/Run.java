package com.cnc.thread.synchronizedUpdateNewValue;

/**
 * Created by liujw on 2017/1/28.
 */
public class Run {
    public static void main(String[] args) {
        //Service service = new Service();
        Service1 service1 = new Service1();
        ThreadA a = new ThreadA(service1);
        a.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadB b = new ThreadB(service1);
        b.start();
        System.out.println("已经发出停止的命令了");
    }
}

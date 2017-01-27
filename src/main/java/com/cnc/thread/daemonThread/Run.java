package com.cnc.thread.daemonThread;

/**
 * Created by liujw on 2017/1/27.
 */
public class Run {
    public static void main(String[] args) {
        try{
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("我离开thread对象也不再打印了");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

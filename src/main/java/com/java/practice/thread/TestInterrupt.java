package com.java.practice.thread;

import java.util.Date;

/**
 * Created by liujw on 2016/8/18.
 */
public class TestInterrupt {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();//子线程启动
        try{
            Thread.sleep(10000);//主线程执行10s后休眠
        }catch(InterruptedException e){};
        thread.interrupt();//抛出异常，子线程结束
    }
}

class MyThread extends Thread {
    public void run() {
        while(true) {
            System.out.println("==="+new Date()+"===");
            try{
                sleep(1000);
            }catch (InterruptedException e) {
                return;//进程结束，退出
            }
        }
    }
}

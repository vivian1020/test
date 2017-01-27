package com.cnc.thread.t14;

/**
 * Created by liujw on 2017/1/27.
 * sleep状态下停止线程
 */
public class Run {
    public static void main(String[] args) {
        try{
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(200);
            thread.interrupt();
        }catch(InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}

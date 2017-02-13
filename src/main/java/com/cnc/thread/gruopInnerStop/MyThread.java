package com.cnc.thread.gruopInnerStop;

/**
 * Created by liujw on 2017/2/13.
 */
public class MyThread extends Thread {
    public MyThread(ThreadGroup group, String name){
        super(group, name);
    }
    public void run(){
        System.out.println("ThreadName="+Thread.currentThread().getName()
        +"死循环");
        while(!this.isInterrupted()){

        }
        System.out.println("ThreadName=" + Thread.currentThread().getName()
        +"结束了");
    }
}


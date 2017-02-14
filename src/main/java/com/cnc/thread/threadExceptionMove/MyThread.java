package com.cnc.thread.threadExceptionMove;

/**
 * Created by liujw on 2017/2/13.
 */
public class MyThread extends Thread {
    private String num = "a";
    public MyThread() {
        super();
    }
    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }
    public void run(){
        int numInt = Integer.parseInt(num);
        System.out.println("在线程中打印："+(numInt+1));
    }
}

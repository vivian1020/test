package com.cnc.thread.atomicIntegerNoSafe;

/**
 * Created by liujw on 2017/1/28.
 */
public class MyThread extends Thread{
    private MyService myService;
    public MyThread(MyService myService){
        super();
        this.myService = myService;
    }
    @Override
    public void run(){
        myService.addNum();
    }
}

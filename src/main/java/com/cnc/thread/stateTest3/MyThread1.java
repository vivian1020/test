package com.cnc.thread.stateTest3;

/**
 * Created by liujinwen on 2017/2/12.
 */
public class MyThread1 extends Thread {
    public void run(){
        MyService.serviceMethod();
    }
}

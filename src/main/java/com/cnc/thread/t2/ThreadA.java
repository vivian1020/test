package com.cnc.thread.t2;

/**
 * Created by liujw on 2017/1/27.
 */
public class ThreadA extends Thread{
    private HasSelfPrivateNum numRef;
    public ThreadA(HasSelfPrivateNum numRef){
        super();
        this.numRef = numRef;
    }
    @Override
    public void run(){
        super.run();
        numRef.addI("a");
    }

}

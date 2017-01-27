package com.cnc.thread.t1;

/**
 * Created by liujw on 2017/1/27.
 */
public class ThreadB extends Thread{
    private HasSelfPrivateNum numRef;
    public ThreadB(HasSelfPrivateNum numRef){
        super();
        this.numRef = numRef;
    }
    @Override
    public void run(){
        super.run();
        numRef.addI("b");
    }
}

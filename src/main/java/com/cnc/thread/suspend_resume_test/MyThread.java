package com.cnc.thread.suspend_resume_test;

/**
 * Created by liujw on 2017/1/27.
 */
public class MyThread extends Thread {
    private long i = 0;
    public long getI(){
        return i;
    }
    public void setI(long i){
        this.i = i;
    }
    @Override
    public void run(){
        while(true){
            i++;
        }
    }
}

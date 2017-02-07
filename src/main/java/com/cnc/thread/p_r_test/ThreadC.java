package com.cnc.thread.p_r_test;

/**
 * Created by liujw on 2017/2/6.
 */
public class ThreadC extends Thread{
    private C r;
    public ThreadC(C r) {
        super();
        this.r = r;
    }
    @Override
    public void run() {
        while(true){
            r.getValue();
        }
    }

}

package com.cnc.thread.p_r_test;

/**
 * Created by liujw on 2017/2/6.
 */
public class ThreadP extends Thread{
    private P p;
    public ThreadP(P p) {
        super();
        this.p = p;
    }
    @Override
    public void run() {
        while(true) {
            p.setValue();
        }
    }
}

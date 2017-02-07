package com.cnc.thread.p_r_test;

/**
 * Created by liujw on 2017/2/6.
 */
public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C r = new C(lock);
        ThreadP[] pThread = new ThreadP[2];
        ThreadC[] rThread = new ThreadC[2];
        for(int i=0; i< 2; i++){
            pThread[i] = new ThreadP(p);
            pThread[i].setName("生产者" + (i+1));
            rThread[i] = new ThreadC(r);
            rThread[i].setName("消费者" + (i+1));
            pThread[i].start();
            rThread[i].start();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread[] threadArray = new Thread[Thread.currentThread()
                .getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);
        for(int i=0; i< threadArray.length; i++){
            System.out.println(threadArray[i].getName() + " "
            + threadArray[i].getState());
        }
    }
}

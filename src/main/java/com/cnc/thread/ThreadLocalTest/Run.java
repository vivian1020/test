package com.cnc.thread.ThreadLocalTest;

/**
 * Created by liujinwen on 2017/2/7.
 */
public class Run {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        a.start();
        b.start();
        for(int i=0;i<100;i++){
            Tools.t1.set("Main" +(i+1));
            System.out.println("Main get Value=" +
            Tools.t1.get());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.cnc.thread.ThreadLocalTest;

/**
 * Created by liujinwen on 2017/2/7.
 */
public class ThreadA extends Thread {
    public void run() {
        for(int i=0;i<100;i++){
            Tools.t1.set("ThreadA"+(i+1));
            System.out.println("ThreadA get value"
            + Tools.t1.get());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

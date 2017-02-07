package com.cnc.thread.joinTest;

/**
 * Created by liujinwen on 2017/2/7.
 */
public class MyThread extends Thread {
    public void run() {
        try {
            int sencondValue = (int) (Math.random() * 10000);
            System.out.println(sencondValue);
            Thread.sleep(sencondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

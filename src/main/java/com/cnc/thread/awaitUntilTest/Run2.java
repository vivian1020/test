package com.cnc.thread.awaitUntilTest;

/**
 * Created by liujinwen on 2017/2/9.
 */
public class Run2 {
    public static void main(String[] args) {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyThreadB myThreadB = new MyThreadB(service);
        myThreadB.start();
    }
}

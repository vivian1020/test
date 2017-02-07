package com.cnc.thread.joinTest;

import com.cnc.thread.atomicIntegerNoSafe.*;

/**
 * Created by liujinwen on 2017/2/7.
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join();
            System.out.println("我想当threadTest执行完毕以后我再执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

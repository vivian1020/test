package com.cnc.thread.singleton;

/**
 * Created by liujinwen on 2017/2/13.
 */
public class MyThread extends Thread {
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(MyObject.getConnection().hashCode());
        }
    }

}


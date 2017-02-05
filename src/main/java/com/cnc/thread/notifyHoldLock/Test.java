package com.cnc.thread.notifyHoldLock;

/**
 * Created by liujinwen on 2017/2/5.
 */
public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
        synNotifyMethodThread c = new synNotifyMethodThread(lock);
        c.start();
    }
}

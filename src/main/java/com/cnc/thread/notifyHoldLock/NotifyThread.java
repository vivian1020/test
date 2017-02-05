package com.cnc.thread.notifyHoldLock;

import com.java.practice.guava.ObjectTest;

/**
 * Created by liujinwen on 2017/2/5.
 */
public class NotifyThread extends Thread{
    private Object lock;
    public NotifyThread(Object lock) {
        super();
        this.lock = lock;
    }
    @Override
    public void run(){
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}

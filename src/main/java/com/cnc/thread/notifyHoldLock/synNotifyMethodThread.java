package com.cnc.thread.notifyHoldLock;

/**
 * Created by liujinwen on 2017/2/5.
 */
public class synNotifyMethodThread extends Thread{
    private Object lock;
    public synNotifyMethodThread(Object lock) {
        super();
        this.lock = lock;
    }
    @Override
    public void run(){
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}

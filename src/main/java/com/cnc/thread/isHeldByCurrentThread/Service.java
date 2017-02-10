package com.cnc.thread.isHeldByCurrentThread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by liujw on 2017/2/9.
 */
public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }
    public void serviceMethod() {
        try {
            System.out.println(lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println(lock.isHeldByCurrentThread());
        } finally {
            lock.unlock();
        }
    }
}

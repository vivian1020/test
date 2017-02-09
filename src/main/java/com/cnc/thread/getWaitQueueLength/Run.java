package com.cnc.thread.getWaitQueueLength;

/**
 * Created by liujw on 2017/2/9.
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread[] threadArray = new Thread[10];
        for(int i=0; i<10;i++) {
            threadArray[i] = new Thread(runnable);
        }
        for(int i=0; i<10;i++) {
            threadArray[i].start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        service.notifyMethod();
    }
}

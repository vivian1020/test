package com.cnc.thread.isHeldByCurrentThread;

/**
 * Created by liujw on 2017/2/9.
 * isHeldByCurrentThread的作用是查询当前线程是否保持此锁定
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}

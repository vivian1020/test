package com.cnc.thread.Fair_noFair_test;

/**
 * Created by liujinwen on 2017/2/8.
 * 公平锁，打印的顺序保持有序的状态
 * 非公平锁，运行结果是乱序的
 * 通过isFair来控制
 */
public class RunFaur {
    public static void main(String[] args) {
        final Service service = new Service(false);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("线程" + Thread.currentThread().getName()
                +"运行了");
                service.serviceMethod();
            }
        };
        Thread[] threadArray = new Thread[10];
        for(int i=0;i<10;i++){
            threadArray[i] = new Thread(runnable);
        }
        for(int i=0;i<10;i++){
            threadArray[i].start();
        }
    }
}

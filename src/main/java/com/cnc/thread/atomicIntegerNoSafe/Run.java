package com.cnc.thread.atomicIntegerNoSafe;

/**
 * Created by liujw on 2017/1/28.
 *
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThread[] array = new MyThread[5];
        for (int i=0;i<array.length;i++){
            array[i] = new MyThread(myService);
        }
        for (int i=0;i<array.length;i++){
            array[i].start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(myService.aiRef.get());
    }
}

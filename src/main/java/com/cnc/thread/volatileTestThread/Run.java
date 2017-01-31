package com.cnc.thread.volatileTestThread;

/**
 * Created by liujw on 2017/1/28.
 * 关键字volatile虽然增加了实例变量在多个线程之间的可见性，但是它却不具备
 * 同步性，那么就不具备原子性。
 */
public class Run {
    public static void main(String[] args) {
        MyThread[] mythreadArray = new MyThread[100];
        for(int i=0;i<100;i++){
            mythreadArray[i] = new MyThread();
        }
        for(int i=0;i<100;i++){
            mythreadArray[i].start();
        }
    }
}

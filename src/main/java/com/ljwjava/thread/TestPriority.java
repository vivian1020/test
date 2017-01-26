package com.ljwjava.thread;

/**
 * Created by liujw on 2016/8/18.
 * 测试线程对象优先级Priority的使用
 */
public class TestPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread(new T1());
        Thread t2 = new Thread(new T2());
        t1.setPriority(Thread.NORM_PRIORITY+3);//设置t1的优先权是普通的优先权加3
        t1.start();
        t2.start();
    }
}

class T1 implements Runnable {
    public void run() {
        for(int i=0; i<=100; i++) {
            System.out.println("T1: "+i);
        }
    }
}

class T2 implements Runnable {
    public void run() {
        for(int i=0; i<=100; i++) {
            System.out.println("----T2: "+i);
        }
    }
}
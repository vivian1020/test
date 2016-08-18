package com.thread;

/**
 * Created by liujw on 2016/8/18.
 * yield:让出CPU,给其他线程执行机会
 * 启动两个线程，每次计数到10的倍数时候让出CPU一次，线程切换
 */
public class TestYield {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3("t1");
        MyThread3 t2 = new MyThread3("t2");
        t1.start();
        t2.start();
    }
}

class MyThread3 extends Thread {
    MyThread3(String s) {
        super(s);
    };

    public void run() {
        for(int i=0; i<=100 ;i++) {
            System.out.println(getName()+": "+i);
            if(i%10 == 0) {
                yield();
            }
        }
    }
}

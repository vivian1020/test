package com.thread;

/**
 * Created by liujw on 2016/8/18.
 * 定义一个Runner类直接从线程类继承，定义该类的对象，并调用线程的start()方法
 */
public class TestThread2 {
    public static void main(String[] args) {
        Runner2 r = new Runner2();
        r.start();
        for(int i=0; i<100; i++) {
            System.out.println("Main Thread :" + i);
        }
    }
}

class Runner2 extends Thread {
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("Runner1 :" + i);
        }
    }
}
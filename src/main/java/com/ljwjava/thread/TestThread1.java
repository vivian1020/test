package com.ljwjava.thread;

/**
 * Created by liujw on 2016/8/18.
 * 定义一个类实现Runnable接口
 */
public class TestThread1 {
    public static void main(String[] args) {
        Runner1 r = new Runner1();
        //r.run();
        Thread t = new Thread(r);
        t.start();

        for(int i=0; i<100; i++) {
            System.out.println("Main Thread:------" + i);
        }
    }
}

class Runner1 implements Runnable {
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("Runner1:" + i);
        }
    }
}

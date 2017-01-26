package com.ljwjava.thread;

/**
 * Created by liujw on 2016/8/18.
 */
public class TestSync implements Runnable{
    Timer timer = new Timer();
    public static void main(String[] args) {
        TestSync test = new TestSync();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
    public void run() {//重写run方法
        timer.add(Thread.currentThread().getName());//取得当前线程对象的名字
    }
}

class Timer {
    private static int num = 0;
    public void add(String name) {
        synchronized (this) {//程序执行过程中锁定当前对象
            num++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }
            System.out.println(name + ",你是第" + num + "个使用timer的线程");
        }
    }
}

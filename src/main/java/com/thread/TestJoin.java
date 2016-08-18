package com.thread;

/**
 * Created by liujw on 2016/8/18.
 */
public class TestJoin {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("abcde");
        t1.start();
        //合并线程到主线程中，等子线程执行完了开始执行主线程
        try{
            t1.join();
        }catch (InterruptedException e){}

        for(int i=0; i<=10; i++) {
            System.out.println("i am main thread");
        }
    }
}
class MyThread2 extends Thread {
    MyThread2(String s) {
        super(s); //调用父类的构造方法
    }

    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("i am " + getName());
            try{
                sleep(1000);
            }catch(InterruptedException e) {
                return;
            }
        }
    }
}
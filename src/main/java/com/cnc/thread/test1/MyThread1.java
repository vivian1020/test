package com.cnc.thread.test1;

/**
 * Created by liujinwen on 2017/2/5.
 * 方法wait()的作用是使当前执行代码的线程进行等待，将当前线程置入预执行队列中，并且在wait所在的代码出
 * 停止执行，直到接到通知或被中断为止。
 */
public class MyThread1 extends Thread{
    private Object lock;
    public MyThread1(Object lock){
        super();
        this.lock = lock;
    }
    @Override
    public void run(){
        try{
            synchronized (lock){
                System.out.println("开始 wait time=" + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束 wait time=" + System.currentTimeMillis());
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

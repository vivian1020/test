package com.cnc.thread.wait_notify_size5;

/**
 * Created by liujinwen on 2017/2/5.
 * 日志信息wait end在最后输出，这也说明了notify()方法执行后并不立即释放锁。
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(50);
            ThreadB b = new ThreadB(lock);
            b.start();

        } catch (InterruptedException e) {

        }
    }
}

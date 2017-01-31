package com.cnc.thread.atomicIntegerNoSafe;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by liujw on 2017/1/28.
 * addAndGet方法是原子的，但是方法和方法之间的调用却不是原子的，解决这个问题必须要同步。
 * 因此addNum方法的前面要加上synchronized
 */
public class MyService {
    public static AtomicLong aiRef = new AtomicLong();
    synchronized public void addNum(){
        System.out.println(Thread.currentThread().getName()+
        "加了100之后的值是:"+aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}

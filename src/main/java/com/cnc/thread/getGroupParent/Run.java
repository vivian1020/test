package com.cnc.thread.getGroupParent;

/**
 * Created by liujw on 2017/2/13.
 */
public class Run {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+ " " +
        Thread.currentThread().getThreadGroup().activeCount());
        ThreadGroup newGroup = new ThreadGroup(Thread.currentThread().getThreadGroup(),
                "newGroup");
        System.out.println(Thread.currentThread().getThreadGroup().activeCount());


    }
}

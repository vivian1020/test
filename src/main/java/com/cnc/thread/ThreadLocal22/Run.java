package com.cnc.thread.ThreadLocal22;

/**
 * Created by liujinwen on 2017/2/7.
 */
public class Run {
    public static ThreadLocalExt t1 = new ThreadLocalExt();

    public static void main(String[] args) {
        if(t1.get() == null) {
            System.out.println("从未放过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}

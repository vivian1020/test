package com.java.practice.jvm;

/**
 * Created by liujw on 2016/9/20.
 * 引用计数算法的缺陷：当对象之间循环引用时，导致它们的引用计数都不为0，
 * 引用计数算法无法停止GC收集器回收它们。
 */
public class ReferenceCountingGC {
    public Object instance = null;
    private static final int _1MB = 1024 * 1024;
    private byte[] bigSize = new byte[2* _1MB];

    public static void main(String[] args) {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        System.gc();
    }
}

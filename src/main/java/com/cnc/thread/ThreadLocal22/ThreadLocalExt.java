package com.cnc.thread.ThreadLocal22;

import com.java.practice.guava.ObjectTest;

/**
 * Created by liujinwen on 2017/2/7.
 */
public class ThreadLocalExt extends ThreadLocal {
    protected Object initialValue() {
        return "我是默认值";
    }
}

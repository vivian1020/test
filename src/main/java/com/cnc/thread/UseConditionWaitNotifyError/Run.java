package com.cnc.thread.UseConditionWaitNotifyError;

/**
 * Created by liujinwen on 2017/2/8.
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}

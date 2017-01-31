package com.cnc.thread.t10;

/**
 * Created by liujw on 2017/1/28.
 * 程序运行起来一直停不下来，因为main线程一直在吃力while循环，导致程序不能继续执行后面的代码
 * 这就需要使用多线程技术
 */
public class Run {
    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        new Thread(printStringService).start();
        System.out.println("我要停止它 stopThread="
        +Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}

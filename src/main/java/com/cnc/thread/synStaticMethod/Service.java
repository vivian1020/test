package com.cnc.thread.synStaticMethod;

/**
 * Created by liujw on 2017/1/28.
 */
public class Service {
    synchronized public static void printA(){
        try{
            System.out.println(Thread.currentThread().getName()
            +"在"+System.currentTimeMillis()+"进入printA");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()
            +"在"+System.currentTimeMillis()+"离开printA");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    synchronized public static void printB(){
        System.out.println(Thread.currentThread().getName()
                +"在"+System.currentTimeMillis()+"进入printB");
        System.out.println(Thread.currentThread().getName()
                +"在"+System.currentTimeMillis()+"离开printB");
    }
}

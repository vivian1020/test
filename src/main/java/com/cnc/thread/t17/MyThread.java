package com.cnc.thread.t17;

/**
 * Created by liujw on 2017/1/27.
 * yield()方法的作用是放弃当前的CPU资源，将它让给其他的任务去占用CPU执行时间。
 * 但是放弃的时间是不确定的，有可能刚刚放弃，马上又获得CPU时间片。
 */
public class MyThread extends Thread{
    @Override
    public void run(){
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for(int i=0;i<50000000;i++){
            //Thread.yield();
            count += i+1;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时： "+(endTime-beginTime)+"毫秒! ");
    }
}

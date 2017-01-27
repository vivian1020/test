package com.cnc.thread.t15;

/**
 * Created by liujw on 2017/1/27.
 */
public class MyThread extends Thread{
    @Override
    public void run(){
        super.run();
        for(int i=0;i<10000;i++){
            System.out.println("i="+(i+1));
        }
        System.out.println("run begin");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("先停止，再遇到sleep!进入catch!");
            e.printStackTrace();
        }
        System.out.println("run end");

    }
}

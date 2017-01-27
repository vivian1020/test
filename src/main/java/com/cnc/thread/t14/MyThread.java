package com.cnc.thread.t14;

/**
 * Created by liujw on 2017/1/27.
 */

 public class MyThread extends Thread{
     @Override
    public void run(){
         super.run();
         System.out.println("run begin");
         try {
             Thread.sleep(200000);
         } catch (InterruptedException e) {
             System.out.println(this.isInterrupted());
             e.printStackTrace();
         }
     }
}



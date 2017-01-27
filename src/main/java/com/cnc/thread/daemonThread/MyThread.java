package com.cnc.thread.daemonThread;

/**
 * Created by liujw on 2017/1/27.
 * Java线程中有两种线程，一种是用户线程，一种是守护线程。守护线程是一种特殊的线程，当进程中不存在
 * 非守护线程时，则守护线程自动销毁。守护线程的作用是为其他线程提供便利服务。
 */
public class MyThread extends Thread{
    private int i = 0;
    @Override
    public void run(){
        try{
            while(true){
                i++;
                System.out.println("i="+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

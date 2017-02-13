package com.cnc.thread.gruopInnerStop;

/**
 * Created by liujw on 2017/2/13.
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadGroup group = new ThreadGroup("我的线程组");
            for(int i=0;i<5;i++){
                MyThread thread = new MyThread(group, "线程"+(i+1));
                thread.start();
            }
            Thread.sleep(5000);
            group.interrupt();
            System.out.println("调用了interrupt()方法");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

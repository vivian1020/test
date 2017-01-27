package com.java.practice.bjsxt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created by liujw on 2017/1/22.
 */
   class Task implements Runnable{
        int taskid;
        public Task(int taskid){
            this.taskid = taskid;
        }
        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName() + "--taskId "+taskid);
        }
    }

    class DaemonThreadFactory implements ThreadFactory{

        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r);
            t.setDaemon(true);
            return t;
        }
    }

public class ThreadFactoryTest{
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(3, new DaemonThreadFactory());
        for(int i=0; i < 3;i++){
            exec.submit(new Task(i));
        }
        exec.shutdown();
    }
}


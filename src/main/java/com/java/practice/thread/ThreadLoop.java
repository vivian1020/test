package com.java.practice.thread;

/**
 * Created by liujw on 2016/8/28.
 * 子线程循环 10 次，接着主线程循环 100，接着又回到子线程循环 10 次，
 接着再回到主线程又循环 100，如此循环 50 次
 */
public class ThreadLoop {
    public static void main(String[] args) {
        new ThreadLoop().init();
    }
    public void init() {
        final Business business = new Business();
        new Thread(new Runnable(){
            public void run() {
                for(int i=0; i< 50; i++) {
                    business.SubThread(i);
                }
            }
        }).start();

        for(int i=0; i<50; i++){
            business.MainThread(i);
        }
    }

    private class Business {
        boolean bShouldSub = true;
        public synchronized void MainThread(int i) {
            if(bShouldSub) {
                try {
                    this.wait();
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }

                for(int j=0;j<5;j++) {
                    System.out.println(Thread.currentThread().getName()+":i="+i+",j="+j);
                }
                bShouldSub = true;
                this.notify();
            }
        }

        public synchronized void SubThread(int i) {
            if(!bShouldSub) {
                try {
                    this.wait();
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for(int j=0;j<10;j++){
                    System.out.println(Thread.currentThread().getName()+":i="+i+",j="+j);
                }
                bShouldSub = false;
                this.notify();
            }
        }
    }
}

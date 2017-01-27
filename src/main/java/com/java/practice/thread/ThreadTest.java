package com.java.practice.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by liujw on 2016/8/28.
 */
public class ThreadTest {
    private int j;
    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        ThreadTest tt = new ThreadTest();
        for(int i=0; i<2; i++) {
            new Thread(tt.new Addr()).start();
            new Thread(tt.new Subtractor()).start();
        }
    }
    private class Subtractor implements Runnable {
        public void run() {
            while(true) {
                lock.lock();
                try {
                    System.out.println("j--="+j--);
                }finally {
                    lock.unlock();
                }
            }
        }
    }

    private class Addr implements Runnable {
        public void run() {
            while(true) {
                lock.lock();
                try {
                    System.out.println("j++="+j++);
                }finally {
                    lock.unlock();
                }
            }
        }
    }
}

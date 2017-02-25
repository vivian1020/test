package com.cnc.thread.t8;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * Created by liujinwen on 2017/2/18.
 */
public class Interrupted {
    public static void main(String[] args) {
        Thread sleepThread = new Thread(new SleepRunner(), "SleepThread");
        sleepThread.setDaemon(true);
        Thread busyThread = new Thread(new BusyRunner(), "BusyThread");
        busyThread.setDaemon(true);
        sleepThread.start();
        busyThread.start();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sleepThread.interrupt();
        busyThread.interrupt();
        System.out.println(sleepThread.isInterrupted());
        System.out.println(busyThread.isInterrupted());
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    static class SleepRunner implements Runnable {
        @Override
        public void run() {
            while(true){
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class BusyRunner implements Runnable {
        public void run(){
            while(true) {

            }
        }
    }
}

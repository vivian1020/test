package com.cnc.thread.timerTest1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by liujinwen on 2017/2/11.
 * TimerTask类中的cancel()方法的作用是将自身从任务队列中清除
 */
public class Run2 {
    static public class MyTaskA extends TimerTask {

        @Override
        public void run() {
            System.out.println("A运行了！时间为：" + new Date());
            this.cancel();
        }
    }

    static public class MyTaskB extends TimerTask {

        @Override
        public void run() {
            System.out.println("B运行的时间为：" + new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTaskA taskA = new MyTaskA();
            MyTaskB taskB = new MyTaskB();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dataString = "2014-10-12 09:12:00";
            Timer timer = new Timer();
            Date dateRef = sdf.parse(dataString);
            System.out.println("字符串时间"+dateRef+" 当前时间："
            + new Date());
            timer.schedule(taskA, dateRef, 4000);
            timer.schedule(taskB, dateRef, 4000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }










}

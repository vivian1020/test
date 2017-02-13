package com.cnc.thread.formatOK1;

import com.cnc.thread.formatError.MyThread;

import java.text.SimpleDateFormat;

/**
 * Created by liujw on 2017/2/13.
 */
public class Test {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] dateStringArray = new String[] {"2000-01-01","2000-01-02","2000-01-03"
                ,"2000-01-04","2000-01-05","2000-01-06"};
        com.cnc.thread.formatError.MyThread[] threadArray = new com.cnc.thread.formatError.MyThread[6];
        for(int i=0;i<6;i++) {
            threadArray[i] = new MyThread(sdf, dateStringArray[i]);
        }
        for(int i=0;i<6;i++) {
            threadArray[i].start();
        }
    }
}

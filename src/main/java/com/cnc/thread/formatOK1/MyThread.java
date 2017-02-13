package com.cnc.thread.formatOK1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by liujw on 2017/2/13.
 */
public class MyThread extends Thread {
    private SimpleDateFormat sdf;
    private String dateString;
    public MyThread(SimpleDateFormat sdf, String dateString) {
        super();
        this.sdf = sdf;
        this.dateString = dateString;
    }

    public void run() {
        try {
            Date dateRef = DateTools.parse("yyyy-MM-dd", dateString);
            String newDateString = DateTools.format("yyyy-MM-dd", dateRef)
                    .toString();
            if(!newDateString.equals(dateString)) {
                System.out.println(this.getName() + " " + dateString + " " + newDateString);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

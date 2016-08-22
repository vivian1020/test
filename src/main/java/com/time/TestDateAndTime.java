package com.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by liujw on 2016/8/22.
 */
public class TestDateAndTime {
    public static void main(String[] args) {
        long times = System.currentTimeMillis();
        System.out.println(times);
        Date d = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(d);

        System.out.println(c.get(c.YEAR));
        System.out.println(c.get(c.MONTH));

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd H:m:s");
        SimpleDateFormat format1 = new SimpleDateFormat("yy-MM-dd H:m:s");
        SimpleDateFormat format2 = new SimpleDateFormat("y-M-d H:m:s");

        System.out.println(format.format(c.getTime()));
        System.out.println(format1.format(c.getTime()));
        System.out.println(format2.format(c.getTime()));
    }

}

package com.java.practice.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by liujw on 2016/8/22.
 */
public class TestDateAndTime {
    public static void main(String[] args) {
        /*long times = System.currentTimeMillis();
        System.out.println(times);
        Date d = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(d);

        System.out.println(c.get(c.YEAR));
        System.out.println(c.get(c.MONTH));

        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd H:m:s");
        SimpleDateFormat format1 = new SimpleDateFormat("yy-MM-dd H:m:s");
        SimpleDateFormat format2 = new SimpleDateFormat("y-M-d H:m:s");

        System.out.println(format.format(c.getTime()));
        System.out.println(format1.format(c.getTime()));
        System.out.println(format2.format(c.getTime()));*/

        //test Date
        String dstr = "2007-03-01";
        String dstr1 = "2007-02-27";
        long sub = 1290876532190L;
        Date d = null;
        Date d1 = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            sdf.setLenient(false);
            d = sdf.parse(dstr);
            d1 = sdf.parse(dstr1);
            if(d.getTime() > d1.getTime()) {
                throw new NullPointerException("startDate is later than endDate");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(dstr);
        System.out.println(d.getTime());
        System.out.println(d1.getTime());
        System.out.println(d.getTime()-d1.getTime());

        /*
        //test Calendar
        Calendar c = Calendar.getInstance();
        c.set(2016,9,1);
        Calendar c1 = Calendar.getInstance();
        c1.set(2016,8,1);
        long t1 = c.getTimeInMillis();
        long t2 = c1.getTimeInMillis();
        long days = (t1 - t2)/(24 * 60 * 60 * 1000);
        System.out.println(days);*/

    }
}

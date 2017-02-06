package com.java.practice.bjsxt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by liujw on 2017/2/6.
 */
public class UTCTest {
    public static void main(String[] args) {
        String date = "2015-12-7T16:00:00.000Z";
        date = date.replace("Z", " UTC");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
        Date d = null;
        try {
            d = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(d);
    }
}

package com.ljwjava.example;

/**
 * Created by liujw on 2016/8/15.
 * 动态初始化
 */
class Date {
    int year, month, day;
    Date(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }
}

public class TestArray {
    public static void main(String[] args) {
         int a[];
        a = new int[3];
        a[0] = 3; a[1] = 0; a[2] = 4;
        Date days[];
        days = new Date[3];
        days[0] = new Date(1, 4, 2004);
        days[1] = new Date(2, 4, 2004);
        days[2] = new Date(3, 4, 2004);

        /*int a[] = {3, 9, 8};
        com.ljwjava.example.Date days[] = {
                new com.ljwjava.example.Date(1, 4, 2004),
                new com.ljwjava.example.Date(2, 4, 2004),
                new com.ljwjava.example.Date(3, 4, 2004)
        };*/

    }
}

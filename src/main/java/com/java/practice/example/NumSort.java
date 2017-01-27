package com.java.practice.example;

/**
 * Created by liujw on 2016/8/15.
 * 将输入的参数转化为int型元素
 */
public class NumSort {
    public static void main(String[] args) {
       Date1[] days = new Date1[5];
        days[0] = new Date1(2006, 7, 8);
        days[1] = new Date1(2006, 6, 4);
        days[2] = new Date1(2008, 5, 4);
        days[3] = new Date1(2004, 5, 9);
        days[4] = new Date1(2004, 5, 4);

        bubbleSort(days);

        for(int i=0; i<days.length; i++) {
            System.out.println(days[i]);
        }
    }
    public static Date1[] bubbleSort(Date1[] a) {
        int len = a.length;
        for(int i=len-1; i>=1; i--){
            for(int j=0; j<=i-1; j++){
                if(a[j].compare(a[j+1]) > 0) {
                    Date1 temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
}

class Date1{
    int year, month, day;
    Date1(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }
    public int compare(Date1 date) {
        return year > date.year ? 1
                :year < date.year ? -1
                : month > date.month ? 1
                : month < date.month ? -1
                : day > date.day ? 1
                : day < date.day ? -1 : 0;
    }
    public String toString() {
        return "Year:Month:Day --" + year + "-" + "month" + "-" + day;
    }
}
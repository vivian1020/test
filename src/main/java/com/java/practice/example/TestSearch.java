package com.java.practice.example;

/**
 * Created by liujw on 2016/8/15.
 */
public class TestSearch {
    public static void main(String[] args) {
        int a[] = {1, 3, 6, 8, 9, 10, 12, 18, 20, 34};
        int i = 12;
        System.out.println(binarySearch(a, i));
    }
    public static int binarySearch(int[] a, int num) {
        if(a.length == 0) return -1;

        int startPos = 0;
        int endPos = a.length -1;
        int m = (startPos + endPos) / 2;
        while(startPos <= endPos) {
            if(num == a[m]) return m;
            if(num > a[m]){
                startPos = m + 1;
            }
            if(num < a[m]){
                endPos = m - 1;
            }
            m = (startPos + endPos) / 2;
        }
        return -1;
    }
}

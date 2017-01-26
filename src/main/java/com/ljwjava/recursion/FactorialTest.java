package com.ljwjava.recursion;

import java.util.Scanner;

/**
 * Created by liujw on 2016/8/30.
 * 求一个数的阶乘
 */
public class FactorialTest {
    public static void main(String[] args) {
        System.out.println("输入一个整数");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int result = digui(x);
        System.out.println(result);
    }

    private static int digui(int x) {
        if(x <= 0) {
            return 1;
        }else {
            return x*digui(x-1);
        }
    }
}

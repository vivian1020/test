package com.ljwjava.commonClass;

import java.util.StringTokenizer;

/**
 * Created by liujw on 2016/9/27.
 */
public class TestTokenizer {
    public static void main(String[] args) {
        String s = new String("The java paltform is the ideal");
        StringTokenizer st = new StringTokenizer(s);
        System.out.println("Token  Total:" +st.countTokens());
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}

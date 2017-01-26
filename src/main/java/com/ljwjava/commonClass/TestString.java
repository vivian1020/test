package com.ljwjava.commonClass;

/**
 * Created by liujw on 2016/8/16.
 * 1、编写一个程序，输出一个字符串中的大写英文字母数，小写英文字母数以及非英文字母数。
 * 2、编写一个方法，输出在一个字符串中，指定字符串出现的次数。
 */
public class TestString {
    public static void main(String[] args) {
        /*String s1 = "hello world";
        String s2 = "world";
        String s3 = "hello world";
        System.out.println(s1 == s3);

        s1 = new String("hello");
        s2 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        char c[] = {'s','u','n','j','a','v','a'};
        String s4 = new String(c);
        String s5 = new String(c, 4, 2);
        System.out.println(s4);
        System.out.println(s5);

        int j = 1234567;
        String sNumber = String.valueOf(j);
        System.out.println("j 是"+sNumber.length()+"位数");
        String s = "Mary,F,1976";
        String[] sPlit = s.split(",");
        for(int i=0; i<sPlit.length; i++) {
            System.out.println(sPlit[i]);
        }*/
        String s = "AaaaaABBBBcc&99adfsadfvfvweCCadOO990ad76zz_haHa";
        String str = "99";
        int upperCharNum = 0; //大写字母出现的次数
        int lowerCharNum = 0; //小写字母出现的次数
        int otherCharNum = 0; //其他字符出现的次数
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                lowerCharNum++;
            }
            else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                upperCharNum++;
            }
            else {
                otherCharNum++;
            }
        }
        int count = 0;//记录指定字符串出现的次数
        int index = 0;
        while(s.indexOf(str, index) != -1) {
            count++;
            index = s.indexOf(str, index) + str.length();
        }
        System.out.println(count);

        System.out.println(lowerCharNum);
        System.out.println(lowerCharNum + " " + upperCharNum + " " + otherCharNum );


    }
}

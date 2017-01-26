package com.ljwjava.practice;

import java.io.UnsupportedEncodingException;

/**
 * Created by liujw on 2016/9/2.
 * 有一个字符串，其中包含中文字符、英文字符和数字字符，请统计和打印出各个字符的个数。
 */
public class TestCharacter {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "我爱Java2109";
        int znNum = 0;
        int enNum = 0;
        int num = 0;
        char c;
        for(int i = 0; i<s.length(); i++){
            c = s.charAt(i);
            if(String.valueOf(c).getBytes("GBK").length > 1){
                znNum++;
            }else if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                enNum++;
            }else{
                num++;
            }
        }
        System.out.println(znNum );
        System.out.println(enNum);
        System.out.println(num);
    }
}

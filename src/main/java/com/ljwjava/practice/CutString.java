package com.ljwjava.practice;

import java.io.UnsupportedEncodingException;

/**
 * Created by liujw on 2016/9/2.
 3、编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串，但要保证汉字不被截取半个，
 如“我 ABC”， 4，应该截取“我 AB”，
 输入“我 ABC 汉 DEF”， 6，应该输出“我 ABC”，而不是“我 ABC+汉的半个”。
 */
public class CutString {
    /**
     * 判断是否是一个中文汉字
     */
    public static boolean isChineseChar(char c) throws UnsupportedEncodingException {
        return String.valueOf(c).getBytes("GBK").length > 1;
    }

    public static String substring(String orignal, int count) throws UnsupportedEncodingException {
        // 原始字符不为null，也不是空字符串
        if (orignal != null && !"".equals(orignal)) {
            // 将原始字符串转换为GBK编码格式
            orignal = new String(orignal.getBytes(), "GBK");
            // 要截取的字节数大于0，且小于原始字符串的字节数
            if (count > 0 && count < orignal.getBytes("GBK").length) {
                StringBuffer buff = new StringBuffer();
                char c;
                for (int i = 0; i < count; i++) {
                    c = orignal.charAt(i);
                    buff.append(c);
                    if (CutString.isChineseChar(c)) {
                        // 遇到中文汉字，截取字节总数减1
                        --count;
                    }
                }
                return buff.toString();
            }
        }
        return orignal;

    }

    public static void main (String[]args){// 原始字符串
        String s = "我ZWR爱JAVA";
        System.out.println("原始字符串：" + s);
        try {
            System.out.println("截取前1位：" + CutString.substring(s, 1));
            System.out.println("截取前2位：" + CutString.substring(s, 2));
            System.out.println("截取前4位：" + CutString.substring(s, 4));
            System.out.println("截取前6位：" + CutString.substring(s, 6));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}


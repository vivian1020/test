package com.ljwjava.practice;

import java.io.UnsupportedEncodingException;

/**
 * Created by liujw on 2016/9/2.
 * 实验在常见编码格式下，一个英文字母和一个中文汉字分别占用多少字节
 */
public class EncodeTest {

    public static void printByteLength(String s, String encodingName) {
        System.out.print("字节数：");
        try {
            System.out.print(s.getBytes(encodingName).length);
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        System.out.println(";编码："+encodingName);
    }

    public static void main(String[] args) {
        String en = "A";
        String ch  = "人";

        System.out.println("英文字母：" + en);
        EncodeTest.printByteLength(en, "GB2312");
        EncodeTest.printByteLength(en, "GBK");
        EncodeTest.printByteLength(en, "GB18030");
        EncodeTest.printByteLength(en, "ISO-8859-1");
        EncodeTest.printByteLength(en, "UTF8");
        EncodeTest.printByteLength(en, "UTF-16");
        EncodeTest.printByteLength(en, "UTF-16BE");
        EncodeTest.printByteLength(en, "UTF-16LE");

        System.out.println();

        // 计算一个中文汉字在各种编码下的字节数
        System.out.println("中文汉字：" + ch);
        EncodeTest.printByteLength(ch, "GB2312");
        EncodeTest.printByteLength(ch, "GBK");
        EncodeTest.printByteLength(ch, "GB18030");
        EncodeTest.printByteLength(ch, "ISO-8859-1");
        EncodeTest.printByteLength(ch, "UTF-8");
        EncodeTest.printByteLength(ch, "UTF-16");
        EncodeTest.printByteLength(ch, "UTF-16BE");
        EncodeTest.printByteLength(ch, "UTF-16LE");
    }
}

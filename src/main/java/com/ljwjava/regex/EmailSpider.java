package com.ljwjava.regex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by liujw on 2016/8/30.
 * 实现将一个html网页中的email地址找出来
 */
public class EmailSpider {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\test.html"));
        String line = "";
        try {
            while((line = br.readLine()) != null) {
                Pattern p = Pattern.compile("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+");
                Matcher m = p.matcher(line);
                while(m.find()){
                    System.out.println(m.group());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

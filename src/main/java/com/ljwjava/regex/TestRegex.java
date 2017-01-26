package com.ljwjava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by liujw on 2016/8/29.
 * 常用的正则表达式使用方法
 * 范围，替换，查找，空白符，group
 */
public class TestRegex {
    public static void main(String[] args) {
       /* p("abc".matches("..."));
        p("a8729a".replaceAll("\\d", "-"));
        Pattern p = Pattern.compile("[a-z]{3}");
        Matcher m = p.matcher("fgh");
        p(m.matches());
        p("gfha".matches("[a-z]{3}"));

        //认识. * + ?
        p("a".matches("."));
        p("aa".matches("aa"));
        p("aaaa".matches("a*")); /*//*表示0或多个
        p("aaaa".matches("a+")); //+表示1或多个
        p("".matches("a*"));
        p("aaaa".matches("a?")); //？表示0或1个
        p("".matches("a?"));
        p("a".matches("a?"));
        p("289834245134567".matches("\\d{3,100}")); //数字个数在3-100之间
        p("192.168.0.aaa".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
        p("192".matches("[0-2][0-9][0-9]"));//每个中括号中的数字范围表示每位数字的范围*//*


        //中括号,范围
        p("a".matches("[abc]"));//匹配abc中的一个  true
        p("a".matches("[^abc]"));//取除了abc之外的字符，取反 false
        p("A".matches("[a-zA-Z]"));//小写的a-z或者大写的A-Z true
        p("A".matches("[a-z]|[A-Z]"));//同上，“|”表示或者 true
        p("A".matches("[a-z[A-Z]]"));//同上 true
        p("R".matches("[A-Z&&[RFG]]"));//匹配A-Z中的，并且是RFG三者之一的 true

        //认识\s \w \d \
        p(" \n\r\t".matches("\\s{4}")); //true
        p(" ".matches("\\S"));
        p("a_8".matches("\\w{3}")); //匹配3个单词字符，下划线是其中之一
        p("abc888&^%".matches("[a-z]{1,3}\\d+[&^#%]+"));
        p("\\".matches("\\\\")); //正则表达式中匹配一个反斜线需要用两个反斜线

        //POSIX
        p("a".matches("\\p{Lower}"));

        //boundary
        p("hello sir".matches("^h.*"));
        p("hello sir".matches(".*ir$"));
        p("hello sir".matches("^h[a-z]{1,3}o\\b.*]")); //\b 表示单词边界，如换行和空格等
        p("hellosir".matches("^h[a-z]{1,3}o\\b.*]"));

        //whilte lines
        p(" \n".matches("[\\s&&[^\\n]]*\\n$")); //开头是一个空白符，但是不是一个换行符，并且出现0到多次，以换行符结尾

        //matches find lookingAt
        Pattern p = Pattern.compile("\\d{3,5}");
        String s = "123-34345-00";
        Matcher m = p.matcher(s);
        p(m.matches());
        m.reset();
        p(m.find());
        p(m.start() + "-" +m.end());
        p(m.find());
        p(m.start() + "-" +m.end());
        p(m.find());
       // p(m.start() + "-" +m.end());
        p(m.find());

        p(m.lookingAt());
        p(m.lookingAt());
        p(m.lookingAt());
        p(m.lookingAt());

        //replacement 替换
        Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("java Java JAVa Ilovejava adsdfd");
        StringBuffer buf = new StringBuffer();
        int i = 0;
        while(m.find()) {
            i++;
            if(i%2 == 0) {
                m.appendReplacement(buf, "java");
            } else {
                m.appendReplacement(buf, "JAVA");
            }
        }
        m.appendTail(buf);
        p(buf);

        //group 把找到的字串按照匹配规则分组
        Pattern p = Pattern.compile("(\\d{3,5})([a-z]{2})");
        String s = "123aa-34345bb-234cc-00";
        Matcher m = p.matcher(s);
        while(m.find()) {
            p(m.group(1));
        }

        //qulifiers
        Pattern p = Pattern.compile("(.{3,10}?)[0-9]");
        String s = "aaaa5bbbb6";
        Matcher m = p.matcher(s);
        if(m.find())
            p(m.start()+"-"+m.end());
        else
            p("not match!");


        //non-capturing groups
        //Pattern  p = Pattern.compile(".{3}(?=a)"); //匹配以a结尾的前面3个字符
        Pattern p = Pattern.compile("(?=a).{3}"); //匹配以a开头的3个字符，包括a
        String s = "444a66b";
        Matcher m = p.matcher(s);
        while(m.find()) {
            p(m.group());
        }*/

        String s = "2016-12-18";
        Pattern p = Pattern.compile("\\d{4}-[01]\\d-[0-3]\\d");
        Matcher m = p.matcher(s);
        p(m.matches());

    }
    public static void p(Object o){
        System.out.println(o);
    }
}

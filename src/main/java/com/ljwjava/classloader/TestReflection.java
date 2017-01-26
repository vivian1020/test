package com.ljwjava.classloader;

import java.lang.reflect.Method;

/**
 * Created by liujw on 2016/8/23.
 */
public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String str = "T";
        Class c = Class.forName(str);
        c.newInstance();//加载类
        Method[] methods = c.getMethods();//查看类中的方法，返回methods的数组
        for(Method m : methods) {
           System.out.println(m.getName());
        }
    }
}

class T {
    //public T() {
     //   System.out.println("T constructed!");
    //}

    int i;
    String s;

    public void m1(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }
}

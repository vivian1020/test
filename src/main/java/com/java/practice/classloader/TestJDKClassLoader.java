package com.java.practice.classloader;

/**
 * Created by liujw on 2016/8/23.
 */
public class TestJDKClassLoader {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println(com.sun.crypto.provider.DESedeKeyFactory.class.getClassLoader().getClass().getName());
        System.out.println(TestJDKClassLoader.class.getClassLoader().getClass().getName());
        System.out.println(ClassLoader.getSystemClassLoader());

        ClassLoader c = TestJDKClassLoader.class.getClassLoader();
        while (c != null) {
            System.out.println(c.getClass().getName());
            c = c.getParent();
        }
    }
}

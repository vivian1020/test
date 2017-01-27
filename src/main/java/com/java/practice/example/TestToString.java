package com.java.practice.example;

/**
 * Created by liujw on 2016/8/12.
 */
public class TestToString {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println("d:" + d);
    }
}

class Dog {
    public String toString() {
        return "Hello World!";
    }
}

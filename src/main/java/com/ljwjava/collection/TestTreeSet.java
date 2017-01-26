package com.ljwjava.collection;

import java.util.TreeSet;

/**
 * Created by liujw on 2016/8/29.
 */

class Parent implements Comparable {
    private int age = 0;
    public Parent(int age) {
        this.age = age;
    }
    public int compareTo(Object o) {
        System.out.println("method of parent");
        Parent o1 = (Parent)o;
        return age>o1.age?1:age<o1.age?-1:0;
    }
}
 class Child1 extends Parent {
    public Child1(){
        super(3);
    }
    public int compareTo(Object o){
        System.out.println("method of child");
        Child1 o1 = (Child1)o;
        return 1;
    }
}
public class TestTreeSet{
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(new Parent(3));
        set.add(new Child1());
        set.add(new Parent(4));
        System.out.println(set.size());
    }
}

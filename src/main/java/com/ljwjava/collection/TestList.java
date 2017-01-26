package com.ljwjava.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by liujw on 2016/8/26.
 */
class Child implements Comparable {
    private String name;
    private int age;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Object o) {
        Child c = (Child)o;
        if(this.age!=c.age)return this.age - c.age;
        else return this.name.compareTo(c.name);
    }
}

public class TestList {
    public static void main(String[] args) {
        Child c1 = new Child("sun2", 10);
        Child c2 = new Child("sun1", 30);
        Child c3 = new Child("sun3", 30);
        Child c4 = new Child("sun3", 30);

      /*  List l = new ArrayList();
        l.add(c1);
        l.add(c2);
        l.add(c3);

        Collections.sort(l);

        Iterator i = l.iterator();
        while(i.hasNext()) {
            Child c = (Child)i.next();
            System.out.println(c.getName());
        }*/

        Set set = new TreeSet();
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);

       Iterator i1 = set.iterator();
        while(i1.hasNext()) {
            Child c = (Child)i1.next();
            System.out.println(c.getName());
        }
    }
}

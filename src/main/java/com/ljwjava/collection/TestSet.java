package com.ljwjava.collection;

import java.util.*;

/**
 * Created by liujw on 2016/8/17.
 */
public class TestSet {
    public static void main(String[] args) {
        HashSet s1 = new HashSet();
        HashSet s2 = new HashSet();
        s1.add("a");
        s1.add("b");
        s1.add("c");
        s2.add("d");
        s2.add("a");
        s2.add("b");
        Set sn = new HashSet(s1);
        sn.retainAll(s2);//求交集
        Set su = new HashSet(s1);
        su.addAll(s2); //求并集
        System.out.println(sn);
        System.out.println(su);

        //List
        List l1 = new LinkedList();
        List l2 = new LinkedList();
        for(int i=0; i <=9; i++) {
            l1.add("a"+i);
        }
        System.out.println(l1);
        Collections.shuffle(l1);
        System.out.println(l1);
        Collections.reverse(l1);
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);
        System.out.println(Collections.binarySearch(l1, "a5"));

        //Map
        Map m1 = new HashMap();Map m2 = new TreeMap();
        m1.put("one", 1);
        m1.put("two", 2);
        m1.put("three", 3);
        m2.put("A", 1);
        m2.put("B", 2);
        System.out.println(m1.size());
        System.out.println(m1.containsKey("one"));
        System.out.println(m2.containsValue(2));
        if(m1.containsKey("two")) {
            int i = (Integer)m1.get("two");
            System.out.println(i);
        }
        Map m3 = new HashMap(m1);
        m3.putAll(m2);
        System.out.println(m3);
    }
}

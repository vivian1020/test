package com.java.practice.collection;

import java.util.*;

/**
 * Created by liujw on 2016/8/26.
 * HashMap,LinkedHashMap,TreeMap,HashTable
 * Iterator的使用
 */
public class TestMap1 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<String, String>();
        m.put("key5", "312");
        m.put("key4","111");
        m.put("key2","123");
        m.put("key1", "145");
        m.put("key3", "139");

        Map<String,String> m1 = new Hashtable<String, String>();
        m1.put("key4","111");
        m1.put("key2","123");
        m1.put("key1", "145");
        m1.put("key3", "139");
        m1.put("key5", "312");

        Map<String, String> m2 = new LinkedHashMap<String, String>();
        m2.put("key1","111");
        m2.put("key2","123");
        m2.put("key4", "145");
        m2.put("key3", "139");

        Map<String, String> m3 = new TreeMap<String, String>();
        m3.put("key1","111");
        m3.put("key2","173");
        m3.put("key4", "145");
        m3.put("key3", "159");

        //遍历方法1：在for-each中循环使用entries来遍历
        for(Map.Entry<String, String> entry : m.entrySet()) {
            try {
                System.out.println("key = " + entry.getKey() + ",Value= " + entry.getValue());
            }catch (NullPointerException e)
            {
                e.printStackTrace();
            }
        }

        //遍历方法2：在for-each循环中遍历keys或values
        for(String key : m.keySet()) {
            System.out.println("key=" + key);
        }

        for(String value : m.values()) {
            System.out.println("value=" + value);
        }

        //方法三：使用Iterator遍历
        //使用泛型
        Iterator<Map.Entry<String, String>> entries = m1.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<String, String> entry = entries.next();
            System.out.println("key=" + entry.getKey() +",value" + entry.getValue());
        }

        //不用泛型
        Iterator entries1 = m1.entrySet().iterator();
        while(entries1.hasNext()){
            Map.Entry entry = (Map.Entry)entries1.next();
            System.out.println("key=" + entry.getKey() +",value" + entry.getValue());
        }

        //方法四：使用键找值遍历
        for (String key : m.keySet()) {
            String value = m.get(key);
            System.out.println("Key" + key + ",Value" +value);
        }












    }
}

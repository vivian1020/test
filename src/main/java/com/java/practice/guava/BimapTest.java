package com.java.practice.guava;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * Created by liujw on 2016/9/8.
 */
public class BimapTest {
    public static void main(String[] args) {
        BiMap<Integer, String> logfileMap = HashBiMap.create();
        logfileMap.put(1,"a.log");
        logfileMap.put(2,"b.log");
        logfileMap.put(3,"c.log");
        System.out.println("logfileMap:"+logfileMap);
        BiMap<String,Integer> filelogMap = logfileMap.inverse();
        System.out.println("logfileMap:"+filelogMap);

    }
}

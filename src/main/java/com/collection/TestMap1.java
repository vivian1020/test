package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by liujw on 2016/8/26.
 * @Description:值遍历
 */
public class TestMap1 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("key1", "value1");
        m.put("key2", "value2");
        m.put("key3", "value2");
        m.put("key1", "value4");

       /* Collection c = m.values();
        Iterator i = c.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }*/

        Set s = m.keySet();
        Iterator i = s.iterator();
        while(i.hasNext()) {
            System.out.println(i.next() +" = " + m.get(i.next()));
        }
    }
}

package com.ljwjava.guava;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liujw on 2016/9/8.
 */
public class testGuavaImmutable {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("list:"+list);

        ImmutableList<String> imlist = ImmutableList.copyOf(list);
        System.out.println("imlist: "+imlist);

        ImmutableList<String> imOflist = ImmutableList.of("pedia", "jerry", "harry");
        System.out.println("imOflist: "+imOflist);

        ImmutableSortedSet<String> imSortList = ImmutableSortedSet.of("a", "b", "c", "a", "d", "b");
        System.out.println("imSortlist:" +imSortList);

        list.add("baby");
        System.out.println("list add a item after list:"+list);
        System.out.println("list add a item after imlist:"+imlist);

        ImmutableSet<Color> imColorSet = ImmutableSet.<Color>builder()
                .add(new Color(0, 255, 255))
                .add(new Color(0, 191, 255))
                .build();
        System.out.println("imColorSet: "+imColorSet);
    }
}

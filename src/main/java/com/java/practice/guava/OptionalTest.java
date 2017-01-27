package com.java.practice.guava;

import com.google.common.base.Optional;

import java.util.Set;

/**
 * Created by liujw on 2016/9/6.
 */
public class OptionalTest {
    public static void main(String[] args) {
        Optional<Integer> possible = Optional.of(6);
        Optional<Integer>absentOpt = Optional.absent();
        Optional<Integer>NullableOpt = Optional.fromNullable(null);
        Optional<Integer>NoNullableOpt = Optional.fromNullable(10);
        if (possible.isPresent()) {
            System.out.println("possible isPresent: " +possible.isPresent());
            System.out.println("possible value: " + possible.get());
        }
        if (absentOpt.isPresent()) {
            System.out.println("absentOpt isPresent:" + absentOpt.isPresent());
        }
        if (NullableOpt.isPresent()) {
            System.out.println(NullableOpt.isPresent());
        }
        if(NoNullableOpt.isPresent()) {
            System.out.println(NoNullableOpt.isPresent());
        }

        Optional<Long> value = OptionalTest.method();
        if (value.isPresent() == true) {
            System.out.println("获得返回值："+ value.get());
        } else {
            System.out.println("获得返回值：" + value.or(-12L));
        }

        System.out.println("获得返回值 orNull:" + value.orNull());

        Optional<Long> valueNoNull = OptionalTest.methodNoNull();
        if (value.isPresent() == true) {
            Set<Long> set = valueNoNull.asSet();
            System.out.println("set size:");
            System.out.println("获得返回值："+ valueNoNull.get());
        } else {
            System.out.println("获得返回值：" + valueNoNull.or(-12L));
        }
        System.out.println("获得返回值 orNull:" + valueNoNull.orNull());
    }


    public static Optional <Long> method() {
        return Optional.fromNullable(null);
    }
    public static Optional <Long> methodNoNull() {
        return Optional.fromNullable(15L);
    }
}

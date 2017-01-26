package com.ljwjava.guava;

import com.google.common.base.Objects;

/**
 * Created by liujw on 2016/9/8.
 * guava toString()
 */
public class ObjectTest {
    public static void main(String[] args) {
        //System.out.println(Objects.toStringHelper(this).add("x", 1).toString());
        System.out.println(Objects.toStringHelper(Person.class).add("x", 1).toString());

        Person person = new Person("pedia", 23);
        String result = Objects.toStringHelper(Person.class)
                .add("name", person.name)
                .add("age", person.age).toString();
        System.out.println(result);
    }
}

class Person {
    public String name;
    public int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
package com.java.practice.classloader;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by liujw on 2016/8/25.
 * 测试反射机制
 */
public class Student {
    public String name;
    private int age;
    public Student() {};

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

    public void study(){
        System.out.println(name + " study");
    }

    public void study(int h){
        System.out.println(name + " study for " + h + " hours");
    }

    public double study(int a, double b){
        System.out.println(name + " study " + a + " " + b);
        return a * b;
    }

    private void play(){
        System.out.println(name + " play");
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class c = Student.class;
       System.out.println(c.getSimpleName());//得到类名，不包括包名
        System.out.println(c.getName());//得到类名，包括包名
        System.out.println(c.getSuperclass());//得到父类的类对象
        Method[] ms = c.getDeclaredMethods();//获取本类中定义的方法
        for(Method m:ms) {
            System.out.println(m);
        }
        Field[] fs = c.getDeclaredFields();//获取本类中定义的属性
        for(Field f:fs) {
            System.out.println(f);
        }

        Field f = c.getDeclaredField("name");//getName()获得属性
        System.out.println(f.getName());

        Student stu = new Student();//新建一个类的对象
        f.set(stu, "tom"); //属性的赋值
        String data = (String)f.get(stu);//属性的获取
        System.out.println(data);

        f = c.getDeclaredField("age");
        f.setAccessible(true); //可以操作私有属性
        f.set(stu, 10);

        Method m = c.getDeclaredMethod("study", new Class[]{int.class, double.class});
        m.invoke(stu, new Object[]{10, 10.2});

        Constructor con = c.getDeclaredConstructor(new Class[]{String.class, int.class});
        con.newInstance(new Object[]{"suns", 10});

    }
}

package com.reflection;

import com.java.practice.classloader.Student;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by liujw on 2017/2/4.
 */
public class ReflectMethodTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class clz = Class.forName("com.reflection.Test");
        System.out.println(clz);
        Test test = (Test)clz.newInstance();
        Method  mt = clz.getMethod("doRun", new Class[]{String.class, Student.class, String.class});
        System.out.println(mt);
        System.out.println(mt.invoke(test, new Object[]{"i love you", null, "i fuck you"}));

    }
}

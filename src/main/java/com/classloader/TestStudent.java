package com.classloader;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by liujw on 2016/8/25.
 */

public class TestStudent {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //new FileOutputStream("C:\\Users\\liujw\\IdeaProjects\\test\\src\\main\\resources\\reflection.txt");
        //InputStream is = TestStudent.class.getResourceAsStream("/reflection.txt");
        InputStream is = new FileInputStream("C:\\Users\\liujw\\IdeaProjects\\test\\src\\main\\resources\\reflection.txt");
        InputStreamReader ir = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(ir);
        String className = br.readLine();
        String methodName = br.readLine();
        String methodGetName = br.readLine();

        Class c = Class.forName(className);
        Object o = c.newInstance();//类的对象

        Field[] fs = c.getDeclaredFields();//获取本类中定义的属性
        for(Field f:fs) {
            System.out.println(f);
        }

        Method m = c.getDeclaredMethod(methodGetName);
        Method m1 = c.getDeclaredMethod(methodName, new Class[]{String.class});

        m.setAccessible(true);
        m1.invoke(o, new Object[]{"tom"});
        m.invoke(o);
    }
}


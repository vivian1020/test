package com.io;

import java.io.*;

/**
 * Created by liujw on 2016/8/19.
 */
public class TestObjectIO {
    public static void main(String[] args) throws Exception{
        T t = new T();
        t.k = 8;
        FileOutputStream fos = new FileOutputStream("d:/share/java/io/testobjectio.test");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(t);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("d:/share/java/io/testobjectio.test");
        ObjectInputStream ois = new ObjectInputStream(fis);
        T tReaded = (T)ois.readObject();
        System.out.println(tReaded.i + " "+tReaded.j + " " + tReaded.d + " " + tReaded.k);
    }
}

class T implements Serializable {
    int i = 10;
    int j = 9;
    double d = 2.3;
    int k = 15;
}
package com.ljwjava.guava;
import com.google.common.base.Throwables;

/**
 * Created by liujw on 2016/9/8.
 */
public class ThrowableTest {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Throwable t) {
            String ss = Throwables.getStackTraceAsString(t);
            System.out.println("ss:"+ss);
            Throwables.propagate(t);
        }
    }
}

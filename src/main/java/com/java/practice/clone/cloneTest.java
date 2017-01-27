package com.java.practice.clone;

/**
 * Created by liujw on 2016/9/1.
 * 浅拷贝与深拷贝
 */
public class cloneTest {
    public static void main(String[] args) {
        try {
            Employee original = new Employee("John Q.public", 50000);
            original.setHireDay(2000, 1, 1);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2002, 12, 31);
            System.out.println("original="+original);
            System.out.println("copy=" +copy);
        }catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

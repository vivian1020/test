package com.ljwjava.clone;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by liujw on 2016/9/1.
 */
public class Employee implements Cloneable{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s){
        name = n;
        salary = s;
        hireDay = new Date();
    }

    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.hireDay = (Date)hireDay.clone();
        return cloned;
    }

    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month-1, day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

    public void raiseSalary(double byParent) {
        double raise = salary * byParent / 100;
        salary += raise;
    }

    public String toString() {
        return "Employee[name=" +name+ ",salary=" +salary+ ",hireDay=" +hireDay+"]";
    }

}

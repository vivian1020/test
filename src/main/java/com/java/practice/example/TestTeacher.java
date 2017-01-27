package com.java.practice.example;

/**
 * Created by liujw on 2016/8/12.
 */
class Person {
    private String name;
    private String location;

    Person(String name) {
        this.name = name;
        location = "Beijing";
    }

    Person(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String info() {
        return "name: " + name + "location: " + location;
    }
}

class Student extends Person {
    private String school;
    Student(String name, String school) {
        this(name, "Beijing", school);
    }

    Student(String n, String l, String school) {
        super(n, l);
        this.school = school;
    }
    public String info() {
        return super.info() + "school: " + school;
    }
}

 class Teacher extends Person {
     private String capital;

     Teacher(String name, String capital) {
         this(name, "beijing", capital);
     }

     Teacher(String n, String l, String capital) {
         super(n, l);
         this.capital = capital;
     }

     public String info() {
         return super.info() + "capital: " + capital;
     }
}

public class TestTeacher {
    public static void main(String[] args) {
        Person p1 = new Person("com.ljwjava.example.A");
        Person p2 = new Person("B", "shanghai");
        Student s1 = new Student("C", "S1");
        Student s2 = new Student("C", "shanghai", "S2");
        Teacher t1 = new Teacher("T",  "professor");
        System.out.println(p1.info());
        System.out.println(p2.info());
        System.out.println(s1.info());
        System.out.println(s2.info());
        System.out.println(t1.info());
    }
}

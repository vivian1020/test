package com.cnc.thread.innerClass;

/**
 * Created by liujw on 2017/1/28.
 */
public class Run {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordValue");
        System.out.println(publicClass.getUsername()+" "+
        publicClass.getPassword());
        PublicClass.PrivateClass privateClass = new PublicClass.PrivateClass();
        privateClass.setAddress("addressValue");
        privateClass.setAge("ageValue");
        System.out.println(privateClass.getAge()+ " "+
        privateClass.getAddress());
    }
}

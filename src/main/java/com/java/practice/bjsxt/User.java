package com.java.practice.bjsxt;

/**
 * Created by liujw on 2017/1/27.
 */
public class User {
    private static int userNumber = 0;

    public User(){
        userNumber++;
    }

    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();

        System.out.println("user1=" + User.userNumber);
        System.out.println("user2=" + User.userNumber);
    }
}

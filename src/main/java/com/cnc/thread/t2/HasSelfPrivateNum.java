package com.cnc.thread.t2;

/**
 * Created by liujw on 2017/1/27.
 * synchronized关键字解决非线程安全问题
 */
public class HasSelfPrivateNum {
    private int num = 0;
    synchronized public void addI(String username){
        try{
            if(username.equals("a")){
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            }else{
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num="+num);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

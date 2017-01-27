package com.cnc.thread.t1;

/**
 * Created by liujw on 2017/1/27.
 * "非线程安全“问题存在于”实例变量“中，如果是方法内部的私有变量，则不存在”非线程安全“
 * 问题，所得的结果也就是线程安全的了。
 */
public class HasSelfPrivateNum {
    public void addI(String username){
        try{
            int num = 0;
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

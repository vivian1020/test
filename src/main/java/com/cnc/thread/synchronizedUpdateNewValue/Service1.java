package com.cnc.thread.synchronizedUpdateNewValue;

/**
 * Created by liujw on 2017/1/28.
 */
public class Service1 {
    private boolean isContinueRun = true;
    public void runMethod(){
        String anyString = new String();
        while(isContinueRun == true){
            synchronized (anyString){

            }
        }
        System.out.println("停不下来了");
    }
    public void stopMethod(){
        isContinueRun = false;
    }
}

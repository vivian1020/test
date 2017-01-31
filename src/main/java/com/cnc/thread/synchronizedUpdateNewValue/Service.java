package com.cnc.thread.synchronizedUpdateNewValue;

/**
 * Created by liujw on 2017/1/28.
 */
public class Service {
    private boolean isContinueRun = true;
    public void runMethod(){
        while(isContinueRun == true){

        }
        System.out.println("停不下来了");
    }
    public void stopMethod(){
        isContinueRun = false;
    }
}

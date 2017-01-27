package com.java.practice.bjsxt;

/**
 * Created by liujw on 2017/1/27.
 * 溢出：StacOverFlowError,OutOfMemoryError
 */
public class StackOverFlowTest {
    int stackDepth = 0;

    public static void main(String[] args) {
        StackOverFlowTest test = new StackOverFlowTest();
        try{
            test.overFlow();
        }catch(Throwable e){
            System.out.println("depth of current stack:"+ test.stackDepth);
            e.printStackTrace();
        }
    }

    public void overFlow(){
        stackDepth += 1;
        overFlow();
    }
}

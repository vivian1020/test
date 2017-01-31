package com.cnc.thread.t10;

/**
 * Created by liujw on 2017/1/28.
 */
public class PrintString implements Runnable{
    private boolean isContinuePrint = true;
    public boolean isCOntinuePrint(){
        return isContinuePrint;
    }
    public void setContinuePrint(boolean isContinuePrint){
        this.isContinuePrint = isContinuePrint;
    }
    public void printStringMethod() {
        while (isContinuePrint == true) {
            System.out.println("run printStringMethod threadName=" +
                    Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void run(){
        printStringMethod();
    }

}

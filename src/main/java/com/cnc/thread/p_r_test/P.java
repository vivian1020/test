package com.cnc.thread.p_r_test;

/**
 * Created by liujw on 2017/2/6.
 */
public class P {
    private String lock;
    public P(String lock) {
        super();
        this.lock = lock;
    }
    public void setValue() {
        synchronized (lock) {
            if (!ValueObject.value.equals("")){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            String value = System.currentTimeMillis() + "_"
                    + System.nanoTime();
            System.out.println("set的值是 "+value);
            ValueObject.value = value;
            lock.notify();
        }
    }
}

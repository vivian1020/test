package com.ljwjava.thread;

/**
 * Created by liujw on 2016/8/29.
 */
public class TestProducerConsumer{
    public static void main(String[] args) {
        Stack1 s = new Stack1();
        Thread t1 = new Producer(s);
        Thread t2 = new Consumer(s);
        t1.start();
        t2.start();
    }
}

class Stack1 {
    private char[] data = new char[6];
    private int index = 0;
    private void print() {
        for(int i=0;i<index;i++){
            System.out.println(data[i]+" ");
        }
        System.out.println();
    }
    public synchronized void push(char c) {
        while(index == data.length){
            try {
                this.wait();
            }catch (InterruptedException e) {

            }
        }
        data[index] = c;
        index++;
        this.notifyAll();
        System.out.print(c+" push stack:");
        print();
    }

    public synchronized void pop() {
        while(index == 0) {
            try {
                this.wait();
            }catch(InterruptedException e){}
        }
        index--;
        char c = data[index];
        data[index] = ' ';
        this.notifyAll();
        System.out.print(c+ " poped stack:");
        print();
    }
}

class Producer extends Thread {
    Stack1 s;
    public Producer(Stack1 s) {
        this.s = s;
    }
    public void run() {
        for(char c='A';c<='Z';c++){
            s.push(c);
            try {
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Consumer extends Thread {
    Stack1 s;
    public Consumer(Stack1 s) {
        this.s = s;
    }
    public void run(){
        for(int i=0;i<=26;i++){
            s.pop();
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
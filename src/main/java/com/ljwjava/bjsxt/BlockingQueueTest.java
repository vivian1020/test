package com.ljwjava.bjsxt;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 多线程模拟实现生产者/消费者模型
 * Created by liujw on 2017/1/22.
 */
public class BlockingQueueTest {
    /**
     * 定义装苹果的篮子
     */
    public class Basket{
        BlockingQueue<String> basket = new LinkedBlockingQueue<>(3);

        public void produe() throws InterruptedException {
            basket.put("an apple");
        }

        public String consume() throws InterruptedException {
            return basket.take();
        }
    }

    class Producer implements Runnable{
        private String instance;
        private Basket basket;

        public Producer(String instance, Basket basket){
            this.instance = instance;
            this.basket = basket;
        }

        @Override
        public void run() {
            try{
                while(true){
                    System.out.println("生产者准备生产苹果"+instance);
                    basket.produe();
                    System.out.println("生产苹果完毕"+instance);
                    Thread.sleep(300);
                }
            }catch (InterruptedException e){
                System.out.println("Producer Interrupted");
            }
        }
    }

    class Consumer implements Runnable{
        private String instance;
        private Basket basket;

        public Consumer(String instance, Basket basket){
            this.instance = instance;
            this.basket = basket;
        }

        @Override
        public void run() {
            try{
                while(true){
                    // 消费苹果
                    System.out.println("消费者准备消费苹果：" + instance);
                    System.out.println(basket.consume());
                    System.out.println("!消费者消费苹果完毕：" + instance);
                    // 休眠1000ms
                    Thread.sleep(1000);
                }
            }catch(InterruptedException e){
                System.out.println("Consumer Interrupted");
            }
        }
    }

    public static void main(String[] args) {
        BlockingQueueTest test = new BlockingQueueTest();

        Basket basket = test.new Basket();

        ExecutorService service = Executors.newCachedThreadPool();
        Producer producer = test.new Producer("生产者001", basket);
        Producer producer2 = test.new Producer("生产者002", basket);
        Consumer consumer = test.new Consumer("消费者001", basket);

        service.submit(producer);
        service.submit(producer2);
        service.submit(consumer);
    }
}

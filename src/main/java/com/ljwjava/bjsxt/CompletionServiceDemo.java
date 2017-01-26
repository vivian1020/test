package com.ljwjava.bjsxt;

import java.util.concurrent.*;

/**
 * Created by liujw on 2017/1/18.
 */
public class CompletionServiceDemo {
    public static class Task implements Callable<Integer>{
        private int i;
        Task(int i){
            this.i = i;
        }

        @Override
        public Integer call(){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ " " + i);
            return i;
        }
    }

    public void run(){
        ExecutorService pool = Executors.newFixedThreadPool(10);
        CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(pool);
        try {
            for (int i = 0; i < 10; i++) {
                completionService.submit(new CompletionServiceDemo.Task(i));
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(completionService.take().get());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }finally{
            pool.shutdown();
        }
    }

    public static void main(String[] args) {
        new CompletionServiceDemo().run();
    }
}

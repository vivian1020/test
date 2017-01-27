package com.java.practice.bjsxt;

import com.google.common.util.concurrent.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by liujw on 2017/1/17.
 */
public class ListenableFutureTest {
    private int MAX_TIMES = 400000;
    public void testListenableFuture(){
        //创建线程池
        ListeningExecutorService pool = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(10));
        final ListenableFuture<String> future = pool.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                //Thread.sleep(1000 * 2);
                return "Task done!";
            }
        });
        Futures.addCallback(future, new FutureCallback<String>() {
            @Override
            public void onSuccess(String result) {
                System.out.println(result);
            }

            @Override
            public void onFailure(Throwable t) {
                t.printStackTrace();
            }
        });

        pool.shutdown();

    }

    public void testFuture(){

        //创建线程池
        //final long start = System.currentTimeMillis();
        ListeningExecutorService pool = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(10));
        final long start = System.currentTimeMillis();
        final ListenableFuture<List<String>> future = pool.submit(new Callable<List<String>>() {
            @Override
            public List<String> call() throws Exception {
                return compute();
            }
        });
        //final long end = System.currentTimeMillis();
        List<String> result = null;
        try {
            result = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        final long end = System.currentTimeMillis();
        System.out.println("query use:" +(end -start) + " ms");
        //System.out.println("result="+ result);
        pool.shutdown();

    }

    public void testCompute(){
        final long start = System.currentTimeMillis();
        List<String> result1 = compute();
        final long end = System.currentTimeMillis();
        System.out.println("query use:" +(end -start) + " ms");
        //System.out.println("resultCompute="+ result1.size());

    }

    private List<String> compute(){
        List<String> result = new ArrayList<>();
        for(int i =0; i < MAX_TIMES;i++) {
            result.add(String.valueOf(inteCompute(i)));
        }
        return result;
    }

    private int inteCompute(int m){
        int temp = 0;
        for(int i=0; i < m;i++){
            temp += i;
        }
        return temp;
    }

    public void testCallable(){
        /*ExecutorService threadPool = Executors.newSingleThreadExecutor();
        Future<String> future = threadPool.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000);
                return "hello";
            }
        });

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
                e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        threadPool.shutdown();*/

        ExecutorService threadPool2 = Executors.newFixedThreadPool(10);
        CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(threadPool2);
        for(int i=1; i<= 10; i++){
            final int seq = i;
            completionService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    Thread.sleep(1000*2);
                    return seq;
                }
            });
        }
        for(int i = 1; i<=10; i++){
            try{
                System.out.println(completionService.take().get());
            }catch(InterruptedException | ExecutionException e){
                e.printStackTrace();
            }
        }
        threadPool2.shutdown();
    }



    public static void main(String[] args) {
        ListenableFutureTest futureTest = new ListenableFutureTest();
        //futureTest.testListenableFuture();
        //futureTest.testFuture();
        //futureTest.testCompute();
        futureTest.testCallable();

    }
}

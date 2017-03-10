package com.cnc.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by liujw on 2017/2/26.
 */
public class DefaultThreadPool <Job extends Runnable> implements ThreadPool<Job> {
    private static final int MAX_WORKER_NUMBERS = 10;
    private static final int DEFAULT_WORKER_NUMBERS = 5;
    private static final int MIN_WORKER_NUMBERS = 1;
    private final LinkedList<Job> jobs = new LinkedList<Job>();
    private final List<Worker> workers = Collections.synchronizedList(new ArrayList
            <Worker>());
    private int workerNum = DEFAULT_WORKER_NUMBERS;
    private AtomicLong threadNum = new AtomicLong();

    public DefaultThreadPool() {
        initializeWorkers(DEFAULT_WORKER_NUMBERS);
    }


    @Override
    public void execute(Job job) {

    }

    @Override
    public void shutdown() {

    }

    @Override
    public void addWorkers(int num) {

    }

    @Override
    public void removeWorker(int num) {

    }

    @Override
    public int getJobSize() {
        return 0;
    }

    //初始化线程工作者
    public void initializeWorkers(int num) {
        for(int i=0;i<num;i++){
            Worker worker = new Worker();
            workers.add(worker);
            Thread thread = new Thread(worker,"ThreadPool-Worker-"+threadNum.incrementAndGet());
            thread.start();
        }

    }

    class Worker implements Runnable {
        private volatile boolean running = true;

        @Override
        public void run() {
            while(running) {
                Job job = null;
                synchronized (jobs) {
                    while(jobs.isEmpty()) {
                        try {
                            jobs.wait();
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    job = jobs.removeFirst();
                }
                if(job != null) {
                    try {
                        job.run();
                    } catch (Exception e) {

                    }
                }
            }
        }
        public void shutdown() {
            running = false;
        }
    }
}

package com.cnc.thread;

/**
 * Created by liujw on 2017/2/26.
 */
public interface ThreadPool<Job extends Runnable> {
    void execute(Job job);
    void shutdown();
    void addWorkers(int num);
    void removeWorker(int num);
    int getJobSize();
}

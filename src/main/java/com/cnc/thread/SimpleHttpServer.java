package com.cnc.thread;

/**
 * Created by liujw on 2017/2/26.
 */
public class SimpleHttpServer {
    static ThreadPool<HttpRequestHandler> threadPool = new DefaultThreadPool
            <HttpRequestHandler>(1);

    static class HttpRequestHandler implements Runnable {

        @Override
        public void run() {

        }
    }

}

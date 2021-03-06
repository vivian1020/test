package com.cnc.thread.pipeInputOutput;

import java.io.PipedOutputStream;

/**
 * Created by liujinwen on 2017/2/6.
 */
public class ThreadWrite extends Thread{
    private WriteData write;
    private PipedOutputStream out;

    public ThreadWrite(WriteData write, PipedOutputStream out) {
        super();
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}

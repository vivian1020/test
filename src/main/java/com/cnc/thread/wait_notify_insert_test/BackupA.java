package com.cnc.thread.wait_notify_insert_test;

/**
 * Created by liujinwen on 2017/2/6.
 */
public class BackupA extends Thread {
    private DBTools dbTools;

    public BackupA(DBTools dbTools) {
        super();
        this.dbTools = dbTools;
    }
    @Override
    public void run(){
        dbTools.backupA();
    }
}

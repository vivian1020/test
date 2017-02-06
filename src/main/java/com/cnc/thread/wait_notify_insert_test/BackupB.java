package com.cnc.thread.wait_notify_insert_test;

/**
 * Created by liujinwen on 2017/2/6.
 */
public class BackupB extends Thread {
    private DBTools dbTools;

    public BackupB(DBTools dbTools) {
        super();
        this.dbTools = dbTools;
    }
    @Override
    public void run(){
        dbTools.backupB();
    }
}

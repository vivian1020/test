package com.cnc.thread.wait_notify_size5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liujinwen on 2017/2/5.
 */
public class MyList {
    private static List list = new ArrayList();
    public static void add(){
        list.add("anyString");
    }
    public static int size() {
        return list.size();
    }
}

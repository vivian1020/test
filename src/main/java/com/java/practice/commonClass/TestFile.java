package com.java.practice.commonClass;

import java.io.File;
import java.io.IOException;

/**
 * Created by liujw on 2016/8/16.
 */
public class TestFile {
    public static void main(String[] args) {
        String separator = File.separator;
        String filename = "myfile.txt";
        String directory = "mydir1" + separator + "mydir2";
        File f = new File(directory, filename);
        if(f.exists()) {
            System.out.println("文件名："+f.getAbsolutePath());
            System.out.println("文件大小："+f.length());
        } else {
            f.getParentFile().mkdirs();//求它的父路径
            try {
                f.createNewFile();//创建一个新文件
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

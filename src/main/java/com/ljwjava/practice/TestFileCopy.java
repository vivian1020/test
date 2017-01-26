package com.ljwjava.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by liujw on 2016/9/1.
 * 编写一个程序，将 d:\java 目录下的所有.java 文件复制到 d:\jad 目录下，
 * 并将原来文件的扩展名从.java 改为.jad。
 */
public class TestFileCopy {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\java");
        File [] files = file.listFiles();
        String[] fileNames = file.list();//取得java目录下的所有的文件名

        for(File file1: files) {
            String fileName = file1.getName();
            String prefix = fileName.substring(fileName.lastIndexOf(".")+1);//取得文件名的后缀
            String content = fileName.substring(0, fileName.lastIndexOf("."));
            //System.out.println(content);
           // System.out.println("D:\\jad\\"+content+".jad");
            if(prefix.equals("java")) {
                System.out.println(fileName);
                FileInputStream fis = new FileInputStream(file1);
                File fout= new File("D:\\jad\\"+content+".jad");
                FileOutputStream fos = new FileOutputStream(fout);
                byte[] buffer = new byte[1444];
                int hasRead = 0;
                while ((hasRead = fis.read(buffer)) != -1) {
                    fos.write(buffer, 0, hasRead);
                }
                fis.close();
                fos.close();
            }
        }
    }
}

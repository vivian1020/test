package com.java.practice.regex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by liujw on 2016/8/30.
 */
public class CodeCount {

    static long normalLines = 0;
    static long commentLines = 0;
    static long whiteLines =0;

    public static void main(String[] args) {
        File f = new File("F:\\Array");
        File[] codeFiles = f.listFiles();
        for(File child:codeFiles){
            if(child.getName().matches(".*\\.java$")) {
                parse(child);
            }
        }
        System.out.println("normalLines:" + normalLines);
        System.out.println("commentLines:" + commentLines);
        System.out.println("whiteLines:" + whiteLines);
    }

    private static void parse(File f)  {
        BufferedReader br = null;
        boolean comment = false;

        try {
            br = new BufferedReader(new FileReader(f));
            String line = "";
            while((line = br.readLine()) != null) {
                line = line.trim();
                if (line.matches("^[\\s&&[^\\n]]*$")) {
                    whiteLines ++;
                } else if (line.startsWith("/*") && line.endsWith("*/")) {
                    commentLines ++;
                } else if (line.startsWith("/*") && !line.endsWith("*/")) {
                    commentLines ++;
                    comment = true;
                } else if (true == comment) {
                    commentLines ++;
                    if (line.endsWith("*/")) {
                        comment = false;
                    }
                } else if (line.startsWith("//")) {
                    commentLines ++;
                } else {
                    normalLines ++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                    br = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package com.ljwjava.bjsxt;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Point {

    public static void test() {
        List<String> scacheType = new ArrayList<String>();
        scacheType.add("scachedata");
        scacheType.add("scachedataGDC");
        List<String> flowType = new ArrayList<>();
        flowType.add("flow");
        flowType.add("flowGDC");

        boolean isFirstLine = true;
        boolean isFlowType = false;
        boolean isConcount = false;

        String line = null;
        String typeName = null;
        String date = null;
        String time;
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("d:\\1\\2016-12-21-03-32-00-41922_61.174.63.217.scachedata"));
            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    typeName = line.split(":")[1].trim();
                    if (scacheType.contains(typeName)) {
                        System.out.println("scacheType");
                    } else if (flowType.contains(typeName)) {
                        System.out.println("flowType");
                        isFlowType = true;
                    } else {
                        isConcount = true;//Type是isCount时跳出
                        break;
                    }
                } else if (line.startsWith("#Type")) { //如果非首次出现Type，则退出循环不再读取文件
                    break;
                } else if (line.startsWith("#Date")) {
                    date = line.split(":")[1].trim();
                    System.out.println("date=" + date);
                } else if (line.startsWith("#Channel")) {
                    String channelName = line.split(":")[1].trim();
                    System.out.println("channel " + channelName);
                } else if (line.startsWith("#Area")) {
                    String areaName = line.split(":")[1].trim();
                    System.out.println("area " + areaName);
                } else if (line.matches("[0-9]+.*")) {//以数字开头
                    String[] tmp = line.split("\\t");
                    System.out.println("length= " + tmp.length);
                    time = tmp[0];
                    System.out.println(date + " " +time);
                    if (isFlowType) {
                        System.out.println(tmp[1] + " "+ tmp[2] + " " + tmp[3] + " " + tmp[4]);
                    } else {
                        System.out.println(tmp[1] + " "+ tmp[2]);
                    }
                } else {
                    continue;
                }
            }
            System.out.println("typename:" + typeName);
            if(isConcount){
                System.out.println("isConcount");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                reader.close();
            }catch(IOException e){
                throw new RuntimeException("close bufferedReader failed!");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        List<String> data = Lists.newArrayList(Splitter.on(".").trimResults().split(
                "hive.com.cnc.resent "
        ));
        System.out.println(String.format("1, %s",  data.get(0)));

    }


    }

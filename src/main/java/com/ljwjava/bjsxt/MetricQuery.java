package com.ljwjava.bjsxt;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.io.*;
import java.util.List;

/**
 * Created by liujw on 2017/1/17.
 */
public class MetricQuery {
    public void test(){
        File file = new File("d:\\temp-data\\iowait");
        File outfile = new File("d:\\temp-data\\iowait.out");
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(file));
            bw = new BufferedWriter(new FileWriter(outfile));
            String s = null;
            int count = 0;
            int writeCount = 0;
            while((s = br.readLine()) != null){
                List<String>tmpList = Lists.newArrayList(Splitter.on(" ").trimResults().
                        split(s));
                String metric = tmpList.get(1);
                String metric1 = metric.substring(0, metric.length()-1);
                String newStr = metric1.replaceAll("iowait.wait", "");
                //System.out.println(metric1+" "+newStr);
                count++;
                if((count % 90 == 0) && writeCount < 1000) {
                    writeCount ++;
                    bw.write(newStr + "\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }


    public static void main(String[] args) {
        MetricQuery query = new MetricQuery();
        query.test();
    }


}

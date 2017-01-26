package com.ljwjava.commonClass;

/**
 * Created by liujw on 2016/8/16.
 * 编写一个方法，返回一个double型二维数组，数组中的元素通过解析字符串参数获得
 *
 */
public class TwoDimensionArray {
    public static void main(String[] args) {
        String str = "1,2;3,4,5;6,7,8";
        double[][] d;
        String[] strArray = str.split(";");
        d = new double[strArray.length][];
        for(int i=0; i<strArray.length; i++) {
            String[] tmp = strArray[i].split(",");
            d[i] = new double[tmp.length];
            for(int j=0; j< tmp.length; j++) {
                d[i][j] = Double.parseDouble(tmp[j]);
            }
        }

        for(int i=0; i<d.length; i++) {
            for(int j=0; j<d[i].length; j++){
                System.out.println("d["+i+","+j+"]="+d[i][j]);
            }
        }
    }
}

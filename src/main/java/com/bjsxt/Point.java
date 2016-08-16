package com.bjsxt;
/**
 * Created by liujw on 2016/8/11.
 * 定义一个点类来表示三维空间中的点，有3个坐标。
 * 1、生成具有特定坐标的点对象
 * 2、提供设置三个坐标的方法
 * 3、提供可以计算该点距离原点距离平法的方法
 */
 public class Point {
        public double x;
        public double y;
        public Point(double x1, double y1) {
            x = x1;
            y = y1;
        }
        public double getX() { return x; }
        public double getY() { return y; }
        public void setX(double i) { x = i; }
        public void setY(double j) { y = j; }
}

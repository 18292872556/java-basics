package com.qx.day08;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/14/23:38
 * @Description:
 */
public class Circle {
    public Circle(double radius) {
        getName();//个人感觉这句没啥用，或许是为了对应属性初始化
        this.radius = radius;
    }

    private double radius;
    private static String name ="这是一个圆";

    public static String getName(){
        return name;//写不了this.name。因为静态方法中不可以出现this，super
    }


    public double findArea() {
        return Math.PI * radius * radius;
    }

    public void display(){
        System.out.println("name:"+getName()+"radius:"+this.radius+"Area:"+findArea());
    }


}

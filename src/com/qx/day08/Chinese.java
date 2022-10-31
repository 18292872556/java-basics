package com.qx.day08;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/14/23:31
 * @Description:
 */
public class Chinese {
    public Chinese(String name, int age){
        this.country = "China";
        this.name = name;
        this.age = age;
        count++;

    }

    public static String country;
    public static int count;
    public String name;
    public int age;

    @Override
    public String toString() {
        return getClass().getName()+"[name="+this.name+"country="+this.country+"count="+this.count+"age="+age+"]";
    }

    public static void test(){
        System.out.println("Chinese的类方法test");
    }
    public void people(){
        System.out.println(this.name+"的实例方法");
    }

}

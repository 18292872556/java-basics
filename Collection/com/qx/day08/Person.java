package com.qx.day08;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/15/14:46
 * @Description:
 */
public class Person {
    public int id;
    public static int total = 0;
    public Person(){
        total++;
        id = total;
    }
    public static void main(String args[]){
        //本类中调用
        Person Tom = new Person();
        Tom.id = 0;
        total = 100;//不用创建对象就可以访问静态成员
    }
}

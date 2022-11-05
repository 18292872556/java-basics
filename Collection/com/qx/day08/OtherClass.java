package com.qx.day08;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/15/14:52
 * @Description:
 */
public class OtherClass {
    public static void main(String args[]){
        Person.total = 100;//不用创建对象就可以访问静态成员
        //访问方式：类名.类属性，类名.类方法
        System.out.println(Person.total);//100

        Person c = new Person();
        System.out.println(c.total);//101
        System.out.println(c.id);//101

        Person d = new Person();
        System.out.println(d.total);//102
        System.out.println(d.id);//102
        //每创建一个对象，total++

    }
}

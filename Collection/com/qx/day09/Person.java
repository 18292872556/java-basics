package com.qx.day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/15/20:24
 * @Description: 测试代码块
 */
public class Person {
    static int age;

    //静态代码块
    static {
        //这里只能使用静态static修饰的属性和方法
        age = 1;
        showAge();
        System.out.println("====执行的是静态代码块1====");
    }

    static {
        System.out.println("====执行的是静态代码块2====");
    }

    String name;

    //非静态的代码块
    {
        System.out.println("执行的是非静态代码块1");
    }

    {
        System.out.println("执行的是非静态代码块2");
    }

    {
        System.out.println("执行的是非静态代码块3");
    }

    {
        System.out.println("执行的是非静态代码块4");
    }

    public Person() {
        this.name = "张三";
        System.out.println("执行的是构造方法");
    }

    public static void showAge() {
        System.out.println(age);
    }
}

package com.qx.day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/15/22:25
 * @Description:
 */
public class Student {
    String name;
    String schoolName;

    public Student() {
        this.name = "学生姓名";
        this.schoolName = "学校名称";
        System.out.println("执行的是构造方法");
    }

    public void test() {
        System.out.println("Student的test方法");
    }
}

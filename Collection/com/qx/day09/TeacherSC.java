package com.qx.day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/26/17:42
 * @Description:
 */
public class TeacherSC extends Person2 implements Cook,Sing {
    String course;

    public void setInfo(String name, int age, String sex, String course){
        super.name = name;
        super.age = age;
        super.sex = sex;

        this.course = course;
    }

    @Override
    public void showInfo() {
        System.out.println("会唱歌会做菜的老师信息：");
        System.out.println("姓名："+name+",年龄："+age+",性别"+sex);
        System.out.println("任教课程："+course);
        fry();
        singsing();


    }

    @Override
    public void fry() {
        System.out.println(super.name+"会做川菜");
    }

    @Override
    public void singsing() {
        System.out.println(this.name+"会唱流行歌");
    }
}

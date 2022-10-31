package com.qx.day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/18/17:36
 * @Description: 测试abstract抽象类
 */
public abstract class Animal {

    //设置动物行走方式
    public abstract void move();
}

//三个动物类继承抽象类并重写抽象方法
class Fish extends Animal {

    @Override
    public void move() {
        System.out.println(getClass().getName() + "的行走方式是游");
    }
}

class Dog extends Animal {

    @Override
    public void move() {
        System.out.println(getClass().getName() + "行走方式是跑");

    }
}

class Brid extends Animal {

    @Override
    public void move() {
        System.out.println(getClass().getName() + "行走方式是飞");
    }
}


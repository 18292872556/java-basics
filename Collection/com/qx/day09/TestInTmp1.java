package com.qx.day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/26/17:22
 * @Description: 如果一个类既继承父类，又实现接口
 * 那么先继承，再实现
 */
public class TestInTmp1 extends Person implements TestIn1,TestIn2{

    @Override
    public void start() {
        System.out.println("实现方法start");
    }

    @Override
    public void stop() {

    }
}

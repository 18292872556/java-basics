package com.qx.day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/15/19:52
 * @Description: 测试内部类
 */
public class Test2 {
    public int k;
    int i;
    private int h;

    public void setInfo() {
        new A().setTest2Fileds();//外部类实例化内部类对象，并调用内部类方法
    }

    //内部类
    class A {
        int i;

        //给外部类的属性赋值
        public void setTest2Fileds() {
            Test2.this.i = 1;
            Test2.this.k = 4;
            Test2.this.h = 8;

        }

        //给自己内部类的属性赋值
        public void set() {
            this.i = 10;
        }
    }


}

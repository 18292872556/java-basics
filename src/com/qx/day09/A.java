package com.qx.day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/29/14:03
 * @Description: 外部类和内部类有同名属性时，在内外区分两个同名属性
 */
public class A {

    private int a = 0;
    public void showInfo(){
        InnerB b = new InnerB();
        System.out.println("");
        b.ma();//在外部类方法中调用内部类方法

        System.out.println("内外部类同名属性，内部属性a = "+ b.a);
        System.out.println("内外部类同名属性，外部属性a = "+ a);
    }

    class InnerB{

        int a = 10;//与外部类的属性名相同，怎么在内部类中区分两个同名属性
        public void ma(){
            a = 8;
            A.this.a = 80;
            System.out.println("内外部类同名属性，内部属性a = "+a);
            System.out.println("内外部类同名属性，外部属性a = "+new A().a);

        }

    }

}

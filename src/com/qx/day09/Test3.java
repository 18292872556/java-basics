package com.qx.day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/31/20:48
 * @Description: 类A想同时获得类B和类C的方法，并且重写
 * 可以使用内部类来变相的实现类的多重继承
 */
public class Test3 {
    class InnerA extends Aa{
        int i;

        @Override
        void testA() {
            //super.testA();
            System.out.println("内部类InnerA继承A后，重写方法A");
        }
    }
    class InnerB extends Bb{

    }
    class InnerC extends Cc{

    }

    private int k;
    void showInfo(){
        //创建内部类对象调用内部类方法
       InnerA a =  new InnerA();
       a.testA();
       //或不命名直接new无名对象调用方法
       new InnerA().testA();

       new InnerB().testB();

       new InnerC().testC();

    }

}
class Aa{
    void testA(){
        System.out.println("方法A");
    }
}
class Bb{
    void testB(){
        System.out.println("方法B");
    }
}
class Cc{
    void testC(){
        System.out.println("方法C");
    }
}
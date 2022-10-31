package com.qx.day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/16/10:15
 * @Description: 测试staic final修饰的全局常量，在被其他类调用时，不走他所在类的构造器和静态代码块(用来初始化本类的静态成员)
 */
public class NotInit {
    public static void main(String[] args) {
        //经过编译优化，静态常量已经存到NotInit类自身常量池中，不会加载ConstC
        System.out.println(ConstC.str);
    }
}

class ConstC {
    public static final String str = "全局常量";
    public static int age;

    static {
        age = 50;
        System.out.println("ConstC init!");
    }

    public int count;
    public ConstC() {
        count = 90;
        System.out.println("ConstC ");
    }

}
package com.qx.day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/29/14:03
 * @Description: 内部类的访问权限修饰符
 */
public class C {
    final class InnerD{
        //不可以被继承
    }
    //外部类只能是缺省或public，内部类四种访问权限修饰符都可以
    private class InnerE extends InnerF{

    }
    protected class InnerF {

    }
}

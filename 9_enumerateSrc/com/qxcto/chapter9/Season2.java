package com.qxcto.chapter9;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/11/15/19:31
 * @Description: 枚举类实现接口
 */
public enum Season2 implements ITest{
    ;

    @Override
    public void test() {//此处不可缺省
        System.out.println("实现接口ITest的test方法");
    }
}

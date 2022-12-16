package chapter13.TestProxy;

import chapter13.TestProxy.ITestDemo;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/12/16/22:29
 * @Description: 实现接口的对象
 */
public class TestDemoImp implements ITestDemo {
    @Override
    public void test1() {
        System.out.println("执行test()方法");
    }

    @Override
    public void test2() {
        System.out.println("执行test2()方法");
    }
}

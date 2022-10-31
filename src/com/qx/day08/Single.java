package com.qx.day08;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/15/15:45
 * @Description:饿汉式单例模式
 */
public class Single {

   //构造方法私有化，不允许调用该类new对象
    private Single(){

    }

    //在类中new一次私有的Single对象
    private static Single single = new Single();

    //返回创建好的实例对象
    public static Single getInstance(){
        return single;
    }
}

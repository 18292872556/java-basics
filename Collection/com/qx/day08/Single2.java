package com.qx.day08;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/15/18:19
 * @Description:懒汉式单例模式
 */
public class Single2 {

    //私有化构造，让外面不能直接new
    private Single2(){

    }

    //创建对象为null，并不实例化
    private static Single2 single2 = null;

    //若是头次调用则new一个对象，
    public static Single2 getInstance(){
        if(single2 == null){
            single2 = new Single2();
        }

        return single2;
    }

}

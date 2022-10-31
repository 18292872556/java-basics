package com.qx.day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/28/17:26
 * @Description: 汽车生产工厂接口
 */
public interface BWMFactory {
    BWM productBWM();
}
class BWM3Factory implements BWMFactory{

    @Override
    public BWM productBWM() {
        System.out.println("生产宝马3系车，new一个BWM3对象并返回");
        return new BWM3();
    }
}

class BWM5Factory implements BWMFactory{

    @Override
    public BWM productBWM() {
        System.out.println("生产宝马5系车，new一个BWM5对象并返回");
        return new BWM5();
    }
}

class BWM7Factory implements BWMFactory{

    @Override
    public BWM productBWM() {
        System.out.println("生产宝马7系车，new一个BWM7对象并返回");
        return new BWM7();
    }
}
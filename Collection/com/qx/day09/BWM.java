package com.qx.day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/28/17:22
 * @Description: 宝马车的产品接口
 */

public interface BWM {
    //产品的信息介绍
    //车的发动方式
    void showInfo();
}
class BWM3 implements BWM{
    @Override
    public void showInfo() {
        System.out.println("这个是宝马3系");
    }
}

class BWM5 implements BWM{
    @Override
    public void showInfo() {
        System.out.println("这个是宝马5系");
    }
}

class BWM7 implements BWM{
    @Override
    public void showInfo() {
        System.out.println("这个是宝马7系");
    }
}
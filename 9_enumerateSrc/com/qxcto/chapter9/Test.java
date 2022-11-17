package com.qxcto.chapter9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/11/11/6:27
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        //===============================普通类获取固定的四个类对象==============================
        Season.getSpring();
        Season.getSummer();
        Season.getAutumn();
        Season.getWinter();

        //====================================枚举类=======================================

        //Season.SPRING这段执行就是获取一个Season对象
        SeasonEnum spring = SeasonEnum.SPRING;
        spring.showInfo();

        SeasonEnum summer = SeasonEnum.SUMMER;
        summer.showInfo();
        System.out.println(summer.equals(summer));//true
        System.out.println(spring.toString());//SPRING

        //=====================================注解==========================================

        new TestB().test1();//test1过时

        @SuppressWarnings({"rawtypes","unused"})
        List list = new ArrayList();//不写泛型会有警告


    }
}

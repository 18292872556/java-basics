package com.qx.day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/09/01/16:02
 * @Description:
 */
interface Aaa{
    public abstract void fun1();
}

public class Outer {
    public static void main(String[] args){
        new Outer().calllnner(new Aaa(){
            //接口是不能new但此处比较特殊，是子类对象实现接口，只不过没有为对象取名
            public void fun1(){
                System.out.println("Implement for fun1");
            }
        });//两步写成一步了
    }

    public void calllnner(Aaa a){
        a.fun1();
    }
}

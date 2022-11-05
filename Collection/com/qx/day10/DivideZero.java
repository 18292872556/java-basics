package com.qx.day10;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/09/01/20:07
 * @Description: 除数为0异常
 */
public class DivideZero{
    int x;
    public static void main(String[] args) {
        //除数为0的异常
//        int y;
//        DivideZero c=new DivideZero();
//        y=3/c.x;
//        System.out.println("program ends ok!");

        int y;
        DivideZero c=new DivideZero();
        try{
            y=3/c.x;
        }catch(ArithmeticException e){
            System.out.println("divide by zero error!");
        }

        System.out.println("this is a end");

        //处理异常
//        int i = 0;
//        try{//用try()来括住一段有可能出现异常的代码
//            System.out.println(3/i);//由于异常，使中断，可以通过异常处理机制防止程序的中断
//
//        }catch(Exception e){//当不知道捕获的是什么类型的异常时，可以直接使用所有异常的父类Exception
//            e.printStackTrace();
//            //System.out.println(e.getMessage());
//        }
//        System.out.println("ok");
    }
}

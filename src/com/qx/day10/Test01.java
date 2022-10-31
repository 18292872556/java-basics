package com.qx.day10;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/09/01/20:04
 * @Description: 数组越界访问异常
 */
public class Test01{
    public static void main(String[] args) {
        //数组越界异常
//        String friends[]={"lisa","bily","kessy"};
//        for(int i=0;i<5;i++){
//            System.out.println(friends[i]); //friends[4]?
//        }
//        System.out.println("\nthis is the end");

        //处理
        String friends[]={"lisa","bily","kessy"};
        try {
            for(int i=0;i<5;i++){
                System.out.println(friends[i]); //friends[4]?
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index error!");
        }
        System.out.println("\nthis is the end");

    }
}
package com.qx.day10;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/09/01/16:31
 * @Description: 异常
 */
public class Test {
    public static void main(String[] args) {

        //空指针异常
//        A a = null;//在这块，引用变量a没有指向任何对象，指向的是null，什么都没有，自然没有i的值
//        //java.lang.NullPointerException就会报空指针异常
//        System.out.println(a.i);

//        A a = null;
//        try{
//            System.out.println(a.i);
//        }catch(NullPointerException e){
//            System.out.println("nullpointer error!");
//        }
//        System.out.println("this is a end");


        //try中捕获到异常，后续句子不执行
//        int i = 0;
//        try{//用try{}来括住一段有可能出现异常的代码
//            System.out.println(1);
//            System.out.println(3/i);//由于异常，使中断，可以通过异常处理机制防止程序的中断
//            System.out.println(2);//这句不执行
//        }catch(Exception e){//当不知道捕获的是什么类型的异常时，可以直接使用所有异常的父类Exception
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//            System.out.println(3);
//        }finally{//这个finally可以写也可以不写，它是捕获异常的体系中最终一段会执行的部分，为了谢谢io操作和JDBC都会接触
//            System.out.println(4);
//        }
//
//        System.out.println("ok");


        //catch两次，第二个catch不执行
//        String[] strs = new String[]{"a","b"};
//        A a = null;
//        //try catch是为了防止程序可能出现的异常
//        //在捕获异常的代码块中(try()里的代码),如果前面的代码有异常了，就不会执行后面的
//        try{
//            System.out.println(strs[2]);//数组越界
//            System.out.println(a.i);//空指针
//        }catch(ArrayIndexOutOfBoundsException e1){
//            System.out.println(e1.getMessage());//输出2
//            e1.printStackTrace();
//        }catch(NullPointerException e2){
//            System.out.println(e2.getMessage());//不输出
//            e2.printStackTrace();
//        }
//        System.out.println("========");



        //练习1
//捕获到第一个异常以后，捕获不到第二个异常

//        try {
//            char[] arr = new char[]{'8', 'i', 'u'};
//            for (int i = 0; i < 5; i++) {
//                System.out.println(arr[i]);
//            }
//
//            System.out.println(3/0);
//        } catch (ArrayIndexOutOfBoundsException e1) {
//            e1.getMessage();
//            e1.printStackTrace();
//        }catch(ArithmeticException e2){
//            e2.getMessage();
//            e2.printStackTrace();
//        }
//        finally{
//            System.out.println("======end======");
//        }


//day08,编程题2
//        int[] arr1 = new int[5];
//        for(int i=0; i<5; i++){
//            arr1[i] = (int)(Math.random()*(101));
//        }
//        //输出随机数数组
//        for (int i=0; i<arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }
//        //创建一个控制台输入流
//        Scanner input = new Scanner(System.in);
//        System.out.println("随机数已经产生并存入数组");
//        System.out.println("请输入一个1-100之间的整数；");
//        int n = input.nextInt();
//        //System.out.println("接收到的整型值为"+n);
//        int i = 0;
//        for(i=0; i<arr1.length; i++){
//            if(arr1[i] == n){
//                System.out.println("数组中存在该数字");
//                break;
//            }
//        }
//        if(i == arr1.length){
//            System.out.println("数组中不存在该数字");
//        }
//        //关闭输入流
//        input.close();

//        //day08,编程题3
//        double[] arr2 = new double[10];
//        for(int i=0; i<arr2.length; i++){
//            arr2[i] = Math.random()*101;
//        }
//
//        for(int i=0; i<arr2.length; i++){
//            System.out.println(arr2[i]);
//        }
//        double maximum = arr2[0];
//        double sum = 0;
//        double average = 0;
//        for(int i=0; i<arr2.length; i++){
//            if(arr2[i] > maximum){
//                maximum = arr2[i];
//            }
//            sum += arr2[i];
//        }
//        System.out.println("该数组的最大值为"+maximum+"该数组的平均值为"+sum/arr2.length);
//


        //day08.编程题4
//        int[] arr3 = new int[10];
//        for(int i=0; i<arr3.length; i++){
//            arr3[i] = (int)(Math.random()*(100-1+1)+1);
//            System.out.print(arr3[i]+" ");
//        }
//        System.out.println();
//
//        int[] arr4 = new int[arr3.length/2];
//        for(int i=0,j=0; i<arr4.length && j<arr3.length; i++,j+=2){
//            arr4[i] = arr3[j];
//            System.out.print(arr4[i]+" ");
//        }

        //day08,编程题4，简单做法
//        int[] arr3 = new int[10];
//        for(int i=0; i<arr3.length; i++){
//            arr3[i] = (int)(Math.random()*(100-1+1)+1);
//            System.out.print(arr3[i]+" ");
//        }
//        System.out.println();
//
//        int[] arr4 = new int[arr3.length/2];
//        int j = 0;//用来遍历新的偶数组
//        for(int i=0; i<arr3.length; i++){
//
//            if(i%2 == 0){//只有下标模2为0，才赋值
//                arr4[j] =  arr3[i];
//                System.out.print(arr4[j]+" ");
//                j++;//只有赋值新数组后，新数组下标才++向后走
//
//            }
//        }


        //day08,编程题4，做法3
//        int[] arr3 = new int[10];
//        for(int i=0; i<arr3.length; i++){
//            arr3[i] = (int)(Math.random()*(100-1+1)+1);
//            System.out.print(arr3[i]+" ");
//        }
//        System.out.println();
//
//        int[] arr4 = new int[arr3.length/2];
//        for(int i=0; i<arr4.length; i++){
//            arr4[i] = arr3[i*2];
//            System.out.print(arr4[i] +" ");
//        }

        //day08,编程题5
        //4行3列
        int[][] arr5 = {{11,22,33},{44,55,66},{77,88,99},{11,22,33}};


        for(int i=0; i<arr5.length; i++){
            int sum = 0;
            for(int j=0; j<arr5[0].length; j++){
                sum += arr5[i][j];
            }
            System.out.println("第"+(i+1)+"个季度的营业额为："+sum);
        }
        System.out.println();
    }
}
class A{
    int i;
}








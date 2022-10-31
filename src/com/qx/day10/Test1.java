package com.qx.day10;
import java.io.*;
/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/09/02/23:24
 * @Description:
 */
public class Test1 {
    public static void main(String[] args){//可以在main方法继续抛出异常
        //main方法抛出异常直接抛到虚拟机上去了，就在程序中不能处理
//        B b = new B();

//        try{//throw在代码这抛出的异常，在调用方法去捕获处理
//            b.test();
//        }catch(Exception e){
//            e.printStackTrace();
//        }

//        Test1 t = new Test1();
//        try{
//            t.readFile();
//        }catch(IOException e){   }



//        C c= new C();
//        try{
//            c.test();
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }

        B b = new B();
        try{
            b.test1(-100);
            //b.test2(-100);
        }catch(Exception e){
            e.printStackTrace();
        }


    }

//    public void readFile()throws IOException {
//        FileInputStream in=new FileInputStream("myfile.txt");
//        int b;
//        b = in.read();
//        while(b!= -1)   {
//            System.out.print((char)b);
//            b = in.read();
//        }
//        in.close();
//    }

}
class B{
    int i;
    //可以用throws在代码这抛出异常，在调用方法去捕获处理
    //NullPointerException的父类是Exception
    public void test() throws NullPointerException{
        B b = null;
        System.out.println(b.i);
    }

    int age;
    public void test1(int age) throws Exception{
        if(age >= 0 && age <= 150){
            this.age = age;
            System.out.println("年龄是："+this.age);
        }else{
            throw new Exception("年龄在0到150之间");
        }
    }

    public void test2(int age) throws MyException{
        if(age >= 0 && age <= 150){
            this.age = age;
            System.out.println("年龄是："+this.age);
        }else{
            throw new MyException("年龄在0到150之间");
        }
    }
}
class C extends B{
    @Override
    public void test() throws NullPointerException {
        //public void test() throws Exception {//重写方法不能抛出比被重写方法范围更大的异常类型                               
        super.test();
    }
}

class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}
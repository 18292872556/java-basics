package com.qx.day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/29/16:21
 * @Description: static和非static内部类声明成员和调用外部类成员为static和非static的情况
 */
public class G {
    int a = 0;
    static int b = 0;
    static void showInfo(){

    }

    void showInfo2(){

    }

    static class InnerH{

        static int g;
        int h;
        void show(){
            //a = 9;//错误，内部类为static时，内部类中不能访问外部类的非static成员
            b = 0;//访问外部类的static成员


        }
    }
    class InnerI{
        //错误写法，非static内部类不可以定义静态成员 static int I = 0;
        int r;
        void show(){
            //内部类可以访问外部类的static成员和非static成员
            a=9;
            b=0;

        }

    }
}

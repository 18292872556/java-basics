package com.qxcto.chapter8;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/11/10/23:28
 * @Description: 测试泛型方法
 */
public class C<E> {
    /*在类中可定义泛型变量，可在普通方法内使用
    但不能在static静态方法中使用，如果要使用泛型，只能使用静态方法自己定义的泛型
    */

    private E e;

    //此处方法的泛型化都属于方法的重载，因为同名且参数不同；注意判断方法是否重载与返回值无关
    //===============================无返回值的方法泛型化================================
    public void test(){
        System.out.println(this.e);//可以使用泛型变量
    }
    //将public void test()；泛型化
    public<T> void test(T s){
        T t = s;
        System.out.println(this.e);//可以使用泛型变量
    }

    //==============================有返回值的方法泛型化===================================
    public String test1(String s){

        return s;
    }

    //泛型化
    public<T> T test1(T s){//与test中的T在一个类中不冲突，属于方法内的定义
        return s;
    }

    //===============================无返回值，可变参数类型的方法泛型化=============================
    public void test2(String... strs){//与数组做参数使用方法相同，传参可以传数组名，new匿名数组，直接传元素串
        for(String s: strs){
            System.out.println(s);
        }
    }
    //泛型化
    public<T> void test2(T... strs){
        for(T s: strs){
            System.out.println(s);
        }
    }

    //=================================静态的方法泛型化=========================================
    public static void test3(int i){
        System.out.println(i);
    }
    //泛型化
    public static<T> void test3(T t){
        System.out.println(t);
        //System.out.println(e);//类定义的泛型变量，静态方法不可用
    }

    //===================================方法的使用=====================================
    public static void main(String[] args) {
        /*泛型方法在调用之前没有固定的数据类型，在调用时，传入的参数是什么类型，就会把泛型改成什么类型*/
        C<Object> c = new C<Object>();//<Object>不可省略
        Integer ii = c.test1(2);
        Boolean b = c.test1(true);
        c.test();//输出null

        c.test2("enen","uyt","67ert");//元素串
        c.test2(new int[]{56,3,567,124});//匿名数组传参

        char[] arr = new char[]{'y','5','我','%'};//数组静态初始化
        c.test2(arr);

        Boolean[] arr2 = new Boolean[3];//数组动态初始化
        arr2[0] = false;
        arr2[1] = true;
        c.test2(arr2);

        C.test3(false);
    }
}

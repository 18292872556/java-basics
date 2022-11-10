package com.qxcto.chapter8;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/11/10/22:27
 * @Description: 测试泛型类
 */
public class A<T> {
    public A(T key){
        this.key = key;
    }
    public A(){

    }
    private T key;

    public void setKey(T key ){
        this.key = key;
    }

    public T getKey(){
        return this.key;
    }

    public static void main(String[] args){
        //----------------------------------------
        A<String > a1 = new A<String>();
        a1.setKey("xxx");
        String s = a1.getKey();

        //----------------------------------------
        A<Integer> a2 = new A<Integer>();
        a2.setKey(1);
        Integer i = a2.getKey();
        //----------------------------------------
        A a3 = new A();//相当于A<Object> a3 = new A<Obiect>();
        a3.setKey("hello");//或者a3.setKey(new Object());
        a3.setKey(896);
        Object obj = a3.getKey();//896
    }
}

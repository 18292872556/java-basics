package com.qxcto.chapter8;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/11/10/23:19
 * @Description: 测试泛型接口
 * 泛型接口IB<T>,类B1<T>继承接口，接口泛型不指定一起加到类中；类B2<T>继承接口，指定接口泛型
 *  * 此处的泛型T可以任意取名，A,B,V，一般使用T，意为type
 */
public class TestIB{
    public static void main(String[] args) {
        //B1和B2类的使用区别
        B1 b1 = new B1();//相当于B1<Object> b1 = new B1();
        B1<String> b2 = new B1();
        B1<Integer> b3 = new B1();

        B2 b4 = new B2();//不用指定泛型，因为已经确定为String

        b1.test(new Object());
        b1.test("yurt");
        b1.test(45634);
        b2.test("453rt");
        b3.test(876);
        b4.test("ryut");
    }
}


interface IB<T> {

    public T test (T t);
}

/**
 * @Description: 未传入泛型实参，声明类时，泛型声明一起加到类中
 */
class B1<T>  implements IB<T> {
    @Override
    public T test(T t) {
        return null;
    }
}

/**
 * @Description: 传入泛型实参String，如果实现接口时指定接口的泛型的具体数据类型，
 * 这个类实现接口所有方法的位置，都要泛型替换实际的具体数据类型
 */
class B2  implements IB<String>{

    @Override
    public String test(String s) {
        return null;
    }
}

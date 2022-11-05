package com.qx.day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/16/0:13
 * @Description: 测试关键字final
 */
public class TestPerson {
    final static String NAME = "全局常量1";//final static修饰的变量为全局常量
    final int count;
    final String PERSON_NAME = "哈哈";//final修饰的变量是就是全局常量
    final Person p = new Person();
    //final String PERSON_NAME;//错，final修饰的变量为常量，初始化时必须显示赋值
    int age;

    public TestPerson() {
        count = 9;
    }
    //p.name = "新名字";//写法错误，final修饰的对象也不能修改啥

    public void test() {
        //PERSON_NAME = "87";//错，final修饰的变量为常量不可再赋值
        System.out.println("普通方法test");
    }

    public final void test2() {
        System.out.println("父类的final方法");
    }
}

final class TestOverride extends TestPerson {
    @Override
    public void test() {
        super.test();
    }

//    @Override
//    public final void test2(){
//        System.out.println("父类的final方法");
//    }
    //错误，final修饰的方法不可被重写

}
//class TestOverride2 extends TestOverride{
//
//}//错误，TestOverride被final修饰，不可被继承
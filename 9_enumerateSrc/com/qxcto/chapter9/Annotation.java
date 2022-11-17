package com.qxcto.chapter9;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/11/11/7:22
 * @Description:
 */
public class Annotation {
}
class TestA{
    public void test(){

    }
}

class TestB extends TestA{
    @TestAnn(id=100,desc="姓名")//只能给属性做注解，因为@Target(ElementType.FIELD)
    String name;


    @Override
    public void test() {
        super.test();
    }

    public void test1(){

    }
}

@Target(ElementType.FIELD)//这个注解类是给其他类的属性做注解
@Retention(RetentionPolicy.RUNTIME)//定义注解的生命周期
@Documented//把注解抽取到docu文档中
@interface TestAnn{//一个注解类
    public int id() default 0;//注解不填时默认值0

    public String desc() default "";//该属性不写时默认空字符串

}
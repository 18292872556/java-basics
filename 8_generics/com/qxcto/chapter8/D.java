package com.qxcto.chapter8;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/11/11/4:47
 * @Description: 有限制的通配符，定义类的继承关系：Aa->Bb->Cc->Dd,B1和B2类实现接口IB
 */
class Aa{

}
class Bb extends Aa{

}class Cc extends Bb{

}
public class Dd extends Cc{
    public void test(List<? extends Cc> list){//只允许泛型为C及C的子类的引用调用
        Iterator<?> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public void test2(Set<? super Bb> set){//只允许泛型为TestIB及TestIB父类的引用调用
        Iterator<?> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public void test3(List<? extends IB> list){//只允许泛型为实现IB接口的实现类引用调用
        Iterator<?> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        Dd d = new Dd();
        List<Aa> la = new ArrayList<>();
        List<Bb> lb = new ArrayList<>();
        List<B1> lb1 = new ArrayList<>();
        List<Cc> lc = new ArrayList<>();
        List<Dd> ld = new ArrayList<>();

        Set<Aa> sa = new HashSet<>();
        Set<Bb> sb = new HashSet<>();
        Set<Cc> sc = new HashSet<>();
        Set<Dd> sd = new HashSet<>();


        //==========================调用test,list泛型为C及C的子类的引用调用=====================

        System.out.println("调用test,list泛型为C及C的子类的引用调用");
        d.test(lc);
        d.test(ld);
        //d.test(lb1);
        //====================调用test2,set泛型为TestIB及TestIB父类的引用调用==================
        System.out.println("调用test2,set泛型为TestIB及TestIB父类的引用调用");
        d.test2(sa);
        d.test2(sb);
        //d.test2(sc);
        //d.test2(sd);
        //====================调用test3,list泛型为实现IB接口的实现类引用调用=====================
        System.out.println("调用test3,list泛型为实现IB接口的实现类引用调用");
        //d.test3(la);
        //d.test3(lb);
        d.test3(lb1);
        //d.test3(lc);

    }

}

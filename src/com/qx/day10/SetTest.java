package com.qx.day10;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/09/04/21:02
 * @Description: Set学习
 */

public class SetTest {
    public static void main(String[] arghs){

        //hashset使用
//        Set set1 = new HashSet();//Set引用类型接收HashSet对象
//        set1.add(99);//添加元素
//        set1.add(3);
//        set1.add(1);
//        set1.add("bb");
//        set1.add(2);
//        set1.add(4);
//        set1.add("a");
//        set1.add("a");
//        set1.add(null);
//        set1.add("null");
//        set1.add(new MyData());
//        MyData d1 = new MyData("d1",56,78);
//        set1.add(d1);
//        System.out.println(set1);
//
//        set1.remove(1);//移除元素
//        System.out.println(set1);
//
//        System.out.println(set1.contains("a"));//判断是否包含元素a
//        set1.clear();//清空集合
//        System.out.println(set1);




        //Iterator
//        Set set2 = new HashSet();
//        set2.add("a");
//        set2.add("b");
//        set2.add("c");
//        set2.add("d");
//        System.out.println(set2);
//
//        //使用迭代器遍历集合
//        Iterator it = set1.iterator();
//
//        while(it.hasNext()){
//            System.out.print(it.next()+" ");
//        }
//        System.out.println();
//
////        //for each迭代集合
//        for(Object obj : set1){//把set2的每一个值取出来，赋值给obj,直到循环set的所有值
//            System.out.print(obj+" ");
//        }
//
//        System.out.println(set1.size());


        //String类的HashSet
//        Set set3 = new HashSet();
//        Set<String> set4 = new HashSet<String>();//指定String为集合的泛型，这个集合不能存String之外的数据类型，只能存String类
//        String s1 = "7";
//        String s2 = "uyjsdas";
//        set4.add(s1);
//        set4.add(s2);
//        set4.add("");
//        set4.add(null);
//        set4.add("haha");
//        set4.add("中国");
////        set4.add(8);
//        System.out.println(set4);


        //对象类型的HashSet,没意义，集合本来就是存对象的引用
//        Set<Object>set5 = new HashSet<Object>();
//        set5.add(new Test());
//        set5.add(new A());
//        set5.add(7);
//        set5.add("iut");
//        System.out.println(set5);

        //自定义类的HashSet
        Set<MyData> set55 = new HashSet<MyData>();
        //set55.


        //TreeSet
//        Set<Integer> set6 = new TreeSet<Integer>();
//
//        set6.add(5);
//        set6.add(98);
//        set6.add(5);
//        set6.add(0);
//        set6.add(78);
//        set6.add(897);
//       // set6.add(null);
//        System.out.println(set6);
//        set6.remove(5);
//        System.out.println(set6);
//        System.out.println(set6.contains(5));
//
//
//        //使用迭代器Iterator遍历集合
//        Iterator<Integer> it2 = set6.iterator();
//        while(it2.hasNext()){
//            System.out.print(it2.next()+",");
//        }
//        System.out.println();
//        //使用foreach遍历集合
//        for(Integer i :set6){
//            System.out.print(i+"，");
//        }

        //TreeSet不定义元素类型时，只能存一种数据类型,重复数据不存
        Set set7 = new TreeSet();
        set7.add(7);
        set7.remove(7);
        set7.add("fgr");
//        set7.remove("fgr");
//        set7.add("oiu7");
//        set7.add("i");
//        set7.add("i");
//        set7.add(true);

        set7.add("y");
       // set7.add(null);
        set7.add("yy");
        set7.add("uyhr");

        System.out.println(set7);

//
        Person p1 = new Person("张三",9);
        Person p2 = new Person("李四",9);
        Person p3 = new Person("王五",67);
        Person p4 = new Person("赵六",24);
//
        Set<Person> set8 = new TreeSet<Person>();
        //Set<Person> set8 = new TreeSet<Person>(new Person());
        set8.add(p1);
        set8.add(p2);
        set8.add(p3);
        set8.add(p4);
        //System.out.println(set8);
        //[com.qx.day10.Person@2db0f6b2, com.qx.day10.Person@3cd1f1c8, com.qx.day10.Person@3a4afd8d, com.qx.day10.Person@1996cd68]

        for(Person p: set8){
            System.out.println(p.name+" "+p.age);
        }


    }
}

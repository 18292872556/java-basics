package com.qx.day10;

import java.util.List;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/09/08/15:40
 * @Description: List测试
 */
public class ListTest {
    public static void main(String[] args){


        //--------------------------------规定泛型的ArrayList---------------------------------------
        MyData d1 = new MyData(45,"hyud",234);
        MyData d2 = new MyData(567,"fhus",4567);

        Student s1 = new Student(2016,"张三");

        List<String> list1 = new ArrayList<String>();
        list1.add("b");//索引下标0
        list1.add("ulk");//下标1
        list1.add("hyds");//下标2
        list1.add("jh");//下标3
        list1.add("b");
        list1.add("ulk");
        System.out.println(list1);

        System.out.println(list1.get(2));//通过索引来访问指定位置的集合元素
        list1.add(1,"iu");
        System.out.println(list1);
        list1.clear();


        //------------------MyData的ArrayList---------------
        List<MyData> list2 = new ArrayList<MyData>();
        list2.add(new MyData(5,"uijt",456));
        list2.add(d1);
        list2.add(d2);

        for(MyData d:list2){
            System.out.println(d.getData1()+" ");
        }



        //----------------------------------不规定泛型的ArrayList--------------------------------------------

//        List list2 = new ArrayList();
//        list2.add("b");
//        list2.add(8);
//        System.out.println(list2);//[b, 8]


//        List list3 = new ArrayList();
//        list3.add("iu");
//        list3.add("Taylor");
//        list3.add('o');
//        list3.add(8);
//        list3.add(null);
//        list3.add("happy");
//        list3.add(8);
//        list3.add(555);
//
//        list3.add(d1);
//        list3.add(s1);
//        list3.add(5,555);
//        System.out.println(list3);
//
//        list3.remove(0);//移除索引为0的元素
//        System.out.println(list3);
//        list3.remove("happy");//移除元素happy
//        System.out.println(list3);
//
//        System.out.println(list3.indexOf("Taylor"));//查找元素在集合中第一次出现的索引下标
//        System.out.println( list3.lastIndexOf(555));//查找元素最后一次出现的索引
//        list3.set(3,333);//改索引3位置元素为333
//        System.out.println(list3);
//
//
//
//        List sublist = list3.subList(4,6);//截取list3索引[4,6)的元素形成一个新集合。接去的时候，包含开始索引，不包含结束时索引
//        System.out.println(sublist);
//
//        System.out.println(list3.size());// 返回集合长度


    }

}

package com.qx.day10;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/09/08/0:25
 * @Description:
 */
 public class Person implements Comparator<Person> {//把Person对象存到TreeSet中并且按照年龄排序
     public Person(){
     }
     public Person(String name, int age){
         this.name = name;
         this.age = age;
     }


    String name;
    int age;

    /**
    * @Description: 定义比较大小方式
    * @Param: [o1, o2]
    * @return: int
    * @Author: xuexuezi
    * @Date: 2022/9/8
    */
//    @Override
//    public int compare(Person o1, Person o2) {
//        //return 0;
//        if(o1.age > o2.age){
//            return 1;
//        }else if(o1.age < o2.age){
//            return -1;
//        }else{
//            return 0;
//        }
//    }
    @Override
    public int compare(Person o1, Person o2){
        if(o1.age > o2.age){
            return -1;//认为o1<o2，o2排在后
        }else if(o1.age < o2.age){
            return 1;
        }else{
            return 0;
        }
    }

    public void showInfo(){
        System.out.println("姓名："+this.name+"年龄："+this.age);
    }
}

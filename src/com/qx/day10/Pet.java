package com.qx.day10;

import java.util.*;
import java.util.Map.Entry;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/09/17/3:50
 * @Description:
 */
public class Pet implements Comparator<Pet> {
    public Pet(){

    }

    public Pet(String name,int num, int legNum){
        this.name = name;
        this.num = num;
        this.legNum = legNum;
    }
    private String name;
    private int num;
    private int legNum;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getNum(){
        return this.num;
    }
    public void setNum(int num){
        this.num = num;
    }

    public int getLeg(){
        return this.legNum;
    }

    public void setLeg(int legNum){
        this.legNum = legNum;
    }

    @Override
    public int compare(Pet o1, Pet o2) {
        if(o1.name.compareTo(o2.name) > 0){//指定的数o1.name>参数o2.name,返回正数
            return 1;//得出o1>o2.并排在o2后
        }else if(o1.name.compareTo(o2.name) < 0){//指定的数o1.name<o2.name，返回负数
            return -1;
        }else{//相等返回0
            return 0;
        }
    }

//    @Override
//    public String toString() {
//        //return super.toString();
//        return getClass().getName()+"[name = "+name+",num = "+num+",legNum = "+legNum+"]";
//    }

    public static void main(String[] args){

        Pet pet1 = new Pet("边牧",1,4);
        Pet pet2 = new Pet("缅因猫",2,4);
        Pet pet3 = new Pet("鹦鹉",4,2);
        Pet pet4 = new Pet("鲸鱼",1,0);
        Map<Integer,Pet> map1 = new HashMap<Integer,Pet>();//该种宠物养了几只
        map1.put(1,pet1);
        map1.put(23,pet4);
        map1.put(56,pet2);
        map1.put(8,pet2);
        map1.put(2,pet3);

        //注意，以自定义的类为key时，需要在构造map时提供参数new一下自定义的类
        Map<Pet,String> map2 = new TreeMap<Pet,String>(new Pet());//这类宠物性格特征
        map2.put(pet1,"聪明");
        map2.put(pet2,"温顺");
        map2.put(pet3,"漂亮");
        map2.put(pet4,"孤独");

//        //1.直接遍历
//        System.out.println(map1);
//        System.out.println(map2);
//
//        //2.使用map.keySet()方法把所有key存入Set集合，再根据map.get()方法，根据key取到value
//        Set<Integer> key1 = map1.keySet();
//        for(Integer k1: key1){//此处，key为个数直接输出，vaule为对象，直接输出对象是散列码，最好是输出对象的名称
//            System.out.println(k1+" = "+map1.get(k1).name);
//        }
//
//        Set<Pet> key2 = map2.keySet();
//        for(Pet k2: key2){//此处，key为对象，输出对象的名称比较好
//            System.out.println(k2.name+" = "+map2.get(k2));
//        }
//

//        //3.遍历3
        Set<Entry<Integer,Pet>> entrys = map1.entrySet();
        System.out.println(entrys);

        Set<Entry<Pet,String>> entryss = map2.entrySet();
        System.out.println(entryss);


        //4.遍历Entry类型的Set,使用Entry的getKey()和getValue()方法
        for(Entry<Integer,Pet> e: entrys){
            System.out.println(e.getKey()+" = "+ e.getValue().getName());
        }

        for(Entry<Pet,String> e: entryss){
            System.out.println(e.getKey().getName() +" = "+e.getValue());
        }


        //5.遍历5使用forEach
        map1.forEach((k,v)->{
            System.out.print(k+"="+v.getName()+" ");
        });
        System.out.println();

        map2.forEach((k,v)->{//Lambda表达式内k,v随意起名。只是代表map中每个键值对的key和value
            System.out.print("key:"+k.getName()+"="+"value:"+v+" ");
        });

    }

}

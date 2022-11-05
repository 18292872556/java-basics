package com.qx.day10;

import java.util.*;
import java.util.Map.Entry;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/09/08/17:25
 * @Description: Map
 */
public class MapTest {
    public static void main(String[]args){

//=======================================HashMap==================================================================
        PetShop s5 = new PetShop("店5",234);
        PetShop s6 = new PetShop("店6",80);

        Map map = new HashMap();
        map.put(5,6);
        map.put(5,"yu");
        map.put("哈哈哈",'y');
        map.put(4.7,'y');
        map.put(s5,"PetShop类店1");
        map.put(null,"thu");
        map.put(true,null);

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(1,"tuyr");
        map2.put(null,"rtgf");
        map2.put(4,null);
        System.out.println(map2);

        System.out.println(map);


        Student stu1 = new Student();
        Student stu2 = new Student(2345,"张三");
        Student stu3 = new Student(567,"李四");
        Map<Student,Character> maps = new HashMap<>();
        maps.put(stu1,'e');
        maps.put(stu3,'5');
        maps.put(stu2,'o');

        maps.forEach((k,v)->{
            System.out.println(k.getName()+" = "+v);
        });

        Set<Entry<Student,Character>> entry = maps.entrySet();




        Map<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("b",1);//添加数据
        map1.put("c",2);
        map1.put("e",2);
        map1.put("f",8);
        map1.put("h",0);
//        System.out.println(map1);
//
//        System.out.println(map1.get("b"));//根据key取值
//
//        map1.remove("c");//根据key移除键值对
//        System.out.println(map1);
//
//        System.out.println(map1.size());//map集合的长度
//
//        System.out.println(map1.containsKey("h"));//判断当前的map集合是否包含指定的key
//
//        System.out.println(map1.containsValue(10));//判断当前的map集合是否包含指定的value
//
//        //map1.clear();//清空集合
//
//        Set<String> keys = map1.keySet();//获取map集合的key的集合,return Set<E>
//
//        System.out.println(map1.values());//获取集合的所有value值,return Collection
//
//        //遍历map集合，通过map.keySet();
//        for(String key: keys){
//            System.out.print(key+"="+map1.get(key)+",");//b=1,e=2,f=8,h=0,
//        }
//        System.out.println();
//
//        //返回映射的Set视图
//        Set<Entry<String,Integer>> entrys = map1.entrySet();
//
//        System.out.println(entrys);//[b=1, e=2, f=8, h=0]
//
//        for(Entry<String,Integer> en: entrys){
//            System.out.println(en.getKey()+" = "+en.getValue());

//===========================================TreeMap==============================================================


//        Map<Integer,String> map2 = new TreeMap<Integer,String>();
//        map2.put(4,"a");
//        map2.put(3,"a");
//        map2.put(2,"f");
//        //TreeMap的自然排序指字典排序
//        System.out.println(map2);
//
//        Map<String,String> map3 = new TreeMap<String,String>();
//        map3.put("ui","jh");
//        map3.put("u","78");
//        map3.put("ui","yh");//key不能重复
//        map3.put("hu","nj");
//        map3.put("gh","df");
//        System.out.println(map3);

        Map<PetShop,String> map4 = new TreeMap<PetShop,String>(new PetShop());//按照petNum升序排序
        PetShop s1 = new PetShop("店1",8);
        PetShop s2 = new PetShop("店2",8);
        PetShop s3 = new PetShop("店3",7);
        PetShop s4 = new PetShop("店4",24);
        map4.put(s1,"布偶猫");
        map4.put(s2,"边牧");
        map4.put(s3,"萨摩耶");
        map4.put(s4,"缅因");
        //map4.put("ui","String类");
//        map4.put(null,"是null");
//        map4.put(s1,null);
        Set<Entry<PetShop,String>> entrys = map4.entrySet();
        for(Entry<PetShop,String> e: entrys){
            System.out.println(e.getKey().getShopName()+" = "+e.getValue()+","+e.getKey().getPetNum());
        }

        Map map3 = new TreeMap();
        map3.put("uie",34);
        map3.put("tyu",'9');
        //map3.put(45,678);
        //map3.put(45,'8');
        System.out.println(map3);



//
//        //遍历1
//        System.out.println(map4);
//
//        //遍历2
//        //存key
//        Set<PetShop> keys = map4.keySet();
//        for(PetShop k:keys){
//            System.out.println(k.getShopName()+"  = "+map4.get(k));
//        }
//
//
//        //遍历3
//        Set<Entry<PetShop,String>> entrys = map4.entrySet();
//
//        System.out.println(entrys);
//
//        //遍历4
//        for(Entry<PetShop,String> e:entrys ){
//            System.out.println(e.getKey().getShopName()+"="+e.getValue());
//        }


       //Iterator接口
        //HashSet
//        Set<String> set1 = new HashSet<String>();
//        set1.add("ufo");
//        set1.add("jisoo");
//        set1.add("lisa");
//
//
//        Iterator<String> it1 = set1.iterator();
//        while(it1.hasNext()){
//            String i = it1.next();//每次执行都会返回下一个元素，并更新迭代器状态。如果是第一次执行，就返回第一个元素
//            if(i.compareTo("ufo") == 0){
//                it1.remove();
//            }else{
//                System.out.println(it1.next()+" ");
//            }
//
//        }

        //TreeSet
        Set<Integer> set2 = new TreeSet<Integer>();

//        set2.add(9);
////        set2.add(56);
////        set2.add(6);
////        set2.add(99);
////        set2.add(78);
////        set2.add(87);
////        Iterator<Integer> it2 = set2.iterator();
////
////        while(it2.hasNext()){
////            System.out.println(it2.next());
////            System.out.println(it2.next());
////
////            it2.remove();
////
////        }
////        System.out.println(set2);


        //ArrayList
//        List<Character> list = new ArrayList<Character>();
//        list.add('y');
//        list.add('t');
//        list.add('T');
//        list.add('k');
//        Iterator<Character> it3 = list.iterator();
//        while(it3.hasNext()){
//            if(it3.next() == 't'){//会删掉t,因为现在在y，但是返回后一位t，删除返回的这一位
//                it3.remove();
//            }
//        }
//        System.out.println(list);


    }
}

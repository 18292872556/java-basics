package com.qx.javaTest;


import com.qx.day10.MyData;
import com.qx.javaTest.Puppy;
import com.qx.javaTest.Student;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/10/15/13:05
 * @Description:
 */
public class Test {
    public static void main(String[] args){
//        //一、
//        HashMap<Integer,String> map = new HashMap<Integer,String>();
//        map.put(1,"张三丰");
//        map.put(2,"周芷若");
//        map.put(3,"汪峰");
//        map.put(4,"灭绝师太");
//
//        //遍历集合
//        //遍历1，直接输出
//        System.out.println("遍历1，直接输出");
//        System.out.println(map);
//
//        //遍历2，map.keySet返回key的Set集合；再map.get(key)获得value
//        System.out.println("遍历2，map.keySet返回key的Set集合；再map.get(key)获得value");
//        Set<Integer> key1 = map.keySet();
//        for(Integer k: key1){
//            System.out.println(k+"="+map.get(k)+" ");
//        }
//        //遍历3.使用map.entrySet()方法，并使用Entry类的Set集合存放所有键值对
//        System.out.println("遍历3.使用map.entrySet()方法，并使用Entry类的Set集合存放所有键值对");
//        Set<Entry<Integer,String>> entrys = map.entrySet();
//        System.out.println(entrys);
//
//        //遍历4.遍历Entry类型的Set,使用Entry的getKey()和getValue()方法
//        System.out.println("遍历4.遍历Entry类型的Set,使用Entry的getKey()和getValue()方法");
//        for(Entry<Integer,String> e:entrys){
//            System.out.println(e.getKey()+"="+e.getValue());
//        }
//        //遍历5.forEach
//        //通过 lambda 表达式使用 forEach()
//        System.out.println("遍历5.通过 lambda 表达式使用 forEach()");
//        map.forEach((key, value) -> {
//            System.out.print(key + "=" + value + " ");
//        });
//
//        //2.向该map集合中插入一个编码为5姓名为李晓红的信息
//        map.put(5,"李晓红");
//        System.out.println(map);
//        //3.移除该map中的编号为1的信息
//        map.remove(1);
//        System.out.println(map);
//        //4.将map集合中编号为2的姓名信息修改为"周林"
//        map.replace(2,"周林");//替换指定的key对应value
//        //map.put(2,"周林");//小技巧，可以直接添加。因为如果key存在，就会替换这个key的value
//        System.out.println(map);




//        //二、
//        String[] arr1 = {"黑龙江省","浙江省","江西省","广东省","福建省"};
//        String[] arr2 = {"哈尔滨","杭州","南昌","广州","福州"};
//
//        Map<String,String> map2 = new TreeMap<>();
//        for(int i=0; i<arr1.length && i<arr2.length; i++){
//            map2.put(arr1[i],arr2[i]);
//        }
//        //遍历1，直接输出
//        System.out.println(map2);
//
//        //遍历2，Set存储key
//        Set<String> key2 = map2.keySet();
//        for(String k:key2){
//            System.out.println(k+"="+map2.get(k));
//        }

//        //遍历3，entry类
//        Set<Entry<String,String>> entrys2 = map2.entrySet();
//        System.out.println(entrys2);
//
//        //遍历4，entry类foreach
//        for(Entry<String,String> e:entrys2){
//            System.out.println(e);
//        }


        //三、
        //
        //Scanner buffer = new Scanner(System.in);//空格结束
//        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));//回车结束输入，中间可用空格隔开
//        System.out.println("请输入字符串");
//        String str = "";//空字符串
//        try {
//            //str = buffer.next();//空格结束
//            str = buffer.readLine();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        char[] arr = str.toCharArray();
//        int[] ascii = new int[178];//默认值全为0
//
//        for (int i=0; i < arr.length; i++) {
//            //遍历字符数组，检索字符个数
//            ascii[arr[i]]++;//每检索到一个字符就在对应位置++
//
//        }
//
//        for(int i=0; i<ascii.length; i++){
//            if(ascii[i] != 0){
//                System.out.print((char)i+"("+ascii[i]+")");
//            }
//        }

        //用Map组建对应关系
//        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("请输入字符串");
//        String str2="";//如果不赋值，因为不确定try中能否成功赋值。toCharArray时字符有空的可能，编译出错。
//        try{
//            str2 = buf.readLine();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//
//        //注意到，元素不装箱，依然可以正常将char类型的元素赋值给类型为Character的key
//        //因为自动装箱
//        char[] arr4 = str2.toCharArray();
//
////        //将元素装箱
////        char[] arr3 = str2.toCharArray();
////        Character[] arr4 = new Character[arr3.length];
////        for(int i=0; i<arr3.length; i++){
////            arr4[i] = new Character(arr3[i]);
////        }
//
//        //读到字符数组以后，构造Map
//        Map<Character,Integer> map3 = new TreeMap<>();
//        for(int i=0; i<arr4.length; i++){
//            //每读到一个字符就输入，因为key重复的话只刷新value，所以直接put,value++即可
//            //如果读到新字符,get(key)将无法获取value,注意区分
//
//            if(map3.containsKey(arr4[i])){
//                map3.put(arr4[i],map3.get(arr4[i])+1);
//            }else{
//                map3.put(arr4[i],1);
//            }
//
//        }
//
//
//        //map的5种遍历方式
//        System.out.println("1.map3直接输出");
//        System.out.println(map3);
//
//        System.out.println("2.keySet()方法遍历key+get(key)获得value");
//        Set<Character> key3 = map3.keySet();
//        for(Character k: key3){
//            System.out.print(k+"("+map3.get(k)+")");
//        }
//        System.out.println();
//
//        System.out.println("3.entry类型接收map的entrySet方法，一个entry类对象相当于一个键值对。直接输出entrySet");
//        Set<Entry<Character,Integer>> entrys3= map3.entrySet();
//        System.out.println(entrys3);
//
//        System.out.println("4.for each输出entrySet");
//        Set<Entry<Character,Integer>> entrys4= map3.entrySet();
//        for(Entry<Character,Integer> e:entrys4){
//            System.out.print(e.getKey()+"("+e.getValue()+")");
//        }
//        System.out.println();
//
//        System.out.println("5.Lambde表达式forEach输出");
//        map3.forEach((k,v)->{
//            System.out.print(k+"("+v+")");
//        });


        //测试两种定制排序Student和MyData
        //有排序功能的集合有TreeSet，TreeMap

        //Student类继承接口Comparable<E>,实现方法compareTo(E o)
        Student stu1 = new Student(2026,"学生1",15);
        Student stu2 = new Student(2022,"学生2",23);
        Student stu3 = new Student(2020,"学生3",35);
//
//        //MyData类继承接口Comparator<E>,实现方法compare(E o1, E o2)
//        MyData d1 = new MyData(34,"数据1",56);
//        MyData d2 = new MyData(45,"数据2",6778);
//        MyData d3 = new MyData(23,"数据3",908);
//
//        //Puppy类，普通类
//         Puppy p1 = new Puppy(8,"边牧");
//         Puppy p2 = new Puppy(4,"伯恩山");
//         Puppy p3 = new Puppy(3,"萨摩耶");
//
//
//         //1.自然排序的自定义类Student
//         //TreeSet
//        Set<Student> set1 = new TreeSet<>();
//        set1.add(stu1);
//        set1.add(stu2);
//        set1.add(stu3);
//        System.out.println("实现自然排序自定义类的TreeSet"+set1);
//
//
//        //TreeMap
//        Map<Student,Integer> map1 = new TreeMap<>();
//        map1.put(stu1,23);
//        map1.put(stu2,24);
//        map1.put(stu3,45);
//        System.out.println("实现自然排序自定义类的TreeMap"+map1);
//
//
//        //2.比较器排序的自定义类MyData,比较器类型的自定义类需要在new集合的时候提供该类对象作为参数
//        //TreeSet
//        Set<MyData> set2 = new TreeSet<>(new MyData());
//        set2.add(d1);
//        set2.add(d2);
//        set2.add(d3);
//        System.out.println("实现比较器排序的自定义类的TreeSet"+set2);
//
//        //TreeMap
//        Map<MyData,Student> map2 = new TreeMap<>(new MyData());
//        map2.put(d1,stu1);
//        map2.put(d2,stu2);
//        map2.put(d3,stu3);
//        System.out.println("实现比较器排序的自定义类的TreeMap"+map2);
//
//
//        //普通类Puppy,在集合new的时候传入匿名类实现普通自定义类的定制排序方法
//        //TreeSet
//        //自然排序不能这样写，因为本身就是重写在自定义类中直接使用，不需要传参
////        Set<Puppy> set3 = new TreeSet<>(new Comparable<Puppy>(){
////            @Override
////            public int compareTo(Puppy o) {
////                //return 0;
////
////            }
////        });
//
//        Set<Puppy> set3 = new TreeSet<Puppy>(new Comparator<Puppy>(){
//            @Override
//            public int compare(Puppy o1, Puppy o2) {
//                //return 0;
//                if(o1.getId() > o2.getId()){
//                    return 1;
//                }else if(o1.getId() < o2.getId()){
//                    return -1;
//                }else{
//                    return 0;
//                }
//            }
//        });
//        set3.add(p1);
//        set3.add(p2);
//        set3.add(p3);
//        System.out.println("普通自定义类在new TreeMap时传匿名对象重写比较器"+set3);
//
//
//        //TreeMap,key和value都是自定义类的情况，
//
//        Map<Puppy,MyData> map3 = new TreeMap<>(new Comparator<Puppy>(){
//            @Override
//            public int compare(Puppy o1, Puppy o2) {
//                //return 0;
//                if(o1.getId() > o2.getId()){
//                    return -1;
//                }else if(o1.getId() < o2.getId()){
//                    return 1;
//                }else{
//                    return 0;
//                }
//            }
//        });
//        map3.put(p1,d1);
//        map3.put(p2,d2);
//        map3.put(p3,d3);
//        System.out.println("普通自定义类在new TreeMap时传匿名对象重写比较器"+map3);

        Integer i = 8;
        System.out.println(i.compareTo(90));

        List list4 = new ArrayList();
        list4.add(9);
        list4.add('u');
        list4.add(null);
        list4.add(stu1);
        System.out.println(list4);

    }
}

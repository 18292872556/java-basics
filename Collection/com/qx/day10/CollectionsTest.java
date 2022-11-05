//package com.qx.day10;
//
//import java.util.*;
//
///**
// * Created with IntelliJ IDEA.
// *
// * @Author: xuexuezi
// * @Date: 2022/09/30/16:37
// * @Description:
// */
//public class CollectionsTest {
//    public static void main(String[] args) {
//
//
//        //测试List的5种方法
//
////        List<Character> list = new ArrayList<Character>();
////        list.add('r');
////        list.add('y');
////        list.add('u');
////        list.add('h');
////        System.out.println(list);
////        //反转
//////        Collections.reverse(list);
////        //洗牌
////        //Collections.shuffle(list);
////        //升序排序
//////        Collections.sort(list);
////        //交换
////        Collections.swap(list,0,3);
//////
////      System.out.println(list);
//////
////        List<Double> list0 = new ArrayList<Double>();
////        list0.add(7.9);
////        list0.add(45.765);
////        list0.add(67.9876);
////        list0.add(7.0);
////        System.out.println(list0);
////        //反转
//////        Collections.reverse(list0);
////        //洗牌
////        //Collections.shuffle(list0);
////        //升序排序
////        //Collections.sort(list0);
////
////        //交换
////        Collections.swap(list0,0,3);
////      System.out.println(list0);
//////
//////
////
////        List<String> list1 = new ArrayList<String>();
////        list1.add("ty");
////        list1.add("gth");
////        list1.add("frgg");
////        list1.add("haha");
////        list1.add("ha");
////        System.out.println(list1);
////        //反转
////        //Collections.reverse(list1);
////        //洗牌
////       // Collections.shuffle(list1);
////        //升序排序
////        //Collections.sort(list1);
//        //交换
////        Collections.swap(list1,0,3);
////        System.out.println(list1);
////
////        //创建存储自定义类的list
////
////        MyData d1 = new MyData(20,"年，月",25);
////        MyData d2 = new MyData(18,"时,分",31);
////        MyData d3 = new MyData(24,"年龄，身高",168);
////        List<MyData> list2 = new ArrayList<MyData>();
////        list2.add(d1);
////        list2.add(d3);
////        list2.add(d2);
//        //用迭代器遍历输出对象的属性
//        // Iterator<MyData> it = list2.iterator();
//        //System.out.println(it.next().getName()+it.next().getName()+it.next().getName());
////        while(it.hasNext()){
////            MyData i = it.next();//用i记录it.next()因为每调用一次next方法，迭代器都会返回下一位，并不会固定停留在某一位
////            System.out.println("name="+i.getName()+"; data1="+i.getData1()+"; data2="+i.getData2());
////        }
////
////        //反转
////        //Collections.reverse(list2);
////        //洗牌
////        //Collections.shuffle(list2);
////        //升序排序
//////        MyData data = new MyData();
//////        Collections.sort(list2,data);
//        //交换
////        Collections.swap(list2,0,2);
////
////        it = list2.iterator();
////        while (it.hasNext()) {
////            MyData i = it.next();//用i记录it.next()因为每调用一次next方法，迭代器都会返回下一位，并不会固定停留在某一位
////            System.out.println("name=" + i.getName() + "; data1=" + i.getData1() + "; data2=" + i.getData2());
//
//
////=================================================================================================
//        //测试Collection类的6种方法
//        //工具，返回最大值，最小值，返回元素出现次数，新值代替旧值
//        //Collection类的子接口包含，List和set
//
//        //构造List<MyData>,List<String>,List<Integer>,List<Double>
//
//
//        //ArrayList特点：1.元素可重复2.存储式自然排序3.可以存储不同类型元素4.有索引从0开始指向元素
//        //构造自定义元素的list1
//
//        MyData d1 = new MyData(20, "年，月", 4);
//        MyData d2 = new MyData(18, "时,分", 31);
//        MyData d3 = new MyData(24, "年龄，身高", 168);
//        MyData d4 = new MyData(168, "身高，体重", 75);
//
//        List<Integer> list1 = new ArrayList<Integer>();
//        List<MyData> list2 = new ArrayList<>();
//
//
//        //HashSet特点：1.排序随机2.元素不可重复3.可以存储不同类型元素4.元素可以是null，表示空
//        Set<Character> hset1 = new HashSet<>();
//        Set<MyData> hset2 = new HashSet<>();
//
//        Set<Double> tset1 = new TreeSet<>();
//        //Set<MyData> tset2 = new TreeSet<>(new MyData());
//
//        list1.add(8);
//        list1.add(67);
//        list1.add(345);
//        list1.add(9);
//
//        list2.add(d1);
//        list2.add(d2);
//        list2.add(d3);
//
//        hset1.add('a');
//        hset1.add('b');
//        hset1.add('c');
//
//        hset2.add(d1);
//        hset2.add(d2);
//        hset2.add(d3);
//
//        tset1.add(4.6);
//        tset1.add(9.674);
//        tset1.add(1.0);
//
////        tset2.add(d1);
////        tset2.add(d2);
////        tset2.add(d3);
//
//
//
//
//        //1. Object max(Collection)根据元素的自然顺序，返回给定集合中的最大元素
//        System.out.println("打印list1,为存储Integer元素的ArrayList"+list1);
//        System.out.println("list1的max:"+Collections.max(list1));
//
//        System.out.println("打印hset1,为存储Character元素的HashSet"+hset1);
//        System.out.println("hset1的max:"+Collections.max(hset1));
//
//        System.out.println("打印tset1,为存储Double元素的TreeSet"+tset1);
//        System.out.println("tset的max："+Collections.max(tset1));
//
//
//        //2.Object max(Collection,Comparator)根据Comparator指定的顺序，返回给定集合中的最大元素
////
//        System.out.println("打印list2，为存储MyData元素的ArrayList"+list2);
////        Iterator<MyData> it1 = list2.iterator();
////        while(it1.hasNext()){
////            System.out.print(it1.next()+" ");
////        }
////        System.out.println();
//        //写法一：自定义类中有重写比较器
//        System.out.println("list2的max的data1："+Collections.max(list2, new MyData()).getData1());
//
//        //写法二：普通类，在参数部分重写
//        //本身ArrayList存储的元素是不需要定制排序的，但是这个方法需要
//        List<Student> list3 = new ArrayList<Student>();
//        list3.add(new Student(01,"张三"));
//        list3.add(new Student(02,"李四"));
//        list3.add(new Student(03,"王五"));
//        System.out.println("打印list3,为存储Student的ArryList"+list3);
//        System.out.println("list3的max的id:"+Collections.max(list3,new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                //return 0;
//                if (o1.getId() > o2.getId()) {
//                    return 1;//升序
//                } else if (o1.getId() < o2.getId()) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        }).getId());
//
//        System.out.println("打印hset2,为存储MyData元素的HashSet"+hset2);
//        System.out.println("hset2的max的data1：" + Collections.max(hset2, new MyData()).getData1());
//
//        System.out.println("打印tset2，为存储MyData元素的TreeSet"+tset2);
//        System.out.println("tset2的max的data1:" + Collections.max(tset2, new MyData()).getData1());
//
//        // 3. Object min(Collection)
//
//        System.out.println("打印list1,为存储Integer元素的ArrayList" + list1);
//        System.out.println("list1的min:" + Collections.min(list1));
//
//        System.out.println("打印hset1,为存储Character元素的HashSet" + hset1);
//        System.out.println("hset1的min:" + Collections.min(hset1));
//
//        System.out.println("打印tset1,为存储Double元素的TreeSet"+tset1);
//        System.out.println("tset的min："+Collections.min(tset1));
//
////         4. Object min(Collection, Comparator)
//        System.out.println("打印tset2，为存储MyData元素的TreeSet"+list2);
//        System.out.println("list2的min的data1："+Collections.min(list2, new MyData()).getData1());
//
//        System.out.println("打印hset2,为存储MyData元素的HashSet"+hset2);
//        System.out.println("hset2的min的data1："+Collections.min(hset2,new MyData()).getData1());
//
//        System.out.println("打印tset2，为存储MyData元素的TreeSet"+hset2);
//        System.out.println("tset2的min的data1:"+Collections.min(tset2,new MyData()).getData1());
//
////         5. int frequency(Collection,Object)返回指定集合中指定元素的出现次数
//
//        list1.add(96);
//        list1.add(96);
//        System.out.println("打印list1,为存储Integer元素的ArrayList" + list1);
//        System.out.println("list1的96出现次数:" + Collections.frequency(list1,96));
//
//
//        System.out.println("打印hset1,为存储Character元素的HashSet" + hset1);
//        System.out.println("hset1的'u:出现次数" + Collections.frequency(hset1,'u'));
//
//
//        tset1.add(5.8);
//        tset1.add(5.8);
//        System.out.println("打印tset1,为存储Double元素的TreeSet"+tset1);
//        System.out.println("tset的5.8出现次数："+Collections.frequency(tset1,5.8));
//
//
//        list2.add(new MyData(11,"一",78));//3
//        list2.add(new MyData(11,"呵呵",78));//4
//        list2.add(new MyData(11,"一",78));//5
//        list2.add(new MyData(11,"一",67));//6
//        list2.add(list2.get(3));
//        list2.add(list2.get(5));
//        list2.get(5).setData1(700);
//        list2.add(list2.get(5));
//        System.out.println("打印list2，为存储MyData元素的TreeSet"+list2);
//        System.out.println("list2的new MyData(11,\"一\",78)的出现次数："+Collections.frequency(list2, new MyData(11,"一",78)));
//
//        System.out.println("list2的list2.get(5)的出现次数："+Collections.frequency(list2,list2.get(5) ));
//
//        hset2.add(Collections.max(hset2,new MyData()));
//
//        System.out.println("打印hset2,为存储MyData元素的HashSet"+hset2);
//        System.out.println("hest2的data1的max的出现次数："+Collections.frequency(hset2, Collections.max(hset2,new MyData())));
//
//
//
//        System.out.println("打印tset2，为存储MyData元素的TreeSet"+hset2);
//        System.out.println("tset2的new MyData(11,\"一\",78)的出现次数："+Collections.frequency(tset2, new MyData(11,"一",78)));
//////         6. boolean replaceAll(List list,Object oldVal,newVal)使用新值代替
//
//
//        list1.add(8);
//        list1.add(8);
//        list1.add(8);
//        System.out.println("打印list1,为存储Integer元素的ArrayList"+list1);
//        System.out.println("用888代替8,"+Collections.replaceAll(list1,8,888)+"->"+list1);
//
//        list2.add(list2.get(0));
//        list2.add(list2.get(0));
//        System.out.println("打印list2,为存储MyData元素的ArrayList"+list2);
//        System.out.println("用MyData[data1=22,name=年，月,data2=10]代替对象索引为0的MyData[data1=20,name=年，月,data2=4],"+Collections.replaceAll(list2,list2.get(0),new MyData(22,"年，月",10))+"->"+list2);
//    }
//}
//
//
//

package com.qx.day08;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/13/20:32
 * @Description:
 */
public class Test {

    public static void main(String[] args) {

        //toString方法
        //引用数据类型
//        MyData m1 = new MyData();
//        String str = "78hg";
//
//        System.out.println(m1);//com.qx.day08.MyData@38cccef
//        System.out.println(m1.toString());//com.qx.day08.MyData@38cccef
//        System.out.println("m1="+m1);//m1=com.qx.day08.MyData@38cccef
//////
//        System.out.println(str);//78hg
//        System.out.println(str.toString());//78hg
//        System.out.println("str="+str);//78hg



        //基本数据类型
//        boolean b = true;
//        int i = 0;
//        char c = 'd';
//        System.out.println("b = "+b);//b = true
//        //相当于下一行
//        System.out.println("b = "+new Boolean(b).toString());//b = true
//
//        System.out.println("i = "+i);//i = 0
//        //相当于下一行
//        System.out.println("i = "+new Integer(i).toString());//i = 0
//
//
//        System.out.println("c = "+c);//c = d
//        //相当于下一行
//        System.out.println("c = "+new Character(c).toString());//c = d



//        char[] arr = {'7','9','j'};
//        System.out.println(Arrays.toString(arr));//[7, 9, j]
//
//        int[][] arr2 = {{3,4,5},{3,5},{9}};
//        System.out.println(Arrays.deepToString(arr2));//[[3, 4, 5], [3, 5], [9]]


//        System.out.println(Employee.nextId);
//
//        Employee employee = new Employee();
//        employee.id = 7;

        //static关键字

//        Circle c1 = new Circle(2.0);
//        Circle c2 = new Circle(3.0);
//
//        System.out.println("c1的面积 = "+c1.findArea());//c1的面积 = 12.566370614359172
//        System.out.println("c2的面积 + "+c2.findArea());//c2的面积 + 28.274333882308138
//

//        Chinese p1 = new Chinese("张三",3);
//
//        System.out.println(Chinese.country);
//        System.out.println(p1.country);
//
//        //System.out.println(Chinese.name);
//        System.out.println(p1.name);
//
//        //System.out.println(Chinese.age);
//        System.out.println(p1.age);
//
//        Chinese.test();//Chinese的类方法test
//        p1.people();//张三的实例方法
//        Chinese p2 = new Chinese("李四",4);
//        System.out.println("中国人数为"+Chinese.count);

        //判断字符串不为空
//        String str = "234fhg";
//        String s = null;
////        if(str != null && !str.equals("")){
////            System.out.println("true");
////            //在未来的开发中，可能会多次使用这一判断，这样重复代码就很多，
////            //可以把这一代码抽取到工具类中做一个方法
////        }
//        System.out.println(Utils.isEmpty(str));
//        System.out.println(Utils.isEmpty(s));

//        System.out.println(Circle.getName());//这是一个圆
//
//        Circle c1 = new Circle(5.7);//name:这是一个圆radius:5.7Area:102.07034531513239
//        Circle c2 = new Circle(8.9);//name:这是一个圆radius:8.9Area:248.84555409084754
//        c1.display();
//        c2.display();

//        Single s1 = Single.getInstance();
//        Single s2 = Single.getInstance();
//        Single s3 = Single.getInstance();
//        //已知equals方法比较普通类对象时，比较的是对象地址，必须得为同一个对象才相等为true
//        //==比较基本数据类型是内容，引用类比较的也是对象地址
//        System.out.println(s1.equals(s2));//true
//        System.out.println(s2.equals(s3));//true
//        System.out.println(s1 == s2);//true
//        System.out.println(s2 == s3);//true
//
//
//        Single2 s4 = Single2.getInstance();
//        Single2 s5 = Single2.getInstance();
//        Single2 s6 = Single2.getInstance();
//
//        System.out.println(s4.equals(s5));//true
//        System.out.println(s5.equals(s6));//true
//        System.out.println(s4 == s5);//true
//        System.out.println(s5 == s6);//true






    }
}

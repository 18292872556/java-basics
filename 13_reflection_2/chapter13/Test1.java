package chapter13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/12/10/5:50
 * @Description:
 */
public class Test1 {
    public static void main(String[] args) {
        try{

            //======================================获取当前类的结构===============================================
//            //--------------------------------------------获取当前类的父类-------------------------------------------------------
              Class clazz = Class.forName("chapter13.Student");//通过包名.类名的字符串，调用Class.forName方法获取指定类的Class实例
//            Class superClass = clazz.getSuperclass();//获取父类
//            System.out.println("父类："+superClass.getName());
//            //父类：chapter13.Person
//
//            //---------------------------------------------获取当前类实现的所有接口-----------------------------------------------------
//            Class[] interfaces = clazz.getInterfaces();//获取当前类的所有接口
//            for(Class c: interfaces){
//                System.out.println("接口："+c.getName());//输出所有接口的名称；直接c输出名称前多一个interface
//
//            }
//
//            //-----------------------------------------获取当前类public的构造器-------------------------------------------------
//            Constructor[] pcons = clazz.getConstructors();//返回的是一个数组，public的构造方法的数组；
//            for(Constructor c: pcons){
//                System.out.println("------------------------");
//                //输出所有构造方法的名称；直接c输出整个方法名包含修饰符、返回值、参数类型
//                System.out.println("构造方法名称："+c.getName());//getName获取方法名称
//                System.out.println("构造方法:"+c.getName()+"的修饰符是:"+c.getModifiers());//getModifiers获取方法修饰符
//                //getModifiers取得方法的修饰，返回数字1代表public,返回数字2代表private，缺省是0，protected是4
//            }
//
//            //-----------------------------获取当前类所有的构造器-----通过构造方法Constructor类返回参数数组--------------------------------------
//            System.out.println();
//            System.out.println("获取当前类所有的构造器-----通过构造方法Constructor类返回参数数组");
//            Constructor[] cons = clazz.getDeclaredConstructors();//返回此Class对象类声明的所有构造方法
//            for(Constructor c: cons){
//                System.out.println("------------------------");
//
//                //输出所有构造方法的名称；直接c输出整个方法名包含修饰符、返回值、参数类型
//                System.out.println("构造方法名称："+c.getName());//getName获取方法名称
//                System.out.println("构造方法:"+c.getName()+"的修饰符是:"+c.getModifiers());//getModifiers获取方法修饰符
//
//                Class[] parmClazz = c.getParameterTypes();//获取方法的参数类型，有几个参数，数组的元素就有几个
//                for(Class pc: parmClazz){
//                    System.out.println("构造方法"+c.getName()+"的参数类型："+pc.getName());
//                }
//            }



            //================================用反射的构造方法来创建对象==============================
//            Class clazz = Class.forName("chapter13.Student");//通过包名.类名的字符串，调用Class.forName方法获取指定类的Class实例
//
//            try{
//                //-------------------用Class对象.newInstance();调用无参构造器返回对应类的Object------------------------------
//                //相当于调用Student类的无参公有的构造方法,public Student()
//                Object obj = clazz.newInstance();//无参，返回Object对象
//                //得到一个Student对象,需要强转到原本类型
//                Student stu1 =(Student)obj;
//                System.out.println("该public无参构造的Student对象学校为："+stu1.school);//无参构造，school无值
//
//
//                //------------------用Constructor对象.newInstance(参数.class);调用public有参构造器返回对应类的Object------------------------------------
//                Constructor c1 = clazz.getConstructor(int.class);//参数类型为Class，返回Constructor类对象
//                Student stu2 = (Student)c1.newInstance(36);//通过newInstance实例化对象，相当于调用protected Student(String school)
//                System.out.println("该public有参构造的Student对象年龄为："+stu2.age);
//
//
//                //------------------用Constructor对象.newInstance(参数.class);调用procected有参构造器返回对应类的Object------------------------------------
//                //指定获取有一个参数并且为String类型的protected的构造方法
//                Constructor c2 = clazz.getDeclaredConstructor(String.class);//参数类型为Class，返回Constructor类对象
//                Student stu3 = (Student)c2.newInstance("第一中学");//通过newInstance实例化对象，相当于调用protected Student(String school)
//                System.out.println("该protected有参构造的Student对象学校为："+stu3.school);//该有参构造的Student对象学校为：第一中学
//
//
//                //------------------用Constructor对象.newInstance(参数.class);调用private有参构造器返回对应类的Object------------------------------------
//                //通过反射机制，可以强制的调用私有的构造方法
//                Constructor c3 = clazz.getDeclaredConstructor(String.class,int.class);//指定获取有两个参数（String,int)的构造方法
//
//                //需要加上这一句，解除封装
//                c3.setAccessible(true);//解除私有的封装，下面就可以对这个私有方法强制调用
//
//                //直接写报错java.lang.IllegalAccessException: Class chapter13.Test1 can not access a member of class chapter13.Student with modifiers "private"
//                //因为是私有构造
//                Student stu4 = (Student)c3.newInstance("张三",24);
//                System.out.println("该private有参构造的Student对象姓名为为："+stu4.name+",年龄为："+stu4.age);//该有参构造的Student对象学校为：第一中学
//
//

//            }catch(Exception e){
//                e.printStackTrace();
//            }


            //--------------------------------------获取类的所有方法Methods------------------------------------------------

//            //Method[] ms = clazz.getMethods();//获取到类的所有的公有public方法
//            Method[] ms = clazz.getDeclaredMethods();//获取类的所有方法，包括公有和私有
//            for (Method m : ms) {//输出每一个方法
//                System.out.println("方法名：" + m.getName());
//                System.out.println("返回值类型：" + m.getReturnType());
//                System.out.println("修饰符：" + m.getModifiers());
//
//                Class[] pcs = m.getParameterTypes();//获取方法的参数类型，是一个数组，方法有几个参数，数据就有几个元素
//                //输出方法的每个参数
//                if (pcs != null && pcs.length > 0) {//没有参数的情况，懒得打印
//                    for (Class p : pcs) {
//                        System.out.println(p.getName());
//                    }
//                }
//                System.out.println("---------------------------");
//
//            }
//
//            //--------------------------------------获取类的所有属性Field------------------------------------------------
//            /*
//             * 加了Declared就不能输出基类的属性，但是可以输出所有类型的
//             */
//            Field[] fs = clazz.getFields();//获取类的公有的属性,包括从父类继承的
////            Field[] fs = clazz.getDeclaredFields();//获取类的所有属性包括私有,不包括从父类继承的
//            for (Field f:fs){
//                System.out.println("-----------------------------");
//                System.out.println("修饰符："+f.getModifiers());
//                System.out.println("属性类型："+f.getType());
//                System.out.println("属性名称"+f.getName());
//            }
//
//            Package p = clazz.getPackage();//获取类所在的包
//            System.out.println("获取类所在的包"+p.getName());


            //=============================通过反射调用类的指定方法、指定属性============================

            //----------------------------------通过反射调用指定方法---------------------------------------------

            /**
             * 注意：下面不论是反射调用setInfo还是test方法
             * 都调用的obj对象的方法，obj对象实际上就是Student对象
             */
//            Constructor con = clazz.getConstructor();//获取无参构造
//            Object obj = con.newInstance();//使用无参构造创建对象
//
//            Method m =  clazz.getMethod("setInfo",String.class,int.class,int.class);//得到名称叫setInfo，参数是String，int,int的方法
//            m.invoke(obj,"张三",23,20165678);//参数1是需要实例化的对象，后面的参数是调用当前的方法实际参数
//
//            //如果想要调用一个私有方法
//            Method m1 = clazz.getDeclaredMethod("test",String.class);//获取方法名为test,参数为1个String类型的方法
//            m1.setAccessible(true);//解除私有封装，下面可以强制调用私有的方法
//            m1.invoke(obj,"李四");//私有的
//
//            //调用一个重载方法
//            Method m2= clazz.getMethod("setInfo",String.class);
//            m2.invoke(obj,"第一中学");
//
//            //有返回值的方法
//            Method m3 = clazz.getMethod("getSchool");//这是获取方法名为getSchool并且没有参数的方法
//            String school= (String)m3.invoke(obj);//调用有返回值但是没有参数的方法;返回的是Object类型的，强转一下
//            System.out.println(school);

            //----------------------------------通过反射调用指定方法属性---------------------------------------------

            //反射创建一个对象
            Constructor con = clazz.getConstructor();//利用无参构造创建一个对象
            Student stu = (Student)con.newInstance();//通过构造方法创建对象
            Field f = clazz.getField("school");//获取名称为school的属性

            f.set(stu,"第三中学");
            String school = (String)f.get(stu);//获取stu对象的school属性的值
            System.out.println(school);

            //如果是私有属性
            Field f1 = clazz.getDeclaredField("privateField");
            f1.setAccessible(true);//解除私有的封装，下面就可以强制的调用这个属性
            f1.set(stu,"测试私有属性");
            System.out.println(f1.get(stu));




        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

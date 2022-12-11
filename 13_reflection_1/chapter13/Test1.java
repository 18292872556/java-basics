package chapter13;

import java.lang.reflect.Constructor;
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
              //Class clazz = Class.forName("chapter13.Student");//通过包名.类名的字符串，调用Class.forName方法获取指定类的Class实例
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
//            //---------------------------------------------获取当前类public的构造器-------------------------------------------------
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

                //=============================通过反射调用类的指定方法、指定属性============================
            Class clazz = Class.forName("chapter13.Student");
            Method[] ms = clazz.getMethods();//获取到类的所有的公有public方法
            for(Method m:ms) {
                System.out.println("方法名："+m.getName());
            }
            //





//            }catch(Exception e){
//                e.printStackTrace();
//            }


        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

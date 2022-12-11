package chapter13;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/12/09/17:10
 * @Description: 创建Class对象的四种方法
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();

        //clazz对象中就包含对象p所属的Person类的所有信息
        Class clazz = p.getClass();//通过对象名.getClass()

        //=================创建Class对象的四种方法==============
        Class c0 = Person.class;//通过类名.class创建指定类的Class实例
        Class c1 = p.getClass();//通过一个类的实例对象.getClass()方法，获取对应 实例对象的类的Class实例
        try{

            //通过Class的静态方法forName(String className)来获取一个类的Class实例
            //forName(String className)方法中的参数是你要获取的Class实例的类的全路径(包名.类名)
            Class c2 = Class.forName("chapter13.Person");//这个是获取Class实例的常用方式

        }catch(Exception e){
            e.printStackTrace();
        }


    }
}

package qxcto.chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/12/08/6:22
 * @Description: 序列化与反序列化
 * 注意：对象的序列与反序列化使用的类要严格一致，包名，类名，类结构等等所有都要一致
 * 如果类名相同，但不在一个包下
 */
public class TestSerialize {
    public static void main(String[] args) {
        try{
            TestSerialize.testSerialize();
            TestSerialize.testDeserialize();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    /**
     * 对象的序列化
     */
    public static void testSerialize()throws Exception{
        //定义对象的输出流，把对象序列化之后的流放到指定的文件中
        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("D:\\MyAll\\study\\WorkSpace\\IDEA_Project\\ten_IO\\src\\qxcto\\chapter10\\oout.txt"));

        Person p1 = new Person();
        p1.name = "张三";
        p1.age = 17;

        oout.writeObject(p1);
        oout.flush();//刷写数据到硬盘

        oout.close();

    }

    /**
     * 对象的反序列化
     * @throws Exception
     */
    public static void testDeserialize()throws Exception{
        //把对象流读回来
        //创建对象输入流，从指定的文件中把对象的序列化后的流读取出来
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream("D:\\MyAll\\study\\WorkSpace\\IDEA_Project\\ten_IO\\src\\qxcto\\chapter10\\oout.txt"));

        Object obj = oin.readObject();

        //Person p = (Person)obj;
        //这个时候序列化与反序列化使用的类不是一个类，分别是qxcto.chapter10.Person和qxcto.chapter10.object.Person
        //这是反序列化就有异常qxcto.chapter10.Person cannot be cast to qxcto.chapter10.object.Person
        //类型转换异常，哪怕两个类的结构一致
        qxcto.chapter10.object.Person p = (qxcto.chapter10.object.Person)obj;
        System.out.println(p.name);
        System.out.println(p.age);

        oin.close();
    }

}

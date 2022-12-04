package qxcto.chapter10;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/11/27/0:22
 * @Description: File类的操作
 */
public class FileTest {



    public static void main(String[] args) {

        //=======================================创建文件或目录对象============================================
        File f = new File("D:\\MyAll\\study\\WorkSpace\\test\\abc\\tt.txt");//这个对象f就是tt.txt了。一个参数路径的写法

        File f1 = new File("D:\\MyAll\\study\\WorkSpace","test\\abc\\tt.txt");//这个也是tt.txt。这种两个参数路径的写法使用较少，
        File f2 = new File("D:/MyAll/study/WorkSpace/test/abc/tt.txt");
        File f3 = new File("D:/MyAll\\study/WorkSpace"+File.separator+"test/abc/tt.txt");//也可以用File.separator分隔；这里试了一下，双斜杠和反斜杠混着用也没问题
        //注意，这个\斜杠在文件中是一个路径的分隔符，但是在java编程中，一个\代表转义符，在java中是用双斜杠\\或者一个/反斜杠分隔目录


        File ff = new File("D:\\MyAll\\study\\WorkSpace\\test\\abc");//一个目录
        File fs = new File("src/qxcto/chapter10/Test1.java");//使用相对路径来创建File对象


        //====================================访问文件名=================================

        //--------------------------------getName()获取当前文件名或目录名称----------------------------------
        System.out.println(f.getName());//tt.txt
        System.out.println(fs.getName());//Test.java
        System.out.println(ff.getName());//abc

        //----------------------------------getPath()获取文件或目录的路径----------------------------------
        //获取的是new file时写的路径
        System.out.println(f.getPath());//D:\MyAll\study\WorkSpace\test\abc\tt.txt
        System.out.println(fs.getPath());//src\Test.java
        System.out.println(ff.getPath());//D:\MyAll\study\WorkSpace\test\abc

        //返回一个用当前文件的绝对路径构建的file对象
        //获取当前文件的绝对路径，若不是则补齐
        System.out.println(f.getAbsoluteFile());//D:\MyAll\study\WorkSpace\test\abc\tt.txt
        System.out.println(fs.getAbsolutePath());//D:\MyAll\study\WorkSpace\IDEA_Project\22-11-17(十、IO)\src\Test.java
        System.out.println(ff.getAbsoluteFile());//D:\MyAll\study\WorkSpace\test\abc

        System.out.println(fs);//src\Test.java；与fs.getAbsoluteFile()是一个东西，只不过一个是相对路径一个绝对路径


        //返回当前文件或文件夹的父级路径
        System.out.println(f.getParent());//D:\MyAll\study\WorkSpace\test\abc
        System.out.println(fs.getParent());//src\qx\chapter10
        System.out.println(ff.getParent());//D:\MyAll\study\WorkSpace\test

        //-------------------------------重命名文件名或目录名-------------------------------
        //重命名成功返回true，失败返回false
        //失败一般是因为原文件（夹）不存在，或新文件已存在。如果不在一个目录下重命名，要保证父级路径存在



        System.out.println("重命名");

        //把ff对应的abc路径重命名为abcabc
        System.out.println(ff.renameTo(new File("D:\\MyAll\\study\\WorkSpace\\test\\abcabc")));//true
        //把f对应的tt.txt文件重命名为tt1.txt
        System.out.println(f.renameTo(new File("D:\\MyAll\\study\\WorkSpace\\test\\abc\\tt1.txt")));//true
        //把fs对应的Test.java文件重命名为TestFile.java；不知道是不是因为本类与Test类在同一个包下
        System.out.println(fs.renameTo(new File("D:\\MyAll\\study\\WorkSpace\\IDEA_Project\\ten_IO\\src\\qxcto\\chapter10\\Test2.java")));//false修改失败



        //=======================================文件检测=======================================


        //重命名后原File对象不存在了
        System.out.println(f.exists());//false
        System.out.println(fs.exists());//true
        System.out.println(ff.exists());//false


        //判断文件是否存在,存在返回true,不存在返回false
        System.out.println(f.exists());//true
        System.out.println(fs.exists());
        System.out.println(ff.exists());

        //判断文件是否可读，是否可写;可以返回true，不可返回false
        System.out.println(f.canWrite());
        System.out.println(f.canRead());
        System.out.println(ff.canWrite());

        //判断File对象是否是文件；是否是文件夹
        System.out.println(f.isFile());//true
        System.out.println(ff.isDirectory());


        System.out.println(f.lastModified());//获取文件的最后修改时间，返回的是一个毫秒数
        System.out.println(ff.lastModified());
        System.out.println(f.length());//返回文件的长度，单位是字节数
        System.out.println(ff.length());

        //=======================================文件操作相关========================================

        File f4 = new File("D:\\MyAll\\study\\WorkSpace\\test\\abc\\tt2.txt");
        System.out.println(f4.exists());
//        if(!f4.exists()) {//判断如果f4不存在
//            try {
//                f4.createNewFile();//创建新的文件
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        f4.delete();//删除文件

        //====================================目录相关操作========================================
        //-------------------------------------创建目录-------------------------------------
        File f5 = new File("D:\\MyAll\\study\\WorkSpace\\test\\cc");
        f5.mkdir();//创建单层目录，如果使用这样的方法来创建多层目录，就得一层一层的执行mkdir方法
        File f6 = new File("D:\\MyAll\\study\\WorkSpace\\test\\cc\\dd");
        f6.mkdir();

        File f7 = new File("D:\\MyALL\\study\\WorkSpace\\test\\a\\b\\c");//aa\bb\cc不存在
        f7.mkdirs();//创建多层目录

        //-----------------------------------返回目录的子集-----------------------------------------
        File f8 = new File("D:\\MyALL\\study\\WorkSpace\\test");
        System.out.println(f8.list());//null//返回值是一个String字符串

        String[] f8s = f8.list();//返回的是当前文件夹的子集的名称，包括目录和文件
        for(String s: f8s){
            System.out.println(s);

        }

        File[] f8ss = f8.listFiles();//返回当前文件夹子集的file对象，包括目录和文件
        for(File fss: f8ss){
            System.out.println(fss);
        }







    }

}

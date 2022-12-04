package qxcto.chapter10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/12/04/0:42
 * @Description: 缓冲字节流
 */
public class BufferedStreamTest {

    public static void main(String[] args){

        //因为两个方法都把可能的异常抛出了，调用的时候需要接收一下
        try{
            BufferedStreamTest.testBufferedInputStream();

            BufferedStreamTest.testBufferedOutputStream();

        }catch(Exception e){
            e.printStackTrace();
        }

        //复制文件或目录
        BufferedStreamTest.bfSCopyFile("D:\\MyAll\\study\\WorkSpace\\test\\abca.zip","D:\\MyAll\\study\\WorkSpace\\test\\haha\\wex\\abcaCopy.zip");

    }

    /**
    * @Description: 缓冲字节输入流
    * @Param: []
    * @return: void
    */
    public static void testBufferedInputStream() throws Exception {
        //文件字节输入流对象
        FileInputStream fin  = new FileInputStream("D:\\MyAll\\study\\WorkSpace\\IDEA_Project\\ten_IO\\src\\qxcto\\chapter10\\inTt.txt");

        //缓冲字节输入流对象
        //把这个文件字节流放入到这个缓冲输入流当中
        BufferedInputStream bfin = new BufferedInputStream(fin);//参数需要一个InputStream的或者其子类的对象
        byte[] b = new byte[1024];
        int len = 0;
        while((len = bfin.read(b)) != -1){
            System.out.println(new String(b, 0 ,len));
        }
/*
字节输入时，按byte数组接收
 */

        //关闭流的时候，本着一个最晚开的最早关，依次关
        bfin.close();//后开的先关，一个嵌套样式
        fin.close();

    }

    /**
    * @Description: 缓冲字节输出流
    * @Param: []
    * @return: void
    */
    public static void testBufferedOutputStream() throws Exception{
        //创建字节输出流对象
        FileOutputStream fout = new FileOutputStream("D:\\MyAll\\study\\WorkSpace\\IDEA_Project\\ten_IO\\src\\qxcto\\chapter10\\outTt.txt");

        //创建字节输入流对象
        BufferedOutputStream bfout = new BufferedOutputStream(fout);

        String str = "哈哈，hello,barbie,把这段话输出";
        bfout.write(str.getBytes());//写到内存中
        bfout.flush();//刷到硬盘上
/*
字节输出时，按byte数组输出
 */
        bfout.close();
        fout.close();
    }

    
/**
* @Description: 缓冲字节流复制文件
* @Param: oldFile 原文件的原路径；输入的内容
* @Param newFile 要复制到的新路径，还可以顺便改名字；输出的内容
* @return: void
*/

    public static void bfSCopyFile(String oldFile, String newFile){
        try{

            BufferedInputStream bfin = new BufferedInputStream(new FileInputStream(oldFile));

            BufferedOutputStream bfout = new BufferedOutputStream(new FileOutputStream(newFile));

            byte[] by = new byte[1024];
            int len = 0;
            System.out.println("打印一下读到的内容");
            while((len = bfin.read(by)) != -1){
                System.out.println(by);
                bfout.write(by, 0 , len);//写到内存
            }
/*
字节复制时，接收了byte数组的数据，然后再用byte数组的形式 3 个参数输出
 */
            bfout.flush();//刷到硬盘

            bfout.close();
            bfin.close();


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

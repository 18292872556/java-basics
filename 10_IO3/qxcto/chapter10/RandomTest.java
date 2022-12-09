package qxcto.chapter10;

import java.io.RandomAccessFile;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/12/08/19:00
 * @Description: 随机存取流,文件的随机读写。程序可以直接跳到文件的任意地方来读，写文件
 */
public class RandomTest {
    public static void main(String[] args) {

        try{
            //RandomTest.testRandomRead();
            RandomTest.testRandomWriter();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void testRandomRead() throws Exception{

        //      r: 以只读方式打开
        //      rw：打开以便读取和写入
        //      rwd:打开以便读取和写入；同步文件内容的更新
        //     rws:打开以便读取和写入；同步文件内容和元数据的更新
        //最常用的是r和rw

        //RandomAccessFile的构造有两个参数，参数1是读写的文件的路径
        //参数2是指定RandomAccessFile的访问方式
        RandomAccessFile ra = new RandomAccessFile("D:\\MyAll\\study\\WorkSpace\\IDEA_Project\\ten_IO\\src\\qxcto\\chapter10\\RandomTest.txt","r");

        //通过设置读取文件内容的起始点，来达到从文件的任意位置读取
        ra.seek(13);//设置读文件内容的起始点
        byte[] b = new byte[1024];//可见随机存取流也是字节流
        int len = 0;
        while((len = ra.read(b)) != -1){
            System.out.println(new String(b, 0, len));
        }

        ra.close();
    }

    //随机写
    public static void testRandomWriter() throws Exception{
        //因为要写入，记得设置为rw可读写，如果是r只读就错了
        RandomAccessFile ra = new RandomAccessFile("D:\\MyAll\\study\\WorkSpace\\IDEA_Project\\ten_IO\\src\\qxcto\\chapter10\\RandomTest.txt","rw");

        //ra.seek(6);//设置写的起始点，0代表从头开始写
        //注意：如果是在开头或者中间的某个位置开始写的话，就会用写的内容覆盖掉等长度的原内容
        ra.seek(ra.length());//设置写的起点，ra.length()代表从文件的最后结尾写，也就是文件的追加
        ra.write("咋们在尾部追加，以免覆盖".getBytes());

        ra.close();//不用flush

    }
}

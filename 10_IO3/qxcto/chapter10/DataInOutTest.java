package qxcto.chapter10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/12/08/3:03
 * @Description: 数据流，专门用来做基本数据类型的读写的
 */
public class DataInOutTest {
    public static void main(String[] args) {
        try{

            DataInOutTest.testDataOutputStream();
            DataInOutTest.testDataInputStream();

        }catch(Exception e){
            e.printStackTrace();
        }

    }

   /**
   * @return: void
   * @Param:
   * @Description: 数据输出流
    * 用数据输出流写到文件中的基本数据类型是乱码的，不能直接辨认。
    * 需要数据层的输入流来读取
    * DataOutputStream
   */
    public static void testDataOutputStream()throws Exception{
        DataOutputStream dout = new DataOutputStream(new FileOutputStream("D:\\MyAll\\study\\WorkSpace\\IDEA_Project\\ten_IO\\src\\qxcto\\chapter10\\dataInOut.txt"));//需要一个OutputStream类型的参数，子类都可以
        //dout.writeBoolean(true);
        dout.writeDouble(7.56d);
        //dout.writeInt(345);

        dout.flush();
        dout.close();

    }

    /**
    * @return: void
    * @Param:
    * @Description: 数据的输入流,
     * 用数据输出流写到文件中的基本数据类型是乱码的，不能直接辨认。需要数据层的输入流来读取
     * 用数据输入流读取数据输出流写到文件中的数据时，要保证使用和当时写的数据类型一致的类型来读取
     * 也就是说，如果写的时候是writeDouble，那么读的时候就得是readDouble
    */
    public static void testDataInputStream()throws Exception{
        //把刚输入的那个文件再输入一下，为了识别输出的数据，因为无法手动识别
        DataInputStream din = new DataInputStream(new FileInputStream("D:\\\\MyAll\\\\study\\\\WorkSpace\\\\IDEA_Project\\\\ten_IO\\\\src\\\\qxcto\\\\chapter10\\\\dataInOut.txt"));
        System.out.println(din.readDouble());
        din.close();
    }
}

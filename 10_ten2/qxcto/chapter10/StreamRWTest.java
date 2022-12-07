package qxcto.chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/12/06/7:28
 * @Description: 测试转换流,可以把字节流转换成字符流。
 * 当字节流中的数据都是字符的时候，使用转换流转为字符流处理
 */
public class StreamRWTest {
    public static void main(String[] args){
        //所有的文件都是又编码格式的
        //对于我们来说，txt和java文件一般来讲有三种编码
        //ISO8859-1，西欧编码，是纯粹英文编码，不适用汉字
        //GBK和UTF-8,这两编码是适用于中文和英文
        //我们一般使用UTF-8这种编码

        try{
            StreamRWTest.testInputStreamReader();

            StreamRWTest.testOutputStreamWriter();
        }catch(Exception e){
            e.printStackTrace();
        }


    }

    /**
     * 转换输入流
     * 把字节流转换成字符流
    */
    public static void testInputStreamReader() throws Exception{
        FileInputStream fin = new FileInputStream("D:\\MyAll\\study\\WorkSpace\\IDEA_Project\\ten_IO\\src\\qxcto\\chapter10\\tt5.txt");
        //将字节流转换成字符流
        InputStreamReader inR= new InputStreamReader(fin,"UTF-8");//参数1是字节流，参数2是编码

        char[] ch = new char[100];//因为转换成字符流，用char数组接收
        int len = 0;
        while((len = inR.read(ch)) != -1){
            System.out.println(new String(ch, 0, len));
        }

        inR.close();
        fin.close();

    }

    /*
    *转换输出流
    * 把字节流转换为字符流
     */

    public static void testOutputStreamWriter() throws Exception{
        //该路径当前不存在，第一次输出自动创建,因为项目设置编码格式为UTF-8,能确定创建tt6.txt后也为UTF-8编码格式
        FileOutputStream fout = new FileOutputStream("D:\\MyAll\\study\\WorkSpace\\IDEA_Project\\ten_IO\\src\\qxcto\\chapter10\\tt6.txt");
        OutputStreamWriter outW = new OutputStreamWriter(fout,"GBK");

        String str = "输出到tt6.txt";
        outW.write(str);
        outW.flush();

        outW.close();
        fout.close();

    }
}

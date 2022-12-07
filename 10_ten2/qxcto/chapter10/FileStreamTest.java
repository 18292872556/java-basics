package qxcto.chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/12/02/20:35
 * @Description: 文件流
 */
public class FileStreamTest {
    public static void main(String[] args) {
        FileStreamTest.testFileInputStream();
        FileStreamTest.testFileOutputStream();


    }


    /**
    * @Description: 文件字节输入流
    * @Param: []
    * @return: void
    */
    public static void testFileInputStream() {

        //==========================================FileInputStream=================================================

        //io操作都是有异常的，需要捕获或者抛出
        try {
            FileInputStream in = new FileInputStream("D:\\MyAll\\study\\WorkSpace\\test\\inFile.txt");//必须要是存在的文件
            //InputStream为字节流，做一个比特数组用来接收数据


            byte[] b = new byte[50];//设置一个byte数组，接收读取的文件的内容
            int len = 0;//设置一个读取数据的长度

            /*该方法会有一个返回值，返回值是读取的数据的长度，如果读取到最后一个数据，还会向后读一个，这个时候返回值就是-1
            也就意味着当in.read(b)的返回值是-1的时候，整个文件就读取完了
            in.read(b);//b数组接收in的输入字节流 */

            //注意：new String三个参数的用法（要转化为String类的数组名，开始转化位置，转化结束位置）

            while ((len = in.read(b)) != -1) {//说明没读完
                System.out.println(len);//0//因为疑惑in.read的返回值，发现此处while和if没有区别。第一次返回值即为数据长度（原因，因为数据太短）
                //只读取刚好完即可，不会多读
                System.out.println(new String(b, 0, len));

                /*？一个疑惑：循环输出与单句输出的内容完全一致，解决：是因为数据太短，
                当数据比较长时长于b数组长度,每次read都会新读进来一段存到b然后根据[0,len]输出。而且读满的情况下len是固定的长度10即数组长度

                //例1输出：
                5
                qjhfu

                例2，b长10，输出：
                10
                把这个�
                10
                ��件的�
                10
                �容输入
                10
                到计算�
                2
                ��
                例2，b长50，输出：
                42
                把这个文件的内容输入到计算机
                */


            }

            //优化前，固定b数组长度，可能会比要读取的文件内容长。
            //new String一个参数的用法（要转化为String的数组名）
            //System.out.println(new String(b));//输出b数组，并转为String类型

            in.close();//注意：流在使用完毕之后一定要关闭

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    /**
     * @Description: 文件字节输出流
     * @Param: []
     * @return: void
     */
    public static void testFileOutputStream() {
        //==========================================FileOutputStream=================================================
        try{
            //outFile开始时不存在,输出后自动生成；如果开始时outFile存在，则刷新文件内容
            FileOutputStream out = new FileOutputStream("D:\\MyAll\\study\\WorkSpace\\test\\outFile.txt");
            String str = "2把这段文字输出到outFile文件";
            out.write(str.getBytes());//把数据写到内存,可以看到文件内容变化

            out.flush();//把内存中的数据刷写到硬盘。目前不会观测效果
            out.close();//关闭流

        }catch(Exception e){
            e.printStackTrace();
        }


    }


}

package qxcto.chapter10;

import java.io.FileReader;
import java.io.FileWriter;
/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/12/03/23:10
 * @Description: 文件字符流
 */
public class FileRWTest {

    public static void main(String[] args){

        FileRWTest.testFileReader("D:\\MyAll\\study\\WorkSpace\\test\\FileReader.txt");
        FileRWTest.testFileWriter("把这段字符输出到Filewriter。txt","D:\\MyAll\\study\\WorkSpace\\test\\FileWriter.txt");

        FileRWTest.copyFile("D:\\MyAll\\study\\WorkSpace\\test\\cc\\dd\\文件.txt","D:\\MyAll\\study\\WorkSpace\\test\\abca\\新文件.txt");

    }

    /**
    * @Description: 文件字符输入流
    * @Param: [inPath]
    * @return: void
    */
    public static void testFileReader(String inPath){
        try{
            FileReader fr = new FileReader(inPath);
            char[] ch = new char[20];

            int len = 0;
            while((len = fr.read(ch)) != -1){
                System.out.println(new String(ch, 0, len));
            }
/*
字符输入，用char数组接收
 */
            fr.close();

        }catch(Exception e){
            e.printStackTrace();
        }



    }

    /**
    * @Description: 文件字符输出流
    * @Param: [text, outPath]
    * @return: void
    */
    public static void testFileWriter(String text, String outPath){

        try{
            FileWriter fw = new FileWriter(outPath);
            fw.write(text);//写到内存中
            fw.flush();//把内存中数据刷写到硬盘
            fw.close();//关闭流
/*
字符输出，用String类输出，也可以是char数组， 3个参数的形式
 */
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
    * @Description: 文件字符流复制文件
    * @Param: [oldFile, newPath]
    * @return: void
    */

    public static void copyFile(String oldFile, String newFile){
        try{
            FileReader fr = new FileReader(oldFile);
            FileWriter fw = new FileWriter(newFile);

            char[] ch = new char[200];//字符数组接收读到的数据
            int len = 0;
            while((len = fr.read(ch)) != -1){
                fw.write(ch, 0, len);//把读到的数据按照字符格式输出
            }
            fw.flush();
            fw.close();
            fr.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

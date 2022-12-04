package qxcto.chapter10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/12/04/0:43
 * @Description: 缓冲字符流
 */
public class BufferedRWTest {
    public static void main(String[] args){

        try {
            BufferedRWTest.testBufferedReader("D:\\MyAll\\study\\WorkSpace\\test\\FileReader.txt");
            BufferedRWTest.testBufferedWriter("缓冲字符流进行输出", "D:\\MyAll\\study\\WorkSpace\\test\\FileWriter.txt");

            BufferedRWTest.copyBfRW("D:\\MyAll\\study\\WorkSpace\\test\\cc\\dd\\文件.txt","D:\\MyAll\\study\\WorkSpace\\test\\abcabc\\新文件.txt");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
    * @Description: 缓冲字符输入流
    * @Param: inPath
    * @return: void
    */
    public static void testBufferedReader (String inPath)throws Exception{

        BufferedReader bfR = new BufferedReader(new FileReader(inPath));
        char[] ch = new char[1024];
        int len = 0;
        while((len = bfR.read(ch)) != -1){
            System.out.println(new String(ch, 0, len));
        }

        bfR.close();
    }
    
    /**
    * @Description: 缓冲字符输出流
    * @Param: text
    * @Param outPath
    * @return: void
    */
    public static void testBufferedWriter(String text, String outPath)throws Exception{

        BufferedWriter bfW = new BufferedWriter(new FileWriter(outPath));

        bfW.write(text);
        bfW.flush();
        bfW.close();
    }

 /**
 * @Description: 缓冲字符流复制文件
 * @Param: oldFile
 * @Param newFile
 * @return: void
 */
    public static void copyBfRW(String oldFile, String newFile) throws Exception{
        BufferedReader bfR = new BufferedReader(new FileReader(oldFile));
        BufferedWriter bfW = new BufferedWriter(new FileWriter(newFile));

        char[] ch = new char[1024];
        int len = 0;
        while((len = bfR.read(ch)) != -1){
            bfW.write(ch, 0 ,len);
        }

        bfW.flush();

        bfW.close();
        bfR.close();
    }
}

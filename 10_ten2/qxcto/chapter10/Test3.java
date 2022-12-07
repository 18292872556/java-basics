package qxcto.chapter10;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/12/07/7:49
 * @Description: 练习，
 */
public class Test3 {
    public static void main(String[] args){

        try{
            //控制台输入的数据输出到该txt文件,开始时不存在
            Test3.testSystemIn("D:\\MyAll\\study\\WorkSpace\\IDEA_Project\\ten_IO\\src\\qxcto\\chapter10\\systemIn.txt");
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    /*控制台输入的内容写到指定的txt文件中，当接收到字符串over，就结束程序的运行
    *
     */
    //我的写法：理解怎么使用标准输入流来接收控制台输入的内容，开始想使用字节流但发现readLine方法只能是字符流用
    //全篇使用字符流（为什么呢，因为readLine是字符流的方法），用缓冲字节输出流接收新建一个文件字节输出流来确认输出txt的路径，再用缓冲字节输入流接收标准输入流
    //定义String空字符串作为一个临时接收字符串的变量
    //while读，读到null说明读完，循环体内写
    public static void testSystemIn(String txtPath)throws Exception{

        //创建一个输入转换流，把标准输入转为字符流
        InputStreamReader inR = new InputStreamReader(System.in);
        //创建一个缓冲字节输入流，把输入流放入缓冲流
        BufferedReader bfR = new BufferedReader(inR);

        ////创建一个缓冲字节输出流，用来接收到数据后输出到txt文件,缓冲流接收一下文件字节输出流会快一点
        BufferedWriter bfOut = new BufferedWriter(new FileWriter(txtPath));

        String line ="";//定义一个临时接收字符的字符串,而且是一行一行的读
        //这里需要考虑实现读到over结束字符
        //复习：== 对于基础数据比较内容，对于引用类只有同一个对象才true
        //equals只能比较对象，只有对于File,String,Data和包装类是比较内容，不要求是同一个对象。其他类都是必须为同一个对象才相等true

        while((line = bfR.readLine()) != null){
            if(line.equals("over")){
                //中断逻辑
                break;
            }
            //读取的每一行都写到指定的txt文件中
            bfOut.write(line);
        }

        bfOut.flush();

        bfOut.close();
        bfR.close();
        inR.close();

    }
    
    //如果想要追求简便写法，也就是最基础的思路，可以不用缓冲流，只用文件流，就是传输效率不如缓冲流

}

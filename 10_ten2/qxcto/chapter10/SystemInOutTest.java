package qxcto.chapter10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/12/07/6:58
 * @Description: 标准输入和输出流
 */
public class SystemInOutTest {
    public static void main(String[] args) {

        try{
            SystemInOutTest.testSystemIn();
        }catch(Exception e){
            e.printStackTrace();
        }
    }


/**
 * 标准输入流
*/
/**
* @Description: 一个简单的标准输入流，把输入的String输出来观察输入结果
* @Param: 
* @return: void
*/
    public static void testSystemIn() throws Exception{
        //创建一个接收键盘输入数据的输入流
        InputStreamReader inR = new InputStreamReader(System.in);//把字节流转成字符流

        //把输入流放到缓冲流里
        BufferedReader bfR = new BufferedReader(inR);//缓冲字符流

        String str = "";//定义一个临时接收数据的字符串

        //.readLine返回的是一个字符串，如果要是读到最后一个最后一个字符之后的下一个，就是空null
        while((str = bfR.readLine()) != null){
            System.out.println(str);
        }

        bfR.close();
        inR.close();

    }
}

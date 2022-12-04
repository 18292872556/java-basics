package qxcto.chapter10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/11/27/0:22
 * @Description: 测试练习题
 */
public class Test {

    public static void main(String[] args) {


        //递归遍历文件下所有
        //new Test().traverseFile(new File("D:\\MyAll\\study\\WorkSpace\\test"));

        //复制文件到一个文件夹下
        File file1 = new File("D:\\MyAll\\study\\WorkSpace\\test\\abc\\img.png");
        File file2 = new File("D:\\MyAll\\study\\WorkSpace\\test\\cc");
        new Test().copyFile(file1,file2);

        System.out.println("重命名");


        File ff = new File("D:\\MyAll\\study\\WorkSpace\\test\\abc");//一个目录


        //把ff对应的abc路径重命名为abcabc
        System.out.println(ff.renameTo(new File("D:\\MyAll\\study\\WorkSpace\\test\\abcabc")));//true


    }

 /**
 * @Description: 把一个文件复制到指定的文件夹下,file1为该文件，file2为该目录
 * @Param: [file1, file2]
 * @return: void
 */
    public void copyFile(File file1, File file2){//其实参数也可以直接写String类型，因为根据String类型的数据新建了File对象也不一定是存在的
        if (file1.isFile() && file2.isDirectory()) {
            //通过文件字节流复制其内容
            //思路，将文件内容读取到内存，用一个byte数组接收，再将其输出到指定路径下，将自动创建新文件
            try {
                FileInputStream in = new FileInputStream(file1);//把file1的内容输入进来，读的源文件
                //输出到新路径下
                FileOutputStream out = new FileOutputStream(file2 + File.separator + file1.getName());//复制到哪里


                byte[] b = new byte[200];//做大一点，因为b作为接收对象必须接收所有数据，不可以比文件中数据长度短
                int len = 0;

                while ((len = in.read(b)) != -1) {
                    System.out.println(new String(b, 0, len));//输出一下要复制的数据
                    out.write(b);//如果b长度小于数据长度，可能会读不全。直接在循环里交互，即使短也能按段复制

                }

                out.flush();//把写到内存的数据刷到硬盘
                out.close();//后开的先关
                in.close();


            } catch (Exception e) {
               e.printStackTrace();
           }

        }
        else{
            System.out.println("输入错误，请重新输入。请保证file1为文件，file2为目录。该方法用来将file1复制到file2下");
            return;
        }
        
    }
    
    
    
    /**
    * @Description: 递归遍历文件
    * @Param: [file]
    * @return: void
    */
    public void traverseFile(File file){//处理一个file对象，如果是文件直接输出，如果是目录则遍历目录下子文件和子目录
        //先判断这个File对象是文件还是目录
        if(file.isFile()){//是文件直接输出名称
            System.out.println(file.getAbsoluteFile()+"是文件");
        }else{//是目录则遍历目录下的file对象，并调用自身test方法再次处理子file对象
            System.out.println(file.getAbsoluteFile()+"是目录");

            //如果是文件夹（目录），内部可能有子文件夹或者文件
            File[] fstr = file.listFiles();
            //优化一下，当目录下为空（如果file是文件则file.listFiles返回null)，或长度为0时（file为空目录则返回空数组，长度为0）不处理(文件夹的长度会比其下文件长度长一点点）
            if(fstr != null && fstr.length>0){
                for(File f:fstr){
                    traverseFile(f);//递归，调用方法自身去处理该目录下的子文件or子目录
                }
            }

        }
    }


}

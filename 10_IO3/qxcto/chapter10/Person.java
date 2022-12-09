package qxcto.chapter10;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/12/08/3:55
 * @Description: 可以序列化与反序列化的对象
 */
public class Person implements Serializable {
    /**
     * 一个用来表示序列化版本标识符的静态变量
     * 用来表明类的不同版本间的兼容性
     */
    private static final long seriaVersionUID = 1L;

    public String name;
    public int age;
}

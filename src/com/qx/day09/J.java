package com.qx.day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/31/17:53
 * @Description: abstract内部类被同外部类中的内部类继承
 */
public class J {
    abstract class K{
        int i = 0;

    }
    class L extends K{

        void setI(int i){
            i = 9;
        }
    }
}
//class M extends J.K{
//
//}
//class N {
//    class O extends J.L{
//
//    }
//
//}
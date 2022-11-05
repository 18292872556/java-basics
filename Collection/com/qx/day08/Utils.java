package com.qx.day08;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/15/13:13
 * @Description:
 */
public class Utils {

    public static boolean isEmpty(String str){
        if(str != null && !str.equals("")){
            return false;
        }
        return true;
    }
}

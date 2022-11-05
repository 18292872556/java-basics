package com.qx.day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/25/15:18
 * @Description:
 */
public abstract class Template {
    public final void getTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("执行时间是："+(end-start));
    }
    public abstract void code();
}

class SubTemplate extends Template{
    @Override
    public void code() {
        int i = 1000000;
        while(i > 0){
            i--;
        }
    }
}

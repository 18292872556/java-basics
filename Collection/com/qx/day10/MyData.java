package com.qx.day10;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/09/30/18:15
 * @Description: 自定义类，我的数据类型
 * 实现接口Comparator<MyData> ，public int compare(MyData o1, MyData o2)
 */
public class MyData  {
    //implements Comparator<MyData>
    public MyData(){

    }
    public MyData(int data1,String name, int data2){

        this.data1 = data1;
        this.name = name;
        this.data2 = data2;
    }


    private String name;
    private int data1;
    private int data2;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setData1(int data1){
        this.data1 = data1;
    }
    public int getData1(){
        return data1;
    }

    public void setData2(int data2){
        this.data2 = data2;
    }
    public int getData2(){
        return data2;
    }

//    @Override
//    public int compare(MyData o1, MyData o2) {//理解新添加需要排序的元素是o1，已经排好序的元素s为o2
//        if(o1.data2 > o2.data2){
//            return 1;//默认，o1>o2，o2在前，o1在后
//        }else if(o1.data2 < o2.data2){
//            return -1;////默认，o1<o2，o1在前，o2在后
//        }
//        else{
//            return 0;//相等
//        }

        //添加顺序1,3,2,4.
       //return 0;//1
        //return 1;//1,3,2,4
        //return -1;//4,2,3,1
        //返回-1,默认o1<o2，o1排在o2之前
    //}

    @Override
    public String toString() {
        //return super.toString();
        return getClass().getName()+"[data1="+data1+",name="+name+",data2="+data2+"]";
    }
}

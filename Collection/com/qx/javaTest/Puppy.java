package com.qx.javaTest;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/10/19/14:56
 * @Description: 不实现接口的比较器或自然排序，在集合参数里new匿名类，重写比较器
 * */
public class Puppy {

    private int id;
    private String name;



    public Puppy(int id,String name){
        this.name = name;
        this.id = id;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNmae(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        //return super.toString();
        return getClass().getName()+"[id="+id+",name="+name+"]";
    }

}

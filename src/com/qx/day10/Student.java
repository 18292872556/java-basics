package com.qx.day10;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/09/10/14:47
 * @Description:
 */
public class Student {
    private int id;
    private String name;

    public Student(){

    }

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void setNmae(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        //return super.toString();
        return getClass().getName()+"[id="+id+",name="+name+"]";
    }
}

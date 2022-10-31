package com.qx.javaTest;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/10/13/21:23
 * @Description: 实现接口Comparable<Student>，重写compareTo(Student o)
 */
public class Student implements Comparable<Student>{
    //学生，三个属性，姓名，年龄，学号
    private String name;
    private int age;
    private int id;

    public Student( int id,String name, int age){
        this.name = name;
        this.age = age;
        this.id = id;

    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getId(){
        return this.id;
    }

    //学号不会重复，所以以学号来决定大小
    @Override
    public int compareTo(Student o) {//this代表当前添加进来需要排序的元素，o代表集合中所有已经排序完成的元素
        if(this.id > o.id){
            return 1;//默认this大于o,o在前，this在后
        }else if(this.id < o.id){
            return -1;
        }else{
            return 0;
        }
        //return 0;
    }

    @Override
    public String toString() {
        //return super.toString();
        return getClass().getName()+"[id="+id+",name="+name+",age="+age+"]";
    }
}

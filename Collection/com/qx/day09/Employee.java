package com.qx.day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: xuexuezi
 * @Date: 2022/08/23/14:07
 * @Description:
 */
public abstract class Employee {
    public Employee(int id, String name, String salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public Employee(){

    }

    int id;
    String name;
    String salary;

    public abstract void work();


}
class CommonEmployee extends Employee{
    @Override
    public void work() {
        System.out.println("普通员工工作");
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSalary(){
        return salary;
    }
}

class Manager extends Employee{

    int bonus;

    @Override
    public void work() {
        System.out.println("管理员工作");
    }
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSalary(){
        return salary;
    }
    public int getBonus(){
        return bonus;
    }
}
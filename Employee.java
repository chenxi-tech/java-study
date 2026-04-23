package com.itheima.oopextendshomework1;

public class Employee {
    //定义属性
    private int id;
    private String name;
    private double salary;

    //构造方法

    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //get/set方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //成员方法
    public void work(){
        System.out.println("员工正在工作");
    }

    public void eat(){
        System.out.println("员工正在吃");
    }
}

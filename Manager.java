package com.itheima.oopextendshomework1;

public class Manager extends Employee {
   // 属性
    private double bonus;
    //构造方法

    public Manager() {
    }

    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    //get/set方法

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    //成员方法

    @Override
    public void work() {
        System.out.println("经理的工作是管理其他人");
    }

    @Override
    public void eat() {
        System.out.println("经理在吃米饭");
    }
}

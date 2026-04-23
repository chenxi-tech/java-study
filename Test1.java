package com.itheima.oopextendshomework1;

public class Test1 {
    public static void main(String[] args) {
            /*
         练习：继承的作业1（餐饮菜品推荐）
        1. 经理
           成员变量：工号，姓名，工资，管理奖金
           成员方法：工作(管理其他人)，吃饭(吃米饭)

        2. 厨师
           成员变量：工号，姓名，工资
           成员方法：工作(炒菜)，吃饭(吃米饭)
     */
        //创建对象
        Manager m = new Manager(1101, "王经理", 5000,1000);
        System.out.println(m.getName() + " "+ m.getId() + " "+ m.getSalary() + " " + m.getBonus());
        m.work();
        m.eat();

        System.out.println("----------------");

        Cook c = new Cook(1102, "张大厨", 5000);
        System.out.println(c.getName() + " "+ c.getId() + " "+ c.getSalary());
        c.work();
        c.eat();


    }
}

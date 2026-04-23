package com.itheima.oopextendshomework1;

public class Cook extends  Employee {

    //构造方法

    public Cook() {
    }

    public Cook(int id, String name, double salary) {
        super(id, name, salary);
    }

    //重写 方法

    @Override
    public void work() {
        System.out.println("厨师正在炒菜");
    }

    @Override
    public void eat() {
        System.out.println("厨师在吃米饭");
    }
}

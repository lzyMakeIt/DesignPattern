package com.lzy.design.template;

/**
 * @Author: lzy
 * @Date: 2021/8/14 20:19
 * @Description: 豆浆抽象类
 */
public abstract class SoybeanMilk {

    //模板方法 防止子类重写
    public final void make(){
        select();
        //钩子方法
        if(flag()) {
            add();
        }
        push();
        start();
    }

    public void select(){
        System.out.println("挑选黄豆");
    }

    public void push(){
        System.out.println("放入豆浆机");
    }

    public void start(){
        System.out.println("开启豆浆机");
    }

    public boolean flag(){
        return true;
    }

    public abstract void add();
}

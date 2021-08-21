package com.lzy.design.strategy;

import com.lzy.design.strategy.behaviour.Flyable;
import com.lzy.design.strategy.behaviour.Shoutable;

/**
 * @Author: lzy
 * @Date: 2021/8/21 21:43
 * @Description: 鸭子抽象类
 */
public abstract class Duck {
    private Flyable fly;
    private Shoutable shout;

    public void setFly(Flyable fly){
        this.fly=fly;
    }

    public void setShout(Shoutable shout) {
        this.shout = shout;
    }

    public void fly(){
        fly.fly();
    }

    public void shout(){
        shout.shout();
    }

    public abstract void display();
}

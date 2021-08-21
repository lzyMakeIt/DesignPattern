package com.lzy.design.strategy;

import com.lzy.design.strategy.behaviour.Flyable;
import com.lzy.design.strategy.behaviour.Shoutable;

/**
 * @Author: lzy
 * @Date: 2021/8/21 21:49
 * @Description: 鸭子实现类
 */
public class ToyDuck extends Duck {
    public ToyDuck(Flyable flyable, Shoutable shoutable){
        setFly(flyable);
        setShout(shoutable);
    }

    @Override
    public void display() {
        System.out.println("-- 这是一只玩具鸭 --");
        fly();
        shout();
    }
}

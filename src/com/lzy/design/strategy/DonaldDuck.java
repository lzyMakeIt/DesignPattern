package com.lzy.design.strategy;

import com.lzy.design.strategy.behaviour.Flyable;
import com.lzy.design.strategy.behaviour.Shoutable;

/**
 * @Author: lzy
 * @Date: 2021/8/21 21:51
 * @Description: 鸭子实现类
 */
public class DonaldDuck extends Duck {
    public DonaldDuck(Flyable flyable, Shoutable shoutable){
        setFly(flyable);
        setShout(shoutable);
    }

    @Override
    public void display() {
        System.out.println("-- 我是唐老鸭 --");
        fly();
        shout();
    }
}

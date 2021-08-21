package com.lzy.design.strategy.behaviour;

/**
 * @Author: lzy
 * @Date: 2021/8/21 21:53
 * @Description: 不会飞
 */
public class NonFlyBehaviour implements Flyable {
    @Override
    public void fly() {
        System.out.println("不会飞 ~~");
    }
}

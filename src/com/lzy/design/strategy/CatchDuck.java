package com.lzy.design.strategy;

import com.lzy.design.strategy.behaviour.*;

/**
 * @Author: lzy
 * @Date: 2021/8/21 21:57
 * @Description: 客户端
 */
public class CatchDuck {
    public static void main(String[] args) {
        Flyable nonFly=new NonFlyBehaviour();
        Shoutable noShout=new NonShoutBehaviour();
        Shoutable shout=new GoodShoutBehaviour();

        Duck toy=new ToyDuck(nonFly,noShout);
        Duck donald=new DonaldDuck(nonFly,shout);

        toy.display();
        donald.display();
    }
}

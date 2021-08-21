package com.lzy.design.strategy.behaviour;

/**
 * @Author: lzy
 * @Date: 2021/8/21 21:54
 * @Description: 不会叫
 */
public class NonShoutBehaviour implements Shoutable {
    @Override
    public void shout() {
        System.out.println("不会叫 =_=");
    }
}

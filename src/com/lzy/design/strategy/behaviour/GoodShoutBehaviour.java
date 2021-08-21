package com.lzy.design.strategy.behaviour;

/**
 * @Author: lzy
 * @Date: 2021/8/21 21:55
 * @Description: 会说话
 */
public class GoodShoutBehaviour implements Shoutable {
    @Override
    public void shout() {
        System.out.println("欢迎来到 米奇妙妙屋");
    }
}

package com.lzy.design.mediator.colleagueImpl;

import com.lzy.design.mediator.Colleague;

/**
 * @Author: lzy
 * @Date: 2021/8/20 17:42
 * @Description: 咖啡机
 */
public class CoffeeMachine extends Colleague {

    @Override
    public void send() {
        getMediator().relay(this);
    }

    @Override
    public void receive() {
        System.out.println("打开咖啡机");
        send();
    }
}

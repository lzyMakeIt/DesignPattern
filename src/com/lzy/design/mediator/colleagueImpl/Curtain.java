package com.lzy.design.mediator.colleagueImpl;

import com.lzy.design.mediator.Colleague;

/**
 * @Author: lzy
 * @Date: 2021/8/20 18:00
 * @Description: 窗帘
 */
public class Curtain extends Colleague {
    @Override
    public void send() {
        getMediator().relay(this);
    }

    @Override
    public void receive() {
        System.out.println("窗帘关闭");
        send();
    }
}

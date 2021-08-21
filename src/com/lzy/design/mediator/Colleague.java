package com.lzy.design.mediator;

import com.lzy.design.mediator.Mediator;

/**
 * @Author: lzy
 * @Date: 2021/8/20 17:35
 * @Description: 同事抽象类
 */
public abstract class Colleague {
    //中介者
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void send();
    public abstract void receive();
}

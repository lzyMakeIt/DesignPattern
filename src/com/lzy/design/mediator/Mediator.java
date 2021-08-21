package com.lzy.design.mediator;

/**
 * @Author: lzy
 * @Date: 2021/8/20 17:34
 * @Description: 中介者抽象类
 */
public interface Mediator {
    void register(Colleague colleague);
    void relay(Colleague colleague);
}

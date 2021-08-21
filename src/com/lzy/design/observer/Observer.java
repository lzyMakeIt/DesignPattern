package com.lzy.design.observer;

/**
 * @Author: lzy
 * @Date: 2021/8/20 16:59
 * @Description: 抽象观察者
 */
public interface Observer {
    //主题状态改变时调用
    void update();
}

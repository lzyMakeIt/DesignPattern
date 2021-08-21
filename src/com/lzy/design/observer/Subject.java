package com.lzy.design.observer;

/**
 * @Author: lzy
 * @Date: 2021/8/20 16:56
 * @Description: 抽象主题
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

package com.lzy.design.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lzy
 * @Date: 2021/8/20 18:40
 * @Description: 维护对象状态
 */
public class CareTaker {
    private Map<String,Memento> mementos;

    public CareTaker(){
        this.mementos=new HashMap<>();
    }

    public void addState(String state,Memento memento){
        mementos.put(state,memento);
    }

    public Memento getState(String state){
        return mementos.get(state);
    }
}

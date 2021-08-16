package com.lzy.design.visitor.element;

import com.lzy.design.visitor.visitor.Action;

/**
 * @Author: lzy
 * @Date: 2021/8/16 18:05
 * @Description: 抽象元素 被访问者抽象类
 */
public abstract class Person {
    private String name;

    public Person(String name){
        this.name=name;
    }

    public final String getName(){
        return name;
    }

    //接收访问者
    public abstract void accept(Action action);
}

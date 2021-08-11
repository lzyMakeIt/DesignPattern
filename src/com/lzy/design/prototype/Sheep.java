package com.lzy.design.prototype;

import java.io.Serializable;

/**
 * @Author: lzy
 * @Date: 2021/8/9 17:57
 * @Description: 原型模式
 */
public class Sheep implements Cloneable, Serializable {
    private String name;
    private Sheep friend;

    public Sheep(String name){
        this.name=name;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public Sheep getFriend() {
        return friend;
    }

    //克隆方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //深拷贝
        if(this.friend!=null){
            this.friend=(Sheep) this.friend.clone();
        }

        return super.clone();
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", friend=" + friend +
                '}';
    }
}

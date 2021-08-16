package com.lzy.design.flyweight;

/**
 * @Author: lzy
 * @Date: 2021/8/13 22:07
 * @Description: 用户,外部状态
 */
public class User {
    private String name;

    public User(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}

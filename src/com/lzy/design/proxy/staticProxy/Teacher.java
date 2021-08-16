package com.lzy.design.proxy.staticProxy;

/**
 * @Author: lzy
 * @Date: 2021/8/13 22:17
 * @Description: 被代理类
 */
public class Teacher implements TeachDao {
    @Override
    public void teach() {
        System.out.println("被代理的类");
    }
}

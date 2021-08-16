package com.lzy.design.proxy.dynamic;

/**
 * @Author: lzy
 * @Date: 2021/8/14 20:01
 * @Description: 被代理类
 */
public class Teacher implements TeachDao {
    @Override
    public void teach() {
        System.out.println("开始授课");
    }
}

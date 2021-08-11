package com.lzy.design.bridge;

/**
 * @Author: lzy
 * @Date: 2021/8/10 20:11
 * @Description: 手机品牌实现类
 */
public class Apple implements Brand {
    @Override
    public void open() {
        System.out.println("苹果手机开机");
    }

    @Override
    public void call() {
        System.out.println("苹果手机打电话");
    }

    @Override
    public void close() {
        System.out.println("苹果手机关机");
    }
}

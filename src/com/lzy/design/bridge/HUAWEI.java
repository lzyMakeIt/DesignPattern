package com.lzy.design.bridge;

/**
 * @Author: lzy
 * @Date: 2021/8/10 20:13
 * @Description: 手机品牌实现类
 */
public class HUAWEI implements Brand{
    @Override
    public void open() {
        System.out.println("华为手机开机");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void close() {
        System.out.println("华为手机关机");
    }
}

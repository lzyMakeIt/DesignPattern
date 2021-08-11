package com.lzy.design.factory.common;

/**
 * @Author: lzy
 * @Date: 2021/8/5 22:09
 * @Description: 北京工厂的希腊披萨
 */
public class BJGreekPizza extends Pizza {

    public BJGreekPizza(){
        prepare();
        box();
    }

    @Override
    public void prepare() {
        System.out.println("北京工厂生产希腊披萨");
    }

    @Override
    public void box() {
        System.out.println("北京工厂打包希腊披萨");
    }
}

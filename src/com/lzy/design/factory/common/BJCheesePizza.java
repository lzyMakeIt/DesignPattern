package com.lzy.design.factory.common;

/**
 * @Author: lzy
 * @Date: 2021/8/5 22:19
 * @Description: 北京工厂的奶酪披萨
 */
public class BJCheesePizza extends Pizza {

    public BJCheesePizza(){
        prepare();
        box();
    }

    @Override
    public void prepare() {
        System.out.println("北京工厂生产奶酪披萨");
    }

    @Override
    public void box() {
        System.out.println("北京工厂打包奶酪披萨");
    }
}

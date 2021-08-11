package com.lzy.design.factory.common;

/**
 * @Author: lzy
 * @Date: 2021/8/5 22:20
 * @Description: 伦敦工厂的奶酪披萨
 */
public class LDCheesePizza extends Pizza {
    public LDCheesePizza(){
        prepare();
        box();
    }

    @Override
    public void prepare() {
        System.out.println("伦敦工厂生产奶酪披萨");
    }

    @Override
    public void box() {
        System.out.println("伦敦工厂打包奶酪披萨");
    }
}

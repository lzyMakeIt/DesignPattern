package com.lzy.design.factory.common;

/**
 * @Author: lzy
 * @Date: 2021/8/5 22:22
 * @Description: 伦敦工厂的希腊披萨
 */
public class LDGreekPizza extends Pizza {

    public LDGreekPizza(){
        prepare();
        box();
    }

    @Override
    public void prepare() {
        System.out.println("伦敦工厂生产希腊披萨");
    }

    @Override
    public void box() {
        System.out.println("伦敦工厂打包希腊披萨");
    }
}

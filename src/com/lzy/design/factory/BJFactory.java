package com.lzy.design.factory;

import com.lzy.design.factory.common.BJCheesePizza;
import com.lzy.design.factory.common.BJGreekPizza;
import com.lzy.design.factory.common.Pizza;

/**
 * @Author: lzy
 * @Date: 2021/8/5 22:05
 * @Description: 北京披萨工厂
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String name) {
        Pizza pizza=null;

        if("greek".equals(name)){
            return new BJGreekPizza();
        }else if("cheese".equals(name)){
            return new BJCheesePizza();
        }else {
            System.out.println("没有该披萨!");
        }

        return pizza;
    }
}

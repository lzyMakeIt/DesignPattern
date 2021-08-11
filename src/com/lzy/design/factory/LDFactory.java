package com.lzy.design.factory;

import com.lzy.design.factory.common.LDCheesePizza;
import com.lzy.design.factory.common.LDGreekPizza;
import com.lzy.design.factory.common.Pizza;

/**
 * @Author: lzy
 * @Date: 2021/8/5 22:05
 * @Description: 伦敦披萨工厂
 */
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String name) {
        Pizza pizza=null;

        if("greek".equals(name)){
            return new LDGreekPizza();
        }else if("cheese".equals(name)){
            return new LDCheesePizza();
        }else {
            System.out.println("没有该披萨!");
        }

        return pizza;
    }
}

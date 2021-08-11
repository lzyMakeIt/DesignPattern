package com.lzy.design.decorator;

/**
 * @Author: lzy
 * @Date: 2021/8/10 22:46
 * @Description: 装饰者
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        super.setDes("牛奶");
        super.setCost(1.0);
    }
}

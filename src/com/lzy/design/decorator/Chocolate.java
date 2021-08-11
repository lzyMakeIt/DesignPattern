package com.lzy.design.decorator;

/**
 * @Author: lzy
 * @Date: 2021/8/10 22:49
 * @Description: 装饰者
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        super.setDes("巧克力");
        super.setCost(2.5);
    }
}

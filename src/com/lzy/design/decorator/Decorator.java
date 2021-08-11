package com.lzy.design.decorator;

/**
 * @Author: lzy
 * @Date: 2021/8/10 22:44
 * @Description: 装饰者类
 */
public abstract class Decorator extends Drink {
    //聚合被修饰者
    private Drink drink;

    public Decorator(Drink drink){
        this.drink=drink;
    }

    @Override
    public double cost() {
        return drink.cost()+super.getVal();
    }

    @Override
    public String describe() {
        return drink.describe()+" "+super.describe();
    }
}

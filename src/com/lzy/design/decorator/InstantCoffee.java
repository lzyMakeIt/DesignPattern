package com.lzy.design.decorator;

/**
 * @Author: lzy
 * @Date: 2021/8/10 22:42
 * @Description: 被装饰者 速溶咖啡
 */
public class InstantCoffee extends Drink {
    public InstantCoffee(){
        super.setDes("速溶咖啡");
        super.setCost(8.0);
    }

    @Override
    public double cost() {
        return super.getVal();
    }
}

package com.lzy.design.decorator;

/**
 * @Author: lzy
 * @Date: 2021/8/10 22:34
 * @Description: 被装饰类 摩卡咖啡
 */
public class MochaCoffee extends Drink {
    public MochaCoffee(){
        super.setDes("摩卡咖啡");
        super.setCost(10.0);
    }

    @Override
    public double cost() {
        return super.getVal();
    }
}

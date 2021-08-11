package com.lzy.design.decorator;

/**
 * @Author: lzy
 * @Date: 2021/8/10 22:29
 * @Description: 全体的超类
 */
public abstract class Drink {
    private String des;
    private double val;

    public void setDes(String des) {
        this.des = des;
    }

    public void setCost(double val){
        this.val=val;
    }

    public double getVal() {
        return val;
    }

    public String describe(){
        return des;
    }
    public abstract double cost();
}

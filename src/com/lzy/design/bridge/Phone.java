package com.lzy.design.bridge;

/**
 * @Author: lzy
 * @Date: 2021/8/10 20:19
 * @Description: 手机抽象类
 */
public abstract class Phone {
    //聚合品牌
    private Brand brand;

    public Phone(Brand brand){
        this.brand=brand;
    }

    protected void open(){
        brand.open();
    }

    protected void call(){
        this.brand.call();
    }

    protected void close(){
        this.brand.close();
    }
}

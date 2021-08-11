package com.lzy.design.bridge;

/**
 * @Author: lzy
 * @Date: 2021/8/10 20:25
 * @Description: 触屏手机
 */
public class TouchPhone extends Phone {
    public TouchPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        System.out.println("触屏式手机");
        super.open();
    }

    public void call(){
        System.out.println("触屏式手机");
        super.call();
    }

    public void close(){
        System.out.println("触屏式手机");
        super.close();
    }
}

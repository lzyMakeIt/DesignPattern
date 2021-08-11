package com.lzy.design.bridge;

/**
 * @Author: lzy
 * @Date: 2021/8/10 20:22
 * @Description: 折叠式手机类
 */
public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        System.out.println("折叠式手机");
        super.open();
    }

    public void call(){
        System.out.println("折叠式手机");
        super.call();
    }

    public void close(){
        System.out.println("折叠式手机");
        super.close();
    }
}

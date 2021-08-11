package com.lzy.design.bridge;

/**
 * @Author: lzy
 * @Date: 2021/8/10 20:27
 * @Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        Phone iphone=new FoldedPhone(new Apple());
        iphone.open();
        iphone.call();
        iphone.close();

        System.out.println("-----------------------------------------------");

        Phone huawei=new TouchPhone(new HUAWEI());
        huawei.open();
        huawei.call();
        huawei.close();
    }
}

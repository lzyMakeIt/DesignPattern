package com.lzy.design.facade;

/**
 * @Author: lzy
 * @Date: 2021/8/13 21:11
 * @Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        FacadePattern facade=new FacadePattern();

        facade.start();
        facade.end();
    }
}

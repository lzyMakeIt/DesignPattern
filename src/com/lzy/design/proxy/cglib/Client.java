package com.lzy.design.proxy.cglib;

/**
 * @Author: lzy
 * @Date: 2021/8/14 23:59
 * @Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxy=new ProxyFactory(new Teach());

        Teach teacher=(Teach) proxy.getProxyInstance();
        teacher.teach();
    }
}

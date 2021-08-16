package com.lzy.design.proxy.dynamic;

/**
 * @Author: lzy
 * @Date: 2021/8/14 20:08
 * @Description: 用户
 */
public class Client {
    public static void main(String[] args) {
        TeachDao teacher=(TeachDao) new ProxyFactory(new Teacher()).getInstance();
        teacher.teach();
    }
}

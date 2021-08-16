package com.lzy.design.proxy.staticProxy;

/**
 * @Author: lzy
 * @Date: 2021/8/13 22:19
 * @Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        TeachDao teacher=new TeachProxy(new Teacher());
        teacher.teach();
    }
}

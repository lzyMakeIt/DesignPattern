package com.lzy.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: lzy
 * @Date: 2021/8/14 20:02
 * @Description: 动态代理工厂
 */
public class ProxyFactory {
    //被代理对象
    private Object target;

    public ProxyFactory(Object target){
        this.target=target;
    }

    public Object getInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("--- 前置增强 ---");
                        Object obj=method.invoke(target,args);
                        System.out.println("--- 后置增强 ---");
                        return obj;
                    }
                });
    }
}

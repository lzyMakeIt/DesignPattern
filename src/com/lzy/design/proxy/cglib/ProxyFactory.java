package com.lzy.design.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: lzy
 * @Date: 2021/8/14 23:49
 * @Description: cglib代理
 */
public class ProxyFactory implements MethodInterceptor {
    private Object target;

    public ProxyFactory(Object target){
        this.target=target;
    }

    public Object getProxyInstance(){
        //创建工具类
        Enhancer enhancer=new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("--- cglib前置增强 ---");
        Object returnVal=method.invoke(target,objects);
        System.out.println("--- cglib后置增强 ---");
        return returnVal;
    }
}

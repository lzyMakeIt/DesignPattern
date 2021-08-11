package com.lzy.design.singleton;

import java.io.Serializable;

/**
 * @Author: lzy
 * @Date: 2021/8/4 19:27
 * @Description: 饿汉式单例模式
 * 类装载时实现对象创建
 * 线程安全
 * 没有实现lazy loading 可能造成内存浪废
 */
public class SingletonType1 implements Serializable {

    private static final long serialVersionUID=1l;
    //保证单例模式
    private static String lock="lzy";

    //构造器私有
    private SingletonType1(){
        if(!"lzy".equals(lock)){
            throw new RuntimeException("不要用反射破坏单例模式");
        }
        lock=null;
    }

    //方法一 常量
    //private static final SingletonType1 instance=new SingletonType1();

    //方法二 静态代码块
    private static SingletonType1 instance=null;

    static {
        instance=new SingletonType1();
    }

    public static SingletonType1 getInstance(){
        return instance;
    }

    //反序列化时调用此函数 保证单例
    public Object readResolve(){
        return instance;
    }
}

package com.lzy.design.singleton;

/**
 * @Author: lzy
 * @Date: 2021/8/4 19:43
 * @Description: 懒汉式单例模式
 * 静态内部类方式
 * 实现了懒加载
 * 保证线程安全
 */
public class SingletonType3 {

    private SingletonType3(){}

    //静态内部类
    //外部类加载并不会导致内部类的加载
    private static class InsideType3{
        private static final SingletonType3 instance=new SingletonType3();
    }

    public static SingletonType3 getInstance() {
        return InsideType3.instance;
    }
}

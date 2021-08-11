package com.lzy.design.singleton;

/**
 * @Author: lzy
 * @Date: 2021/8/4 19:35
 * @Description: 懒汉式单例模式
 * 双重检查方式
 * 实现了lazy loading
 * double check保证线程安全
 */
public class SingletonType2 {

    private SingletonType2(){}

    //new不是原子操作 volatile关键字防止指令重排
    //volatile保证可见性、防止指令重排，但是不保证原子性
    private static volatile SingletonType2 instance=null;

    public static SingletonType2 getInstance(){
        if(instance==null){
            //synchronized重量级锁
            //保证线程安全同时也保证执行效率
            synchronized (SingletonType2.class){
                if(instance==null){
                    instance=new SingletonType2();
                }
            }
        }
        return instance;
    }
}

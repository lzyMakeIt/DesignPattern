package com.lzy.design.singleton;

/**
 * @Author: lzy
 * @Date: 2021/8/4 19:56
 * @Description: 枚举式单例模式
 * 枚举保证单例优势
 * 避免反射攻击
 * 避免序列化问题
 */
public enum SingletonType4 {
    INSTANCE;

    public void method(){
        System.out.println("枚举单例模式");
    }

    public static void main(String[] args) {
        SingletonType4.INSTANCE.method();
    }
}

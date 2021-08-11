package com.lzy.design.singleton.attack;

import com.lzy.design.singleton.SingletonType1;

import java.lang.reflect.Constructor;

/**
 * @Author: lzy
 * @Date: 2021/8/4 20:26
 * @Description: 模拟反射破坏单例模式
 */
public class ReflectAttack {
    public static void main(String[] args) throws Exception {
        Class clazz=SingletonType1.class;

        Constructor con=clazz.getDeclaredConstructor(null);
        con.setAccessible(true);
        con.newInstance();
    }
}

package com.lzy.design.factory;

import com.lzy.design.factory.common.Pizza;

/**
 * @Author: lzy
 * @Date: 2021/8/5 22:04
 * @Description: 定义工厂的模式
 */
public interface AbsFactory {
    Pizza createPizza(String name);
}

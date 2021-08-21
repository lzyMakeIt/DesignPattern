package com.lzy.design.interpreter;

import java.util.Map;

/**
 * @Author: lzy
 * @Date: 2021/8/20 19:55
 * @Description: 抽象表达式
 */
public abstract class AbstractExpression {
    public abstract int Interpret(Map<Character,Integer> map);
}

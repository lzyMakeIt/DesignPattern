package com.lzy.design.interpreter.interpreter;

import com.lzy.design.interpreter.AbstractExpression;
import com.lzy.design.interpreter.NonterminalExpression;

import java.util.Map;

/**
 * @Author: lzy
 * @Date: 2021/8/20 20:14
 * @Description: 加法解释器
 */
public class AddExpression extends NonterminalExpression {
    public AddExpression(AbstractExpression left, AbstractExpression right) {
        super(left, right);
    }

    @Override
    public int Interpret(Map<Character, Integer> map) {
        return left.Interpret(map)+right.Interpret(map);
    }
}

package com.lzy.design.interpreter.interpreter;

import com.lzy.design.interpreter.AbstractExpression;
import com.lzy.design.interpreter.NonterminalExpression;

import java.util.Map;

/**
 * @Author: lzy
 * @Date: 2021/8/20 20:16
 * @Description: 减法解释器
 */
public class SubtractExpression extends NonterminalExpression {
    public SubtractExpression(AbstractExpression left, AbstractExpression right) {
        super(left, right);
    }

    @Override
    public int Interpret(Map<Character, Integer> map) {
        return left.Interpret(map)- right.Interpret(map);
    }
}

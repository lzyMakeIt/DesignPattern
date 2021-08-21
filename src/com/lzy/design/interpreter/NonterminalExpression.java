package com.lzy.design.interpreter;

import java.util.Map;

/**
 * @Author: lzy
 * @Date: 2021/8/20 19:58
 * @Description: 非终结符表达式
 */
public abstract class NonterminalExpression extends AbstractExpression {
    protected AbstractExpression left;
    protected AbstractExpression right;

    public NonterminalExpression(AbstractExpression left,AbstractExpression right){
        this.left=left;
        this.right=right;
    }
}

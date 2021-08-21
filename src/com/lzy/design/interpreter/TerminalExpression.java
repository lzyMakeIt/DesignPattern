package com.lzy.design.interpreter;

import java.util.Map;

/**
 * @Author: lzy
 * @Date: 2021/8/20 19:57
 * @Description: 终结符表达式
 */
public class TerminalExpression extends AbstractExpression {
    private char val;

    public TerminalExpression(char val){
        this.val=val;
    }

    @Override
    public int Interpret(Map<Character,Integer> map) {
        return map.get(val);
    }
}

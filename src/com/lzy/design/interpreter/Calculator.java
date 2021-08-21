package com.lzy.design.interpreter;

import com.lzy.design.interpreter.interpreter.AddExpression;
import com.lzy.design.interpreter.interpreter.SubtractExpression;

import java.util.Map;
import java.util.Stack;

/**
 * @Author: lzy
 * @Date: 2021/8/20 20:18
 * @Description: context环境类
 */
public class Calculator {
    private AbstractExpression expression;

    public Calculator(String expression){
        char[] exp=expression.toCharArray();
        Stack<AbstractExpression> expressions=new Stack<>();

        AbstractExpression left=null;
        AbstractExpression right=null;

        for(int i=0;i<exp.length;i++){
            switch (exp[i]){
                case '+':
                    left=expressions.pop();
                    right=new TerminalExpression(exp[++i]);
                    expressions.push(new AddExpression(left,right));
                    break;
                case '-':
                    left=expressions.pop();
                    right=new TerminalExpression(exp[++i]);
                    expressions.push(new SubtractExpression(left,right));
                    break;
                default:
                    expressions.push(new TerminalExpression(exp[i]));
                    break;
            }
        }

        this.expression=expressions.pop();
    }

    public int calculate(Map<Character,Integer> parameters){
        return expression.Interpret(parameters);
    }
}

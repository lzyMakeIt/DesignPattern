package com.lzy.design.interpreter;

import java.util.*;

/**
 * @Author: lzy
 * @Date: 2021/8/20 20:31
 * @Description: 测试
 */
public class UseCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String expression=sc.next();

        Calculator calculator=new Calculator(expression);

        Map<Character,Integer> parameters=new HashMap<>();
        Set<Character> rep=new HashSet<>();
        char[] exp_char=expression.toCharArray();
        for(char c:exp_char){
            if(('a'<=c&&'z'>=c)||(c>='A'&&c<='Z')){
                if(rep.add(c)){
                    System.out.print("请输入"+c+"的值: ");
                    int val=sc.nextInt();
                    parameters.put(c,val);
                }
            }
        }

        System.out.println(expression+"的值是: "+calculator.calculate(parameters));
    }
}

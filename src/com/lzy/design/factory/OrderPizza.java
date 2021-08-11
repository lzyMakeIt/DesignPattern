package com.lzy.design.factory;

import java.util.Scanner;

/**
 * @Author: lzy
 * @Date: 2021/8/5 22:24
 * @Description: 订购披萨
 */
public class OrderPizza {
    //聚合生产工厂
    private AbsFactory factory;

    public void setFactory(AbsFactory factory) {
        this.factory = factory;
    }

    private void order(String name){
        if (factory!=null){
            factory.createPizza(name);
        } else {
            throw new RuntimeException("未指定工厂!");
        }
    }

    public void listenOrder(){
        Scanner sc=new Scanner(System.in);
        String name=null;

        while (!"quit".equals(name=sc.next())){
            order(name);
        }
    }

    public static void main(String[] args){
        OrderPizza orderPizza=new OrderPizza();

        orderPizza.setFactory(new BJFactory());
        orderPizza.listenOrder();
    }
}

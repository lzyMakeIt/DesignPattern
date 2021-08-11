package com.lzy.design.decorator;

/**
 * @Author: lzy
 * @Date: 2021/8/10 22:50
 * @Description: 咖啡店 调用端
 */
public class CoffeeShop {
    public static void main(String[] args) {
        Drink drink=new MochaCoffee();
        System.out.println(drink.describe()+" ---> "+drink.cost());

        drink=new Milk(drink);
        System.out.println(drink.describe()+" ---> "+drink.cost());

        drink=new Chocolate(drink);
        System.out.println(drink.describe()+" ---> "+drink.cost());

        drink=new Chocolate(drink);
        System.out.println(drink.describe()+" ---> "+drink.cost());
    }
}

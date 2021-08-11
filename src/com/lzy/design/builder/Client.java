package com.lzy.design.builder;

/**
 * @Author: lzy
 * @Date: 2021/8/9 19:55
 * @Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        HouseDirector director=new HouseDirector(new CommonHouseBuilder());
        House common=director.createHouse();
        System.out.println(common);

        System.out.println("----------------------------------------------------");

        director.setBuilder(new HighBuildingBuilder());
        House high=director.createHouse();
        System.out.println(high);
    }
}

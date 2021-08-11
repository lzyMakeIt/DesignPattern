package com.lzy.design.builder;

/**
 * @Author: lzy
 * @Date: 2021/8/9 19:50
 * @Description: 指挥者类
 */
public class HouseDirector {
    private Builder builder;

    public HouseDirector(Builder builder){
        setBuilder(builder);
    }

    public void setBuilder(Builder builder){
        this.builder=builder;
    }

    public House createHouse(){
        builder.buildBase();
        builder.buildWall();
        builder.buildRoof();

        House house= builder.getHouse();

        //造成内存浪费
        builder.buildNew();

        return house;
    }
}

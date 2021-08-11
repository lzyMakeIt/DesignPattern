package com.lzy.design.builder;

/**
 * @Author: lzy
 * @Date: 2021/8/9 19:30
 * @Description: 建造者抽象类
 */
public abstract class Builder {
    private House house=new House();

    public abstract void buildBase();
    public abstract void buildWall();
    public abstract void buildRoof();

    public void buildNew(){
        house=new House();
    }

    public House getHouse(){
        return house;
    }
}

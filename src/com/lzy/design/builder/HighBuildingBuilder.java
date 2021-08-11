package com.lzy.design.builder;

/**
 * @Author: lzy
 * @Date: 2021/8/9 19:45
 * @Description: 建造者实现类
 */
public class HighBuildingBuilder extends Builder {
    @Override
    public void buildBase() {
        getHouse().setBase("50m");
        System.out.println("高层打地基50米");
    }

    @Override
    public void buildWall() {
        getHouse().setWall("2m");
        System.out.println("高层砌墙2米");
    }

    @Override
    public void buildRoof() {
        getHouse().setRoof("3m");
        System.out.println("高层盖屋顶3米");
    }
}

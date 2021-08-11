package com.lzy.design.builder;

/**
 * @Author: lzy
 * @Date: 2021/8/9 19:43
 * @Description: 建造者实现类
 */
public class CommonHouseBuilder extends Builder {
    @Override
    public void buildBase() {
        getHouse().setBase("20m");
        System.out.println("普通房子打地基20米");
    }

    @Override
    public void buildWall() {
        getHouse().setWall("3m");
        System.out.println("普通房子砌墙3米");
    }

    @Override
    public void buildRoof() {
        getHouse().setRoof("2m");
        System.out.println("普通房子盖屋顶2米");
    }
}

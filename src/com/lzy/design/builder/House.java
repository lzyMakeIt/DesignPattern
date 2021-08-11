package com.lzy.design.builder;

/**
 * @Author: lzy
 * @Date: 2021/8/9 19:37
 * @Description: 产品类
 */
public class House {
    private String base;
    private String wall;
    private String roof;

    public void setBase(String base) {
        this.base = base;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "base='" + base + '\'' +
                ", wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}

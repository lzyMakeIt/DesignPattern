package com.lzy.design.composite;

/**
 * @Author: lzy
 * @Date: 2021/8/11 19:27
 * @Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        //大学
        CompositeDemo university=new University("青岛科技大学","very good");

        //添加学院
        CompositeDemo tech=new College("信息技术学院","my like");
        CompositeDemo math=new College("数理学院","excellent");
        university.add(tech);
        university.add(math);

        //添加系
        tech.add(new Department("软件工程","pretty good"));
        tech.add(new Department("计算机通讯","hard"));
        tech.add(new Department("信息工程","feel easy"));
        math.add(new Department("应用统计","all is good"));

        university.print();
    }
}

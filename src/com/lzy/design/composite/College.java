package com.lzy.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lzy
 * @Date: 2021/8/11 19:23
 * @Description: 学院类
 */
public class College extends CompositeDemo {
    //学院含有、管理系
    private List<CompositeDemo> departments=new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    public void add(CompositeDemo compositeDemo) {
        departments.add(compositeDemo);
    }

    @Override
    public void remove(CompositeDemo compositeDemo) {
        departments.remove(compositeDemo);
    }

    @Override
    public void print() {
        System.out.println("----------------");
        super.print();
        for(CompositeDemo d:departments){
            d.print();
        }
    }
}

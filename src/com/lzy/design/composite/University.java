package com.lzy.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lzy
 * @Date: 2021/8/11 19:20
 * @Description: 大学类
 */
public class University extends CompositeDemo {
    //大学含有、管理学院
    private List<CompositeDemo> colleges=new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    public void add(CompositeDemo compositeDemo) {
        colleges.add(compositeDemo);
    }

    @Override
    public void remove(CompositeDemo compositeDemo) {
        colleges.remove(compositeDemo);
    }

    @Override
    public void print() {
        System.out.println("----------------------");
        super.print();
        for(CompositeDemo c:colleges){
            c.print();
        }
    }
}

package com.lzy.design.iterator;

import java.util.Iterator;

/**
 * @Author: lzy
 * @Date: 2021/8/16 18:54
 * @Description: 学院抽象类
 */
public abstract class College {
    private String name;
    private String des;

    public College(String name,String des){
        this.name=name;
        this.des=des;
    }

    public final String getName(){
        return name;
    }

    public final String getDes(){
        return des;
    }

    public abstract void addDepartment(Department department);
    public abstract Iterator createIterator();
}

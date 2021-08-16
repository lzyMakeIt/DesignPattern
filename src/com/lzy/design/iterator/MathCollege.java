package com.lzy.design.iterator;

import java.util.Iterator;

/**
 * @Author: lzy
 * @Date: 2021/8/16 19:09
 * @Description: 数理学院
 */
public class MathCollege extends College {
    private Department[] departments;
    private int cur=0;

    public MathCollege() {
        super("数理学院","非常不错");
        departments=new Department[5];
        this.addDepartment(new Department("应用统计","do a good job"));
        this.addDepartment(new Department("数理基础科学","excellent"));
    }

    @Override
    public void addDepartment(Department department) {
        departments[cur++]=department;
    }

    @Override
    public Iterator createIterator() {
        return new MathCollegeIterator(departments);
    }
}

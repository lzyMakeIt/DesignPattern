package com.lzy.design.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: lzy
 * @Date: 2021/8/16 18:58
 * @Description: 信息学院
 */
public class InfoCollege extends College {
    private List<Department> departments;

    public InfoCollege(){
        super("信息学院","这个学院有东西");
        departments=new ArrayList<>();
        this.addDepartment(new Department("软件工程","我的专业"));
        this.addDepartment(new Department("信息安全","good security"));
        this.addDepartment(new Department("惠普测试","不太懂"));
    }

    @Override
    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}

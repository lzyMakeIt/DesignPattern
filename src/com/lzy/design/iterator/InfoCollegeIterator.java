package com.lzy.design.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Author: lzy
 * @Date: 2021/8/16 19:05
 * @Description: 信息学院的迭代器
 */
public class InfoCollegeIterator implements Iterator {
    private List<Department> departments;
    private int num;

    public InfoCollegeIterator(List<Department> departments){
        this.departments=departments;
        this.num=-1;
    }

    @Override
    public boolean hasNext() {
        if(num>=departments.size()-1){
            return false;
        }
        num++;
        return true;
    }

    @Override
    public Object next() {
        return departments.get(num);
    }
}

package com.lzy.design.iterator;

import java.util.Iterator;

/**
 * @Author: lzy
 * @Date: 2021/8/16 19:13
 * @Description: 数理学院迭代器
 */
public class MathCollegeIterator implements Iterator {
    private Department[] departments;
    private int cur;

    public MathCollegeIterator(Department[] departments){
        this.departments=departments;
        cur=0;
    }

    @Override
    public boolean hasNext() {
        if(cur<departments.length&&departments[cur]!=null){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return departments[cur++];
    }
}

package com.lzy.design.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: lzy
 * @Date: 2021/8/16 19:17
 * @Description: 封装输出类
 */
public class OutPutDepartments {
    private List<College> colleges;

    public OutPutDepartments(){
        colleges=new ArrayList<>();
    }

    public void addCollege(College college){
        colleges.add(college);
    }

    public void output(){
        for(College college:colleges){
            System.out.println("-------------------------");
            System.out.println(college.getName()+" "+college.getDes());
            Iterator iterator=college.createIterator();
            while (iterator.hasNext()){
                Department department=(Department) iterator.next();
                System.out.println(department.getName()+" --> "+department.getDes());
            }
        }
    }
}

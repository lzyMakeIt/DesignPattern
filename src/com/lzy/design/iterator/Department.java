package com.lzy.design.iterator;

/**
 * @Author: lzy
 * @Date: 2021/8/16 18:56
 * @Description: 系
 */
public class Department {
    private String name;
    private String des;

    public Department(String name,String des){
        this.name=name;
        this.des=des;
    }

    public String getName(){
        return name;
    }

    public String getDes(){
        return des;
    }
}

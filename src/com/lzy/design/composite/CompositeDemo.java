package com.lzy.design.composite;

/**
 * @Author: lzy
 * @Date: 2021/8/11 19:15
 * @Description: 组合类
 */
public abstract class CompositeDemo {
    private String name;
    private String des;

    public void add(CompositeDemo compositeDemo){
        throw new UnsupportedOperationException("not support");
    }

    public void remove(CompositeDemo compositeDemo){
        throw new UnsupportedOperationException("not support");
    }

    public void print(){
        System.out.println(this.name);
    }

    public CompositeDemo(String name,String des){
        this.name=name;
        this.des=des;
    }
}

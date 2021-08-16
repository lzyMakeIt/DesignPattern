package com.lzy.design.template;

/**
 * @Author: lzy
 * @Date: 2021/8/14 20:32
 * @Description: 纯豆浆 使用钩子方法
 */
public class PureSoybeanMilk extends SoybeanMilk {

    @Override
    public boolean flag() {
        return false;
    }

    //空实现
    @Override
    public void add() {
        //System.out.println("我不会被调用");
    }
}

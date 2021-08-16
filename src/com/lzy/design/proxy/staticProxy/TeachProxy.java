package com.lzy.design.proxy.staticProxy;

/**
 * @Author: lzy
 * @Date: 2021/8/13 22:18
 * @Description: 代理类
 */
public class TeachProxy implements TeachDao {

    private TeachDao teacher;

    public TeachProxy(Teacher teacher){
        this.teacher=teacher;
    }

    @Override
    public void teach() {
        System.out.println("--- 前置增强 ---");
        teacher.teach();
        System.out.println("--- 后置增强 ---");
    }
}

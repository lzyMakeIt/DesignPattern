package com.lzy.design.memento;

/**
 * @Author: lzy
 * @Date: 2021/8/20 18:36
 * @Description: 保存状态
 */
public class Memento {
    //大量数据可以用集合存储
    private int attack;
    private int defence;

    public Memento(int attack,int defence){
        this.attack=attack;
        this.defence=defence;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }
}

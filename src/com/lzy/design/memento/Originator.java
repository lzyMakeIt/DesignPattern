package com.lzy.design.memento;

/**
 * @Author: lzy
 * @Date: 2021/8/20 18:33
 * @Description: 源对象
 */
public class Originator {
    private int attack;
    private int defence;

    public void changeState(int attack,int defence){
        this.attack=attack;
        this.defence=defence;
    }

    public Memento getMemento(){
        return new Memento(attack,defence);
    }

    public void recover(Memento memento){
        System.out.println("=== 状态恢复 ===");
        this.attack=memento.getAttack();
        this.defence=memento.getDefence();
    }

    public void display(){
        System.out.println("-----Boss状态-----");
        System.out.println("   攻击力:"+attack);
        System.out.println("   防御力:"+defence);
    }
}

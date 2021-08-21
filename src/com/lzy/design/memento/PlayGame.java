package com.lzy.design.memento;

/**
 * @Author: lzy
 * @Date: 2021/8/20 18:42
 * @Description: 测试
 */
public class PlayGame {
    public static void main(String[] args) {
        Originator originator=new Originator();
        originator.changeState(100,100);
        originator.display();

        CareTaker careTaker=new CareTaker();
        careTaker.addState("start",originator.getMemento());

        originator.changeState(50,50);
        originator.display();
        careTaker.addState("mid",originator.getMemento());

        originator.changeState(0,0);
        originator.display();
        careTaker.addState("end",originator.getMemento());

        originator.recover(careTaker.getState("start"));
        originator.display();
    }
}

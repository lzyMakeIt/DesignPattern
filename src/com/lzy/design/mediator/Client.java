package com.lzy.design.mediator;

import com.lzy.design.mediator.colleagueImpl.CoffeeMachine;
import com.lzy.design.mediator.colleagueImpl.Curtain;
import com.lzy.design.mediator.colleagueImpl.MusicPlayer;

/**
 * @Author: lzy
 * @Date: 2021/8/20 18:22
 * @Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator=new ConcreteMediator();

        mediator.register(new CoffeeMachine());
        mediator.register(new Curtain());
        Colleague music=new MusicPlayer();
        mediator.register(music);

        music.receive();
    }
}

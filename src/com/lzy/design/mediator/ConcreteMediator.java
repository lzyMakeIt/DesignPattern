package com.lzy.design.mediator;

import com.lzy.design.mediator.colleagueImpl.CoffeeMachine;
import com.lzy.design.mediator.colleagueImpl.Curtain;
import com.lzy.design.mediator.colleagueImpl.MusicPlayer;

import java.util.HashMap;
import java.util.Map;


/**
 * @Author: lzy
 * @Date: 2021/8/20 18:03
 * @Description: 具体中介者
 */
public class ConcreteMediator implements Mediator {
    private Map<String,Colleague> colleagues;

    public ConcreteMediator(){
        colleagues=new HashMap();
    }

    @Override
    public void register(Colleague colleague) {
        String name="";

        if(colleague instanceof MusicPlayer){
            name="music";
        }
        if(colleague instanceof Curtain){
            name="curtain";
        }
        if(colleague instanceof CoffeeMachine){
            name="coffee";
        }

        colleagues.put(name,colleague);
        colleague.setMediator(this);
    }

    @Override
    public void relay(Colleague colleague) {
        if(colleague instanceof MusicPlayer){
            colleagues.get("coffee").receive();
        }
        if(colleague instanceof CoffeeMachine){
            colleagues.get("curtain").receive();
        }
        if(colleague instanceof Curtain){
            System.out.println("准备完毕");
        }
    }
}

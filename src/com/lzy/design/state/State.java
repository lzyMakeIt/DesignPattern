package com.lzy.design.state;

import com.lzy.design.state.states.UnpaidState;

/**
 * @Author: lzy
 * @Date: 2021/8/21 21:10
 * @Description: 抽象状态类
 */
public abstract class State {
    protected GameContext game;

    public State(GameContext game){
        this.game=game;
    }

    public abstract void pay();
    public abstract void draw();
    public abstract void send();
}

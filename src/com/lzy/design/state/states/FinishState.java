package com.lzy.design.state.states;

import com.lzy.design.state.GameContext;
import com.lzy.design.state.State;

/**
 * @Author: lzy
 * @Date: 2021/8/21 21:22
 * @Description: 结束状态
 */
public class FinishState extends State {
    public FinishState(GameContext game) {
        super(game);
    }

    @Override
    public void pay() {
        System.out.println("游戏已结束");
    }

    @Override
    public void draw() {
        System.out.println("游戏已结束");
    }

    @Override
    public void send() {
        System.out.println("游戏已结束");
        System.exit(0);
    }
}

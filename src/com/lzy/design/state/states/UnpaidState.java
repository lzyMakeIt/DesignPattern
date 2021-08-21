package com.lzy.design.state.states;

import com.lzy.design.state.GameContext;
import com.lzy.design.state.State;

/**
 * @Author: lzy
 * @Date: 2021/8/21 21:12
 * @Description: 未付费状态
 */
public class UnpaidState extends State {
    public UnpaidState(GameContext game) {
        super(game);
    }

    @Override
    public void pay() {
        System.out.println("成功付费 -50");
        game.setState(game.getRaffle());
    }

    @Override
    public void draw() {
        System.out.println("未完成付费 无法抽奖");
    }

    @Override
    public void send() {
        System.out.println("您无法领奖");
    }
}

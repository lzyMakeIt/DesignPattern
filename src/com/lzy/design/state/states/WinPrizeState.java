package com.lzy.design.state.states;

import com.lzy.design.state.GameContext;
import com.lzy.design.state.State;

/**
 * @Author: lzy
 * @Date: 2021/8/21 21:20
 * @Description: 中奖状态
 */
public class WinPrizeState extends State {
    public WinPrizeState(GameContext game) {
        super(game);
    }

    @Override
    public void pay() {
        System.out.println("您已完成付费");
    }

    @Override
    public void draw() {
        System.out.println("您已抽中奖品，请先领取");
    }

    @Override
    public void send() {
        System.out.println("领取成功");
        game.reduce();
        if(game.getNum()>0){
            game.setState(game.getUnpaid());
            return;
        }

        game.setState(game.getFinish());
    }
}

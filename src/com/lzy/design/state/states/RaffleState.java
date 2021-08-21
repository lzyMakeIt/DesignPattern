package com.lzy.design.state.states;

import com.lzy.design.state.GameContext;
import com.lzy.design.state.State;

import java.util.Random;

/**
 * @Author: lzy
 * @Date: 2021/8/21 21:18
 * @Description: 可抽奖状态
 */
public class RaffleState extends State {
    public RaffleState(GameContext game) {
        super(game);
    }

    @Override
    public void pay() {
        System.out.println("您已付费");
    }

    @Override
    public void draw() {
        Random random=new Random();
        if(random.nextInt(5)==0){
            System.out.println("恭喜您，抽中奖品");
            game.setState(game.getWin());
            return;
        }

        System.out.println("很遗憾，再接再厉");
        game.setState(game.getUnpaid());
    }

    @Override
    public void send() {
        System.out.println("不可领取奖品");
    }
}

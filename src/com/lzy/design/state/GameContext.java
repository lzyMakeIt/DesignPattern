package com.lzy.design.state;

import com.lzy.design.state.states.FinishState;
import com.lzy.design.state.states.RaffleState;
import com.lzy.design.state.states.UnpaidState;
import com.lzy.design.state.states.WinPrizeState;

/**
 * @Author: lzy
 * @Date: 2021/8/21 21:14
 * @Description: 状态上下文
 */
public class GameContext {
    private State current;
    private int num=1;

    private State unpaid=new UnpaidState(this);
    private State raffle=new RaffleState(this);
    private State win=new WinPrizeState(this);
    private State finish=new FinishState(this);

    public GameContext(){
        current=unpaid;
    }

    public void setState(State state){
        current=state;
    }

    public State getUnpaid() {
        return unpaid;
    }

    public State getRaffle() {
        return raffle;
    }

    public State getWin() {
        return win;
    }

    public State getFinish() {
        return finish;
    }

    public int getNum() {
        return num;
    }

    public void reduce(){
        this.num--;
    }

    public void play(){
        current.pay();
        current.draw();
        current.send();
    }
}

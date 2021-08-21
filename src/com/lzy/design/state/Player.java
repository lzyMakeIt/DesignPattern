package com.lzy.design.state;

/**
 * @Author: lzy
 * @Date: 2021/8/21 21:35
 * @Description: 用户
 */
public class Player {
    public static void main(String[] args) {
        GameContext game=new GameContext();

        for(int i=0;i<5;i++){
            game.play();
        }
    }
}

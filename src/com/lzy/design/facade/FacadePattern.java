package com.lzy.design.facade;

/**
 * @Author: lzy
 * @Date: 2021/8/13 21:09
 * @Description: 提供给客户端的调用接口
 */
public class FacadePattern {
    private Music music;
    private Screen screen;
    private Popcorn popcorn;

    public FacadePattern(){
        this.music=Music.getMusic();
        this.screen=Screen.getScreen();
        this.popcorn=Popcorn.getPopcorn();
    }

    public void start(){
        music.turnUp();
        screen.down();
        popcorn.get();
    }

    public void end(){
        music.turnOff();
        screen.up();
    }
}

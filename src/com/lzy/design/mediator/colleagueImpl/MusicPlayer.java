package com.lzy.design.mediator.colleagueImpl;

import com.lzy.design.mediator.Colleague;

/**
 * @Author: lzy
 * @Date: 2021/8/20 18:01
 * @Description: 音乐播放器
 */
public class MusicPlayer extends Colleague {
    @Override
    public void send() {
        getMediator().relay(this);
    }

    @Override
    public void receive() {
        System.out.println("音乐播放器打开");
        send();
    }
}

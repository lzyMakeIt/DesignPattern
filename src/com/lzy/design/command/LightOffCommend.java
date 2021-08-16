package com.lzy.design.command;

/**
 * @Author: lzy
 * @Date: 2021/8/14 23:24
 * @Description: 关灯命令
 */
public class LightOffCommend implements Command {
    private LightReceiver light;

    public LightOffCommend(LightReceiver light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void cancel() {
        light.on();
    }
}

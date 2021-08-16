package com.lzy.design.command;

/**
 * @Author: lzy
 * @Date: 2021/8/14 23:22
 * @Description: 开灯命令
 */
public class LightOnCommend implements Command {
    private LightReceiver light;

    public LightOnCommend(LightReceiver light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void cancel() {
        light.off();
    }
}

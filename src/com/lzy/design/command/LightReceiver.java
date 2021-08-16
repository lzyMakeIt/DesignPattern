package com.lzy.design.command;

/**
 * @Author: lzy
 * @Date: 2021/8/14 23:18
 * @Description: 命令接收者 灯
 */
public class LightReceiver {
    public void on(){
        System.out.println("开灯");
    }

    public void off(){
        System.out.println("关灯");
    }
}

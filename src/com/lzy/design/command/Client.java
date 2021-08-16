package com.lzy.design.command;

/**
 * @Author: lzy
 * @Date: 2021/8/14 23:34
 * @Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        //命令接收者
        LightReceiver light=new LightReceiver();

        //命令
        Command lightOn=new LightOnCommend(light);
        Command lightOff=new LightOffCommend(light);

        //命令调用者
        CommandInvoker invoker=new CommandInvoker();

        //设置命令
        invoker.setCommand(0,lightOn,lightOff);

        //调用命令
        invoker.executeOn(0);
        invoker.executeOff(0);

        //撤销命令
        invoker.cancel();
    }
}

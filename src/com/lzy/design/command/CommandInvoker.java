package com.lzy.design.command;

/**
 * @Author: lzy
 * @Date: 2021/8/14 23:25
 * @Description: 命令调用者
 */
public class CommandInvoker {
    //保存开启命令
    private Command[] onCommand;
    //保存关闭命令
    private Command[] offCommand;
    //上一条执行的命令 用于撤销
    private Command last;

    public CommandInvoker(){
        int len=5;

        onCommand=new Command[len];
        offCommand=new Command[len];

        for(int i=0;i<len;i++){
            onCommand[i]=new NoCommand();
            offCommand[i]=new NoCommand();
        }
    }

    //设置命令
    public void setCommand(int n,Command onCommand,Command offCommand){
        this.onCommand[n]=onCommand;
        this.offCommand[n]=offCommand;
    }

    //执行命令
    public void executeOn(int n){
        onCommand[n].execute();
        last=onCommand[n];
    }

    public void executeOff(int n){
        offCommand[n].execute();
        last=offCommand[n];
    }

    //撤销命令
    public void cancel(){
        last.cancel();
    }
}

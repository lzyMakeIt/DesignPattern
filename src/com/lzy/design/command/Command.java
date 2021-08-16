package com.lzy.design.command;

/**
 * @Author: lzy
 * @Date: 2021/8/14 23:17
 * @Description: 命令接口
 */
public interface Command {
    //执行
    void execute();

    //撤销
    void cancel();
}

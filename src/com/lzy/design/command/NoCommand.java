package com.lzy.design.command;

/**
 * @Author: lzy
 * @Date: 2021/8/14 23:28
 * @Description: 无操作命令 防止出现空指针
 */
public class NoCommand implements Command {

    @Override
    public void execute() {

    }

    @Override
    public void cancel() {

    }
}

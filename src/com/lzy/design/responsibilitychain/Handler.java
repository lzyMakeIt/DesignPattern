package com.lzy.design.responsibilitychain;

/**
 * @Author: lzy
 * @Date: 2021/8/21 22:04
 * @Description: 抽象处理者
 */
public abstract class Handler {
    //下一个处理者
    private Handler next;
    private String name;

    public Handler(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handle(FundRequest request);
}

package com.lzy.design.responsibilitychain;

import java.util.UUID;

/**
 * @Author: lzy
 * @Date: 2021/8/21 22:05
 * @Description: 资金请求
 */
public class FundRequest {
    private String id;
    private double money;

    public FundRequest(double money){
        this.id=UUID.randomUUID().toString();
        this.money=money;
    }

    public double getMoney() {
        return money;
    }

    public String getId() {
        return id;
    }
}

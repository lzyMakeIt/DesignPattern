package com.lzy.design.responsibilitychain.handler;

import com.lzy.design.responsibilitychain.FundRequest;
import com.lzy.design.responsibilitychain.Handler;

/**
 * @Author: lzy
 * @Date: 2021/8/21 22:07
 * @Description: 系处理者
 */
public class DepartmentHandler extends Handler {

    public DepartmentHandler() {
        super("系处理者");
    }

    @Override
    public void handle(FundRequest request) {
        if(request.getMoney()<5000){
            System.out.println(getName()+"处理明细:");
            System.out.println(" -->单号: "+request.getId());
            System.out.println(" -->资金: "+request.getMoney());
        }else {
            getNext().handle(request);
        }
    }
}

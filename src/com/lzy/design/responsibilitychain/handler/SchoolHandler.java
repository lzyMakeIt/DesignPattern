package com.lzy.design.responsibilitychain.handler;

import com.lzy.design.responsibilitychain.FundRequest;
import com.lzy.design.responsibilitychain.Handler;

/**
 * @Author: lzy
 * @Date: 2021/8/21 22:06
 * @Description: 校级处理者
 */
public class SchoolHandler extends Handler {
    public SchoolHandler() {
        super("校级处理者");
    }

    @Override
    public void handle(FundRequest request) {
        if(request.getMoney()<=50000&&30000<=request.getMoney()){
            System.out.println(getName()+"处理明细:");
            System.out.println(" -->单号: "+request.getId());
            System.out.println(" -->资金: "+request.getMoney());
        }else {
            System.out.println("无法处理");
        }
    }
}

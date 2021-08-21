package com.lzy.design.responsibilitychain.handler;

import com.lzy.design.responsibilitychain.FundRequest;
import com.lzy.design.responsibilitychain.Handler;

/**
 * @Author: lzy
 * @Date: 2021/8/21 22:06
 * @Description: 学院处理者
 */
public class CollegeHandler extends Handler {
    public CollegeHandler() {
        super("学院处理者");
    }

    @Override
    public void handle(FundRequest request) {
        if(request.getMoney()<30000&&5000<=request.getMoney()){
            System.out.println(getName()+"处理明细:");
            System.out.println(" -->单号: "+request.getId());
            System.out.println(" -->资金: "+request.getMoney());
        }else {
            getNext().handle(request);
        }
    }
}

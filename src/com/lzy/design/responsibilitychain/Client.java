package com.lzy.design.responsibilitychain;

import com.lzy.design.responsibilitychain.handler.CollegeHandler;
import com.lzy.design.responsibilitychain.handler.DepartmentHandler;
import com.lzy.design.responsibilitychain.handler.SchoolHandler;

/**
 * @Author: lzy
 * @Date: 2021/8/21 22:20
 * @Description: 客户
 */
public class Client {
    public static void main(String[] args) {
        Handler department=new DepartmentHandler();
        Handler college=new CollegeHandler();
        Handler school=new SchoolHandler();

        department.setNext(college);
        college.setNext(school);

        double[] funds={3000,20000,50000,100000};
        for (double fund : funds) {
            FundRequest request = new FundRequest(fund);
            department.handle(request);
        }
    }
}

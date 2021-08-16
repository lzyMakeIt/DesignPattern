package com.lzy.design.iterator;

/**
 * @Author: lzy
 * @Date: 2021/8/16 19:21
 * @Description: 用户
 */
public class Client {
    public static void main(String[] args) {
        OutPutDepartments outPutDepartments=new OutPutDepartments();

        outPutDepartments.addCollege(new InfoCollege());
        outPutDepartments.addCollege(new MathCollege());

        outPutDepartments.output();
    }
}

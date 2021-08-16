package com.lzy.design.template;

/**
 * @Author: lzy
 * @Date: 2021/8/14 20:34
 * @Description: 客户端
 */
public class MilkFactory {
    public static void main(String[] args) {
        SoybeanMilk redBeanMilk=new RedBeanMilk();
        redBeanMilk.make();

        SoybeanMilk pureSoybeanMilk=new PureSoybeanMilk();
        pureSoybeanMilk.make();
    }
}

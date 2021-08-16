package com.lzy.design.visitor;

import com.lzy.design.visitor.element.Man;
import com.lzy.design.visitor.element.Woman;
import com.lzy.design.visitor.visitor.FailedGrade;
import com.lzy.design.visitor.visitor.SuccessGrade;

/**
 * @Author: lzy
 * @Date: 2021/8/16 18:34
 * @Description: 客户端调用对象结构角色
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure=new ObjectStructure();

        objectStructure.addPerson(new Man("jack"));
        objectStructure.addPerson(new Woman("lucy"));
        objectStructure.addPerson(new Woman("amy"));

        objectStructure.accept(new SuccessGrade());
        System.out.println("==========================");
        objectStructure.accept(new FailedGrade());
    }
}

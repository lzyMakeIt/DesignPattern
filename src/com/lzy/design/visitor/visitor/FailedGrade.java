package com.lzy.design.visitor.visitor;

import com.lzy.design.visitor.element.Man;
import com.lzy.design.visitor.element.Woman;

/**
 * @Author: lzy
 * @Date: 2021/8/16 18:17
 * @Description: 具体访问者
 */
public class FailedGrade implements Action {
    @Override
    public void getManMark(Man man) {
        System.out.println(man.getName()+"给的评价是失败");
    }

    @Override
    public void getWomanMark(Woman woman) {
        System.out.println(woman.getName()+"给的评价是失败");
    }
}

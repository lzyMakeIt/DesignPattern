package com.lzy.design.visitor.visitor;

import com.lzy.design.visitor.element.Man;
import com.lzy.design.visitor.element.Woman;

/**
 * @Author: lzy
 * @Date: 2021/8/16 18:02
 * @Description: 抽象访问者
 */
public interface Action {
    void getManMark(Man man);
    void getWomanMark(Woman woman);
}

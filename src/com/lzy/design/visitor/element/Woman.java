package com.lzy.design.visitor.element;

import com.lzy.design.visitor.visitor.Action;

/**
 * @Author: lzy
 * @Date: 2021/8/16 18:07
 * @Description: 具体元素 被访问者
 */
public class Woman extends Person {
    public Woman(String name) {
        super(name);
    }

    @Override
    public void accept(Action action) {
        action.getWomanMark(this);
    }
}

package com.lzy.design.flyweight;

/**
 * @Author: lzy
 * @Date: 2021/8/13 21:25
 * @Description: 网站实现类
 */
public class WebsiteImpl implements Website {
    private String type;

    public WebsiteImpl(String type){
        this.type=type;
    }

    @Override
    public void use(User user) {
        System.out.println(type+"正在被"+user.getName()+"使用");
    }
}

package com.lzy.design.flyweight;

/**
 * @Author: lzy
 * @Date: 2021/8/13 21:30
 * @Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        WebsiteFactory factory=WebsiteFactory.getFactory();

        Website website1=factory.getWebsite("博客");
        Website website2=factory.getWebsite("博客");
        Website website3=factory.getWebsite("平台");

        //System.out.println(website1==website2);

        website1.use(new User("jack"));
        website2.use(new User("tom"));
        website3.use(new User("lucy"));
    }
}

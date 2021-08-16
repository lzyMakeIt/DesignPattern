package com.lzy.design.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lzy
 * @Date: 2021/8/13 21:26
 * @Description: 网站工厂，管理创建网站
 */
public class WebsiteFactory {
    private static WebsiteFactory factory=new WebsiteFactory();
    private Map<String,Website> websites=new HashMap<>();

    private WebsiteFactory(){}

    public static WebsiteFactory getFactory(){
        return factory;
    }

    public Website getWebsite(String type){
        if(!websites.containsKey(type)){
            Website website=new WebsiteImpl(type);
            websites.put(type,website);
            return website;
        }else {
            return websites.get(type);
        }
    }
}

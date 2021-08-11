package com.lzy.design.adapter;

import com.lzy.design.adapter.common.Voltage220V;
import com.lzy.design.adapter.common.Voltage5V;

/**
 * @Author: lzy
 * @Date: 2021/8/9 22:28
 * @Description: 对象适配器
 */
public class ObjectAdapter implements Voltage5V {
    private Voltage220V voltage220V;

    public ObjectAdapter(Voltage220V voltage220V){
        this.voltage220V=voltage220V;
    }

    @Override
    public int output() {
        int convert=voltage220V.output()-215;
        System.out.println("输出电压"+convert+"V");
        return convert;
    }
}

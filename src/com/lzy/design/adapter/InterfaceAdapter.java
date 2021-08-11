package com.lzy.design.adapter;

import com.lzy.design.adapter.common.MultiVoltage;
import com.lzy.design.adapter.common.Voltage220V;

/**
 * @Author: lzy
 * @Date: 2021/8/9 22:34
 * @Description: 接口适配器模式的中间类，提供默认实现
 */
public abstract class InterfaceAdapter implements MultiVoltage {
    protected Voltage220V voltage220V;

    public InterfaceAdapter(Voltage220V voltage220V){
        this.voltage220V=voltage220V;
    }

    @Override
    public int output5V() {
        int convert= voltage220V.output()-215;
        System.out.println("输出电压"+convert+"V");
        return convert;
    }

    @Override
    public int output9V() {
        int convert= voltage220V.output()-211;
        System.out.println("输出电压"+convert+"V");
        return convert;
    }

    @Override
    public int output110v() {
        int convert= voltage220V.output()-110;
        System.out.println("输出电压"+convert+"V");
        return convert;
    }
}

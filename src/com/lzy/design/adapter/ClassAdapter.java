package com.lzy.design.adapter;

import com.lzy.design.adapter.common.Voltage220V;
import com.lzy.design.adapter.common.Voltage5V;

/**
 * @Author: lzy
 * @Date: 2021/8/9 22:23
 * @Description: 类适配器
 */
public class ClassAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int output() {
        int convert=super.output()-215;
        System.out.println("输出电压"+convert+"V");
        return convert;
    }
}

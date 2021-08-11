package com.lzy.design.adapter.common;

import com.lzy.design.adapter.ClassAdapter;
import com.lzy.design.adapter.InterfaceAdapter;
import com.lzy.design.adapter.ObjectAdapter;

/**
 * @Author: lzy
 * @Date: 2021/8/9 22:26
 * @Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        //类适配器
        System.out.println("类适配器");
        ClassAdapter classAdapter=new ClassAdapter();
        classAdapter.output();

        System.out.println("------------------------------------------");

        System.out.println("对象适配器");
        ObjectAdapter objectAdapter=new ObjectAdapter(new Voltage220V());
        objectAdapter.output();

        System.out.println("------------------------------------------");

        System.out.println("接口适配器");
        InterfaceAdapter interfaceAdapter=new InterfaceAdapter(new Voltage220V()){
            @Override
            public int output5V(){
                System.out.println("输出电压5V");
                return voltage220V.output()/44;
            }
        };
        interfaceAdapter.output5V();
    }
}

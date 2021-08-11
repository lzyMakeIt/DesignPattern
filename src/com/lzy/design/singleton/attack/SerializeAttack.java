package com.lzy.design.singleton.attack;

import com.lzy.design.singleton.SingletonType1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author: lzy
 * @Date: 2021/8/4 20:22
 * @Description: 模拟反序列化对单例模式的破坏
 * 解决方式：
 * 添加readResolve方法
 */
public class SerializeAttack {
    public static void main(String[] args) throws Exception {
        SingletonType1 s1=SingletonType1.getInstance();

        String path="C://Users//lenovo//IdeaProjects//DesignPattern//src//com//lzy//design//singleton//attack//serialize.txt";

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(s1);

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(path));
        SingletonType1 s2=(SingletonType1) ois.readObject();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
    }
}

package com.lzy.design.facade;

/**
 * @Author: lzy
 * @Date: 2021/8/13 21:03
 * @Description: 音乐
 */
public class Music {
    private static Music music=new Music();

    private Music(){}

    public static Music getMusic(){
        return music;
    }

    public void turnUp(){
        System.out.println("打开音乐");
    }

    public void turnOff(){
        System.out.println("关闭音乐");
    }
}

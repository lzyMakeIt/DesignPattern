package com.lzy.design.facade;

/**
 * @Author: lzy
 * @Date: 2021/8/13 21:07
 * @Description: 爆米花
 */
public class Popcorn {
    private static Popcorn popcorn=new Popcorn();

    private Popcorn(){};

    public static Popcorn getPopcorn(){
        return popcorn;
    }

    public void get(){
        System.out.println("获得爆米花");
    }
}

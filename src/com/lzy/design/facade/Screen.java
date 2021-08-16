package com.lzy.design.facade;

/**
 * @Author: lzy
 * @Date: 2021/8/13 21:00
 * @Description: 屏幕
 */
public class Screen {
    private static Screen screen=new Screen();

    private Screen(){ }

    public static Screen getScreen(){
        return screen;
    }

    public void down(){
        System.out.println("放下屏幕");
    }

    public void up(){
        System.out.println("升起屏幕");
    }
}

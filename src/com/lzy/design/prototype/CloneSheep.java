package com.lzy.design.prototype;

/**
 * @Author: lzy
 * @Date: 2021/8/9 17:58
 * @Description: 测试原型模式
 */
public class CloneSheep {
    public static void main(String[] args) throws Exception {
        //源对象
        Sheep shaun=new Sheep("肖恩");
        Sheep tom=new Sheep("汤姆");

        shaun.setFriend(tom);

        //开始克隆
        //clone方法
        Sheep clone1=(Sheep) shaun.clone();

        System.out.println(clone1);
        System.out.println(clone1.getFriend()==tom);

        //序列化
        Sheep clone2=(Sheep) DeepClone.deepClone(shaun);
        System.out.println(clone2);
        System.out.println(clone2.getFriend()==tom);
    }
}

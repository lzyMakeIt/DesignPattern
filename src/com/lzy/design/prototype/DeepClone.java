package com.lzy.design.prototype;

import java.io.*;

/**
 * @Author: lzy
 * @Date: 2021/8/9 18:09
 * @Description: 序列化方式深拷贝
 */
public class DeepClone {
    public static Object deepClone(Object obj){
        ByteArrayOutputStream bos=null;
        ObjectOutputStream oos=null;
        ByteArrayInputStream bis=null;
        ObjectInputStream ois=null;

        Object res=null;

        try {
            //序列化
            bos=new ByteArrayOutputStream();
            oos=new ObjectOutputStream(bos);
            oos.writeObject(obj);

            //反序列化
            bis=new ByteArrayInputStream(bos.toByteArray());
            ois=new ObjectInputStream(bis);
            res=ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return res;
    }
}

package com.lzy.design.visitor;

import com.lzy.design.visitor.element.Person;
import com.lzy.design.visitor.visitor.Action;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lzy
 * @Date: 2021/8/16 18:24
 * @Description: 对象结构角色 提供一个容器
 */
public class ObjectStructure {
    private List<Person> people;

    public ObjectStructure(){
        people=new ArrayList<>();
    }

    public void addPerson(Person person){
        people.add(person);
    }

    public void accept(Action action){
        for(Person p:people){
            p.accept(action);
        }
    }
}

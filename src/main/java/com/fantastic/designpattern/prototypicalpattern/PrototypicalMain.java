package com.fantastic.designpattern.prototypicalpattern;

/**
 * @ClassName PrototypicalMain
 * @Description 原型模式
 * @Author lwq
 * @Date 4/17/2019 2:43 PM
 * @Version 1.0
 */
public class PrototypicalMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person(20,"测试1",new Address());
        Person p2 =(Person) p1.clone();
        System.out.println(p2.getAddress()==p1.getAddress());
    }

}

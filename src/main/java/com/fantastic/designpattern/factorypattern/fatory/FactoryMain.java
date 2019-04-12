package com.fantastic.designpattern.factorypattern.fatory;

/**
 * @ClassName FactoryMain
 * @Description 工厂模式
 *
 *  角色：
 *  抽象工厂
 *  具体工厂
 *  抽象产品
 *  具体产品
 *
 * @Author lwq
 * @Date 4/12/2019 10:51 AM
 * @Version 1.0
 */
public class FactoryMain {
    public static void main(String[] args) {
        FlyabelFactory factory = new BirdFactory();
        Flyable instance = factory.createInstance();
        instance.fly();
    }
}

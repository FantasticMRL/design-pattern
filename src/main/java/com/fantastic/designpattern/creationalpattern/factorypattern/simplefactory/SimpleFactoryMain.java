package com.fantastic.designpattern.creationalpattern.factorypattern.simplefactory;

/**
 * @ClassName
 * @Description 简单工厂模式
 * @Author lwq
 * @Date 4/12/2019 10:01 AM
 * @Version 1.0
 */
public class SimpleFactoryMain {
    public static void main(String[] args) {
//        Move car = SimpleFactory.getMoveInstance("car");
//        car.move();

//        Move car = SimpleFactory2.getMoveInstance();
         // car.move();
        String clazz1 = ConfigUtil.getValueByKey("clazz1");
        Move moveInstance = SimpleFactory2.getMoveInstance(clazz1);
        moveInstance.move();

    }
}

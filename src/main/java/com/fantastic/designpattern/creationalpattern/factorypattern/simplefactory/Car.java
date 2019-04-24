package com.fantastic.designpattern.creationalpattern.factorypattern.simplefactory;

/**
 * @ClassName Car
 * @Description 具体产品2
 * @Author lwq
 * @Date 4/12/2019 10:02 AM
 * @Version 1.0
 */
public class Car implements Move {
    @Override
    public void move() {
        System.out.println("car move!!!");
    }
}

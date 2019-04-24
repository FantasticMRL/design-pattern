package com.fantastic.designpattern.creationalpattern.factorypattern.simplefactory;

/**
 * @ClassName Cycle
 * @Description 具体产品1
 * @Author lwq
 * @Date 4/12/2019 10:02 AM
 * @Version 1.0
 */
public class Cycle implements Move {
    @Override
    public void move() {
        System.out.println("cycle move!!!");
    }
}

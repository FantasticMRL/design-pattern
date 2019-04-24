package com.fantastic.designpattern.creationalpattern.factorypattern.fatory;

/**
 * @ClassName Bird
 * @Description TODO
 * @Author lwq
 * @Date 4/12/2019 10:59 AM
 * @Version 1.0
 */
public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("bird fly..");
    }
}

package com.fantastic.designpattern.factorypattern.fatory;

/**
 * @ClassName AirPlane
 * @Description TODO
 * @Author lwq
 * @Date 4/12/2019 11:00 AM
 * @Version 1.0
 */
public class AirPlane implements Flyable {
    @Override
    public void fly() {
        System.out.println("air plane..");
    }
}

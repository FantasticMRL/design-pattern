package com.fantastic.designpattern.creationalpattern.factorypattern.fatory;

/**
 * @ClassName AirPlaneFactory
 * @Description TODO
 * @Author lwq
 * @Date 4/12/2019 11:02 AM
 * @Version 1.0
 */
public class AirPlaneFactory extends FlyabelFactory {
    @Override
    public Flyable createInstance() {
        return new AirPlane();
    }
}

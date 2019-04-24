package com.fantastic.designpattern.creationalpattern.factorypattern.abstarctfactory;

/**
 * @ClassName AbstactFactoryMain
 * @Description 抽象工厂模式---生产相关一套的产品
 * @Author lwq
 * @Date 4/12/2019 11:07 AM
 * @Version 1.0
 */
public class AbstactFactoryMain {
    public static void main(String[] args) {
        Factory factory;
        Gun gun;
        Bullet bullet;

        factory =new AK_Factory();
        bullet=factory.produceBullet();
        bullet.load();
        gun=factory.produceGun();
        gun.shot();
    }
}

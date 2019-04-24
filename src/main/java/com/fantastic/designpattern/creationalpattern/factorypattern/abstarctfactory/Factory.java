package com.fantastic.designpattern.creationalpattern.factorypattern.abstarctfactory;

/**
 * @ClassName Factory
 * @Description TODO
 * @Author lwq
 * @Date 4/12/2019 11:18 AM
 * @Version 1.0
 */
public interface Factory {
     Gun produceGun();
     Bullet produceBullet();
}

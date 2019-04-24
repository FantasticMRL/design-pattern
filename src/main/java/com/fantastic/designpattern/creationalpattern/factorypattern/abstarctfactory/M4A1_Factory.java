package com.fantastic.designpattern.creationalpattern.factorypattern.abstarctfactory;

/**
 * @ClassName M4A1_Factory
 * @Description TODO
 * @Author lwq
 * @Date 4/12/2019 11:19 AM
 * @Version 1.0
 */
public class M4A1_Factory implements Factory {
    @Override
    public Gun produceGun() {
        return new M4A1();
    }

    @Override
    public Bullet produceBullet() {
        return new M4A1_Bullet();
    }
}

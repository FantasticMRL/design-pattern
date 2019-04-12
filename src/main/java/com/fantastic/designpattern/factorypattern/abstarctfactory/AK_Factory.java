package com.fantastic.designpattern.factorypattern.abstarctfactory;

/**
 * @ClassName AK_Factory
 * @Description TODO
 * @Author lwq
 * @Date 4/12/2019 11:19 AM
 * @Version 1.0
 */
public class AK_Factory implements Factory {
    @Override
    public Gun produceGun() {
        return new AK();
    }

    @Override
    public Bullet produceBullet() {
        return new AK_Bullet();
    }
}

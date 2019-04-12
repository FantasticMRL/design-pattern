package com.fantastic.designpattern.factorypattern.abstarctfactory;

/**
 * @ClassName M4A1_Bullet
 * @Description TODO
 * @Author lwq
 * @Date 4/12/2019 11:18 AM
 * @Version 1.0
 */
public class M4A1_Bullet implements Bullet {
    @Override
    public void load() {
        System.out.println("Load bullets with M4A1");
    }
}

package com.fantastic.designpattern.factorypattern.abstarctfactory;

/**
 * @ClassName AK_Bullet
 * @Description TODO
 * @Author lwq
 * @Date 4/12/2019 11:18 AM
 * @Version 1.0
 */
public class AK_Bullet implements Bullet {
    @Override
    public void load() {
        System.out.println("Load bullets with AK");
    }
}

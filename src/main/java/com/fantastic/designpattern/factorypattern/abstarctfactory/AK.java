package com.fantastic.designpattern.factorypattern.abstarctfactory;

/**
 * @ClassName AK
 * @Description TODO
 * @Author lwq
 * @Date 4/12/2019 11:16 AM
 * @Version 1.0
 */
public class AK implements Gun {
    @Override
    public void shot() {
        System.out.println("shooting with AK!");
    }
}

package com.fantastic.designpattern.creationalpattern.factorypattern.simplefactory;

/**
 * @ClassName SimpleFactory
 * @Description 工厂类
 * @Author lwq
 * @Date 4/12/2019 10:04 AM
 * @Version 1.0
 */
public class SimpleFactory {
    public static Move getMoveInstance(String type){
        if("car".equals(type)){
            return new Car();
        }else if("cycle".equals(type)){
            return new Cycle();
        }else{
            return null;
        }
    }
}

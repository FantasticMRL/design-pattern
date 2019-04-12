package com.fantastic.designpattern.factorypattern.simplefactory;

/**
 * @ClassName SimpleFactory
 * @Description 工厂类2
 * @Author lwq
 * @Date 4/12/2019 10:04 AM
 * @Version 1.0
 */
public class SimpleFactory2 {
    public static Move getMoveInstance(String clazzName) {
        Object o = null;
        try {
            o = Class.forName(clazzName).newInstance();
            Move m = (Move) o;
            return m;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

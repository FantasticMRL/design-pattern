package com.fantastic.designpattern.buildpattern.kfcexample;

/**
 * @ClassName MealA
 * @Description TODO
 * @Author lwq
 * @Date 4/16/2019 4:40 PM
 * @Version 1.0
 */
public class MealA extends AbstarctBuilder {
    @Override
    void prepareFood() {
        System.out.println("汉堡");
    }

    @Override
    void prepareDrink() {
        System.out.println("可乐");
    }
}

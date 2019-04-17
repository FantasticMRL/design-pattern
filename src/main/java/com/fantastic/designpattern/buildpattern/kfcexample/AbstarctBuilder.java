package com.fantastic.designpattern.buildpattern.kfcexample;

/**
 * @ClassName AbstarctBuilder
 * @Description TODO
 * @Author lwq
 * @Date 4/16/2019 4:30 PM
 * @Version 1.0
 */
public abstract class AbstarctBuilder {
    Meal m = new Meal();

    abstract void prepareFood();

    abstract void prepareDrink();

    public Meal getRes(){
        return m;
    }

}

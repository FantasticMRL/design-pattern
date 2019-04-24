package com.fantastic.designpattern.creationalpattern.buildpattern.kfcexample;

/**
 * @ClassName Waiter
 * @Description TODO
 * @Author lwq
 * @Date 4/16/2019 4:55 PM
 * @Version 1.0
 */
public class Waiter {
    private AbstarctBuilder abstarctBuilder;

    public Waiter(AbstarctBuilder abstarctBuilder) {
        this.abstarctBuilder = abstarctBuilder;
    }

    public Meal ready(){
        abstarctBuilder.prepareFood();
        abstarctBuilder.prepareDrink();
        return  abstarctBuilder.getRes();
    }

}

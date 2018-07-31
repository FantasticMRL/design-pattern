package com.fantastic.designpattern.decoratorpattern;

/**
 * 穿皮鞋
 */
public class Leather extends Finery {

    @Override
    protected void show() {
        System.out.println("穿皮鞋!");
    }
}

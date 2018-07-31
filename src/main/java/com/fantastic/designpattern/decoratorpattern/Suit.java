package com.fantastic.designpattern.decoratorpattern;

/**
 * 穿西装
 */
public class Suit extends Finery {

    @Override
    protected void show() {
        System.out.println("穿西装!");
    }
}

package com.fantastic.designpattern.decoratorpattern.more;

public class Shoes extends NewFinery {
    @Override
    protected void show() {
        super.show();
        System.out.println("穿鞋");
    }
}

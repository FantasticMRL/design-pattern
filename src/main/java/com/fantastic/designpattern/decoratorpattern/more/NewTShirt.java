package com.fantastic.designpattern.decoratorpattern.more;

public class NewTShirt extends NewFinery {

    @Override
    protected void show() {
        //先调用父类的方法
        super.show();
        System.out.println("穿T恤");
    }
}

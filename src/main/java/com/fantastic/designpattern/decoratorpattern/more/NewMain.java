package com.fantastic.designpattern.decoratorpattern.more;

public class NewMain {

    public static void main(String[] args) {

        NewPerson p = new NewPerson();

        NewFinery tShirt = new NewTShirt();
        NewFinery shoes = new Shoes();

        //
        p.show();
        shoes.decoirate(p);
        //T恤装饰P
        tShirt.decoirate(shoes);
        //tShirt.show();
        //穿鞋

        tShirt.show();
    }

}

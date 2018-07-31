package com.fantastic.designpattern.decoratorpattern;

public class Client {
    public static void main(String[] args) {

        Finery f = new TShirt();
        Person p = new Person("小明",f);
        p.show();
    }
}

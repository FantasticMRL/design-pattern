package com.fantastic.designpattern.decoratorpattern;

public class Person {

    private String name;

    private Finery finery;

    public void show(){
        System.out.println("I am "+name);
        finery.show();
    }

    public Person() {

    }

    public Person(Finery finery) {
        this.finery = finery;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Finery finery) {
        this.name = name;
        this.finery = finery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Finery getFinery() {
        return finery;
    }

    public void setFinery(Finery finery) {
        this.finery = finery;
    }
}

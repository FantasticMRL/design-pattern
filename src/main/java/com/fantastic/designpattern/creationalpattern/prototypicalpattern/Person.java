package com.fantastic.designpattern.creationalpattern.prototypicalpattern;

/**
 * @ClassName Person
 * @Description TODO
 * @Author lwq
 * @Date 4/17/2019 2:43 PM
 * @Version 1.0
 */
public class Person implements Cloneable {

    private int age;

    private String name;

    private Address address;

    public Person() {
    }

    public Person(int age, String name, Address address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person newPerson = (Person) super.clone();
        newPerson.address = (Address) address.clone();
        return newPerson;
    }
}

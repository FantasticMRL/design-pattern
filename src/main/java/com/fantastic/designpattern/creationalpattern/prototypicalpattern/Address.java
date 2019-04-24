package com.fantastic.designpattern.creationalpattern.prototypicalpattern;

/**
 * @ClassName Address
 * @Description TODO
 * @Author lwq
 * @Date 4/17/2019 2:44 PM
 * @Version 1.0
 */
public class Address implements Cloneable{

    private String city;

    public Address(String city) {
        this.city = city;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

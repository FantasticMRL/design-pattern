package com.fantastic.designpattern.proxy;

public class WaterMelon {
    private double price;

    public WaterMelon(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "WaterMelon{" +
                "price=" + price +
                '}';
    }
}

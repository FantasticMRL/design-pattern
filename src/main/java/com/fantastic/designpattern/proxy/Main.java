package com.fantastic.designpattern.proxy;

public class Main {
    public static void main(String[] args) {
        WaterMelon waterMelon = new WaterMelon(20);

        Proxy proxy = new Proxy(waterMelon);


        proxy.buyWaterMelon();
    }
}

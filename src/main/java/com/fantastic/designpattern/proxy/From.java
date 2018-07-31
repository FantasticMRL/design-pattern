package com.fantastic.designpattern.proxy;

public class From implements Shopping {

    private WaterMelon waterMelon;

    public From(WaterMelon waterMelon) {
        this.waterMelon = waterMelon;
    }

    @Override
    public void buyWaterMelon() {
        System.out.println(waterMelon.toString());
    }
}

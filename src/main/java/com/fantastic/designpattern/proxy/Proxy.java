package com.fantastic.designpattern.proxy;

public class Proxy implements Shopping {

    private From from;

    public Proxy(WaterMelon waterMelon) {
        from = new From(waterMelon);
    }

    @Override
    public void buyWaterMelon() {
        from.buyWaterMelon();
    }
}

package com.fantastic.designpattern.buildpattern;

/**
 * @ClassName BuildPatternBuilder
 * @Description 抽象建造者
 * @Author lwq
 * @Date 4/16/2019 4:19 PM
 * @Version 1.0
 */
public abstract class BuildPatternBuilder {
    protected BuildPatternProduct product = new BuildPatternProduct();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public BuildPatternProduct getResult() {
        return product;
    }

}

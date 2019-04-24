package com.fantastic.designpattern.creationalpattern.buildpattern;

/**
 * @ClassName ConcreteBuilder
 * @Description 具体建造者
 * @Author lwq
 * @Date 4/16/2019 4:19 PM
 * @Version 1.0
 */
public class ConcreteBuilder extends BuildPatternBuilder {
    @Override
    public void buildPartA() {
        System.out.println("build part a");
    }

    @Override
    public void buildPartB() {
        System.out.println("build part b");
    }

    @Override
    public void buildPartC() {
        System.out.println("build part c");
    }
}

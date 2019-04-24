package com.fantastic.designpattern.creationalpattern.buildpattern;

/**
 * @ClassName BuildPatternProduct
 * @Description 产品类
 * @Author lwq
 * @Date 4/16/2019 4:18 PM
 * @Version 1.0
 */
public class BuildPatternProduct {
    private String partA; //可以是任意类型
    private String partB;
    private String partC;

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }
}

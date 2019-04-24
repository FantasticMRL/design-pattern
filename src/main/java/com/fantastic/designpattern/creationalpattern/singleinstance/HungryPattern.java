package com.fantastic.designpattern.creationalpattern.singleinstance;

/**
 * @ClassName HungryPatterb
 * @Description 饿汉式
 * @Author lwq
 * @Date 4/16/2019 2:49 PM
 * @Version 1.0
 */
public class HungryPattern {

    /**
     * 在类装载的时候就分配空间,可能会导致空间的浪费，空间换时间
     **/
    private static final HungryPattern instance = new HungryPattern();

    private HungryPattern(){}

    public static HungryPattern getInstance(){
        return instance;
    }

}

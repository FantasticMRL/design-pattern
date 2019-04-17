package com.fantastic.designpattern.buildpattern.kfcexample;

/**
 * @ClassName KFCClient
 * @Description 建造者模式可以用于描述KFC如何创建套餐：
 *  套餐是一个复杂对象，它一般包含主食（如汉堡、鸡肉卷等）和饮料（如果汁、可乐等）等组成部分，
 *  不同的套餐有不同的组成部分，而KFC的服务员可以根据顾客的要求，一步一步装配这些组成部分，
 *  构造一份完整的套餐，然后返回给顾客。
 *
 *  套餐：产品
 *  构建套餐：抽象建造者
 *  具体套餐：具体建造者
 *  服务员：指挥者
 *
 * @Author lwq
 * @Date 4/16/2019 4:25 PM
 * @Version 1.0
 */
public class KFCClient {
    public static void main(String[] args) {
        AbstarctBuilder abstarctBuilder = new MealA();

        Waiter waiter = new Waiter(abstarctBuilder);

        waiter.ready();
    }
}

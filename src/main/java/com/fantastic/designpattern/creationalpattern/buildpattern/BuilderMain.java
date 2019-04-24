package com.fantastic.designpattern.creationalpattern.buildpattern;

/**
 * @ClassName BuilderMain
 * @Description 建造者模式
 * <p>
 * 建造者模式（Builder Pattern） 又名生成器模式，是一种对象构建模式。
 * 它可以将复杂对象的建造过程抽象出来（抽象类别），
 * 使这个抽象过程的不同实现方法可以构造出不同表现（属性）的对象。
 * 建造者模式 是一步一步创建一个复杂的对象，它允许用户只通过指定复杂对象的类型和内容就可以构建它们，
 * 用户不需要知道内部的具体构建细节。
 *
 *
 *  Product（产品角色）：一个具体的产品对象。
    Builder（抽象建造者）：创建一个Product对象的各个部件指定的抽象接口。
    ConcreteBuilder（具体建造者）：实现抽象接口，构建和装配各个部件。
    Director（指挥者）：构建一个使用Builder接口的对象。它主要是用于创建一个复杂的对象。它主要有两个作用，一是：隔离了客户与对象的生产过程，二是：负责控制产品对象的生产过程。


 *
 */
public class BuilderMain {
    public static void main(String[] args) {

        //客户端想要获得产品类
        //建造者
        BuildPatternBuilder buildPatternBuilder = new ConcreteBuilder();
        //指挥者
        Director director = new Director(buildPatternBuilder);
        //指挥者指挥
        director.contruct();


    }
}

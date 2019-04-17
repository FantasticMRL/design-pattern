package com.fantastic.designpattern.buildpattern;

/**
 * @ClassName Director
 * @Description4）指挥者类的代码示例如下： 建造者模式的结构中还引入了一个指挥者类Director，
 * 该类的作用主要有两个：一方面它隔离了客户与生产过程；另一方面它负责控制产品的生成过程。
 * 指挥者针对抽象建造者编程，客户端只需要知道具体建造者的类型，即可通过指挥者类调用建造者的相关方法，
 * 返回一个完整的产品对象。
 * @Author lwq
 * @Date 4/16/2019 4:20 PM
 * @Version 1.0
 */
public class Director {
    private BuildPatternBuilder buildPatternBuilder ;

    //构造器注入建造者
    public Director(BuildPatternBuilder buildPatternBuilder) {
        this.buildPatternBuilder = buildPatternBuilder;
    }

    public BuildPatternProduct contruct(){
        buildPatternBuilder.buildPartA();
        buildPatternBuilder.buildPartB();
        buildPatternBuilder.buildPartC();
        return buildPatternBuilder.getResult();
    }


}

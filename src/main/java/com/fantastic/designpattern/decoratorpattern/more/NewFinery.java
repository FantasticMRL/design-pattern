package com.fantastic.designpattern.decoratorpattern.more;

import com.fantastic.designpattern.decoratorpattern.Person;

public class NewFinery extends NewPerson {

    //装饰对象
    private NewPerson p;

    //装饰方法
    public void decoirate(NewPerson p){
        this.p = p;
    }

    @Override
    protected void show() {
        //直接调用被装饰对象的方法
        p.show();
    }
}

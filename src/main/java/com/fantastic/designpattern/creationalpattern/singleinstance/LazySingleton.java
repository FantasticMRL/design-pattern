package com.fantastic.designpattern.creationalpattern.singleinstance;

/***
 * @Author 懒汉式线程安全 登记式/静态内部类方式
 * @Description //TODO
 * @Date 4/16/2019 3:14 PM
 * @Param
 * @return
 **/
public class LazySingleton {
    private static class SingletonHolder {
        private static final LazySingleton INSTANCE = new LazySingleton();
    }

    private LazySingleton() {
    }

    public static final LazySingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}   


package com.fantastic.designpattern.creationalpattern.singleinstance;

/**
 * @ClassName ClientMain
 * @Description 单例模式
 *
 * 分别懒汉，饿汉
 *
 * @Author lwq
 * @Date 4/16/2019 2:47 PM
 * @Version 1.0
 */
public class ClientMain {
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
           new Thread(()->{
               LazyPattern instance = LazyPattern.getInstance3();
               System.out.println(instance);
           }).start();
        }
    }
}

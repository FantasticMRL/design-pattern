package com.fantastic.designpattern.singleinstance;

/**
 * @ClassName LazyPattern
 * @Description TODO
 * @Author lwq
 * @Date 4/16/2019 2:49 PM
 * @Version 1.0
 */
public class LazyPattern {


    private static LazyPattern instance = null;

    private LazyPattern(){}

    /**
     * @Author lwq
     * @Description //在需要用到的时候创建对象，线程不安全
     * @Date 4/16/2019 2:54 PM
     * @Param []
     * @return com.fantastic.designpattern.singleinstance.LazyPattern
     **/
    public static LazyPattern getInstance(){
        if(instance == null){
            instance = new LazyPattern();
        }
        return instance;
    }

    /**
     * @Author lwq
     * @Description //加锁,但是是重量锁
     * @Date 4/16/2019 2:58 PM
     * @Param []
     * @return com.fantastic.designpattern.singleinstance.LazyPattern
     **/
    public static synchronized LazyPattern getInstance2(){
        if(instance == null){
            instance = new LazyPattern();
        }
        return  instance;
    }

    /**
     * @Author double-checked locking
     * @Description //双重检查加锁版本
     * @Date 4/16/2019 2:58 PM
     * @Param 
     * @return 
     **/
    public static LazyPattern getInstance3(){
        if(instance == null){
            synchronized (LazyPattern.class){
                if(instance == null){
                    instance = new LazyPattern();
                }
            }
        }
        return  instance;
    }



}

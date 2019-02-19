package com.honglekai.design.creational.singleton;

/**
 * description 静态内部类单例模式 基于类的初始化延迟加载解决方案
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/14 10:19
 * modifyTime
 */
public class StaticInnerClassSingleton {

    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    //私有化构造方法，防止外部通过new来初始化
    private StaticInnerClassSingleton(){

    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
}

package com.honglekai.study.dpStrategy.singleton;

/**
 * description 单例模式
 * 实例只创建一次，多线程的时候需要增加synchronize关键字
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/30 16:02
 * modifyTime
 */
public class SingletonTest {

    private static SingletonTest instant = null;

    private SingletonTest() {
    }

    private static synchronized void sysncInit(){
        if (instant == null){
            instant = new SingletonTest();
        }
    }

    public static SingletonTest getInstant(){
        if (instant == null){
            sysncInit();
        }
        return  instant;
    }
}

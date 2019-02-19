package com.honglekai.design.creational.singleton;

/**
 * description 懒汉式 单例模式
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/13 18:19
 * modifyTime
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private static boolean flag = true;

    private LazySingleton(){
        if (flag){
            flag = false;
        }else{
            if (lazySingleton != null){
                throw new RuntimeException("禁止反射调用单例模式");
            }
        }

    }

    /**
     * 如果不加锁的话，多线程会出现对象被创建多次
     * @return
     */
    public  synchronized static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}

package com.honglekai.design.creational.singleton;

/**
 * description
 * double check 懒汉式双重检查单例模式
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/14 9:58
 * modifyTime
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton(){

    }

    public static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton == null){
            synchronized(LazyDoubleCheckSingleton.class){
                if (lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    // 2和3位置可能会互换，在单线程的情况下没有问题，在多线程的情况下会有问题
                    // 为避免这种情况 应该用 volatitle关键字
                    //1.分配内存给这个对象
                    //3.将lazyDoubleCheckSingleton指向分配的内存
                    //2.初始化对象
                    //4.初次访问对象
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}

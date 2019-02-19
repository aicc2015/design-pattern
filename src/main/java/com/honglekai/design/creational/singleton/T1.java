package com.honglekai.design.creational.singleton;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/13 18:21
 * modifyTime
 */
public class T1 implements Runnable {
    @Override
    public void run() {
        LazySingleton instance = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        HungrySingleton instance = HungrySingleton.getInstance();

//        ContainerSingleton.putInstance("hcc",new Object());
//        Object instance = ContainerSingleton.getInstance("hcc");

//        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread()+" "+instance);
    }
}

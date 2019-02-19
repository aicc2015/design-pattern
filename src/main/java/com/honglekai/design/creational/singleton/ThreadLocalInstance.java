package com.honglekai.design.creational.singleton;

/**
 * description ThreadLocal "单例模式"
 * ThreadLocal 为每个线程创建一个对象，线程直接不会相关干扰 用空间换时间
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/14 16:10
 * modifyTime
 */
public class ThreadLocalInstance {

    private ThreadLocalInstance(){

    }

    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    public static ThreadLocalInstance getInstance(){
        return threadLocalInstanceThreadLocal.get();
    }
}

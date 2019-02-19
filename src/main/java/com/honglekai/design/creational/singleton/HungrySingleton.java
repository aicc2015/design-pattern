package com.honglekai.design.creational.singleton;

import java.io.Serializable;

/**
 * description 饿汉式 单例模式
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/14 10:30
 * modifyTime
 */
public class HungrySingleton implements Serializable, Cloneable {

    private final static HungrySingleton hungrySingleton ;

    static {
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton(){
        if (hungrySingleton != null){
            throw new RuntimeException("单例模式禁止反射调用");
        }
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    /**
     * 防止序列号和反序列化后获取的对象不一致
     * @return
     */
    private Object readResolve(){
        return hungrySingleton;
    }

    /**
     * 解决 克隆破坏单例，或者不实现Cloneable接口也行
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
        return hungrySingleton;
    }
}

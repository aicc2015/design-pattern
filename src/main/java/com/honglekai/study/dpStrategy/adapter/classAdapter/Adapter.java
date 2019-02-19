package com.honglekai.study.dpStrategy.adapter.classAdapter;

/**
 * description 类适配器
 * 1个类转化成另一个类的接口时 用
 * 类适配器继承原对象并实现目标接口
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/30 16:52
 * modifyTime
 */
public class Adapter extends Source implements Targetable{

    @Override
    public void method2() {
        System.out.println("this is target method .... ");
    }
}

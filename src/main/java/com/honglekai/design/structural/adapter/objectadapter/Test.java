package com.honglekai.design.structural.adapter.objectadapter;


/**
 * description 适配器模式(对象适配器)
 *
 *
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/18 9:56
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}

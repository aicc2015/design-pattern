package com.honglekai.design.structural.adapter.classadapter;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/18 9:56
 * modifyTime
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("Concrete 具体实现");
    }
}

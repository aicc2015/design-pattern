package com.honglekai.design.structural.adapter.objectadapter;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/18 10:00
 * modifyTime
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}

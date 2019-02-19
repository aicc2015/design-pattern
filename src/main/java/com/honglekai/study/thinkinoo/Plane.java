package com.honglekai.study.thinkinoo;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/7 16:25
 * modifyTime
 */
public class Plane extends Vehicle {

    @Override
    public void run(Address address) {
        System.out.println("======飞机飞起来======"+address.getName());
    }
}

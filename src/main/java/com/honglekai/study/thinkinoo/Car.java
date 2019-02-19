package com.honglekai.study.thinkinoo;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/7 16:20
 * modifyTime
 */
public class Car extends Vehicle {
    @Override
    public void run(Address address) {
        System.out.println("===冒着烟行驶======="+address.getName());
    }
}

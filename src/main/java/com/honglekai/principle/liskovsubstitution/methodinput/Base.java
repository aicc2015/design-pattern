package com.honglekai.principle.liskovsubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/13 15:23
 * modifyTime
 */
public  class Base {

    public void method(Map map) {
        System.out.println("---父类被执行------");
    }
}

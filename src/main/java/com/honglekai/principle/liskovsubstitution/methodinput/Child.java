package com.honglekai.principle.liskovsubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/13 15:25
 * modifyTime
 */
public class Child extends Base {
    /*@Override
    public void method(HashMap map) {
        System.out.println("子类HashMap被执行");
    }*/

    /**
     * 违反了里氏替换原则原则，子类的入参应该比父类更宽松
     * @param map
     */
    public void method(HashMap map) {
        System.out.println("子类HashMap被执行");
    }
}

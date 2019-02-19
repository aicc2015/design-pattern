package com.honglekai.principle.liskovsubstitution.methodinput;

import com.honglekai.study.dpStrategy.chainOfResponsibility.Handle;

import java.util.HashMap;
import java.util.Map;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/13 15:27
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        Child child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}

package com.honglekai.study.dpStrategy.templateMethod;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 14:43
 * modifyTime
 */
public class Plus extends AbstratCalculater {

    @Override
    protected int calculate(int num1, int num2) {
        return num1-num2;
    }
}

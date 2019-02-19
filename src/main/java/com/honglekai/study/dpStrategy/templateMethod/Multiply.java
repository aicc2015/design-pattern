package com.honglekai.study.dpStrategy.templateMethod;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 14:44
 * modifyTime
 */
public class Multiply extends AbstratCalculater {
    @Override
    protected int calculate(int num1, int num2) {
        return num1*num2;
    }
}

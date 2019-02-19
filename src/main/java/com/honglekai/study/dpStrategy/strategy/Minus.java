package com.honglekai.study.dpStrategy.strategy;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 14:18
 * modifyTime
 */
public class Minus extends AbstratCalculater implements ICalculater {

    @Override
    public int calculate(String exp) {
        int[] arr = split(exp,"\\-");
        return arr[0]-arr[1];
    }
}

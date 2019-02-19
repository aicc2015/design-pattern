package com.honglekai.study.dpStrategy.strategy;

import javax.swing.*;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 14:16
 * modifyTime
 */
public class Plus extends AbstratCalculater implements ICalculater {

    @Override
    public int calculate(String exp) {
        int[] arr = split(exp,"\\+");
        return arr[0]+arr[1];
    }
}

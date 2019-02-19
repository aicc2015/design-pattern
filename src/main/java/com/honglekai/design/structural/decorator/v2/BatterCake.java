package com.honglekai.design.structural.decorator.v2;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/15 11:21
 * modifyTime
 */
public class BatterCake extends ABatterCake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}

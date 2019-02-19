package com.honglekai.design.structural.decorator.v1;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/15 11:11
 * modifyTime
 */
public class BatterCakeWithEggSausage extends  BatterCakeWithEgg{
    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}

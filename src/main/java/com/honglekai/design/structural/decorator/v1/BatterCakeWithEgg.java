package com.honglekai.design.structural.decorator.v1;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/15 11:10
 * modifyTime
 */
public class BatterCakeWithEgg extends BatterCake{

    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}

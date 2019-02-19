package com.honglekai.design.structural.decorator.v2;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/15 11:24
 * modifyTime
 */
public class AbstractDecorator extends BatterCake{

    private ABatterCake aBatterCake;

    public AbstractDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    @Override
    protected String getDesc() {
        return aBatterCake.getDesc();
    }

    @Override
    protected int cost() {
        return aBatterCake.cost();
    }
}

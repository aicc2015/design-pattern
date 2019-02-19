package com.honglekai.design.structural.decorator.v2;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/15 11:32
 * modifyTime
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}

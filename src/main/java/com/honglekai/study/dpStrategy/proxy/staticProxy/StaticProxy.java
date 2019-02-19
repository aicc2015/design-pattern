package com.honglekai.study.dpStrategy.proxy.staticProxy;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/30 18:10
 * modifyTime
 */
public class StaticProxy implements BuyHouse {

    private BuyHouse buyHouse;

    public StaticProxy(final BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        System.out.println("..买房前准备");
        buyHouse.buyHouse();
        System.out.println("..买房后装修");
    }
}

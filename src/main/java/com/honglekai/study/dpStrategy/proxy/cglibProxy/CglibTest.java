package com.honglekai.study.dpStrategy.proxy.cglibProxy;

import com.honglekai.study.dpStrategy.proxy.staticProxy.BuyHouse;
import com.honglekai.study.dpStrategy.proxy.staticProxy.BuyHouseImpl;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/31 15:33
 * modifyTime
 */
public class CglibTest {

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        BuyHouse buyHouse = new BuyHouseImpl();

        BuyHouseImpl  proxyInstance = (BuyHouseImpl ) cglibProxy.getInstance(buyHouse);
        proxyInstance.buyHouse();
    }
}

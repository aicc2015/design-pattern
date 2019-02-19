package com.honglekai.study.dpStrategy.proxy.dynamicProxy;

import com.honglekai.study.dpStrategy.proxy.staticProxy.BuyHouse;
import com.honglekai.study.dpStrategy.proxy.staticProxy.BuyHouseImpl;

import java.lang.reflect.Proxy;

/**
 * description 动态代理
 * 优点：和静态代理相比，减少了开发工作量，减少了对业务接口的依赖，降低了耦合
 * 缺点：无法摆脱仅支持interface代理的桎梏
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/30 18:21
 * modifyTime
 */
public class DynamicProxyTest  {

    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();

        BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(),new Class[]{BuyHouse.class},
                new DynamicProxyHandle(buyHouse));

        proxyBuyHouse.buyHouse();
    }
}

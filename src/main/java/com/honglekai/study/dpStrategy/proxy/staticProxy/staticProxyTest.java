package com.honglekai.study.dpStrategy.proxy.staticProxy;

/**
 * description 静态代理
 * 优点.在开闭原则情况下可以对目标对象扩展
 * 缺点.每个服务都需要创建代理类，工作量太大，如果接口一旦改变，代理对象也要改变
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/30 18:13
 * modifyTime
 */
public class staticProxyTest {

    public static void main(String[] args) {

        BuyHouse buyHouse = new BuyHouseImpl();
        buyHouse.buyHouse();

        StaticProxy proxy = new StaticProxy(buyHouse);
        proxy.buyHouse();
    }
}

package com.honglekai.design.structural.proxy.staticproxy;

import com.honglekai.design.structural.proxy.Order;
import com.sun.tools.corba.se.idl.constExpr.Or;

/**
 * description 静态代理
 *
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/19 11:10
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}

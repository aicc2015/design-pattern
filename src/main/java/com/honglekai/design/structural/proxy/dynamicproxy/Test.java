package com.honglekai.design.structural.proxy.dynamicproxy;

import com.honglekai.design.structural.proxy.IOrderService;
import com.honglekai.design.structural.proxy.Order;
import com.honglekai.design.structural.proxy.OrderServiceImpl;

/**
 * description 动态代理
 * 定义：为其他对象提供一种代理，以控制该对象的访问
 * 代理对象在客户端和目标对象中起到中介的作用
 *
 * 适用场景：
 * 1.保护目标对象
 * 2.增加目标对象
 *
 * 优点：
 * 1.代理模式将代理对象与真实被调用的目标对象分离
 * 2.一定程度上降低了系统的耦合度，扩展性好
 * 3.保护目标对象
 * 4.增强目标对象
 *
 * 缺点：
 * 1.代理模式中会造成系统设计中类的数目增加
 * 2.在客户端和目标对象增加一个代理对象，会造成请求处理速度变慢
 * 3.增加系统复杂性
 *
 * 扩展：
 * 1.静态代理
 * 2.动态代理
 * 3.CGLIB代理
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/19 13:47
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);
    }
}

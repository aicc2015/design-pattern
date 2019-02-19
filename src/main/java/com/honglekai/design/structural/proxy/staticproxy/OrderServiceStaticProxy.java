package com.honglekai.design.structural.proxy.staticproxy;

import com.honglekai.design.structural.proxy.IOrderService;
import com.honglekai.design.structural.proxy.Order;
import com.honglekai.design.structural.proxy.OrderServiceImpl;
import com.honglekai.design.structural.proxy.db.DataSourceContextHolder;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/19 10:53
 * modifyTime
 */
public class OrderServiceStaticProxy  {

    private IOrderService iOrderService;

    public int saveOrder(Order order){
        beforeMethod(order);

        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);

        afterMethod();
        return result;

    }

    private void beforeMethod(Order order){
        System.out.println("静态代理 before code");


        int userId = order.getUserId();
        int dbRouter = userId%2;

        System.out.println("静态代理分配到【db"+dbRouter+"】处理数据");

        //TODO 设置datasource
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
    }

    private void afterMethod(){
        System.out.println("静态代理 after code");
    }
}

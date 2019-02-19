package com.honglekai.design.structural.proxy.dynamicproxy;

import com.honglekai.design.structural.proxy.Order;
import com.honglekai.design.structural.proxy.OrderServiceImpl;
import com.honglekai.design.structural.proxy.db.DataSourceContextHolder;
import com.sun.tools.corba.se.idl.constExpr.Or;
import oracle.sql.OracleJdbc2SQLInput;

import java.io.ObjectInputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/19 11:48
 * modifyTime
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
       Class cls = target.getClass();
       return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObj = args[0];
        beforeMethod(argObj);

        Object object = method.invoke(target,args);

        afterMethod();
        return object;
    }

    private void beforeMethod(Object object){
        System.out.println("动态代理 before code");
        if (object instanceof Order){
            Order order = (Order)object;
            int userId = order.getUserId();
            int dbRouter = userId%2;

            System.out.println("动态代理分配到【db"+dbRouter+"】处理数据");

            //TODO 设置datasource
            DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
        }

    }

    private void afterMethod(){
        System.out.println("动态代理 after code");
    }
}

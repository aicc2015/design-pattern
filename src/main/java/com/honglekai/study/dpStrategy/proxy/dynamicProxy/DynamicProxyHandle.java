package com.honglekai.study.dpStrategy.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/30 18:18
 * modifyTime
 */
public class DynamicProxyHandle implements InvocationHandler {

    private Object object;

    public DynamicProxyHandle(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(".....买房前准备。。。。");
        Object result = method.invoke(object,args);
        System.out.println(".....买房后装修。。。。");
        return result;
    }
}

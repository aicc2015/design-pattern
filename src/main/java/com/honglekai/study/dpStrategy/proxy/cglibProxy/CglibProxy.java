package com.honglekai.study.dpStrategy.proxy.cglibProxy;




import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * description CGLIB 代理
 * 缺点：因为用的是继承，所以不能对final类进行代理
 * 优点:
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/30 18:36
 * modifyTime
 */
public class CglibProxy implements MethodInterceptor {

    private Object target;//业务对象，供代理方法进行真正的业务调用

    @Override
    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy proxy) throws Throwable {
        System.out.println("===预处理=========");
        Object result = proxy.invokeSuper(obj,objects);
        System.out.println("===调用后处理=========");
        return result;
    }

    public Object getInstance(final Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();//创建加强器，用来创建动态代理类
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

}

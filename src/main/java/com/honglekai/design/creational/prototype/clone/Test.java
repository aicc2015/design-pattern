package com.honglekai.design.creational.prototype.clone;

import java.util.Date;

/**
 * description 原型模式
 * 定义:指原型对象创建实例的种类，并且通过拷贝这些原型创建新的对象
 * 不需要知道任何创建的细节，不调用构造函数
 *
 * 类型：创建型
 *
 * 适用场景：
 * 1.类初始化消耗较多资源
 * 2.new产生的一个对象需要非常繁琐的过程(数据准备、访问权限)
 * 3.构造函数比较复杂
 * 4.循环体中产生大量对象时
 *
 * 优点：
 * 1.原型模式性能比new一个对象性能高
 * 2.简化创建过程
 *
 * 缺点:
 * 1.必须配备克隆方法
 * 2.对克隆复杂对象或对克隆对象进行复杂改造时，容易引起风险
 * 3.浅拷贝和深拷贝要运用得当
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/14 17:23
 * modifyTime
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        /*Pig p1 = new Pig("佩奇",new Date(0L));
        Pig p2 = (Pig) p1.clone();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p2 == p1);

        p1.getBirthDate().setTime(199999999L);

        System.out.println("====="+p1);
        System.out.println("====="+p2);*/

        CacheKey cacheKey = new CacheKey();

        CacheKey cloneCacheKey = cacheKey.clone();

        System.out.println(cacheKey);
        System.out.println(cloneCacheKey);

        System.out.println("====="+cacheKey.getUpdateList());
        System.out.println("====="+cloneCacheKey.getUpdateList());
    }
}

package com.honglekai.design.creational.prototype.clone;

import java.util.Date;

/**
 * description
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

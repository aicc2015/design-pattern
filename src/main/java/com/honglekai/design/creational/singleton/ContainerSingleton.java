package com.honglekai.design.creational.singleton;

import com.mysql.cj.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/14 15:54
 * modifyTime
 */
public class ContainerSingleton {

    private ContainerSingleton(){

    }

    private static Map<String,Object> singletonMap = new HashMap<>();

    public static  void putInstance(String key,Object instance){
        if (!StringUtils.isNullOrEmpty(key) && instance != null){
            if (!singletonMap.containsKey(key)){
                singletonMap.put(key,instance);
            }
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }
}

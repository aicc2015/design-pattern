package com.honglekai.design.structural.proxy.db;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/19 11:03
 * modifyTime
 */
public class DataSourceContextHolder {

    private static final ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<>();

    public static String getDBType(){
        return THREAD_LOCAL.get();
    }

    public static void setDBType(String dbType){
        THREAD_LOCAL.set(dbType);
    }

    public static void clearDBType(){
        THREAD_LOCAL.remove();
    }
}

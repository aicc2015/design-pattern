package com.honglekai.principle.singleresponsibility;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/12 16:51
 * modifyTime
 */
public class MyCourse {

    public void updateInfo(String name, String address){
        //TODO something
    }

    public void updateName(String name){
        //TODO something
    }

    public void updateAdress(String adress){
        //TODO something
    }

    public void updateInfo(String name,String address, boolean flag){
        //需要拆分为两个或多个方法
        if (flag){
            //TODO something
        }else {
            //TODO something
        }
    }
}

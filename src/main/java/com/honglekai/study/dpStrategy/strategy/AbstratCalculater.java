package com.honglekai.study.dpStrategy.strategy;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 14:11
 * modifyTime
 */
public abstract  class AbstratCalculater  {

    public int[] split(String exp, String opt){
        String[] arr = exp.split(opt);
        int[] returnArr = new int[2];
        returnArr[0] = Integer.parseInt(arr[0]);
        returnArr[1] = Integer.parseInt(arr[1]);

        return  returnArr;
    }
}

package com.honglekai.study.dpStrategy.templateMethod;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 14:37
 * modifyTime
 */
public abstract class AbstratCalculater {

    /**
     * 主方法，实现对本类其他方法的调用
     * @param exp
     * @param opt
     * @return
     */
    public final int calculate(String exp,String opt){
        int[] arr = split(exp,opt);
        return calculate(arr[0],arr[1]);
    }

    protected abstract int calculate(int num1, int num2);

    public int[] split(String exp, String opt) {
        String[] arr = exp.split(opt);
        int[] returnArr = new int[2];
        returnArr[0] = Integer.parseInt(arr[0]);
        returnArr[1] = Integer.parseInt(arr[1]);
        return  returnArr;
    }


}

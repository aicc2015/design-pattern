package com.honglekai.study.dpStrategy.interpreter;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/2 10:46
 * modifyTime
 */
public class Minus implements Expression {
    @Override
    public int interprete(Context context) {
        return context.getNum1()-context.getNum2();
    }
}

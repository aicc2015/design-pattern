package com.honglekai.principle.compositionaggregation;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/13 16:04
 * modifyTime
 */
public class MySqlConnetion extends DBConnetion {
    @Override
    public String getConnetion() {
        return "Mysql连接";
    }
}

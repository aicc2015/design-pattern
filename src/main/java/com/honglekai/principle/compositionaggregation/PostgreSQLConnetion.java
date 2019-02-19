package com.honglekai.principle.compositionaggregation;


/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/13 16:05
 * modifyTime
 */
public class PostgreSQLConnetion extends DBConnetion {
    @Override
    public String getConnetion() {
        return "PostgreSQL连接";
    }
}

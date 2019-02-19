package com.honglekai.study.dpStrategy.factoryMethod;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/30 15:48
 * modifyTime
 */
public class SmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}

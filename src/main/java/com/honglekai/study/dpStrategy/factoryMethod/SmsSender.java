package com.honglekai.study.dpStrategy.factoryMethod;


/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/30 15:45
 * modifyTime
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is SmsSender...");
    }
}

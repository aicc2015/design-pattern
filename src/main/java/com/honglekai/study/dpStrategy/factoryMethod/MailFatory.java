package com.honglekai.study.dpStrategy.factoryMethod;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/30 15:47
 * modifyTime
 */
public class MailFatory implements Provider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}

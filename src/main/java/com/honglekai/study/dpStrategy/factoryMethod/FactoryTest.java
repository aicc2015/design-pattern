package com.honglekai.study.dpStrategy.factoryMethod;

/**
 * description 工厂方法模式
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/30 15:49
 * modifyTime
 */
public class FactoryTest {

    public static void main(String[] args) {
        Provider provider = new MailFatory();
        Sender sender = provider.produce();
        sender.send();
    }

}

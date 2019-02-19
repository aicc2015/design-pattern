package com.honglekai.study.dpStrategy.builder;

/**
 * description 建造者模式
 * 建造者模式和工厂模式区别在于，
 * 工厂模式只关注单个产品，建造者模式关注创建符合对象，多个部分
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/30 17:16
 * modifyTime
 */
public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
        builder.produceSmsSender(10);

    }
}

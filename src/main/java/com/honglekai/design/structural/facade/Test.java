package com.honglekai.design.structural.facade;

/**
 * description 外观模式
 * 定义：
 * 1.又叫门面模式，提供了一个统一的接口，用来访问子系统的一群接口
 * 外观模式定义了一个高层接口，让系统更容易使用
 * 类型：结构型
 *
 * 适用场景：
 * 1.子系统越来越复杂，增加外观模式提供简单的接口调用
 * 2.构建多层系统结构，利用外观对象作为每层的入口，简化层间调用
 *
 * 优点：
 * 1.简化了调用过程，无需深入了解子系统，阻止带来风险
 * 2.减少系统依赖，松散耦合
 * 3.更好的划分访问层次
 * 4.符合迪米特法则，即最少知道原则
 *
 * 缺点：
 * 1.扩展子系统，增加子系统行为容易引入风险
 * 2.不符合开闭原则
 *
 *
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/15 10:08
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("华为mate 20 pro ");

        GiftExchangeService giftExchangeService = new GiftExchangeService();

        //应用层不应该依赖子系统
       /* giftExchangeService.setQualifyService(new QualifyService());
        giftExchangeService.setPaymentService(new PaymentService());
        giftExchangeService.setShippingService(new ShippingService());*/


        giftExchangeService.giftExchage(pointsGift);
    }
}

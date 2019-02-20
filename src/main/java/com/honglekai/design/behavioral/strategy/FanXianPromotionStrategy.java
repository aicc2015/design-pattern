package com.honglekai.design.behavioral.strategy;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/20 13:38
 * modifyTime
 */
public class FanXianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现策略优惠，返现10元到钱包");
    }
}

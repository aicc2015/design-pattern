package com.honglekai.design.behavioral.strategy;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/20 13:52
 * modifyTime
 */
public class LiJianPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("立减策略优惠，立减5元");
    }
}

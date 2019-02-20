package com.honglekai.design.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/20 14:05
 * modifyTime
 */
public class PromotionStrategyFactory  {

    private static  Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN,new FanXianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN,new ManJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN,new LiJianPromotionStrategy());
    }

    private static final PromotionStrategy NO_PROMOTION = new EmptyPromotionStrategy();

    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NO_PROMOTION : promotionStrategy;
    }

    private interface PromotionKey{
        String FANXIAN = "FANXIAN";
        String MANJIAN = "MANJIAN";
        String LIJIAN = "LIJIAN";
    }
}

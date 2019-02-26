package com.honglekai.design.behavioral.strategy;

/**
 * description 策略模式
 * 定义：
 * 1.定义了算法家族，分别封装起来，让他们之间可以相互替换
 * 次模式让算法的变化不会影响到使用算法的用户
 * 2.if...else..
 *
 * 适用场景：
 * 1.系统有很多类，而他们的区别仅仅在于他们的行为不同
 * 2.一个系统需要动态地在几种算法中选择一种
 *
 * 优点：
 * 1.开闭原则
 * 2.避免使用多重条件转移语句
 * 3.提供算法的保密性和安全性
 *
 * 缺点：
 * 1.客户端必须知道所有的策略类，并自行决定使用哪一个策略类
 * 2.产生很多策略类
 *
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/19 18:28
 * modifyTime
 */
public class Test {

    /*public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new ManJianPromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new LiJianPromotionStrategy());

        promotionActivity618.executePromotion();
        promotionActivity1111.executePromotion();
    }*/

    /*public static void main(String[] args) {
        PromotionActivity promotionActivity = null;

        String promotionKey = "LIJIAN";
        if (promotionKey.equals("LIJIAN")){
            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
        }else if(promotionKey.equals("MANJIAN")){
            promotionActivity = new PromotionActivity(new ManJianPromotionStrategy());
        }// else if ....
        promotionActivity.executePromotion();
    }*/

    public static void main(String[] args) {
        String promotionKey = "LIJIAN";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotion();
    }
}

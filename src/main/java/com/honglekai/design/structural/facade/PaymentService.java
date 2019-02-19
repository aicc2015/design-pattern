package com.honglekai.design.structural.facade;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/15 9:58
 * modifyTime
 */
public class PaymentService {

    public boolean pay(PointsGift pointsGift){
        System.out.println("支付成功,礼物为"+pointsGift.getName());
        return true;
    }
}

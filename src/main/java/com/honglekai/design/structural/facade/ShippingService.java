package com.honglekai.design.structural.facade;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/15 9:59
 * modifyTime
 */
public class ShippingService {

    public String getShippingNo(PointsGift pointsGift){
        String shippingNo = "20190215";
        System.out.println("物流系统已接单，运单号为"+shippingNo+"--礼物名称"+pointsGift.getName());
        return shippingNo;
    }
}

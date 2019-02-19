package com.honglekai.design.structural.facade;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/15 9:56
 * modifyTime
 */
public class QualifyService {

    public boolean isAvalible(PointsGift pointsGift){
        System.out.println("校验通过---积分礼物名称为-"+pointsGift.getName());
        return true;
    }
}

package com.honglekai.principle.dependenceinversion;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/12 16:09
 * modifyTime
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("hcc 正在学习 前端课程");
    }
}

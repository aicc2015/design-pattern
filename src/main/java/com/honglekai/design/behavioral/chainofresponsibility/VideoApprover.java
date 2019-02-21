package com.honglekai.design.behavioral.chainofresponsibility;


import org.springframework.util.StringUtils;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/21 15:33
 * modifyTime
 */
public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (!StringUtils.isEmpty(course.getVideo())){
            System.out.println(course.getName()+"含有视频，批准");
            if (approver != null){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName()+"不含有视频，不批准");
        }
    }
}

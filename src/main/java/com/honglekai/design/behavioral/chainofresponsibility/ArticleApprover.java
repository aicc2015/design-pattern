package com.honglekai.design.behavioral.chainofresponsibility;


import org.springframework.util.StringUtils;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/21 15:36
 * modifyTime
 */
public class ArticleApprover extends Approver {

    @Override
    public void deploy(Course course) {
        if (!StringUtils.isEmpty(course.getArticle())){
            System.out.println(course.getName()+"含有手记，批准");
            if (approver != null){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName()+"不含手记，不批准");
        }
    }
}

package com.honglekai.design.behavioral.chainofresponsibility;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/21 15:31
 * modifyTime
 */
public abstract  class Approver {

    protected Approver approver;

    protected void setNextApprover(Approver approver){
        this.approver = approver;
    }

    public abstract  void deploy(Course course);
}
